package com.bolsadeideas.springboot.web.app.controllers;


import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

@RequestMapping(value = {"/","/webapi",""})
public class ExampleParamsController {

    @GetMapping("/obtener")
    public String params(@RequestParam(name = "text", defaultValue = "No hay parametros") String texto, Model model){

        model.addAttribute("titulo","El parametro de la URL es: " + texto);

        return "params/param";
    }


    @GetMapping("/listar")
    public String cliente(Model model){

        model.addAttribute("titulo","Lista de clientes");

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Carlos","Velez","carlos.velez@tcs.com"));
        usuarios.add(new Usuario("Andres","Velez","andres.velez@tcs.com"));
        usuarios.add(new Usuario("Camilo","Velez","camilo.velez@tcs.com"));

        model.addAttribute("usuarios",usuarios);

        return "params/cliente";
    }
}


