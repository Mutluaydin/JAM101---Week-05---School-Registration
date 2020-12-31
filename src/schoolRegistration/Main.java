package schoolRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){

        Ogrenci[] ogrencis = createOgrenci(1);
        for (Ogrenci ogrenci:ogrencis) {
            System.out.println("Ogrencinin Adi: " + ogrenci.getFirstName() + "\n" + "Soyadi: " + ogrenci.getLastName()
                    + "\n" + "Yasi: " + ogrenci.getAge()+ "\n" + "Ogrenci No "  + ogrenci.getOgrenciNo());
        }
    }

    private static Ogrenci[] createOgrenci(int n){
       Ogrenci[] ogrencis = new Ogrenci[n];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            Ogrenci ogrenci = new Ogrenci();

            System.out.println((i + 1) + ". Ogrencinin ismini giriniz: ");
            ogrenci.setFirstName(input.nextLine());
            //System.out.println(name.toUpperCase(Locale.ROOT));

            System.out.println((i + 1) + ". Ogrencinin soyismini giriniz: ");
            ogrenci.setLastName(input.nextLine());
            // System.out.println(lastName.toUpperCase(Locale.ROOT));

            System.out.println((i + 1) + ". Ogrencinin yasini giriniz: ");
            ogrenci.setAge(input.nextInt());

            while (6 > ogrenci.getAge() || ogrenci.getAge() > 10) {
                System.out.println("Ogrencinin yasini 6 ile 10 arasi bir deger giriniz: ");
                ogrenci.setAge(input.nextInt());
            }

            ogrenci.setOgrenciNo(ogrenci.getFirstName().substring(0, 2).toUpperCase() +
                    ogrenci.getLastName().substring(ogrenci.getLastName().length() >3? ogrenci.getLastName().length()-3 : 0).toUpperCase()
                    + ogrenci.getAge());
            ogrencis[i] = ogrenci;
        }
       return ogrencis;
    }

    private static Sinif[] createSiniflar(Ogrenci[] ogrencis){
        Sinif[] sinifs = new Sinif[5];

        return sinifs;
    }

}
