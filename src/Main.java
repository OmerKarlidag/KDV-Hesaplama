import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        double tutar, kdvOran, kdvliTutar, kdvTutar;

        //Scanner sınıfı tanımla
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri al
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        //Değişkenleri tanımla
        kdvOran = (tutar <= 1000) ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;

        //Alınan veriyi yazdır
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
