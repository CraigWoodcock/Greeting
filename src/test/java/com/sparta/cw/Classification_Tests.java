package com.sparta.cw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

//    @ParameterizedTest
//    @ValueSource(ints = {5, 7, 9, 11})
//    @DisplayName("Check against 5, 7, 9 and 11")
//    public void checkAgainst5_7_9_and11(int viewerAge){
//        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(viewerAge));
//    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 12})
    @DisplayName("Check against 5, 10 and 12")
    public void checkAgainst5_10_and12(int viewerAge){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(viewerAge));
    }
    @ParameterizedTest
    @ValueSource(ints = {13, 14, 17})
    @DisplayName("Check against 13, 14 and 17")
    public void checkAgainst13_14_and17(int viewerAge){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(viewerAge));
    }
    @ParameterizedTest
    @ValueSource(ints = {18, 20, 24})
    @DisplayName("Check against 18,20 and 24")
    public void checkAgainst18_20_and_24(int viewerAge){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(viewerAge));
    }
}
