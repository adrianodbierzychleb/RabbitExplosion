package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class AddMaleFox {

    public List<IFox> addMaleFoxs(List<IFox> maleFoxs, int numOfNew, int year){
        CreateMaleFox createMaleFox = new CreateMaleFox();

        if(numOfNew == 0)
        {
            return maleFoxs;
        }
        for (int i = 0; i < numOfNew ; i++) {
            maleFoxs.add(createMaleFox.createMaleFox(year));
        }

        return maleFoxs;
    }

}
