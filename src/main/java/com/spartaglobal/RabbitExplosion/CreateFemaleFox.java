package com.spartaglobal.RabbitExplosion;

public class CreateFemaleFox {

    public IFox createFemaleFox(int year){

        FemaleFox newFox = new FemaleFox();
        newFox.setPregnant(false);
        newFox.setAbleForReproduction(false);
        newFox.setAge(year);
        newFox.setYearOfBirth(year);
        return newFox;

    }


}
