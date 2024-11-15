public class Swap2Numbers {
    public static void main(String... a) {
        int num1 = 5, num2 = 10;
        swap1(num1, num2);
        swap2(num1,num2);
    }

    static void swap1(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }

    static void swap2(int n1, int n2) {
        n1 ^= n2;
        n2 ^= n1;
        n1 ^= n2;

        System.out.println(n1);
        System.out.println(n2);
    }
}
