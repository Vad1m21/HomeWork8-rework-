import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FlowerSaver {

    private FlowerSaver(){

    }

    public static File save (Flower[] flowers){
        File file = new File("Flowers.txt");
        try(FileWriter writer = new FileWriter(file,false))
        {
           for(int i = 0;i<flowers.length;i++){
               if(flowers[i] instanceof Rose){
                   writer.write("Rose\n");
                   writer.flush();
               }
               else if(flowers[i] instanceof Chamomile){
                   writer.write("Chamomile\n");
                   writer.flush();
               }
               else if(flowers[i] instanceof Tulip){
                   writer.write("Tulip\n");
                   writer.flush();
               }

           }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}
