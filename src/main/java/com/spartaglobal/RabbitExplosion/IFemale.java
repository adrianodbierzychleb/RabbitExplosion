package com.spartaglobal.RabbitExplosion;

public interface IFemale extends IRabbit {
    void setPregnant(boolean pregnant);
    boolean getPregnant();
    int giveBirth();

}
