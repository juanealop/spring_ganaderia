package com.drsol.spring.springboot_administracion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.ui.Model;


@Controller
public class primer_controller {

     @GetMapping("/pantalla_ejemplo")
     /* 
    public String info(){

        esto retorna la ruta de la pagina     

        return "pantalla_ejemplo";
    }   

    */ 
    public String info(Model model){
        model.addAttribute("titulo", "servidor en linea");
        model.addAttribute("Servidor", "informacion_config");
        return "pantalla_ejemplo";   //Pasar datos a la vista
    }


}
