import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r , alan, cevre , pi= 3.14 , alfa, daireDilim ;

        Scanner read = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz.");
        r= read.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi :" + cevre);


        System.out.println("Merkez açının ölçüsünü giriniz.");
        alfa = read.nextDouble();

        daireDilim = (pi*(r*r)*alfa)/360;
        System.out.println("Daire diliminin alanı :" + daireDilim);

    }

}
