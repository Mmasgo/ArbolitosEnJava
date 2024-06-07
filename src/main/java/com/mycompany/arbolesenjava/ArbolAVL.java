/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesenjava;

import javax.swing.JPanel;

/**
 *
 * @author MiriamMas
 */
public class ArbolAVL {
    
public NodoAVL nodoMod;
private EncripAVL En;

    public NodoAVL raiz;
    
    public ArbolAVL(){
        raiz=null;
        this.En=new EncripAVL();
    }
    
    
    public boolean EstaVacio(){
         return raiz==null;
    }
    
    //buscar nodo
    public NodoAVL buscar(long d){
         NodoAVL r;

          NodoAVL aux=raiz;
          String nom;
          while(aux.dpiAVL!=d){
              if(d<aux.dpiAVL){
                  aux=aux.HijoIzquierdo;      
              }else{
                  aux=aux.HijoDerecho;
              }
              if(aux==null){
                  return null;
              }
          }
          nodoMod=aux;
          return aux;  
    }
    
    //Obtener el factor de equilibrio
    
    public int ObtenerFE(NodoAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    
    public int balance(NodoAVL equilibrio){
        if(equilibrio==null){
            return 0;
        }
        return ObtenerFE(equilibrio.HijoIzquierdo)-ObtenerFE(equilibrio.HijoDerecho);
    }
    
    //rotacion simple a la izquierda
    public NodoAVL rotacionIzquierda (NodoAVL c){
        NodoAVL aux=c.HijoIzquierdo;
        c.HijoIzquierdo=aux.HijoDerecho;
        aux.HijoDerecho=c;
        c.fe=Math.max(ObtenerFE(c.HijoIzquierdo),ObtenerFE(c.HijoDerecho))+1;//metodo que devuelve el maximo de dos valores
        aux.fe=Math.max(ObtenerFE(aux.HijoIzquierdo),ObtenerFE(aux.HijoDerecho))+1;
        return aux;
    }
    
    //rotacion simple a la derecha
    public NodoAVL rotacionDerecha (NodoAVL c){
        NodoAVL aux=c.HijoDerecho;
        c.HijoDerecho=aux.HijoIzquierdo;
        aux.HijoIzquierdo=c;
        c.fe=Math.max(ObtenerFE(c.HijoIzquierdo),ObtenerFE(c.HijoDerecho))+1;//metodo que devuelve el maximo de dos valores
        aux.fe=Math.max(ObtenerFE(aux.HijoIzquierdo),ObtenerFE(aux.HijoDerecho))+1;
        return aux;
    }

    //rotacion doble a la derecha
    public NodoAVL rotacionDobleIzquierda(NodoAVL c){
        NodoAVL temp;
        c.HijoIzquierdo=rotacionDerecha(c.HijoIzquierdo);
        temp=rotacionIzquierda(c);
        return temp;
    }    
    
    //rotacion doble a la izquierda
    public NodoAVL rotacionDobleDerecha(NodoAVL c){
        NodoAVL temp;
        c.HijoDerecho=rotacionIzquierda(c.HijoDerecho);
        temp=rotacionDerecha(c);
        return temp; 
    }
    
    //metodo para insertar AVL
    public NodoAVL insertarAVL(NodoAVL nuevo, NodoAVL subAr){
        NodoAVL nuevoPadre=subAr;
        if(nuevo.dpiAVL<subAr.dpiAVL){
            if(subAr.HijoIzquierdo==null){
                subAr.HijoIzquierdo=nuevo;
            }else{
                subAr.HijoIzquierdo=insertarAVL(nuevo, subAr.HijoIzquierdo);
                if((ObtenerFE(subAr.HijoIzquierdo)-ObtenerFE(subAr.HijoDerecho)==2)){
                    if(nuevo.dpiAVL<subAr.HijoIzquierdo.dpiAVL){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else if(nuevo.dpiAVL>subAr.dpiAVL){
            if(subAr.HijoDerecho==null){
                subAr.HijoDerecho=nuevo;
            }else{
                subAr.HijoDerecho=insertarAVL(nuevo, subAr.HijoDerecho);
                if((ObtenerFE(subAr.HijoDerecho)-ObtenerFE(subAr.HijoIzquierdo)==2)){
                    if(nuevo.dpiAVL>subAr.HijoDerecho.dpiAVL){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }
        //actualizando altura
        if((subAr.HijoIzquierdo==null)&&(subAr.HijoDerecho!=null)){
            subAr.fe=subAr.HijoDerecho.fe+1;           
        }else if((subAr.HijoDerecho==null)&&(subAr.HijoIzquierdo!=null)){
            subAr.fe=subAr.HijoIzquierdo.fe+1;
        }else{
            subAr.fe=Math.max(ObtenerFE(subAr.HijoIzquierdo), ObtenerFE(subAr.HijoDerecho))+1;
        }
        return nuevoPadre;
    }
    
    //metodo para insertar
    public void insertar(long dpi, String nombre,String departamento, String municipalidad, String dosis, String fecha1, String fecha2, String fecha3, String lugarVacunacion){
        NodoAVL nuevo= new NodoAVL(dpi, nombre, departamento,municipalidad,dosis, fecha1, fecha2, fecha3, lugarVacunacion);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo, raiz);
        }
    }
    
    //recorridos
        public void InOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            InOrden(r.HijoIzquierdo,sb);
            sb.append(r.dpiAVL).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
            InOrden(r.HijoDerecho,sb);
        }
    }
    public void PreOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            sb.append(r.dpiAVL).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
            PreOrden(r.HijoIzquierdo,sb);
            PreOrden(r.HijoDerecho,sb);
        }
    }
    
      public void PostOrden(NodoAVL r, StringBuilder sb){
        if(r!=null){
            PostOrden(r.HijoIzquierdo,sb);
            PostOrden(r.HijoDerecho,sb);
            sb.append(r.dpiAVL).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
        }
    }


      public boolean eliminarAVL(Long dpiAVL){
          raiz=EliminarNodo(raiz,dpiAVL);
          return true;
      }
      
      
      //eliminar nodo
  public NodoAVL EliminarNodo(NodoAVL nodoActual, Long dpiAVL){
   if (nodoActual == null) {
        return nodoActual;
    }

    if (dpiAVL < nodoActual.dpiAVL) {
        nodoActual.HijoIzquierdo = EliminarNodo(nodoActual.HijoIzquierdo, dpiAVL);
    } else if (dpiAVL > nodoActual.dpiAVL) {
        nodoActual.HijoDerecho = EliminarNodo(nodoActual.HijoDerecho, dpiAVL);
    } else { // nodo a eliminar encontrado
        // con un hijo o sin hijos
        if ((nodoActual.HijoIzquierdo == null) || (nodoActual.HijoDerecho == null)) {
            NodoAVL temporal = null;
            
            if (temporal == nodoActual.HijoIzquierdo) {
                temporal = nodoActual.HijoDerecho;
            } else {
                temporal = nodoActual.HijoIzquierdo;
            }

            // si no tiene hijos
            if (temporal == null) {
                temporal = nodoActual;
                nodoActual = null;
            } else {
                // con un hijo
                nodoActual = temporal;
            }
        } else {
            NodoAVL temporal = obtenerSucesor(nodoActual.HijoDerecho);
           nodoActual.dpiAVL = temporal.dpiAVL;
            nodoActual.HijoDerecho = EliminarNodo(nodoActual.HijoDerecho, temporal.dpiAVL);
        }
    }

    if (nodoActual != null) {
        // actualizar altura y balancear
        nodoActual = balancearNodo(nodoActual);
    }

                    return nodoActual;
      }
      
      private NodoAVL balancearNodo(NodoAVL nodoActual) {
    // actualizar altura
    nodoActual.fe = Math.max(ObtenerFE(nodoActual.HijoIzquierdo), ObtenerFE(nodoActual.HijoDerecho)) + 1;
    int factorE = balance(nodoActual);

    // realizar rotaciones
    if (factorE > 1) {
        if (balance(nodoActual.HijoIzquierdo) >= 0) {
            nodoActual = rotacionDerecha(nodoActual);
        } else {
            nodoActual = rotacionDobleIzquierda(nodoActual);
        }
    } else if (factorE < -1) {
        if (balance(nodoActual.HijoDerecho) <= 0) {
            nodoActual = rotacionIzquierda(nodoActual);
        } else {
            nodoActual = rotacionDobleDerecha(nodoActual);
        }
    }

    return nodoActual;
}
      

            
        private NodoAVL obtenerSucesor(NodoAVL node) {
            NodoAVL sucesorpadre=null;
               NodoAVL sucesor=node.HijoDerecho;
               
               while(sucesor.HijoIzquierdo!=null){
                   sucesorpadre=sucesor;
                   sucesor=sucesor.HijoIzquierdo;
               }
               
               if(sucesorpadre!=null){
                   sucesorpadre.HijoIzquierdo=sucesor.HijoDerecho;
               }else{
                   node.HijoDerecho=sucesor.HijoDerecho;
               }
               sucesor.HijoIzquierdo = node.HijoIzquierdo;
                sucesor.HijoDerecho = node.HijoDerecho;
               return sucesor;
            }
        


            
 public void modificar(String departamento, String municipalidad, String dosis, String fecha1, String fecha2, String fecha3, String lugarVacunacion){
    if (nodoMod != null) {
        nodoMod.setDepartamento(departamento);
        nodoMod.setMunicipalidad(municipalidad);
        nodoMod.setDosis(dosis);
        nodoMod.setFecha1(fecha1);
        nodoMod.setFecha2(fecha2);
        nodoMod.setFecha3(fecha3);
        nodoMod.setLugarVacunacion(lugarVacunacion);
    } else {
        System.out.println("Error: No se ha seleccionado ningún nodo para modificar.");
    }
      }
 
       public void datosdeNodo(){
      En.crearArchivo(nodoMod);
      }
       
      public JPanel getdibujo() {
        return new GraficaAVL(this);
    }
}
