import java.util.Arrays;

public class Convert_into_string_to_array {
    

    public static void main(String[] args) {
        

        String s1 = "Omkar mane";

        char [] arr = new char[s1.length()];


        for (int i = 0; i < s1.length(); i++) {
              
            arr[i] = s1.charAt(i);
            
        }

        System.out.println(Arrays.toString(arr));
    }
}
