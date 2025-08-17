//class DynArray {
//    private String arr[];
//    private int size = 0, check = 0;
//
//    public DynArray(int size){
//        this.size = size;
//        arr = new String[size];
//    }
//
//    private void resize(){
//        size += 10;
//        String dummy[] = new String[size];
//        for(int i = 0; i < arr.length; i++){
//            dummy[i] = arr[i];
//        }
//        arr = dummy;
//    }
//
//    public void add(String val){
//        if (check == size){
//            resize();
//        }
//        arr[check++] = val;
//    }
//
//    public void delete(){
//        if (check == 0) {
//            System.out.println("Array is already empty.");
//            return;
//        }
//        check--;
//    }
//
//    public void display(){
//        for(int i = 0; i < check; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public int linearSearch(String val){
//        if(check == 0){
//            System.out.println("Array is full");
//        }
//        else {
//            for (int i=0; i<check; i++){
//                if(arr[i].toLowerCase().contains(val)){
//                    System.out.println("Value :"+val+" found at index :"+i);
//                    return i;
//                }
//            }
//        }
//        return 0;
//    }
//}
//public class Linearsearch {
//    public static void main(String[] args) {
//        DynArray dyn = new DynArray(4);
//        dyn.add("UMAR");
//        dyn.add("UMAIR AlI");
//        dyn.add("Hasnain Ali");
//        dyn.add("Daniyal ali");
//
//
////        dyn.delete();
//        dyn.linearSearch("ali");
////        dyn.display();
//    }
//}
//
//
