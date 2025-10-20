public class subsequence {
    
    public static void main(String[] args) {
        
        String S = "Plan a surf trip to Costa Rica in August";

        int Start = 4;
        int end = 10;
        String ans = "";

        for (int i = Start; i < end; i++) {
            
            ans += S.charAt(i);
        }

        System.out.println(ans);
    }
}
