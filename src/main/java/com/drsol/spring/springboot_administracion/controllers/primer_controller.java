package com.drsol.spring.springboot_administracion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class primer_controller {

     @GetMapping("/pantalla_ejemplo")
     
     

    public String info(){


        return "pantalla_ejemplo";
    }

}
