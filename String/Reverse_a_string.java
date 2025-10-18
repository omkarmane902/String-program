
public class Reverse_a_string {

    public static void main(String[] args) {
        
      String s1 = "Hi Omkar";
      
      String reversed  =" ";

      for(int i =s1.length()-1 ; i >= 0; i-- )
      {
             reversed += s1.charAt(i);
      }


      System.out.println("Reversed String: " + reversed);


    }
    
}
