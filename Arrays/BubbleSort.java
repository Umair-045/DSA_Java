public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3,6};
        int size = 6;
        System.out.print("Unsorted Array :");
        for (int i = 0 ;i<size;i++){
            System.out.print(" " +arr[i]);
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array :");
        for (int i=0;i<size;i++){

            System.out.print(" "+arr[i]);
        }
    }
}
