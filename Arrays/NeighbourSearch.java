public class NeighbourSearch {

    public static void NS(int[] arr, int bt, int at, int target) {
        int beforeMid = bt - 1;
        int afterMid = at + 1;

        System.out.print("Target found at indices: " + bt + " ");

        // Go left
        while (beforeMid >= 0 && arr[beforeMid] == target) {
            System.out.print(beforeMid + " ");
            beforeMid--;
        }

        // Go right
        while (afterMid < arr.length && arr[afterMid] == target) {
            System.out.print(afterMid + " ");
            afterMid++;
        }

        System.out.println(); // Line break
    }

    public static int BS(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int ES(int[] arr, int target) {
        if (arr.length == 0) return -1;
        if (arr[0] == target) return 0;

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }

        return BS(arr, i / 2, Math.min(arr.length - 1, i), target);
    }

    public static void main(String[] args) {
        int[] my_arr = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9, 10, 11, 12};
        int my_tar = 7;

        int index = ES(my_arr, my_tar);
        NS(my_arr, index, index, my_tar);
    }
}