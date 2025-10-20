
import java.util.Arrays;

public class Anagram {
    

    public static void main(String[] args) {
        
     String s = "listen";
     String s1 = "silent";


     char [] arr1 = s.toCharArray();

     char [] arr2 = s1.toCharArray();


     Arrays.sort(arr1);
     Arrays.sort(arr2);

    Arrays.equals(arr1, arr2);

    if(Arrays.equals(arr1, arr2) == true)
    {
            System.out.println("It is Anagram");
    }
    else
    {
        System.out.println("It is not Anagram");
    }
        
    }
}
