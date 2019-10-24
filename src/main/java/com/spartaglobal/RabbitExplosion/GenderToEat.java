package com.spartaglobal.RabbitExplosion;

public class GenderToEat {

    public int femalesToBeEaten(int totalEaten){
        double newFemaleRabbit = Math.random();
        newFemaleRabbit = newFemaleRabbit * totalEaten;
        int retRabbit = (int) newFemaleRabbit;
        return retRabbit;

    }

}
