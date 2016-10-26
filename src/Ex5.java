/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex5 {
    /*
    5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n
de ex
a = 3
b = 2
se va calcula 3*3

a = 3
b = 5
se va calcula 3*3*3*3*3
     */
    public static void main(String[] args) {
        int a =SkeletonJava.readIntGUI("Introduceti numarul a: ");
        int b =SkeletonJava.readIntGUI("Introduceti numarul b: ");
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        SkeletonJava.printGUI(a + " la puterea " + b + " = " + result );
    }
}
