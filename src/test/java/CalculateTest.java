import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateTest {

    @ParameterizedTest
    @MethodSource("testData")
    void testCaluclation(int number1,int number2,char operator,int expectedResult){
        Calculation calculation = new Calculation();
        Assertions.assertEquals(expectedResult,calculation.calculate(number1,number2,operator));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3,2,'*',6),
                Arguments.of(2,2,'/',1),
                Arguments.of(2,2,'%',0),
                Arguments.of(3,2,'%',1)
        );
    }
}
