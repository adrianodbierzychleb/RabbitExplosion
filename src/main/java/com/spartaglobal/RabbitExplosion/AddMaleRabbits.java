package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AddMaleRabbits {


    public List<IRabbit> addMaleRabbits(List<IRabbit> maleRabbits, int numOfNew, int year){
        CreateMaleRabbit createMaleRabbit = new CreateMaleRabbit();

        if(numOfNew == 0)
        {
            return maleRabbits;
        }
        for (int i = 0; i < numOfNew ; i++) {
            maleRabbits.add(createMaleRabbit.createRabbit(year));
        }

        return maleRabbits;
    }
}
