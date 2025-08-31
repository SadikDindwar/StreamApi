package example;


//Strings
public class Practice1{
    public static void main(String[] args) {
        String str = "john";
        String str2 = "john";
        System.out.println(str == str2);
        String str3 = new String("john").intern();
        System.out.println(str3 == str);
        //System.out.println(str3.equals(str));
        String [] arr ={"hello", "hi", "how", "are","you"};
        String str4 = String.join("," , arr);
        System.out.println(str4);
    }

}