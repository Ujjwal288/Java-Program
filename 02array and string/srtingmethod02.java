public class srtingmethod02 {
    public static void main(String[] args) {
         //String concatenation 
        String firstName = "Ujjwal";
        String lastName = "Kumar" ;
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //length of string :
        System.out.println(fullName.length());

        //charAt : It will print every element of string
        for(int i =0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2) == 0) {
            System.out.println("string are equal");
        }
        else {
            System.out.println("string are not equal");
        }

        //substring
        //end index in take end-1
        //by default it take end index last index
        String sentance = "my name is ujjwal";
        String senc = sentance.substring(3,8);
        String s = sentance.substring(8);
        System.out.println(senc);
        System.out.println(s);
    }
}
//Strings are immmutable.