package com.laofaner.MultiThread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    Timer timer;

    public TimerTest(int time) {
        timer = new Timer();
        TimerTaskTest01 timerTaskTest01 = new TimerTaskTest01();
//        timer.schedule(new TimerTaskTest01(), time * 1000);
        timer.schedule(timerTaskTest01, time * 1000, 2000);
        System.out.println(new Date(timerTaskTest01.scheduledExecutionTime()));
    }

    public static void main(String[] args) {
        System.out.println("timer begin....");
        new TimerTest(3);

    }
}

class TimerTaskTest01 extends TimerTask {

    public void run() {
        System.out.println("Time's up!!!!");
        System.out.println(new Date(this.scheduledExecutionTime()));
    }
}
