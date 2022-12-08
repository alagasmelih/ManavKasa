import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut= 2.14, elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutkg,elmakg,muzkg,patlicankg,toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?");
        armutkg=input.nextDouble();
        System.out.println("Elma kaç kilo ?");
        elmakg = input.nextDouble();
        System.out.println("Muz kaç kilo ?");
        muzkg = input.nextDouble();
        System.out.println("Patlıcan kaç kilo ?");
        patlicankg = input.nextDouble();

        toplam = armut*armutkg+elma*elmakg+muz*muzkg+patlican*patlicankg;

        System.out.println("Toplam tutar: " + toplam + "TL");
    }
}