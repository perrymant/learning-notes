import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MissingNumberTest {

    private MissingNumber mn = new MissingNumber();

    @Test
    void canCreateArrayWithMissingInteger7() {
        int[] arrayMissing7 = createArray(10, 7);
        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 8, 9, 10]", Arrays.toString(arrayMissing7));
    }

    int[] createArray(int arrayLength, int missingNumber) {
        List<Integer> allNumbers = IntStream.range(1, arrayLength + 1).boxed().collect(Collectors.toList());
        allNumbers.remove(missingNumber - 1);
        return allNumbers.stream().mapToInt(x -> x).toArray();
    }

    @Test
    void givenMissing7InArray_returns7() {
        int[] arr = createArray(10, 7);
        int lowI = 0;
        int highI = arr.length - 1;
        Assert.assertEquals(7, mn.findMissingNumber(arr, lowI, highI));
    }

    @Test
    void givenArrayOf10_andMissingNumber1(){
        int[] arr = createArray(10, 1);
        Assert.assertEquals(1, mn.findMissingNumber(arr, 0, arr.length - 1));
    }

    @Test
    void givenArrayOf101_andMissingNumber2(){
        int[] arr = createArray(101, 2);
        Assert.assertEquals(2, mn.findMissingNumber(arr, 0, arr.length - 1));
    }

    @Test
    void givenArrayOf10_andMissingNumber5(){
        int[] arr = createArray(10, 5);
        Assert.assertEquals(5, mn.findMissingNumber(arr, 0, arr.length - 1));
    }

    @Test
    void givenArrayOf10_andMissingNumber9(){
        int[] arr = createArray(10, 9);
        Assert.assertEquals(9, mn.findMissingNumber(arr, 0, arr.length - 1));
    }
}