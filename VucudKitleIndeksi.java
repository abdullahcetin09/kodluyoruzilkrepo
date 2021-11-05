import java.util.Scanner;

public class VucudKitleIndeksi {
    public static void main(String[] args) {
         
        float boy , kilo;

        Scanner in=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=in.nextFloat();
        System.out.print("\nLütfen kilonuzu giriniz :");
        kilo=in.nextFloat();
        System.out.print("\nVücut Kitle İndeksiniz :"+ (kilo/(boy*boy)));
        in.close();
    }
    
}
