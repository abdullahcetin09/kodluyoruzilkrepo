import java.util.Scanner;

public class OrtlamaHesaplama {
    public static void main(String[] args) {
        int  not1 ,not2, not3 ;
        double ortalama;
        boolean kosul;
        Scanner inp = new Scanner(System.in);
        
        // Matematik 
        System.out.println("Matematik dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Matematik dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Matematik dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Matematik notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        String str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        // Fizik 
        System.out.println("Fizik dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Fizik dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Fizik dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Fizik notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        // Kimya
        System.out.println("Kimya dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Kimya dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Kimya dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Kimya notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        // Türkçe
        System.out.println("Türkçe dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Türkçe dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Türkçe dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Türkçe notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        // Tarih
        System.out.println("Tarih dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Tarih dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Tarih dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Tarih notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        // Müzik
        System.out.println("Müzik dersinden aldığınız ilk sınav notunuz kaçtır ?");
        not1=inp.nextInt ();
        System.out.println("Müzik dersinden aldığınız ikinci sınav notunuz kaçtır ?");
        not2=inp.nextInt ();
        System.out.println("Müzik dersinden aldığınız üçüncü sınav notunuz kaçtır ?");
        not3=inp.nextInt ();
        ortalama=(not1+not2+not3)/3;
        System.out.println("Müzik notlarınızın aritmatik ortlaması: " + ortalama);
        kosul =ortalama >=60 ;
        str=kosul ?" Tebrikler... Geçtiniz":"Üzgünüz! Kaldınız";
        System.out.println(str); 
        


    }
    
}
