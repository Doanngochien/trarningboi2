import java.util.Scanner;

public class bailamlai{
    public static void main(String[] args) {
        System.out.println("nhập số nguyên thứ nhất");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhập số nguyên thứ hai");
        int b = scanner.nextInt();
        int tongHaiSo = a + b ;
        System.out.println(tongHaiSo);
    }
}

