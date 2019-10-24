package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class KillFox {

    public List<IFox> killFox(List<IFox> foxs)
    {
        for (int i = 0; i < foxs.size() ; i++) {
            if(foxs.get(i).getAge() >= 24 ){
                foxs.remove(i);
            }

        }

        return foxs;
    }

}
