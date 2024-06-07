/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesenjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class EncripAVL {
    private File miArchivoAVL;
    private PrintWriter escribir;

    
     public EncripAVL() {
        miArchivoAVL = new File("archivoAVL.txt"); // Inicializa el archivo en el constructor
        try {
            if (!miArchivoAVL.exists()) {
                miArchivoAVL.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public File getMiArchivoAVL() {
        return miArchivoAVL;
    }
  
    
    
    
    public void crearArchivo(NodoAVL nodo) {
    
        FileWriter escribir;
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(miArchivoAVL, true))) {
            String linea = nodo.dpiAVL + "/" + nodo.nombre + "/" + nodo.departamento+ "/" + nodo.municipalidad + "/" + nodo.dosis+ "/" + nodo.fecha1 + "/" + nodo.fecha2 + "/" + nodo.fecha3 + "/" + nodo.lugarVacunacion;
            writer.write(linea);
            writer.newLine(); // Añadir nueva línea
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void cargar(ArbolAVL arbolito){
        try{
            FileReader archivo = new FileReader("archivoAVL.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea;
            
            while((linea = lectura.readLine()) != null){
            String[] fila = linea.split("/");
                if(fila.length == 9){
                             
                    long dpi = Long.parseLong(fila[0]);
                    arbolito.insertar(dpi, fila[1], fila[2], fila[3], fila[4], fila[5], fila[6], fila[7], fila[8]);
              
                }
            }
            JOptionPane.showMessageDialog(null, "LA CARGA SE REALIZÓ CON EXITO");
        }catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR");
            
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
    

    public void encriptarArbol(NodoAVL nodo) {
        if (nodo != null) {
          
            nodo.dpiAVL =Long.parseLong(encriptar(Long.toString(nodo.dpiAVL)));
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
    
    public void desencriptarArchivo(File archivo) throws IOException {
        Path path = Paths.get(archivo.getAbsolutePath());
        String contenido = new String(Files.readAllBytes(path));
        String contenidoDesencriptado = desEncrip(contenido);
        Files.write(path, contenidoDesencriptado.getBytes());
    } 
    
    
    public void desencriptarArbol(NodoAVL nodo) {
        if (nodo != null) {
            
            nodo.dpiAVL = Long.parseLong(desEncrip(Long.toString(nodo.dpiAVL)));
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
