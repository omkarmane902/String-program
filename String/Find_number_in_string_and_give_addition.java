public class Find_number_in_string_and_give_addition {

    public static void main(String[] args) {

        String s1 = "omkar 1x=2a3 mane 9a6a1a7";
        int sum = 0;
        int num = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');  // नंबर तयार करणे
            } else {
                sum = sum + num;  // नंबर add करणे
                num = 0;          // reset करणे
            }
        }

        sum = sum + num; // शेवटचा नंबर add करणे

        System.out.println("Sum of numbers in string: " + sum);
    }
}
