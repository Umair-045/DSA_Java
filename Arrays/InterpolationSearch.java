public class InterpolationSearch {
    public static int interpolationSearch(int[] arr,int target) {
        int start = 0, end = arr.length-1;
        int pos = start + ((target - arr[start]) * (end - start)) / (arr[end] - arr[start]);
        if (arr[pos]==target) {
            return pos;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 16;
        System.out.println("TARGET FOUND AT INDEX : " + interpolationSearch(arr, target));
    }
}
