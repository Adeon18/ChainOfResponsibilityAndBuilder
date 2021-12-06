package atm;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private ATM atm;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @org.junit.jupiter.api.Test
    void process() {
        atm.process(125);
        assertEquals("Please receive 1 of 5 UAH Bills.\n" + "Please receive 0 of 10 UAH Bills.\n" + "Please receive 6 of 20 UAH Bills.", outputStreamCaptor.toString().trim());
    }

    @org.junit.jupiter.api.Test
    void process2() {
        atm.process(1225);
        assertEquals("Please receive 1 of 5 UAH Bills.\n" + "Please receive 0 of 10 UAH Bills.\n" + "Please receive 61 of 20 UAH Bills.", outputStreamCaptor.toString().trim());
    }
}