package com.examen.examen.service;

import com.examen.examen.model.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("imc")
public class IMCservice implements Operacion{
    Data datos = new Data();

    int peso = Integer.parseInt(datos.getData1());
    int altura = Integer.parseInt(datos.getData2());

    public String getOperacion(Data datos){
        String[] categorias = {"Obesidad", "Peso superior al normal", "Peso inferior al normal", "Normal"};

        int opcion = 0;
        int IMC = 0;
        IMC = peso / altura;

        if(IMC>30){
            opcion = 0;
        }if(IMC<30 && IMC>25){
            opcion = 1;
        }if(IMC < 18){
            opcion = 2;
        }if(IMC >18 && IMC < 25){
            opcion = 3;
        }
        return categorias[opcion];
    }
}
