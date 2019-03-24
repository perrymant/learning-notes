import java.util.HashSet;
import java.util.Set;

class FindDuplicate {
    private int result;

    // How do you find the duplicate number on a given integer array?
    int findDuplicateSingle(int[] arr) {
        final Set<Integer> set = new HashSet<>();
        int duplicatesIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (set.size() + duplicatesIndex != i + 1) {
                result = arr[i];
                duplicatesIndex++;
            }
        }
        return result;
    }

    // What if there are multiple duplicates?
    int[] findDuplicateMultiple(int[] arr) {
        final Set<Integer> setAlreadySeen = new HashSet<>();
        final Set<Integer> setOfDuplicates = new HashSet<>();
        int duplicatesIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            setAlreadySeen.add(arr[i]);
            if (setAlreadySeen.size() + duplicatesIndex != i + 1) {
                setOfDuplicates.add(arr[i]);
                duplicatesIndex++;
            }
        }
        return setOfDuplicates.stream().mapToInt(Number::intValue).toArray();
    }
}

