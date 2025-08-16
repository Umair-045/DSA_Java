public class SecondMaximum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for (int i =0 ; i<a.length; i++) {
            if (a[i] > max) {
                sec_max = max;
                max = a[i];
            } else if (a[i] > max && a[i] < sec_max) {
                sec_max = a[i];
            }
        }
            if(sec_max==Integer.MIN_VALUE){
                System.out.println("No Second Maximum Value ");
            }
            else {
                System.out.println("The Maximum Value is :"+max);
                System.out.println("The Second Maximum Value is :"+sec_max);
            }

    }
}
