//Strings in Java are Immutable : We cannot add or modify string once it is created
//To overcome this problem we use String Builder
public class stringBuilder01 {
    public static void main(String[] args) {
        //Initalization :
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at :
        System.out.println(sb.charAt(2));
        //set character at index :
        sb.setCharAt(0, 'S');  //T will replace with S output - Sony
        System.out.println(sb);
        //Insert :
        sb.insert(0,'T');
        System.out.println(sb);  //It will insert T at index 0. Output: TSony
        //Delete 
        sb.delete(0,1);
        System.out.println(sb);   //It will delete T
        //Append : It will add in the end 
        StringBuilder strB = new StringBuilder("H");
        strB.append("e");
        strB.append("l");
        strB.append("l");
        strB.append("o");
        System.out.println(strB);  //output : Hello
        //lenght
        System.out.println(strB.length());
    }
}
