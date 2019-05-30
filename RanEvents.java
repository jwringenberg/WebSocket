import java.util.Random;
public class RanEvents
{
    public static void main (String[] args)
    {
        Random r = new Random();
        int event = r.nextInt(3); // 0 1 2
        
        int health = 98;
        int x = 100 - health;
        health = health + x; // 100
        
        if(event == 0)
        {
             event1();
        }
        else if( event == 1)
        {
        }
        else if (event == 2)
        {
        }
        else
        {
            event1();
        }
    }
    static public void event1()
    {
        //Story
    }
}
