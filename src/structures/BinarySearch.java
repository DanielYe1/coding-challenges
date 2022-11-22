package structures;

import java.util.List;

import static java.util.Arrays.asList;

public class BinarySearch {

    private static Integer binarySearch(List<Integer> orderedList, Integer value, int low, int high) {
        int actualId = (low + high) / 2;

        if (orderedList.get(actualId).equals(value)) {
            return actualId;
        }

        if (orderedList.get(actualId) < value) {
            return binarySearch(orderedList, value, actualId, high);
        }

        return binarySearch(orderedList, value, low, actualId);

    }

    public static void main(String[] args) {
        List<Integer> integerList = asList(10, 20, 30, 40, 50);

        Integer id = binarySearch(integerList, 40, 0, integerList.size() - 1);

        System.out.println(id);
    }

}
