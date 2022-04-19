package com.examen.examen.controller;

import com.examen.examen.model.Data;
import com.examen.examen.service.DNIservice;
import com.examen.examen.service.IMCservice;
import com.examen.examen.service.LEAPYEARservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired(required = false)
    DNIservice dniService;

    @Autowired(required = false)
    IMCservice imcService;

    @Autowired(required = false)
    LEAPYEARservice leapyearService;

    @GetMapping ("/getDNI")
    public String calcularLetra(Data datos) {
        return dniService.calcularLetra(Integer.parseInt(datos.getData1()));
    }

    @PostMapping("/getIMC")
    public String calcularIMC(Data datos){
        return ("Tu indicice de masa corporal es: "+ imcService.CalcularIMC(datos));
    }

    @GetMapping("/bis/{bisiesto}")
    public String Bis(@PathVariable Integer bisiesto){
        return leapyearService.getBisiesto(bisiesto);
    }
}
