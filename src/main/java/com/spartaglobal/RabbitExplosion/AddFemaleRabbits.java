package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AddFemaleRabbits {
    public List<IRabbit> addFemaleRabbits(List<IRabbit> femaleRabbits, int numOfNew, int year){
        CreateFemaleRabbit createFemaleRabbit = new CreateFemaleRabbit();
        if(numOfNew == 0)
        {
            return femaleRabbits;
        }
        for (int i = 0; i < numOfNew ; i++) {
            femaleRabbits.add(createFemaleRabbit.createRabbit(year));
        }

        return femaleRabbits;
    }
}