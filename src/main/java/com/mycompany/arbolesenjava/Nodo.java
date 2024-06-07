/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesenjava;

/**
 *
 * @author MiriamMas
 */
public class Nodo {
    String nombre;
    long dpi;
    String departamento;
    String municipalidad;
    String dosis;
    String fecha1;
    String fecha2;
    String fecha3;
    String lugarVacunacion;

    Nodo HijoIzquierdo;
    Nodo HijoDerecho;

    public Nodo(long dpi, String nombre,String departamento, String municipalidad, String dosis, String fecha1, String fecha2, String fecha3, String lugarVacunacion) {
       this.dpi=dpi;
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipalidad = municipalidad;
        this.dosis = dosis;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.fecha3 = fecha3;
        this.lugarVacunacion = lugarVacunacion;
        this.HijoIzquierdo = null;
        this.HijoDerecho = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(String municipalidad) {
        this.municipalidad = municipalidad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getFecha3() {
        return fecha3;
    }

    public void setFecha3(String fecha3) {
        this.fecha3 = fecha3;
    }

    public String getLugarVacunacion() {
        return lugarVacunacion;
    }

    public void setLugarVacunacion(String lugarVacunacion) {
        this.lugarVacunacion = lugarVacunacion;
    }

   
    
}
