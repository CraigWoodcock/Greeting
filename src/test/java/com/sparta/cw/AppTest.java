package com.sparta.cw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    /*@Test
    public void checkGoodMorning(){
        Assertions.assertEquals("Good Morning!",App.getGreeting(6));
    }

    @Test
    public void checkGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.getGreeting(15));
    }

    @Test
    public void checkGoodEvening(){
        Assertions.assertEquals("Good Evening!", App.getGreeting(19));
    }*/

    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Check against 5,8 and 12")
    public void checkAgainst5_8_and12(int timeOfDay){
        Assertions.assertEquals("Good Morning!", App.getGreeting(timeOfDay));
    }




}

