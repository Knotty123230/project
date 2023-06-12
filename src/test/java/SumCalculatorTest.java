
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private static SumCalculator sumCalculator;


    @BeforeEach
    public void init() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void sumSuccess() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void sumExceptionAccess() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

}
