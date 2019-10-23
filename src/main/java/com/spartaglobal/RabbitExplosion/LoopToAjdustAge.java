package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class LoopToAjdustAge {

    public List<IRabbit> loopToAdjustAge(List<IRabbit> rabbits, int year){

        for(int i = 0; i<rabbits.size(); i++){

            rabbits.get(i).setAge(year);
        }

        return rabbits;


    }




}
