/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex1 {
    /*
    1. Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
    sirul va fi definit asa, numerele sunt de exemplu.
    int[] a = {1,3,4,6,7,8,10,12,14,23};
    */
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};

        int n = SkeletonJava.readIntGUI("Introduceti un numar:");

        for (int i=0; i<=a.length; i++){
            if (i==a.length) {
                System.out.println(-1);
                break;
            }

            if (n==a[i]) {
               int b = i+1;
                System.out.println("al : " + b + " -lea numar din sir");
                break;
            }

        }
    }
}
