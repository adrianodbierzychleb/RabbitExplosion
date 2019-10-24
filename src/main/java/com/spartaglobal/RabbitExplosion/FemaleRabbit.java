package com.spartaglobal.RabbitExplosion;

public class FemaleRabbit extends Rabbit implements IFemale {

    private boolean pregnant;


    @Override
    public void setPregnant(boolean pregnant) {
        this.pregnant=pregnant;
    }

    @Override
    public boolean getPregnant() {
        return pregnant;
    }

    @Override
    public int giveBirth() {
        boolean gettingPreg;
        double willGetPreg = Math.random();
        willGetPreg = willGetPreg *2;
        int checker = (int)willGetPreg;
        int retChildern = 0;
        if(checker == 1){
            gettingPreg = true;
        }
        else{
            gettingPreg = false;
        }

        if(gettingPreg == true) {
            double noOfChildren = Math.random();
            noOfChildren = noOfChildren * 14;
            retChildern = (int) noOfChildren;
        }
        return retChildern;
    }
}
