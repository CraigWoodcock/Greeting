package com.sparta.cw;

public class App {

    public static void main( String[] args ){
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12)
        {
           greeting = "Good Morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18)
        {
            greeting = "Good Afternoon!";
        }
        else
        {
            greeting = "Good Evening!";
        }
        return greeting;
    }
}
