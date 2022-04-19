package com.examen.examen.service;

import com.examen.examen.model.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dni")
public class DNIservice implements Operacion {

    public  String getOperacion(Data datos){

        int dni = Integer.parseInt(datos.getData1());
        String letra = datos.getData2();

        String[] comprobar = {"correcto", "Incorrecto"};
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = dni % 23;
        int opcion = 0;

        if(letras[resto].equals(letra)){
            opcion = 0;
        }else{
            opcion = 1;
        }
        return comprobar[opcion];
    }

    public String calcularLetra(int dni){
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = dni % 23;
        return letras[resto];
    }
}
