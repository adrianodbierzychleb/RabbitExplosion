package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AdjustFoxAge {

    public List<IFox> loopToAdjustAge(List<IFox> foxs, int year){

        for(int i = 0; i<foxs.size(); i++){

            foxs.get(i).setAge(year);
        }

        return foxs;


    }


}
