package com.spartaglobal.RabbitExplosion;

public class CreateMaleFox {

    public IFox createMaleFox(int year){
        Fox newFox = new Fox();
        newFox.setAbleForReproduction(false);
        newFox.setYearOfBirth(year);
        newFox.setAge(year);
        return newFox;
    }

}

