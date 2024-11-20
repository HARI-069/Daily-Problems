public class Pangram {
    public static void main(String[] args) {
        String input1 = "A quick brown fox jumps over the lazy dog";
        String input2 = "All i am is a man. I want the world in my hands";

        System.out.println( isPangram(input1));
        System.out.println( isPangram(input2));
    }

    static boolean isPangram(String str) {
        String newStr = str.toLowerCase();
        if(str.length() < 26) {
            return false;
        }else {
            for (char i='a'; i<='z'; i++) {
                if(newStr.indexOf(i) < 0) return false;
            }
        }
        return true;
    }

}
