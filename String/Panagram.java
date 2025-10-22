public class Panagram {
    
    public static void main(String[] args) {
        
      String s = "The quick brown fox jumps over the lazy dog";

         boolean ans= PanagramCheck(s);

        if (ans == true)
         {
          System.out.println("It is  Panagram");
         } 
        else {
             System.out.println("It is not Panagram");
        }
    }


    public static boolean PanagramCheck(String s) {
        

      s =  s.toLowerCase();

         for(char ch = 'a'; ch < 'z'; ch++)
         {
           if(s.indexOf(ch)== -1)
           {
              return false; 
           }
         }
         return true; 


    }
}
