import java.util.Scanner;
public class ShowFirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố đầu tiên cần in ra: ");
        int num = scanner.nextInt();
        int count = 0;
        System.out.println(num + " số nguyên tố đầu tiên cần in ra là: ");
        boolean check = true;
        int n=2;
        while (count < num) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                } else {
                    check=true;
                }
            }
            if (check==true){
                count++;
                System.out.print(n+", ");
            }
            n++;
        }
    }
}
