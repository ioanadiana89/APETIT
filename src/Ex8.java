/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex8 {
    /*
    8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
    suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .
    exemplu: x = 4;  n=5
    suma = 1 + 4 +(4*4)+(4*4*4) +(4*4*4*4) +(4*4*4*4*4)
     */
    public static void main(String[] args) {
        int x =SkeletonJava.readIntGUI("Introduceti numarul x: ");
        int n =SkeletonJava.readIntGUI("Introduceti numarul n: ");
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = 1+ result * x;
        }
        SkeletonJava.printGUI("x = " + x + "; n = " + n + " Rezultatul este " + result );
    }
}
