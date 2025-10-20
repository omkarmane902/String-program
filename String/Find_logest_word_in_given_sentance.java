
public class Find_logest_word_in_given_sentance {
    
public static void main(String[] args) {
    

    String s1 = "What can I help with? Message ChatGPT. Quiz me on vocabulary. Plan a surf trip to Costa Rica in August.";
    String Longest = " ";

     String [] arr = s1.split(" ");

     for(int i = 0 ; i <arr.length; i++)
     {
         if (Longest.length() < arr[i].length()) {

             Longest =arr[i];
         }
     }
   
      System.out.println("Longest word: " +Longest);
    
          
      }
    
}






