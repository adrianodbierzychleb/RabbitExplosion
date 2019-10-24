package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AddFemaleFox {

    public List<IFox> addFemaleFoxs(List<IFox> femaleFoxs, int numOfNew, int year){
        CreateFemaleFox createFemaleFox = new CreateFemaleFox();
        if(numOfNew == 0)
        {
            return femaleFoxs;
        }
        for (int i = 0; i < numOfNew ; i++) {
            femaleFoxs.add(createFemaleFox.createFemaleFox(year));
        }

        return femaleFoxs;
    }

}
