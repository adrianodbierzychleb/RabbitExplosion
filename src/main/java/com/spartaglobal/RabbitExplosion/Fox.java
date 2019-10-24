package com.spartaglobal.RabbitExplosion;

public class Fox implements IFox {
    private int age;
    private boolean ableForReproduction;
    private int yearOfBirth;


    @Override
    public void setAge(int age) {
        this.age=(age - yearOfBirth);
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAbleForReproduction(boolean ableForReproduction) {
        this.ableForReproduction = ableForReproduction;
    }

    @Override
    public boolean getAbleForReproduction() {
        return this.ableForReproduction;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth=yearOfBirth;

    }

    @Override
    public int eatRabbits() {
        double noEaten = Math.random();
        noEaten = noEaten *20 +1;
        int retEaten = (int)noEaten;
        return retEaten;
    }
}
