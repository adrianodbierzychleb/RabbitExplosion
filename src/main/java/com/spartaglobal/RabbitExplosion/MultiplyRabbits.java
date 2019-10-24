package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class MultiplyRabbits {


    public int multiplyRabbits(IRabbit maleRabits, IFemale femaleRabbits){

        int newRabits = 0;
        if(maleRabits.getAbleForReproduction() == true && femaleRabbits.getAbleForReproduction() == true && femaleRabbits.getPregnant() == false){
            maleRabits.setAbleForReproduction(false);
            femaleRabbits.setAbleForReproduction(false);
            newRabits = femaleRabbits.giveBirth();
            femaleRabbits.setPregnant(true);
        }
        else {
            femaleRabbits.setAbleForReproduction(true);
            maleRabits.setAbleForReproduction(true);
            femaleRabbits.setPregnant(false);
        }

        return newRabits;


    }



}
