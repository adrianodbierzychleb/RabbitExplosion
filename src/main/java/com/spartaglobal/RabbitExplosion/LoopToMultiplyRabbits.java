package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class LoopToMultiplyRabbits {


    public int totalMultiplyRabbits(List<IRabbit> femaleRabbits, List<IRabbit> maleRabbits){
        MultiplyRabbits multiplyRabbits = new MultiplyRabbits();
        int totalRabbits = 0;
        int counter = 0;
        int sizeFemale = femaleRabbits.size();
        int sizeMale = maleRabbits.size();
        if(sizeMale < sizeFemale){
            counter = maleRabbits.size();
        }
        else{
            counter = femaleRabbits.size();
        }

        for (int i = 0; i < counter ; i++) {
            totalRabbits = totalRabbits + multiplyRabbits.multiplyRabbits(maleRabbits.get(i), (IFemale) femaleRabbits.get(i));


        }


        return totalRabbits;
    }

}
