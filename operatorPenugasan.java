public class operatorPenugasan {
    public static void main(String[] args) {
        int a;
        int b;

        // pengisian nilai
        a = 5;
        b = 10;

        // penambahan
        b += a;
        // sekarang b = 15
        System.out.println("Penambahan : " + b);

        // pengurangan
        b -= a;
        // sekarang b = 10 karena (15-5)
        System.out.println("Pengurangan : " + b);

        // perkalian
        b *= a;
        // sekarang b = 50 karena (10*5)
        System.out.println("Perkalian : " + b);

        // pembagian
        b /= a;
        // sekarang b = 10 karena (50/5)
        System.out.println("Pembagian : " + b);

        // sisa bagi
        b %= a;
        // sekarang b = 0 karena (10/5 sisa 0)
        System.out.println("Sisa bagi : " + b);
    }
}
