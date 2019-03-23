import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MissingNumberTest {

    private MissingNumber mn = new MissingNumber();

    @Test
    void canCreateArrayWithMissingInteger7() {
        int[] arrayMissing7 = arr();
        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 8, 9, 10]", Arrays.toString(arrayMissing7));
    }

    private int[] arr() {
        return mn.createArray(10, 7);
    }

    @Test
    void checkLR() {
        int[] arr = arr();
        int lowI = 0;
        int highI = arr.length - 1;
        Assert.assertEquals(7, mn.search(arr, lowI, highI));
    }

    @Test
    void allNumbersInRange() {
        int range = 100;
        for (int randomNumber = 1; randomNumber < range; randomNumber++) {
            mn.createArray(10, randomNumber);
            int[] arr = mn.createArray(range, randomNumber);
            Assert.assertEquals(randomNumber, mn.search(arr, 0, arr.length - 1));
        }
    }

}