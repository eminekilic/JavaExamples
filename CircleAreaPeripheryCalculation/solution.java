/*
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int dk1,dk2;
        double hipotenus,alan,u;
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("ucgenin iki dik kenar uzunlugunu giriniz--> ");
        dk1 = okuyucu.nextInt();
        dk2 = okuyucu.nextInt();
        hipotenus = Math.sqrt((dk1*dk1)+(dk2*dk2));
        u = (dk1+dk2+hipotenus)/2;
        alan = Math.sqrt(u*(u-dk1)*(u-dk2)*(u-hipotenus));
        System.out.println("hipotenüs:"+hipotenus+"   alan:"+alan);




    }
}