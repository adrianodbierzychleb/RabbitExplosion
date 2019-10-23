package com.spartaglobal.RabbitExplosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitSimulation /*extends TimerTask*/ {
    private int month;
    private List<IRabbit> femaleRabbits = new ArrayList<>();
    private List<IRabbit> maleRabbits = new ArrayList<>();
    private int noOfNawMale;
    private int noOfNewFemale;
    private int totalNewRabbits;


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
        int lenght = lenghtOfSimulation.setLength();
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


}
