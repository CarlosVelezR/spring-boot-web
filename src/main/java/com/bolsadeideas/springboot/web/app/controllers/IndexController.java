package com.bolsadeideas.springboot.web.app.controllers;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;
    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;
    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;

    @GetMapping(value = {"/index","","/","/home"})
    public ModelAndView index(ModelAndView mv){

        mv.addObject("titulo",textoIndex);
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

        model.addAttribute("titulo",textoListar);
        model.addAttribute("usuarios",usuarios);

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){

        List<Usuario> usuarios = Arrays.asList(new Usuario("Andrés","Guzman","andres@guzman.com"),
                new Usuario("Camilo","Mendez","camilo@Mendez.co"),
                new Usuario("Felipe","Garzon","felipe@garzon.com"));

        return usuarios;
    }


}
