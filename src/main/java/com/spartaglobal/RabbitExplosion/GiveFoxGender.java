package com.spartaglobal.RabbitExplosion;

public class GiveFoxGender {

    public int giveFemaleGender(int totalFoxs){
        double newFemaleFox = Math.random();
        newFemaleFox = newFemaleFox * totalFoxs;
        int retFox = (int) newFemaleFox;
        return retFox;

    }
}
