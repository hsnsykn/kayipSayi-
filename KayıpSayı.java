
import java.util.Arrays;

/**
 * bir dizinin sıralı elemanları içerisinde 0'a en yakın kayıp olan tamsayıyı
 * bulunuz int dizi[] = {6,2,3,4,7,9}; sonuc = 5 int dizi[] = {2,4,7,6,5,3,0};
 * sonuc = 1 int dizi[] = {-1,-3,-4,0}; sonuc = 0 int dizi[] = {1,3,4,2}; sonuc
 * = 5
 */
public class KayıpSayı {

    public static void main(String[] args) {
        int dizi[] = {-6, -2, -3, -5, -7};
        Arrays.sort(dizi, 0, dizi.length);
        for (int k = 0; k < dizi.length; k++) {
            System.out.print(" " + dizi[k]);
        }
        System.out.println("");
        int min = dizi[0];
        for (int k = 0; k < dizi.length; k++) {
            if (dizi[k] != min + k) {
                System.out.println((min + k) + " sayısı eksiktir.");
                break;
            } else if (dizi.length + min == dizi[k] + 1) {
                System.out.println(dizi.length + min + " sayısı eksik");
            }
        }
        System.out.println("Ufuk ÇELİK çözüm");
        for (int k = 1; k < dizi.length; k++) {
            if (dizi[k] - dizi[k - 1] != 1) {
                System.out.println("Kayıp sayı = " + (dizi[k] - 1));
                break;
            }
        }

    }
}
