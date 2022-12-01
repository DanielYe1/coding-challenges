package structures;

import java.util.List;

import static java.util.Arrays.asList;

public class BinarySearch {

    private static Integer binarySearch(List<Integer> orderedList, Integer value, int low, int high) {
        int actualId = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (orderedList.get(actualId).equals(value)) {
            return actualId;
        }

        if (orderedList.get(actualId) < value) {
            return binarySearch(orderedList, value, actualId+1, high);
        }

        return binarySearch(orderedList, value, low, actualId-1);

    }

    public static void main(String[] args) {
        List<Integer> integerList = asList(10, 20, 30, 40, 50);

        Integer id1 = binarySearch(integerList, 10, 0, integerList.size() - 1);
        Integer id2 = binarySearch(integerList, 250, 0, integerList.size() - 1);
        Integer id3 = binarySearch(integerList, 50, 0, integerList.size() - 1);
        Integer id4 = binarySearch(integerList, 40, 0, integerList.size() - 1);

        System.out.printf("%d %d %d %d", id1, id2, id3, id4);
    }

}
