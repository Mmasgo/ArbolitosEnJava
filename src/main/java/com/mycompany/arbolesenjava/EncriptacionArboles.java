/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesenjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author MiriamMas
 */
public class EncriptacionArboles {
 
private File miArchivoBBT;
    private PrintWriter escribir;

    
     public EncriptacionArboles() {
        miArchivoBBT = new File("archivoBBT.txt"); // Inicializa el archivo en el constructor
        try {
            if (!miArchivoBBT.exists()) {
                miArchivoBBT.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public File getMiArchivoBBT() {
        return miArchivoBBT;
    }
  
    
    
    
    public void crearArchivo(Nodo nodo) {
    
        FileWriter escribir;
        PrintWriter lineaWriter;  // Para escribir en el archivo
        
        
        try {
            escribir = new FileWriter(miArchivoBBT, true); // true para modo append
            lineaWriter = new PrintWriter(escribir);
            
            // Escribir en el archivo
            lineaWriter.println(nodo.dpi + "/" + nodo.nombre + "/" + nodo.departamento + "/" + nodo.municipalidad + "/" + nodo.dosis + "/" + nodo.fecha1 + "/" + nodo.fecha2 + "/" + nodo.fecha3+ "/" + nodo.lugarVacunacion);
            
            // Cerrar los recursos
            lineaWriter.close();
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void cargar(ArbolBB arbolito){
        try{
            FileReader archivo = new FileReader("archivoBBT.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea;
            
            while((linea = lectura.readLine()) != null){
            String[] fila = linea.split("/");
                if(fila.length == 9){
                             
                    long dpi = Long.parseLong(fila[0]);
                    arbolito.AgregarNodo(dpi, fila[1], fila[2], fila[3], fila[4], fila[5], fila[6], fila[7], fila[8]);
              
                }
            }
            JOptionPane.showMessageDialog(null, "Inscripcción Correcta");
        }catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Inscripcion Fallida");
            
        }
        
    }
    
    
    
public static String encriptar(String texto) {
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        char caracter = texto.charAt(i);
        if (Character.isLetter(caracter)) {
            caracter = (char) (caracter + 3); // Desplazamiento de 3 posiciones
            if ((caracter > 'z' && Character.isLowerCase(texto.charAt(i))) ||
                (caracter > 'Z' && Character.isUpperCase(texto.charAt(i)))) {
                caracter = (char) (caracter - 26); // Ajuste para evitar desbordamiento
            }
        } else if (Character.isDigit(caracter)) {
            caracter = (char) ((caracter - '0' + 3) % 10 + '0'); // Desplazamiento de 3 dígitos
        }
        resultado.append(caracter);
    }
    return resultado.toString();
}

public static String desEncrip(String texto) {
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        char caracter = texto.charAt(i);
        if (Character.isLetter(caracter)) {
            caracter = (char) (caracter - 3); // Desplazamiento de -3 posiciones
            if ((caracter < 'a' && Character.isLowerCase(texto.charAt(i))) ||
                (caracter < 'A' && Character.isUpperCase(texto.charAt(i)))) {
                caracter = (char) (caracter + 26); // Ajuste para evitar desbordamiento
            }
        } else if (Character.isDigit(caracter)) {
            caracter = (char) ((caracter - '0' - 3 + 10) % 10 + '0'); // Desplazamiento de -3 dígitos
        }
        resultado.append(caracter);
    }
    return resultado.toString();
}
    


    public static  void encriptarArchivo(File archivo) throws IOException {
        Path path = Paths.get(archivo.getAbsolutePath());
        String contenido = new String(Files.readAllBytes(path));
        String contenidoEncriptado = encriptar(contenido);
        Files.write(path, contenidoEncriptado.getBytes());
    }
    
        public void desencriptarArchivo(File archivo) throws IOException {
        Path path = Paths.get(archivo.getAbsolutePath());
        String contenido = new String(Files.readAllBytes(path));
        String contenidoDesencriptado = desEncrip(contenido);
        Files.write(path, contenidoDesencriptado.getBytes());
    } 

    public void encriptarArbol(Nodo nodo) {
        if (nodo != null) {
          
            nodo.dpi =Long.parseLong(encriptar(Long.toString(nodo.dpi)));
            nodo.nombre = encriptar(nodo.nombre);
            nodo.departamento = encriptar(nodo.departamento);
            nodo.municipalidad = encriptar(nodo.municipalidad);
            nodo.dosis= encriptar(nodo.dosis);
            nodo.fecha1 = encriptar(nodo.fecha1);
            nodo.fecha2 = encriptar(nodo.fecha2);
            nodo.fecha3 = encriptar(nodo.fecha3);
            nodo.lugarVacunacion = encriptar(nodo.lugarVacunacion);
            encriptarArbol(nodo.HijoIzquierdo);
            encriptarArbol(nodo.HijoDerecho);
          
        }
    }
     
    
    public void desencriptarArbol(Nodo nodo) {
        if (nodo != null) {
            
            nodo.dpi = Long.parseLong(desEncrip(Long.toString(nodo.dpi)));
            nodo.nombre = desEncrip(nodo.nombre);
            nodo.departamento = desEncrip(nodo.departamento);
            nodo.municipalidad = desEncrip(nodo.municipalidad);
            nodo.dosis = desEncrip(nodo.dosis);
            nodo.fecha1 = desEncrip(nodo.fecha1);
            nodo.fecha2 = desEncrip(nodo.fecha2);
            nodo.fecha3 = desEncrip(nodo.fecha3);
            nodo.lugarVacunacion = desEncrip(nodo.lugarVacunacion);
            desencriptarArbol(nodo.HijoIzquierdo);
            desencriptarArbol(nodo.HijoDerecho);
        }
    }
    
}