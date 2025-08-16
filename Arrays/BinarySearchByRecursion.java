public class BinarySearchByRecursion {
    public static int BSR(int[]arr , int target , int start,int end ){
        if (start<=end){
            int mid = start+(end-start)/2; 
            if (target>arr[mid]){
                return BSR(arr, target,mid+1,end);
            } else if (target<arr[mid]) {
                return BSR(arr,target,start,mid-1);
            }
            else{
                return mid;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] my_arr = {1,2,3,4,5,6,7};
        int my_target = 6;
        int strt = 0;
        int en = my_arr.length-1;

        int result = BSR(my_arr,my_target,strt, en);

        if(result!=-1){
            System.out.println("The value found at index :"+result);
        }
        else {
            System.out.println("The Target Not found");
        }
    }
}
