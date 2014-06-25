/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ale.model;

/**
 *
 * @author T107
 */
public class Usuario {
    
    private String Nombre;
    private String paterno;
    private String usuario;
    private String password;
    private char rol_admin;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getRol_admin() {
        return rol_admin;
    }

    public void setRol_admin(char rol_admin) {
        this.rol_admin = rol_admin;
    }
    
    
}
