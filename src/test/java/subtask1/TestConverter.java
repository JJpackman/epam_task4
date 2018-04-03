package subtask1;

import org.junit.*;
import static org.junit.Assert.*;

public class TestConverter {
    private static TemperatureConverter converter;

    @BeforeClass
    public static void createConverter() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC() {
        assertEquals(12.779, converter.convertFtoC(55), 0.01);
    }

    @Test
    public void testConvertCtoF() {
        assertEquals(91, converter.convertCtoF(33), 1);
    }

    @Test
    public void testConvertCtoK() {
        assertNotEquals(279, converter.convertCtoK(0), 1);
    }

    @Test
    public void testConvertKtoC() {
        assertNotEquals(-273.5, converter.convertKtoC(0), 0.1);
    }

    @Test
    public void testConvertFtoK() {
        assertEquals(272.1, converter.convertFtoK(30), 0.1);
    }

    @Test
    public void convertKtoF() {
        assertEquals(321.1037, converter.convertKtoF(433.78), 0.001);
    }
}
