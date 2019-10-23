package com.spartaglobal.RabbitExplosion;

public class GiveGender {


    public int giveFemaleGender(int totalRabits){
        double newFemaleRabbit = Math.random();
        newFemaleRabbit = newFemaleRabbit * totalRabits;
        int retRabbit = (int) newFemaleRabbit;
        return retRabbit;

    }
}
