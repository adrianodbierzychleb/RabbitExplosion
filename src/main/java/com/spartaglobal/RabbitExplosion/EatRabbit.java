package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class EatRabbit {

    public List<IRabbit> eatRabbits(List<IRabbit> rabbits, int rabbitsToBeEaten){


        if(rabbits.size() > rabbitsToBeEaten) {
            for (int i = 0; i < rabbitsToBeEaten; i++) {
                double chooseRandomRabbit = Math.random();
                chooseRandomRabbit = chooseRandomRabbit * rabbits.size();
                int indexToEat = (int) chooseRandomRabbit;
                rabbits.remove(indexToEat);
            }
        }
        return rabbits;
    }

}
