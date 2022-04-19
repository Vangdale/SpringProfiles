package com.examen.examen.service;

import com.examen.examen.model.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("leapyear")
public class LEAPYEARservice implements Operacion{

    public String getOperacion(Data datos){
        int year = Integer.parseInt(datos.getData1());
        int opcion;
        String[] bisiesto = {"Es bisiesto", "No es bisiesto"};
        if(0 == year%4){
            opcion = 0;
        }else{
            opcion = 1;
        }

        return bisiesto[opcion];
    }

    public String getBisiesto(int year){
        int opcion;
        String[] bisiesto = {"Es bisiesto", "No es bisiesto"};
        if(0 == year%4){
            opcion = 0;
        }else{
            opcion = 1;
        }

        return bisiesto[opcion];
    }
}
