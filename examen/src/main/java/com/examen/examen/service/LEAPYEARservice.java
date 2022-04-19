package com.examen.examen.service;

import com.examen.examen.model.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("leapyear")
public class LEAPYEARservice implements Operacion{

    Data datos = new Data();
    int año = Integer.parseInt(datos.getData1());


    public String getOperacion(Data datos){
        int resto= 0;
        int opcion;
        String[] bisiesto = {"Es bisiesto", "No es bisiesto"};
        if(año == año%4){
            opcion = 0;
        }else{
            opcion = 1;
        }

        return bisiesto[opcion];
    }

}
