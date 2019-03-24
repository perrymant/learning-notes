import org.junit.Assert;
import org.junit.Test;

public class FindDuplicateTest {
    private FindDuplicate fd = new FindDuplicate();

    @Test
    public void findDuplicate() {
        int[] arrayWithDuplicate = new int[]{2, 6, 45, 78, 2, 365, 4};
        Assert.assertEquals(2, fd.findDuplicateSingle(arrayWithDuplicate));
    }

    @Test
    public void findArrayOfDuplicates_givenEmpty() {
        int[] arrayWithDuplicate = new int[]{};
        Assert.assertArrayEquals(new int[]{}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }

    @Test
    public void findArrayOfDuplicates_givenNoDuplicates() {
        int[] arrayWithDuplicate = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(new int[]{}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }


    @Test
    public void findArrayOfDuplicates_givenOneDuplicate() {
        int[] arrayWithDuplicate = new int[]{1, 1};
        Assert.assertArrayEquals(new int[]{1}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }

    @Test
    public void findArrayOfDuplicates_givenMultipleDuplicates() {
        int[] arrayWithDuplicate = new int[]{1, 1, 2, 2, 3, 3, 5, 4, 5};
        Assert.assertArrayEquals(new int[]{1, 2, 3, 5}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }

    @Test
    public void findArrayOfDuplicates_givenRepeatedNumber() {
        int[] arrayWithDuplicate = new int[]{5, 5, 5};
        Assert.assertArrayEquals(new int[]{5}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }

    @Test
    public void findArrayOfDuplicates_givenMultipleConditions() {
        int[] arrayWithDuplicate = new int[]{5, 6, 5, 5, 6, 6, 1, 2, 2};
        Assert.assertArrayEquals(new int[]{2, 5, 6}, fd.findDuplicateMultiple(arrayWithDuplicate));
    }

}