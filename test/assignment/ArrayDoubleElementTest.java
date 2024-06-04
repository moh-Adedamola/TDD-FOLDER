package assignment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDoubleElementTest {
    @Test

    public void testArrayDoubleElement() {
        int[] arrays = {2, 3, 5, 2, 5, 3};
        int[] expected = {4, 6, 10, 4, 10, 6};
        assertArrayEquals(expected, ArrayDoubleElement.MultiplyElement(arrays));
    }

}

