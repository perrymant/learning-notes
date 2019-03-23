import java.util.stream.IntStream;

class MissingNumber {
    public static void main(String[] args) {
    }


    int[] createArray(int range, int randomNumber) {
        int[] arrStart = IntStream.range(1, randomNumber).toArray();
        int[] arrEnd = IntStream.range(randomNumber + 1, range + 1).toArray();
        int[] arr = new int[arrStart.length + arrEnd.length];
        System.arraycopy(arrStart, 0, arr, 0, arrStart.length);
        System.arraycopy(arrEnd, 0, arr, arrStart.length, arrEnd.length);
        return arr;
    }

    int search(int[] arr, int lowI, int highI) {
        int midI = (lowI + highI) / 2;
        int midVal = arr[midI];
        if (lowI == highI) {
            if (midVal == midI + 1) {
                return midVal;
            }
            return midVal - 1;
        }
        if (midVal == midI + 1) {
            lowI = midI + 1;
            return search(arr, lowI, highI);
        }
        highI = midI;
        return search(arr, lowI, highI);
    }
}
