class MissingNumber {

    int findMissingNumber(int[] arr, int lowIndex, int highIndex) {
        // find the value of the midIndex of the array
        final int midIndex = (lowIndex + highIndex) / 2;
        final int midValue = arr[midIndex];
        // check if we've narrowed down to just 1 value in the array
        if (lowIndex == highIndex) {
            if (midValue == midIndex + 1) {
                return midValue;
            }
            return midValue - 1;
        }
        if (midValue == midIndex + 1) {
            // update lower bound
            return findMissingNumber(arr, midIndex + 1, highIndex);
        }
        // update upper bound
        highIndex = midIndex;
        return findMissingNumber(arr, lowIndex, highIndex);
    }
}
