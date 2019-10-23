package com.spartaglobal.RabbitExplosion;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        RabbitSimulation rabbitSimulation = new RabbitSimulation();
        rabbitSimulation.startSimulation();


//        TimerTask timerTask = new RabbitSimulation();
//        Timer timer = new Timer();
//        timer.schedule(timerTask,0,1000);
//        try{
//            Thread.sleep(5000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        timer.cancel();


    }
}
