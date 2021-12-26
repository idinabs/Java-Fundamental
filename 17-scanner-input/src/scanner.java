import java.util.Scanner;

public class scanner {
    public static void main (String[] args){
        Scanner unitInput = new Scanner(System.in);
        int panjang, lebar, tinggi,luas, keliling;

        // luas persegi panjang
        System.out.println("=====Luas Persegi Panjang=====");
        System.out.print("Panjang: ");
        panjang = unitInput.nextInt();
        System.out.print("Lebar: ");
        lebar = unitInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Panjang x lebar = " + luas);


        // volume persegi panjang
        System.out.println("=====Menghitung Volume Persegi Panjang=====");
        System.out.print("tinggi: ");
        tinggi = unitInput.nextInt();
        System.out.println("Keliling Persegi Panjang: " + luas * tinggi);



        // keliling persegi panjang
        System.out.println("=====Menghitung Keliling Persegi Panjang=====");
        keliling = 2 * panjang * lebar;
        System.out.println("Keliling persegi panjang: " + keliling);


    }
}
