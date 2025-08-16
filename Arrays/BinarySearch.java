public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int target = 5;
        int start = 0;
        int end = a.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (a[mid]<target){
                start  = mid+1;
            }
            else if (a[mid]>target) {
                end = mid-1;
            }
            else {
                System.out.println(mid);
                break;
            }
        }

    }
}
