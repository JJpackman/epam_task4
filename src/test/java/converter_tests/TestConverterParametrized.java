package converter_tests;

import converter.TemperatureConverter;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(value = Parameterized.class)
public class TestConverterParametrized {
    private float expected;
    private float result;
    private float delta;
    private static TemperatureConverter converter;

    @BeforeClass
    public static void createConverter() {
        converter = new TemperatureConverter();
    }

    @Parameterized.Parameters
    public static Collection<Number[]> data() {
        return Arrays.asList(new Number[][] {
                { 55, 12.779, 0.01 },
                { 91, 33, 1 },
                { -273.5, 0, 0.1 }
        });
    }

    public TestConverterParametrized(float result, float expected, float delta) {
        this.expected = expected;
        this.result = result;
        this.delta = delta;
    }

    @Test
    public void testConvertFtoC() {
        assertEquals(expected, converter.convertFtoC(result), delta);
    }

    @Test
    public void testConvertCtoF() {
        assertEquals(expected, converter.convertCtoF(result), delta);
    }

    @Test
    public void testConvertCtoK() {
        assertNotEquals(expected, converter.convertCtoK(result), delta);
    }

    @Test
    public void testConvertKtoC() {
        assertNotEquals(expected, converter.convertKtoC(result), delta);
    }

    @Test
    public void testConvertFtoK() {
        assertEquals(expected, converter.convertFtoK(result), delta);
    }

    @Test
    public void convertKtoF() {
        assertEquals(expected, converter.convertKtoF(result), delta);
    }
}
