package schoolRegistration;

import java.util.Locale;
import java.util.Scanner;


public class Ogrenci {
     String [] name = new  String[2];
     String []lastName = new String [2];
     int [] age = new int[2];
     String [] no= new String[2];

        public Ogrenci(int no, String name, String lastName, int age){

        }

    public Ogrenci() {


    }


    public void setOgrenci(){


            Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println(i+1 +". Ogrencinin ismini giriniz: ");
            name[i] = input.next();
            //System.out.println(name.toUpperCase(Locale.ROOT));


            System.out.println(i+1 +". Ogrencinin soyismini giriniz: ");
            lastName[i] = input.next();
            // System.out.println(lastName.toUpperCase(Locale.ROOT));

            System.out.println(i+1 +". Ogrencinin yasini giriniz: ");
            age[i] = input.nextInt();

            if (6 > age[i] || age[i] >10){
                System.out.println("Ogrencinin yasini 6 ile 10 arasi bir deger giriniz: ");
                age[i] = input.nextInt();
            }

            String nm = name[i];
            String lstnm = lastName[i];
            System.out.println(i+1 +". Ogrencinin Numarasi: " + nm.substring(0,2).toUpperCase(Locale.ROOT)+
                    lstnm.substring(lastName[i].length()-3).toUpperCase(Locale.ROOT)
                    +age[i]);
        }

        }

}
