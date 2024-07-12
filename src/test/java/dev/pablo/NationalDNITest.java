package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NationalDNITest {
    private NationalDNI nationalDNI;

    @BeforeEach 
    public void setup() {
        nationalDNI = new NationalDNI();
    }

    @Test
    public void testCalculateValidLetter() {
        assertEquals('Z', nationalDNI.calculateLetter(12345678));
        assertEquals('T', nationalDNI.calculateLetter(0));
        assertEquals('R', nationalDNI.calculateLetter(99999999));
    }
}