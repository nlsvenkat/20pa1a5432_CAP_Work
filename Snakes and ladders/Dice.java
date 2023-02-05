import java.util.Random;
interface _dice{
    int roll_dice();
}

public class Dice implements _dice{
    
    public int roll_dice(){
        Random random = new Random();
        int a = random.nextInt(6)+1;   
        return a;
    }
}