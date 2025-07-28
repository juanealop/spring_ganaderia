package com.drsol.spring.springboot_administracion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import java.util.Map; 
import java.util.HashMap;


@RestController

public class primer_rest_controller {
    
    @GetMapping("/pantalla_ejemplo_dos")
   
   //se puede utilizar otros tipos de datos para mandar el json
    public Map<String,Object> pantalla_ejemplo_dos(){
      Map<String, Object> respuesta = new HashMap<>();
      respuesta.put("titulo", "servidor en linea");
      respuesta.put("Servidor", "informacion_config");
      return respuesta;   //controlador rest 
                       //retorna datos en formato json en vez de un html
    }
    
}
