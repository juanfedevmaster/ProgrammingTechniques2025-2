package com.Entities;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String pais;
    private String indicativo;
    
    // Constructor vacío
    public Pais() {
    }
    
    // Constructor con parámetros
    public Pais(String pais, String indicativo) {
        this.pais = pais;
        this.indicativo = indicativo;
    }
    
    // Getters y Setters (Encapsulación)
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getIndicativo() {
        return indicativo;
    }
    
    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }
    
    // Método toString para representación del objeto
    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", indicativo='" + indicativo + '\'' +
                '}';
    }

    private static List<Pais> generarPaises(){
        return new ArrayList<>();
    }

    public static void mostrarPaises(List<Pais> paises){
        if (paises.size() == 0) {
            paises = generarPaises();
        }

        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }
}
