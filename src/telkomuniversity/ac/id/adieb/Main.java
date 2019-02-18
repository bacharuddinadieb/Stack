package telkomuniversity.ac.id.adieb;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pil;
        int angkaRand, angka, nilai = 0;

        stackTP4 correct = new stackTP4<Integer>();
        stackTP4 miss = new stackTP4<Integer>();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lets Play Random Number!!!!!");
            for (int i = 5; i >= 1; i--) {
                angkaRand = rand.nextInt(5);
                System.out.println("Kesempatan = " + i);
                System.out.print("Tebak Angka = ");
                angka = input.nextInt();
                if (angka == angkaRand) {
                    correct.push(angka);
                } else {
                    miss.push(angka);
                }

            }

            System.out.println("Angka yg berhasil ditebak: " + correct.size());
            System.out.println("Angka yg gagal ditebak   : " + miss.size());
            nilai += correct.size() * 10;
            System.out.println("Total point: " + nilai);

            System.out.print("Ingin lanjut(Y/N): ");
            pil = input.next();
            if (pil.equalsIgnoreCase("n")){
                System.out.println("Terimakasih!!");
            }else {
                while (!correct.isEmpty()){
                    correct.pop();
                }
                while (!miss.isEmpty()){
                    miss.pop();
                }
            }
        } while (!pil.equalsIgnoreCase("n"));
    }
}
