import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = veri.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = veri.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = veri.nextInt();

        System.out.print("Türk.e notunuzu giriniz: ");
        turkce = veri.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = veri.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = veri.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        boolean sonuc = ortalama >= 60;
        String dönemsonu = ( sonuc ? "Geçtiniz. " : "Kaldınız. ");
        System.out.print("Ortalamanız: "+ ortalama +" " + dönemsonu);

    }
}