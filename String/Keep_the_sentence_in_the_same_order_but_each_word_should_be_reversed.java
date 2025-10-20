public class Keep_the_sentence_in_the_same_order_but_each_word_should_be_reversed {
    
    public static void main(String[] args) {
        
         
        
        String s = "Plan a surf trip to Costa Rica in August";
        String ans = "";

        String[] arr = s.split(" ");

        // Loop through each word
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String rev = "";

            // Reverse each word character by character
            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }

            ans += rev + " ";
        }

        System.out.println(ans.trim());
    }

         
    }

