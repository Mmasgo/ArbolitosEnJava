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
public class ArbolBB {
public Nodo nodoMod;
private EncriptacionArboles En;
    
   public Nodo raiz;
    
          
    public ArbolBB(){
        raiz=null;
        this.En=new EncriptacionArboles();
    }
    


    
    public void AgregarNodo(Long d, String nom, String departamento, String municipalidad, String dosis, String fecha1, String fecha2, String fecha3, String lugarVacunacion){
        Nodo nuevo= new Nodo (d,nom,departamento, municipalidad, dosis, fecha1, fecha2, fecha3, lugarVacunacion);


        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo auxiliar=raiz;
            Nodo padre;
           
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dpi){
                    auxiliar=auxiliar.HijoIzquierdo;
                    if(auxiliar==null){
                        padre.HijoIzquierdo= nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.HijoDerecho;
                    if(auxiliar==null){
                        padre.HijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean EstaVacio(){
         return raiz==null;
    }
   
    public void InOrden(Nodo r, StringBuilder sb){
        if(r!=null){
            InOrden(r.HijoIzquierdo,sb);
            sb.append(r.dpi).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
            //sb.append(r.dpi).append("\n");
            InOrden(r.HijoDerecho,sb);
        }
    }
    public void PreOrden(Nodo r, StringBuilder sb){
        if(r!=null){
            sb.append(r.dpi).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
            PreOrden(r.HijoIzquierdo,sb);
            PreOrden(r.HijoDerecho,sb);
        }
    }
    
      public void PostOrden(Nodo r,StringBuilder sb){

        if(r!=null){
            PostOrden(r.HijoIzquierdo,sb);
            PostOrden(r.HijoDerecho,sb);
            sb.append(r.dpi).append(" ").append(r.nombre).append(" ").append(r.departamento).append(" ").append(r.municipalidad).append(" ").append(r.dosis).append(" ").append(r.fecha1).append(" ").append(r.fecha2).append(" ").append(r.fecha3).append(" ").append(r.lugarVacunacion).append("\n");
            
        }
    }
      
      //metodo para buscar nodo en el arbol
      
      public Nodo BuscarNodo(long d){
          Nodo r;

          Nodo aux=raiz;
          String nom;
          while(aux.dpi!=d){
              if(d<aux.dpi){
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
      
      //metodo para eliminar un nodo del arbol
      
      public boolean EliminarNodo(long d){
          Nodo auxiliar=raiz;
          Nodo padre=raiz;
         //buscando nodo 
          boolean EsHijoIzq=true;
          
          while(auxiliar.dpi!=d){
              padre=auxiliar;
              if(d<auxiliar.dpi){
                  EsHijoIzq=true;
                  auxiliar=auxiliar.HijoIzquierdo;
              }else{
                  EsHijoIzq=false;
                  auxiliar=auxiliar.HijoDerecho;
              }if(auxiliar==null){
                  return false;//nunca lo encontró
              }
          }//fin del while
         //eliminando

         if(auxiliar.HijoIzquierdo==null && auxiliar.HijoDerecho==null){
             if(auxiliar==raiz){
                 raiz=null;   //de una hoja o solo raiz
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=null;
             }else{
                 padre.HijoDerecho=null;
             }
         }
          //cuando tenga hijos
         else if(auxiliar.HijoDerecho==null){
             if(auxiliar==raiz){
                 raiz=auxiliar.HijoIzquierdo;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=auxiliar.HijoIzquierdo;
             }else{
                 padre.HijoDerecho=auxiliar.HijoIzquierdo;
             }
         }else if(auxiliar.HijoIzquierdo==null){
             if(auxiliar==raiz){
                 raiz=auxiliar.HijoDerecho;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=auxiliar.HijoDerecho;
             }else{
                 padre.HijoDerecho=auxiliar.HijoDerecho;
             }
         }else{
             Nodo reemplazo=ObtenerNodoReemplazo(auxiliar);
             if(auxiliar==raiz){
                 raiz=reemplazo;
             }else if(EsHijoIzq){
                 padre.HijoIzquierdo=reemplazo;
             }else{
                 padre.HijoDerecho=reemplazo;
             }
             reemplazo.HijoIzquierdo=auxiliar.HijoIzquierdo;
         }return true;
      }
      
      public Nodo ObtenerNodoReemplazo(Nodo NodoReemp){
          Nodo reemplazopadre=NodoReemp;
          Nodo reemplazo=NodoReemp;
          Nodo auxiliar=NodoReemp;
          
          while(auxiliar!=null){
              reemplazopadre=reemplazo;
              reemplazo=auxiliar;
              auxiliar=auxiliar.HijoIzquierdo;
          }
          if(reemplazo!=NodoReemp.HijoDerecho){
              reemplazopadre.HijoIzquierdo=reemplazo.HijoDerecho;
              reemplazo.HijoDerecho=NodoReemp.HijoDerecho;
          }
          System.out.println("el nodo reemplazo es "+reemplazo.dpi);
          return reemplazo;
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
        return new ExpresionGraficaABB(this);
    }
}
