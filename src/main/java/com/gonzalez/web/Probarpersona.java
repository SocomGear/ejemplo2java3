/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gonzalez.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author T107
 */
public class Probarpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ServiciosChingativos.class) ;
        Persona p=ctx.getBean(Persona.class);
        p.ejecutarGracia();
        System.out.println(p.ejecutarGracia());
    }
    
}
