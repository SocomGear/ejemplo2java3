/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gonzalez.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T107
 */
@Configuration
public class ServiciosChingativos {
  
 @Bean
 Persona ejecutarGracia(){
 return new CuentaChiste();
 }
 
    
}
