/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex6 {
    /*
    6. Sa se calculeze factorialul unui numar a .
    factorialul este definit asa:
    factorial  = 1*2*3*4….*a

    de ex pentru a = 4, factorialul este 1*2*3*4
    */
    public static void main(String[] args) {
        int a =SkeletonJava.readIntGUI("Introduceti numarul a: ");
        int result = 1;
        for (int i = 0; i < a; i++) {
            result =  result *(i+1);
        }
        SkeletonJava.printGUI("( " + a + " factorial) Rezultatul este " + result );
    }
}
