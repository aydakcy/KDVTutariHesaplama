/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
KDV tutarını hesaplayıp ekrana bastıran programı yazın.
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
 */

import java.util.Scanner;

public class PatikaProje {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        double tutar, kdvOran,kdvTutari, kdvliFiyat;

        //Scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer al
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        //KDV'li fiyat ve kdv tutarı hesaplama
        if (0 < tutar & tutar <= 1000) {
            kdvOran = 0.18;
            
        } else {
            kdvOran = 0.8;

        }

        kdvTutari = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.print("KDV'li Tutar : " + kdvliFiyat);
    }
}
