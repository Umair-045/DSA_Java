class DynArray {
    private String arr[];
    private int size = 0, check = 0;

    public DynArray(int size){
        this.size = size;
        arr = new String[size];
    }

    private void resize(){
        size += 10;
        String dummy[] = new String[size];
        for(int i = 0; i < arr.length; i++){
            dummy[i] = arr[i];
        }
        arr = dummy;
    }

    public void add(String val){
        if (check == size){
            resize();
        }
        arr[check++] = val;
    }

    public void delete(){
        if (check == 0) {
            System.out.println("Array is already empty.");
            return;
        }
        check--;
    }

    public void display(){
        for(int i = 0; i < check; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] SearchMultiple(String val) {
        int[] dummy = new int[arr.length];
        int count = 0;
        if (check == 0) {
            System.out.println("Array is full");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].toLowerCase().contains(val)) {
                    dummy[count] = i;
                    count++;
//                        return i;
                }
            }
            int[] arr1 = new int[count];
            for (int i = 0; i < count; i++) {
                arr1[i] = dummy[i];
            }
            return arr1;
        }

        return dummy;
    }
}
public class SearchMultiple {
    public static void main(String[] args) {
        DynArray dyn = new DynArray(4);
        dyn.add("UMAR");
        dyn.add("UMAIR AlI");
        dyn.add("Hasnain Ali");
        dyn.add("Daniyal ali");


//        dyn.delete();

        int[] a = dyn.SearchMultiple("ali");
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
//        dyn.display();
    }
}



