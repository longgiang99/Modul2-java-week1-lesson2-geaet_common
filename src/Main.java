import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = scanner.nextInt();
        System.out.println("nhap so b");
        int b = scanner.nextInt();
        if ( a == 0 || b == 0){
            System.out.println("khong cos UCLN");
        }
        while ( a!=b ){
            if ( a > b)
                a -= b;
            else b -= a;
        }
        System.out.println(" UCLN  la: "+ a);
    }
}