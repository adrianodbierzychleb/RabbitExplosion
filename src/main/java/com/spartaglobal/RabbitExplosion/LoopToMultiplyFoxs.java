package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class LoopToMultiplyFoxs {

    public int totalMultiplyFoxs(List<IFox> femaleFoxs, List<IFox> maleFoxs){
        MultiplyFoxs multiplyFoxs = new MultiplyFoxs();
        int totalFoxs = 0;
        int counter = 0;
        int sizeFemale = femaleFoxs.size();
        int sizeMale = maleFoxs.size();
        if(sizeMale < sizeFemale){
            counter = maleFoxs.size();
        }
        else{
            counter = femaleFoxs.size();
        }

        for (int i = 0; i < counter ; i++) {
            totalFoxs = totalFoxs + multiplyFoxs.multiplyFoxs(maleFoxs.get(i), (IFemaleFox) femaleFoxs.get(i));


        }


        return totalFoxs;
    }

}
