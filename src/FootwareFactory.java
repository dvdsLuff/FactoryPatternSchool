import model.Footware;
import model.HighHeels;
import model.Sneaker;

public class FootwareFactory {



    public static Footware create(int type, int size){
        int sneakerSpeed=7;
        int highHeelsSpeed=3;

        if(type==2){
            return new Sneaker(size,sneakerSpeed);
        }else return new HighHeels(size,highHeelsSpeed);
        }
    }




