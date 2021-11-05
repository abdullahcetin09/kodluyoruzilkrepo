import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double deger ,kdvli,kdvorani,kdv ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir tutar giriniz ?");
        deger=inp.nextDouble();
        inp.close();
        if(deger <=1000){kdvorani= 0.18;}
        else{kdvorani=0.08;}
        kdv=deger*kdvorani;
        kdvli=deger+kdv;
    
        System.out.println("Girdiğiniz tutara ait KDV oranı : " + kdvorani +"\nKDV tutarı : "+ kdv+"\nKDV'li tutar : "+kdvli+"\nKDV'siz tutar : "+deger);
        
      








    }


}
