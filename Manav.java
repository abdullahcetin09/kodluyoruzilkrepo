import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        int armut,elma ,domates, muz ,patlican;
        double tutar;
        tutar=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        armut =in.nextInt();
        tutar +=(armut*2.14);
        System.out.print("Elma Kaç Kilo ? ");
        elma =in.nextInt();
        tutar +=(elma*3.67);
        System.out.print("Domates Kaç Kilo ? ");
        domates=in.nextInt();
        tutar +=(domates*1.11);
        System.out.print("Muz Kaç Kilo ? ");
        muz =in.nextInt();
        tutar +=(muz*0.95);
        System.out.print("Patlıcan Kaç Kilo ? ");
        patlican =in.nextInt();
        tutar +=(patlican*5.00);
        System.out.print("Toplam Tutar :"+tutar+" TL");
        in.close();
    }
    
}
