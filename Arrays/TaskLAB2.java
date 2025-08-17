public class TaskLAB2 {
    public static void main(String[] args) {
        String[] a = {"Mehran","NED","UET","Mehran","Dawood","Mehran"};
        String target = "Mehran";
        int count = 0;

        for
        (int i=0;i< a.length;i++){
            if(a[i].equalsIgnoreCase(target)){
                count++;
                if(count==3){
                    System.out.println("Word Found at index :"+i);
                }
            }
        }
    }
}
