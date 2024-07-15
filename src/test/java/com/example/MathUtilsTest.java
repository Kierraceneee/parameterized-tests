package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
public class MathUtilsTest {

    @ParameterizedTest
    @MethodSource("GivenNumbersToSquare")
     void testSquare(int number, int expectedSquare){
        MathUtils mathUtils = new MathUtils();
        assertEquals(expectedSquare, mathUtils.square(number));

    }
    private static Stream<Arguments> GivenNumbersToSquare(){
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(40, 1600),
                Arguments.of(2, 4),
                Arguments.of(58, 3364),
                Arguments.of(11, 121)
        );
    }
}
