/**
 * Created by Manuela on 26.10.2016.
 */
import java.util.Arrays;
public class Ex9 {
    /*
    9. Se da un sir. Sa se verifice daca sirul este ordonat crescator ,
    iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
    de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}
    si va ordina si afisa {2,3,4}
     */
    public static void main(String[] args) {
        int[] sir = {11, 13, 9, 8, 16, 3, 65, 20};
        Arrays.sort(sir);
        for (int number : sir) {
            System.out.println("Number = " + number);
        }
    }
}
