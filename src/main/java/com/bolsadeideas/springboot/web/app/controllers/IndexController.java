package com.bolsadeideas.springboot.web.app.controllers;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value = {"/index","","/","/home"})
    public ModelAndView index(ModelAndView mv){

        mv.addObject("titulo","Hola Spring Model n view");
        mv.setViewName("index");

        return mv;
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){


        return "perfil";
    }



    @RequestMapping("/listar")
    public String listar(Model model){


        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Andrés","Guzman","carlos@corre.ar"));
        usuarios.add(new Usuario("Camilo","Rodriguez","camilo@corre.ar"));
        usuarios.add(new Usuario("Yesica","Montenegro","yesica@corre.ar"));

        model.addAttribute("titulo","Listado de usuarios");
        model.addAttribute("usuarios",usuarios);

        return "listar";
    }


}
