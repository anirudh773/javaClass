import java.util.*;


class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ct = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ' && Character.isLetter(str.charAt(i + 1)) && (i > 0)) {
                ct++;
            }
        }
        ct++;

        System.out.println("Total number of words in the string: " + ct);
        
    sc.close();
    }
}
