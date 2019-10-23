package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class KillRabbit {

    public List<IRabbit> killRabbit(List<IRabbit> rabbits)
    {
        for (int i = 0; i < rabbits.size() ; i++) {
            if(rabbits.get(i).getAge() >= 3  ){
                rabbits.remove(i);
            }

        }

        return rabbits;
    }

}
