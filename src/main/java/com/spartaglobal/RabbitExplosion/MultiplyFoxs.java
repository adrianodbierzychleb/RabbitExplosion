package com.spartaglobal.RabbitExplosion;

public class MultiplyFoxs {

    public int multiplyFoxs(IFox maleFox, IFemaleFox femaleFox){

        int newFoxs = 0;
        if(maleFox.getAbleForReproduction() == true && femaleFox.getAbleForReproduction() == true && femaleFox.getPregnant() == false){
            maleFox.setAbleForReproduction(false);
            femaleFox.setAbleForReproduction(false);
            newFoxs = femaleFox.giveBirth();
            femaleFox.setPregnant(true);
        }
        else {
            femaleFox.setAbleForReproduction(true);
            maleFox.setAbleForReproduction(true);
            femaleFox.setPregnant(false);
        }

        return newFoxs;


    }

}
