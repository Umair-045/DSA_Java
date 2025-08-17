class Student{
    String name;

    public Student(String name){
        this.name = name;
    }
}

public class BinarySearchCustom {
    public static int BSC(String [] arr , String target , int start,int end){

        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid].equals(target) ){
                return mid;
            } else if ( arr[mid].compareTo(target) < 0 ) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static String[] sort(String[] arr){
        for (int i=0 ; i< arr.length;i++){
            for (int j=0 ; j< arr.length-1;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Umair");
        Student s2 = new Student("Alam");
        Student s3 = new Student("Ahmed");
        Student s4 = new Student("Hasnain");
        Student s5 = new Student("Umar");

        String[] names = {s1.name,s2.name,s3.name,s4.name,s5.name};
        names = sort(names);

        System.out.print("Sorted Array  : ");
        for (String name : names){
            System.out.print(name+" ");
        }

        System.out.println();

        String targ = "Umair";
        int result = BSC(names,targ,0, names.length-1);

        if (result != -1){
            System.out.println("Name Found at index : "+result);
        }
        else {
            System.out.println("Name Not Found");
        }
    }

}
