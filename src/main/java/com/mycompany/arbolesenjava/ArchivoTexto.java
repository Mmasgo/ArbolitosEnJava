/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesenjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MiriamMas
 */
public class ArchivoTexto {
    
    
    public static void cargarDatosDeArchivo(ArbolBB arch, String rutaArchivo, int lineaInicial, int LineaFinal) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
        String linea = reader.readLine(); // Omitir la línea de encabezado
        int contador=0;
        

           while ((linea = reader.readLine()) != null){
               contador++;
               if(contador>=lineaInicial && contador <=LineaFinal){
            String[] partes = linea.split("\t"); // Separar el nombre y el DPI
            String nombre = partes[0].replaceAll("1", " ");
            String dpiST = partes[1];
            long dpi = Long.parseLong(dpiST);
                // Valores predeterminados para los datos adicionales de vacunación
                String departamento = "";
                String municipalidad = "";
                String dosis = "";
                String fecha1 = "";
                String fecha2 = "";
                String fecha3 = "";
                String lugarVacunacion = "";

                // Agregar el nodo con todos los datos
                arch.AgregarNodo(dpi, nombre, departamento, municipalidad, dosis, fecha1, fecha2, fecha3, lugarVacunacion);        }
           }
        reader.close();
    } catch (IOException e) {
        System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        e.printStackTrace();
    }

    
}    
    
        public static void cargarArchivoAVL(ArbolAVL arch, String rutaArchivo, int lineaInicial, int LineaFinal) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
        String linea = reader.readLine(); // Omitir la línea de encabezado
        int contador=0;
        

           while ((linea = reader.readLine()) != null){
               contador++;
               if(contador>=lineaInicial && contador <=LineaFinal){
            String[] partes = linea.split("\t"); // Separar el nombre y el DPI
            String nombre = partes[0].replaceAll("1", " ");
            String dpiST = partes[1];
            long dpi = Long.parseLong(dpiST);
// Valores predeterminados para los datos adicionales de vacunación
                String departamento = "";
                String municipalidad = "";
                String dosis = "";
                String fecha1 = "";
                String fecha2 = "";
                String fecha3 = "";
                String lugarVacunacion = "";

                // Agregar el nodo con todos los datos
                arch.insertar(dpi, nombre, departamento, municipalidad, dosis, fecha1, fecha2, fecha3, lugarVacunacion);        }
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        e.printStackTrace();
    }

    
}
}
