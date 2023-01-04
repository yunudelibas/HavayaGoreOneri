package Donguler;

import java.util.Scanner;

public class HavayaGoreOneri {
    public static void main(String[] args) {
        int sicaklik;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Hava Sıcaklığı Bugün:");
        sicaklik=girdi.nextInt();
        if (sicaklik<5){
            System.out.println("Kayak Yapmaya gidebilirsiniz.");
        } else if (sicaklik<=25) {
            if (sicaklik<=15)
                System.out.println("Sinemaya gidebilirsiniz");
            if (sicaklik>=10)
                System.out.println("pikniğe gidebilirsiniz.");

        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
