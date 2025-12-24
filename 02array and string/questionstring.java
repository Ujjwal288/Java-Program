//Reverse a string
public class questionstring {
    public static void main(String[] args) {
        //Method 1 : Using loop
        String s = "Hello";
        String reverse = "";
        for(int i = s.length()-1 ; i>=0;i--) {
            reverse+=s.charAt(i);
        }
        System.out.println("Reverse string : " + reverse);

        //Method 2: Using Setbuilder
        String original = "Ujjwal";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed string :" + reversed);

        //Method 3 : It will reverse that string only
        StringBuilder str = new StringBuilder("Hello");
        for(int i=0;i<=str.length()/2;i++) {
            int front = i;
            int back = str.length()-1-i;
            
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front,backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
}
