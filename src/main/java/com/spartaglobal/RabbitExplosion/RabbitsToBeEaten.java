package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class RabbitsToBeEaten {

    public int rabbitsToBeEaten(List<IFox> maleFoxes, List<IFox> femaleFox)
    {
        int totalRabbitsToEat = 0;
        for (int i = 0; i < maleFoxes.size() ; i++) {
            double eat = Math.random();
            eat = eat*20 +1;
            totalRabbitsToEat = totalRabbitsToEat + (int)eat;
        }
        for (int i = 0; i < femaleFox.size() ; i++) {
            double eat = Math.random();
            eat = eat*20 +1;
            totalRabbitsToEat = totalRabbitsToEat + (int)eat;
        }

        return totalRabbitsToEat;



    }

}
