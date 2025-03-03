package nl.hu.xe.xebia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XebiaApplicationTest {
    XebiaApplication x = new XebiaApplication();

    @ParameterizedTest
    @MethodSource("testdata")
    void triangleRow(int rowNumber, List<Integer> result) {
        assertEquals(result, x.triangleRow(rowNumber));
    }

    static Stream<Arguments> testdata() {
        return Stream.of(
                Arguments.of(-1, List.of()),
                Arguments.of(0, List.of(1)),
                Arguments.of(1, List.of(1, 1)),
                Arguments.of(2, List.of(1, 2, 1)),
                Arguments.of(3, List.of(1, 3, 3, 1)),
                Arguments.of(4, List.of(1, 4, 6, 4, 1)),
                Arguments.of(20, List.of(1, 20, 190, 1140, 4845, 15504, 38760, 77520, 125970, 167960, 184756, 167960, 125970, 77520 , 38760, 15504, 4845, 1140, 190, 20, 1))

        );
    }
}