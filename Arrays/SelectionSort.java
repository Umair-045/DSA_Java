public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        int size = arr.length;
        for (int i = 0 ; i<size-1; i++){
            int si = i ;
            for (int j=i+1 ; j<size ; j++){
                if(arr[j]<arr[si]){
                    si = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[si];
            arr[si] = temp;
        }
        for (int i = 0 ; i<size; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
