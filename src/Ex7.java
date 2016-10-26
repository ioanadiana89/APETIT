/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex7 {
    /*
7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
 de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8

     */
    public static void main(String[] args) {
        int[] sir = {11, 13, 9, 8, 16, 3, 65, 20};
        for (int i=0; i<sir.length-1; i++){
            if (sir[i]>sir[i+1]) {
                System.out.println(sir[i]+"; "+sir[i+1]);
            }
        }
    }
}
