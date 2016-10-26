/**
 * Created by Manuela on 26.10.2016.
 */
public class Ex3 {
    /*
    3. Se citesc numere naturale pânã când se introduce numãrul 0.
    Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.
     */
    public static void main(String[] args) {
        int sum=0;
        while(true) {
            int nrCurent = SkeletonJava.readIntGUI("Introduceti numarul: ");
            if(nrCurent==0) {
                break;
            }
            if(nrCurent>4 && nrCurent<11) {
                sum = sum+nrCurent;
            }
        }
        SkeletonJava.printGUI("Suma este: " + sum);
    }

}

