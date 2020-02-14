import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int amountRose, int amountTulip, int amountChamomile) {
        Flower[] flowers = new Flower[amountRose + amountTulip + amountChamomile];

        int flowerIndex = 0;

        for (int i = 0; i < amountRose; i++) {
            flowers[flowerIndex++] = new Rose();
        }

        for (int i = 0; i < amountTulip; i++) {
            flowers[flowerIndex++] = new Tulip();
        }

        for (int i = 0; i < amountChamomile; i++) {
            flowers[flowerIndex++] = new Chamomile();
        }

        for (int i = 0; i < flowers.length; i++) {
            System.out.println(i + " element: " + flowers[i]);
        }


        for (Flower flower: flowers) {
            wallet+=flower.getPrice();
        }

        return flowers;
    }




    public Flower [] sellSequence(int amountRose, int amountTulip, int amountChamomile){

        List<Rose> roses = new ArrayList<Rose>();
        for (int i = 0;i <amountRose;i++) {
            roses.add(new Rose());
        }
        List<Chamomile> chamomiles = new ArrayList<Chamomile>();
        for (int i = 0;i <amountChamomile;i++){
            chamomiles.add(new Chamomile());
        }
        List<Tulip> tulips = new ArrayList<Tulip>();

        for (int i = 0;i <amountTulip;i++){
            tulips.add(new Tulip());
        }
        List<Flower> flowers = new ArrayList<Flower>();

        boolean end = false;

        while (!end){
            end = true;

            if(roses.size()>0){
                for (int j = 0; j <roses.size(); j++) {
                    flowers.add(new Rose());
                    roses.remove(j);
                    break;
                }
                end = false;
            }

            if (chamomiles.size()>0){
                for (int z = 0; z <chamomiles.size(); z++) {
                    flowers.add(new Chamomile());
                    chamomiles.remove(z);
                    break;
                }
                end = false;
            }
            if (tulips.size()>0){
                for (int y = 0; y < tulips.size(); y++) {

                    flowers.add(new Tulip());
                    tulips.remove(y);

                    break;
                }
                end = false;
            }

        }

        Flower [] flowersArray = new Flower[flowers.size()];
        for(int i = 0;i<flowersArray.length;i++){
            flowersArray[i] = flowers.get(i);
        }

        for (Flower flower: flowers) {
            wallet+=flower.getPrice();
        }

        for (int i = 0; i < flowersArray.length; i++) {
            System.out.println(i + " element: " + flowersArray[i]);
        }

        return flowersArray;
    }
}
