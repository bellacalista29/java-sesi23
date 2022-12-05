import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        double biayaAdmin = 2000;
        double bunga = 0.02;
        double saldo;
        double hasilBunga;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input saldo : ");
        saldo = scan.nextDouble();

        if(saldo >= 10000)
        {
            hasilBunga = saldo*bunga;
            System.out.println("Saldo anda : " + (saldo + hasilBunga));
        }
        else if(saldo < 2000)
        {
            System.out.println("Saldo anda : " + saldo);
        }
        else
        {
            System.out.println("Saldo anda : " + (saldo + biayaAdmin));
        }
    }
}
