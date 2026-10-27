public class Main {

    static void print(int n) {
        if (n == 0) {
            return; // Base case
        }

        System.out.println(n);

        print(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        print(5);
    }
}