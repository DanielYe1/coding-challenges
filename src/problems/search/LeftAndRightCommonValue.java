package problems.search;

public class LeftAndRightCommonValue {


    private static int findLeftEqual(long[] orderedList, Long value, int low, int high) {
        int actualId = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (orderedList[actualId] == value && (actualId == 0 || orderedList[actualId - 1] < value)) {
            return actualId;
        }

        if (orderedList[actualId] < value) {
            return findLeftEqual(orderedList, value, actualId + 1, high);
        }
        return findLeftEqual(orderedList, value, low, actualId - 1);
    }


    private static int findRightEqual(long[] orderedList, Long value, int low, int high) {
        int actualId = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }

        if (orderedList[actualId] == value && (actualId == orderedList.length - 1 || orderedList[actualId + 1] > value)) {
            return actualId;
        }

        if (orderedList[actualId] > value) {
            return findRightEqual(orderedList, value, low, actualId - 1);
        }
        return findRightEqual(orderedList, value, actualId + 1, high);

    }

    public static void main(String[] args) {
        long[] integerList = new long[]{
                1L, 3L, 5L, 5L, 5L, 5L, 67L, 123L, 125L
        };

        Integer id1 = findLeftEqual(integerList, 12L, 0, integerList.length - 1);
        Integer id2 = findRightEqual(integerList, 12L, 0, integerList.length - 1);


        System.out.println(id1);
        System.out.println(id2);
    }

}
