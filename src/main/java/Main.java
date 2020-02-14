import flowers.Flower;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FlowerStore flowerStore =new  FlowerStore();
        flowerStore.sell(4 , 5 ,2);
        System.out.println(flowerStore.getWallet());
        System.out.println("\n\n");

        Flower[] flowers;
        flowers =  flowerStore.sellSequence(4,5,2);
        System.out.println(flowerStore.getWallet());
        System.out.println("\n\n");



       Flower [] flowerFromFile;
      flowerFromFile =  FlowerLoad.load( FlowerSaver.save(flowers));
        System.out.println("FLowers from file:");
        for (int i = 0; i < flowerFromFile.length; i++) {
            System.out.println(i + " element: " + flowerFromFile[i]);
        }

    }
}
