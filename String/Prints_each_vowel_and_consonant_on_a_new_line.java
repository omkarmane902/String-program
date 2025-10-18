



public class Prints_each_vowel_and_consonant_on_a_new_line {

    public static void main(String[] args) {
        
     String s1 = "Hello World !";

     String  vowel = " ";
     String  consonant = " ";
     String spicalCh = " ";


     for (int i = 0; i < s1.length(); i++) {


             char ch = s1.charAt(i);

             if (ch=='a' || ch == 'i' || ch == 'e'|| ch=='o'||ch=='u' ||ch=='A' || ch == 'I' || ch == 'E'|| ch=='O'||ch=='U') {
                vowel += ch;
             }
             else if(ch >= 'a' && ch<= 'z' || ch >= 'A' && ch<= 'Z')
             {
                  consonant += ch;
             }
             else
             {
                spicalCh +=ch;
             }
         
     }

         System.out.println("Vowels: " + vowel);
         System.out.println("Consonants: " + consonant);
         System.out.println("special characters: " + spicalCh);
    }
}