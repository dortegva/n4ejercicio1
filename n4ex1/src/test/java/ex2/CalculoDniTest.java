package ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculoDniTest {

@ParameterizedTest
@CsvSource ({"12348596, P",
            "45989039, X",
            "56598903, I",
            "89767546, P",
            "23989098, L",
            "12466596, K",
            "45645639, J",
            "56545645, V",
             "45647546, Z",
             "23456498, Q"
        } )
    public void assignaLletraTest(int numDNI,char lletraExpect){

    Assertions.assertEquals(lletraExpect,CalculoDni.assignalletra(numDNI));
}
}