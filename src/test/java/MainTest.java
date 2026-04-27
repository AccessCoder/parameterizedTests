import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test//-> Annotation
    void isEven_shouldReturnTrue_whenCalledWithEvenNumber() {
        //GIVEN -> Vorbereitung -> Was weißt du alles?
        int num = 2;
        //WHEN -> Tatsächlicher Methodenaufruf -> Was ist es?
        boolean actual = Main.isEven(num);
        //THEN -> Vergleichen Erwartungshaltung mit Realität
        assertTrue(actual);
    }


    @ParameterizedTest//-> Annotation
    @CsvSource({
            "1, false",
            "-1, false"
    })
    void isEven_shouldReturnFalse_whenCalledWithOddNumber(int a, boolean expected) {
        assertEquals(expected, Main.isEven(a));
    }


    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "-2, 3, 1",
        "1, 1, 2",
        "10, 5, 15"

    })
    void add(int a, int b, int expected) {
        //GIVEN Arange
        //WHEN Act
        int actual = Main.add(a, b);
        //THEN Assert
        assertEquals(expected, actual);
    }


}