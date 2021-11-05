import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double pi,r,aci,alan,alan1,cevre;
        pi=3.14;
        Scanner inp=new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz. ");
        r=inp.nextDouble();
        System.out.println("Alanını öğrenmek istediğiniz Daire diliminin açısını giriniz. ");
        aci=inp.nextDouble();
        alan=pi*Math.pow(r,2);
        cevre=2*pi*r;
        alan1=(pi*Math.pow(r, 2)*aci)/360;
        System.out.println(r+" yarı çaplı dairenin alanı :"+alan+"\n cevresi :"+cevre+"\nbelirtiğiniz "+aci+" acıya karşılık gelen daire dilimin alanı :"+alan1);
        inp.close();



    }
}
