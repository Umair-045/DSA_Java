public class searchingTask {
    public static void main(String[] args) {
        int[] a = {1,2,1,3,1,4,1,5};
        int[] b = new int[5];

        int target = 1;
        int count = 0;

        for (int i=0;i<a.length;i++){
            if(a[i]==target){
                count++;

            for (int j=0;j<count;j++) {
                b[count] = i;
            }}
        }
        for (int i =0; i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
