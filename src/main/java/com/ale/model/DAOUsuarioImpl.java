/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ale.model;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class DAOUsuarioImpl {
    
    public static ArrayList<Usuario> Implementar(){
        ArrayList<Usuario> registro =new ArrayList<Usuario>();
        
        Usuario usu;
        usu=new Usuario("jcampos","xxx","Y");
        registro.add(usu);
        
        usu=new Usuario("analopez","yyy","Y");
        registro.add(usu);
        
        usu=new Usuario("pedroperez","www","Y");
        registro.add(usu);
        
        return registro;
        
        
        
    }
    
}
