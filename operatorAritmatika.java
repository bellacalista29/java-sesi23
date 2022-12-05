import java.util.Scanner;

public class operatorAritmatika {
    public static void main(String[] args) {
        double angka1 = 0;
        double angka2 = 0;
        double hasil = 0;

        Scanner keyboard = new Scanner(System.in);

        // System.out.println("Input angka 1 : ");
        // angka1 = keyboard.nextDouble();
        // System.out.println("Input angka 2 : ");
        // angka2 =  keyboard.nextDouble();

        // //penjumlahan
        // hasil = angka1 + angka2;
        // System.out.println("Hasil = " + hasil);

        // System.out.println("Input angka 1 : ");
        // angka1 = keyboard.nextDouble();
        // System.out.println("Input angka 2 : ");
        // angka2 =  keyboard.nextDouble();

        // //perkalian
        // hasil = angka1 * angka2;
        // System.out.println("Hasil = " + hasil);

        // System.out.println("Input angka 1 : ");
        // angka1 = keyboard.nextDouble();
        // System.out.println("Input angka 2 : ");
        // angka2 =  keyboard.nextDouble();

        // //pembagian
        // hasil = angka1 / angka2;
        // System.out.println("Hasil = " + hasil);

        // System.out.println("Input angka 1 : ");
        // angka1 = keyboard.nextDouble();
        // System.out.println("Input angka 2 : ");
        // angka2 =  keyboard.nextDouble();

        // //sisa bagi
        // hasil = angka1 % angka2;
        // System.out.println("Hasil = " + hasil);

        //increment
        hasil = angka1++;
        System.out.println("Hasil increment = " + hasil);

        hasil = angka1--;
        System.out.println("Hasil increment = " + hasil);
    }
}