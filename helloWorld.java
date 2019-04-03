
public class HelloWorld {
    public static void main(String args[]) {

        System.out.println("First Java practice for Movil Apps \nNumeros pares");
        pairNumbers(20, 0);
        fibonacciNumbers(10);

    }

    // Punto 1
    public static void pairNumbers(int upperlimit, int lowerLimit) {

        while (lowerLimit < upperlimit) {

            if (lowerLimit % 2 == 0) {

                System.out.println(lowerLimit);
            }
            lowerLimit++;
        }

    }

    // Punto 2
    public static void fibonacciNumbers(int limit) {

        int n, f = 0;
        int t1 = 1, t2;
        System.out.println("You are looking the firts " + limit + " Numbers of Fibonacci serie");
        for (int i = 0; i <= limit; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            System.out.println(t1);
        }
    }

    public static void deleteVocals(StringBuilder text) {

        int size = text.length();

    }

}