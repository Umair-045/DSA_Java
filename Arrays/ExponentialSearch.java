


public class ExponentialSearch {
    public static int BS(int[]arr,int start,int end,int target){
        while(start<=end){
            int mid = (start+end)/2;

            if (arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int ES(int[] arr , int target){
        if(arr[0] == target){
            return 0;
        }
        int i = 1;
        while(i< arr.length && arr[i]<= target){
            i = i*2;
        }
        return BS(arr , i/2 , Math.min(arr.length-1 , i  ) , target);
    }

    public static void main(String[] args) {

        int [] my_arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int my_tar = 7;

        System.out.println(ES(my_arr , my_tar));

    }

}
