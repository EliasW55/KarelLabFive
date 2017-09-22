
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        pickUpBeepers();
        if(pickUpBeepers()==true) {
            turnLeft();
            move();
            while(nextToABeeper()) {
                pickBeeper();
            }
        }
        else {
            turnRight();
            move();
            while(nextToABeeper()) {
                pickBeeper();
            }
        }
    }
    

    public boolean pickUpBeepers() {
        int i=0;
        while(nextToABeeper()) {
            pickBeeper();
            ++i;
        }
        if(i%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}