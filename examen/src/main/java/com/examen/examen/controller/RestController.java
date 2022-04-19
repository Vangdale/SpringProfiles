package com.examen.examen.controller;

import com.examen.examen.service.DNIservice;
import com.examen.examen.service.IMCservice;
import com.examen.examen.service.LEAPYEARservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    DNIservice dni;
    IMCservice imc;
    LEAPYEARservice leapyear;

    @GetMapping ("/getDNI")
    public String ListAlumno(int num,@RequestParam(value = "letra") String letra) {

        return dni.calcularLetra(num, letra);
    }

    @PostMapping()
}
