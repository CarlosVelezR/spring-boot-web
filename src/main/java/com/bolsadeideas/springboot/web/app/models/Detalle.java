package com.bolsadeideas.springboot.web.app.models;

public class Detalle {
    

    private String nombre;
    private String artefacto;

    public Detalle(String nombre, String artefacto) {
        this.nombre = nombre;
        this.artefacto = artefacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }
}
