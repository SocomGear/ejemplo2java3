/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gonzalez.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/hola2")
public class Controladorhola {

@RequestMapping (value="/mensaje",method=RequestMethod.GET,headers={"Accept=text/html"})

public @ResponseBody String algo(){

String  facil="Mi primer servicio en java con REST y spring";
return facil;
}


    
}
