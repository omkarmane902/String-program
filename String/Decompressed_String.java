public class Decompressed_String {
    public static void main(String[] args) {
        

        String str = "a3b2c4";
        
        String ans = " ";

       for (int i = 0; i < str.length(); i++) {
           
               char ch = str.charAt(i);

               if (Character.isLetter(ch)) {
                  
                int num = str.charAt(i + 1) -'0';

                for(int j = 0; j < num; j++){
                             
                   ans = ans + ch; 
                }
               }

       }

       System.out.println(ans);
    }
}
