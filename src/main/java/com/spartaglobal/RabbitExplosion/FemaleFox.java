package com.spartaglobal.RabbitExplosion;

public class FemaleFox extends Fox implements IFemaleFox {
    private boolean pregnant;

    @Override
    public void setPregnant(boolean pregnant) {
        this.pregnant=pregnant;
    }

    @Override
    public boolean getPregnant() {
        return this.pregnant;
    }

    @Override
    public int giveBirth() {
        double noOfChildren = Math.random();
        noOfChildren = noOfChildren *10 +1;
        int retChildern = (int)noOfChildren;
        return retChildern;
    }

}
