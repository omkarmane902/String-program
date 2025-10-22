public class Compress_String {
    
public static void main(String[] args) {
    
String str = "aaabbbbbzzzonknjnnn";

System.out.println(Compress(str));

}

public static String Compress(String str) {
   
   String ans = ""; 
   int count  = 1;

   for (int i = 0 ,j = i+1; i < str.length(); ) 
   {
      if (j< str.length() && str.charAt(i)==str.charAt(j)) {

           count ++;
           j++;

      } 
      else
      {
        ans+=str.charAt(i);
        ans +=count;

        i = j;
        j = i + 1;
        count = 1;
      }
     
   }
    return ans;
}
}

