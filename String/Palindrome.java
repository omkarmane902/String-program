public class Palindrome {
    

    public static void main(String[] args) {
        
      String sTR = "madam";

      String reversed  = "";

      
    

      for(int i = sTR.length()-1; i >= 0 ; i --)
      {
          reversed += sTR.charAt(i);
      }


      if (sTR.equals(reversed))
         {
        System.out.println("String is Palindrome ");
         }
       else 
         {
        System.out.println("String is NOT Palindrome ");
         }

    }
}

