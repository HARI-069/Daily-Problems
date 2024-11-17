public class Prime {
    public static void main(String[] args) {
        int inputNum1 = 7;
        int inputNum2 = 15;
        System.out.println(isPrime(inputNum1));
        System.out.println(isPrime(inputNum2));
    }

    static boolean isPrime(int num){
        for (int i = 2; i*i < num; i++) if(num % i == 0) return false;
        return true;
    }
}
