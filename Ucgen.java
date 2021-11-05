import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,alan,cevre;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dik kenar ölçülerini giriniz");
        kenar1=inp.nextDouble();
        System.out.println("Dik kenar ölçülerini giriniz");
        kenar2=inp.nextDouble();
        inp.close();
        kenar3=Math.sqrt(Math.pow(kenar1, 2)+Math.pow(kenar2, 2));
        cevre=kenar1+kenar2+kenar3;
        alan=Math.sqrt((cevre/2)*((cevre/2)-kenar1)*((cevre/2)-kenar2)*((cevre/2)-kenar3));
                
        System.out.println("üçüncü kenar uzunluğu : "+kenar3+"\nüçgenin alanı : "+ alan+"\nüçgenin çevresi :"+cevre);
        
    }
    
}
