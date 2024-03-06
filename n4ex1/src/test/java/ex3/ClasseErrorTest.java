package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseErrorTest {

    @Test
    public void llistaErrorTest() {

       int index=1;
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ClasseError.llistaError(1);});
}
}