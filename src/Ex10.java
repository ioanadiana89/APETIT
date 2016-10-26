/**
 * Created by Manuela on 26.10.2016.
 */

public class Ex10 {
    /*
    10. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,
    iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare
    si numerele asa cum sunt in sir daca sunt pare.
     */
    public static void main(String[] args) {
        int[] sir = {2, 8, 96, 62, 42, -10, 12, 15, -3, 24, 11, -2};
        for (int i = 0; i < sir.length / 2; i++) {
            System.out.println(sir[i] * 2);
        }
        for (int i = sir.length / 2; i < sir.length; i++) {
            if (sir[i] % 2 == 0) {
                System.out.println(sir[i] * 3);
            } else {
                System.out.println(sir[i]);
            }
        }
    }
}


