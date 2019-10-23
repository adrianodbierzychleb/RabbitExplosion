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
        double noOfChildren = Math.random();
        noOfChildren = noOfChildren *14 +1;
        int retChildern = (int)noOfChildren;
        return retChildern;
    }
}
