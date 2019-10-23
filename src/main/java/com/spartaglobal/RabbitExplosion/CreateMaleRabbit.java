package com.spartaglobal.RabbitExplosion;

public class CreateMaleRabbit {

    public IMale createRabbit(int year){
        MaleRabbit newRabbit = new MaleRabbit();
        newRabbit.setAge(year);
        newRabbit.setAbleForReproduction(false);
        newRabbit.setYearOfBirth(year);
        newRabbit.setAlive(true);
        return newRabbit;

    }

}
