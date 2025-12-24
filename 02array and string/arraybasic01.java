//Collection of similar kind of data

//Intialization :  type [] arrayName = new type[size];
//new keyword is used to take a space in memory for non primitive datatype

public class arraybasic01 {
    public static void main(String[] args) {
        //Method 
        int arr [] = {8,95,96};
        for(int i=0;i<=3;i++) {
            System.out.println(arr[i]);
        }

        int [] marks = new int [3];
        marks[0] = 98;
        marks[1] = 95;
        marks[2] = 96;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for(int j=0;j<=3;j++) {
            System.out.println(marks[j]);
        }
    }
}

