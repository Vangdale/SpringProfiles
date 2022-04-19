package com.examen.examen.service;

import com.examen.examen.model.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("imc")
public class IMCservice implements Operacion{

    public String getOperacion(Data datos){
        String[] categorias = {"Obesidad", "Peso superior al normal", "Peso inferior al normal", "Normal"};

        double peso = Double.parseDouble(datos.getData1());
        double altura = Double.parseDouble(datos.getData2());

        int opcion = 1;
        double IMC = 0;
        IMC = peso / (altura*altura);

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

    public double CalcularIMC(Data data){
        double IMC = Double.parseDouble(data.getData1()) / (Double.parseDouble(data.getData2())*Double.parseDouble(data.getData2()));
        return IMC;
    }

}
