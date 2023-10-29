package java101;

import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        double yaricap, merkezAci;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        yaricap = input.nextDouble();
        System.out.print("Merkez açıyı giriniz: ");
        merkezAci = input.nextDouble();
        double pi = 3.14;

        double alan = (pi*(yaricap*yaricap)*merkezAci)/360;
        System.out.print("Daire dilimi alanı: " + alan);
    }
}
