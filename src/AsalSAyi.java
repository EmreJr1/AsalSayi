import java.util.Scanner;

public class AsalSAyi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 ile N arasındaki Asal Sayıları bulan program");
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        System.out.println("0 ile " + n + " arasındaki asal sayılar:");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num+" , ");
            }
        }

        input.close();
    }
}
