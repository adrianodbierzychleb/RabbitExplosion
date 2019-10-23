package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AdjustAvailableForReproduction {

    public List<IRabbit> readyToReproduce(List<IRabbit> rabbits){

        for (int i = 0; i < rabbits.size() ; i++) {
            if(rabbits.get(i).getAge() >= 3)
            {
                rabbits.get(i).setAbleForReproduction(true);
            }
        }

        return rabbits;
    }

}
