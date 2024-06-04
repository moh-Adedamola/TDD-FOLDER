package assignment;

import java.util.Arrays;

public class ArrayDoubleElement {
    public static int[] MultiplyElement(int[] arrays) {

        int[] numbers = new int[arrays.length];
        for(int counter = 0; counter < numbers.length; counter++){
          numbers[counter] = arrays[counter]*2;
        }
        return numbers;
    }






}
