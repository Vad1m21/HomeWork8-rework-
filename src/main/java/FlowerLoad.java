import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerLoad {

    private FlowerLoad(){

    }

    public static Flower [] load(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Flower> flower = new ArrayList<>();

        while (scanner.hasNextLine()){
            String flowerFromFile = scanner.nextLine();
            if(flowerFromFile.equals("Rose")){
                flower.add(new Rose());
            }
            else if(flowerFromFile.equals("Tulip")){
                flower.add(new Tulip());
            }
            else if(flowerFromFile.equals("Chamomile")){
                flower.add(new Chamomile());
            }

        }
        Flower [] flowersArray = new Flower[flower.size()];
        for(int i = 0;i<flowersArray.length;i++){
            flowersArray[i] = flower.get(i);
        }


        return flowersArray;
    }
}
