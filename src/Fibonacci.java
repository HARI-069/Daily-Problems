public class Fibonacci {
    public static void main(String... a) {
        int inputNum = 10;
        fibonacci(inputNum);
    }

    static void fibonacci(int num) {
        int first = 0, second = 1, next;

        for(int i = 0; i < num; i++) {
            if(i <= 1) next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);
        }
    }
}
