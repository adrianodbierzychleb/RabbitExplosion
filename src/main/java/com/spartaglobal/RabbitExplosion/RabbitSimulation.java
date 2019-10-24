package com.spartaglobal.RabbitExplosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitSimulation /*extends TimerTask*/ {
    private int month;
    private List<IRabbit> femaleRabbits = new ArrayList<>();
    private List<IRabbit> maleRabbits = new ArrayList<>();
    private List<IFox> femaleFoxs = new ArrayList<>();
    private List<IFox> maleFoxs = new ArrayList<>();
    private int noOfNawMale;
    private int noOfNewFemale;
    private int totalNewRabbits;
    private int totalRabbitsToEat;
    private int femalesToEat;
    private int malesToEat;
    private int totalNewFoxs;
    private int noOfNewFemaleFoxs;
    private int noOfNewMaleFoxs;


    public RabbitSimulation(){
        createInitialRabbits();
    }

//    @Override
//    public void run() {
//
//
//
//        year++;
//    }

    public void startSimulation(){
        LenghtOfSimulation lenghtOfSimulation = new LenghtOfSimulation();
        LoopToAjdustAge loopToAjdustAge = new LoopToAjdustAge();
        KillRabbit killRabbit = new KillRabbit();
        AdjustAvailableForReproduction adjustAvailableForReproduction = new AdjustAvailableForReproduction();
        GiveGender giveGender = new GiveGender();
        LoopToMultiplyRabbits loopToMultiplyRabbits = new LoopToMultiplyRabbits();
        AddMaleRabbits addMaleRabbits = new AddMaleRabbits();
        AddFemaleRabbits addFemaleRabbits = new AddFemaleRabbits();
        RabbitsToBeEaten rabbitsToBeEaten = new RabbitsToBeEaten();
        GenderToEat genderToEat = new GenderToEat();
        EatRabbit eatRabbit = new EatRabbit();
        AdjustFoxAge adjustFoxAge = new AdjustFoxAge();
        KillFox killFox = new KillFox();
        LoopToMultiplyFoxs loopToMultiplyFoxs = new LoopToMultiplyFoxs();
        GiveFoxGender giveFoxGender = new GiveFoxGender();
        int lenght = lenghtOfSimulation.setLength();
        AddMaleFox addMaleFox = new AddMaleFox();
        AddFemaleFox addFemaleFox = new AddFemaleFox();
        month =0;
        while(month < lenght){
            femaleRabbits = loopToAjdustAge.loopToAdjustAge(femaleRabbits, month);
            maleRabbits = loopToAjdustAge.loopToAdjustAge(maleRabbits, month);
            femaleRabbits = adjustAvailableForReproduction.readyToReproduce(femaleRabbits);
            maleRabbits = adjustAvailableForReproduction.readyToReproduce(maleRabbits);
            totalNewRabbits = loopToMultiplyRabbits.totalMultiplyRabbits(femaleRabbits, maleRabbits);
            noOfNewFemale = giveGender.giveFemaleGender(totalNewRabbits);
            noOfNawMale = totalNewRabbits - noOfNewFemale;
            System.out.println("Total new rabbits: " + totalNewRabbits);
            System.out.println("Total females: " + noOfNewFemale);
            System.out.println("Total males: " + noOfNawMale);
            maleRabbits = addMaleRabbits.addMaleRabbits(maleRabbits,noOfNawMale, month);
            femaleRabbits = addFemaleRabbits.addFemaleRabbits(femaleRabbits, noOfNewFemale, month);
            femaleRabbits = killRabbit.killRabbit(femaleRabbits);
            maleRabbits = killRabbit.killRabbit(maleRabbits);
            if(month == 6){
                createInitialFox();
            }

            if (month >=6) {
                if(month % 9 == 0){
                    totalNewFoxs = loopToMultiplyFoxs.totalMultiplyFoxs(femaleFoxs,maleFoxs);
                    noOfNewFemaleFoxs = giveFoxGender.giveFemaleGender(totalNewFoxs);
                    noOfNewMaleFoxs = totalNewFoxs - noOfNewMaleFoxs;
                    maleFoxs = addMaleFox.addMaleFoxs(maleFoxs,noOfNawMale,month);
                    femaleFoxs = addFemaleFox.addFemaleFoxs(femaleFoxs,noOfNewFemale,month);
                }

                femaleFoxs = adjustFoxAge.loopToAdjustAge(femaleFoxs, month);
                maleFoxs = adjustFoxAge.loopToAdjustAge(maleFoxs, month);
                totalRabbitsToEat = rabbitsToBeEaten.rabbitsToBeEaten(maleFoxs, femaleFoxs);
                femalesToEat = genderToEat.femalesToBeEaten(totalRabbitsToEat);
                malesToEat = totalRabbitsToEat - femalesToEat;
                femaleRabbits = eatRabbit.eatRabbits(femaleRabbits,femalesToEat);
                maleRabbits = eatRabbit.eatRabbits(maleRabbits, malesToEat);
                //System.out.println("Rabbits eaten in month " + month + " is " + totalRabbitsToEat);
                totalNewFoxs = loopToMultiplyFoxs.totalMultiplyFoxs(femaleFoxs,maleFoxs);
                noOfNewFemaleFoxs = giveFoxGender.giveFemaleGender(totalNewFoxs);
                noOfNewMaleFoxs = totalNewFoxs - noOfNewMaleFoxs;

                femaleFoxs = killFox.killFox(femaleFoxs);
                maleFoxs = killFox.killFox(maleFoxs);
            }



            System.out.println("The number of Female rabbits in month " + month + " is " + femaleRabbits.size());
            System.out.println("The number of Male rabbits in month " + month + " is " + maleRabbits.size());

            month++;
        }




    }



    public void createInitialRabbits(){
        CreateFemaleRabbit createFemaleRabbit = new CreateFemaleRabbit();
        CreateMaleRabbit createMaleRabbit = new CreateMaleRabbit();
        femaleRabbits.add(createFemaleRabbit.createRabbit(0));
        maleRabbits.add(createMaleRabbit.createRabbit(0));


    }


    public void createInitialFox(){
        CreateFemaleFox createFemaleFox = new CreateFemaleFox();
        CreateMaleFox createMaleFox = new CreateMaleFox();
        femaleFoxs.add(createFemaleFox.createFemaleFox(month));
        maleFoxs.add(createMaleFox.createMaleFox(month));

    }

}
