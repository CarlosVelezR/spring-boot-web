package com.bolsadeideas.springboot.web.app.controllers;


import com.bolsadeideas.springboot.web.app.models.Detalle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/web")
public class DetalleController {

    @GetMapping(value = {"/","/detail",""})
    public ModelAndView detalle(ModelAndView mv){

        List<Detalle> detalle = new ArrayList<>();

        detalle.add(new Detalle("Arreglo Pintura","Pintura"));
        detalle.add(new Detalle("Cambio Rines","Rines"));
        detalle.add(new Detalle("Cambio Llantas","LLantas"));

        mv.addObject("titulo","Detalle de los articulos: ");
        mv.addObject("details",detalle);
        mv.setViewName("detail");

        return mv;
    }

}
