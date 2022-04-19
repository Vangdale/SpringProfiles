package com.examen.examen.controller;

import com.examen.examen.model.Data;

import com.examen.examen.service.Operacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringBootController {

    @Autowired
    Operacion op;

    @GetMapping("/")
    public ModelAndView welcome(){

        return new ModelAndView("index").addObject("Datos", new Data());
    }

    @PostMapping("index")
        public ModelAndView index(Data datos){
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("mensaje", op.getOperacion(datos));
            return modelAndView;
        }

}
