import sun.font.TrueTypeFont;

/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex4 {
    /*
    4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.
     */
    public static void main(String[] args) {

        while (true) {
            int nrCurent = SkeletonJava.readIntGUI("Introduceti numarul: ");
            if (nrCurent>=9 && nrCurent<=24){
                SkeletonJava.printGUI("true");
            }
            else{
                SkeletonJava.printGUI("false");
            }

        }
    }
}
