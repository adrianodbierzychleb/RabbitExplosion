package com.spartaglobal.RabbitExplosion;

public abstract class Rabbit implements IRabbit {

    private int age;
    private boolean alive;
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
    public void setAlive(boolean alive) {
        this.alive=alive;
    }

    @Override
    public boolean getAlive() {
        return this.alive;
    }

    @Override
    public void setAbleForReproduction(boolean ableForReproduction) {
        this.ableForReproduction=ableForReproduction;
    }

    @Override
    public boolean getAbleForReproduction() {
        return this.ableForReproduction;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth=yearOfBirth;
    }
}
