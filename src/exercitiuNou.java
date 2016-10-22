/**
 * Created by Manuela on 22.10.2016.
 */
public class exercitiuNou {
    public static void main(String[] args) {

      int max= 0;
        int counter = 0;
        while (true){
            counter++;
            int nrCurent =SkeletonJava.readIntConsole("Introduceti un numar:" + counter + ":");
                    if(nrCurent<0){
                        counter--;
                        break;
                    }
            if (max<nrCurent)
                max=nrCurent;
            }
            SkeletonJava.printGUI("nr. maxim este" +max);
            }
        }


