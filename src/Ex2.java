/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex2 {
    /*
    2. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
int n = 20; //sau o alta valoare

     */
    public static void main(String[] args) {

        int n = 20;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}