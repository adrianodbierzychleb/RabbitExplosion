package com.spartaglobal.RabbitExplosion;

public class CreateFemaleRabbit {

    public IFemale createRabbit(int year)
    {
        FemaleRabbit newFemale = new FemaleRabbit();
        newFemale.setPregnant(false);
        newFemale.setAbleForReproduction(false);
        newFemale.setYearOfBirth(year);
        newFemale.setAge(year);
        newFemale.setAlive(true);

        return newFemale;
    }

}
