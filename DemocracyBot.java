
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for(int i=0; i<5; i++) {
            move();
            countBallot();
            move();
        }
    }
    
    public void countBallot() {
        if(nextToABeeper()) {
            turnRight();
            move();
            if(nextToABeeper()) {
                turnAround();
                moveTwo();
                if(nextToABeeper()) {
                    turnAround();
                    move();
                    turnLeft();
                }
                else {
                    putBeeper();
                    turnAround();
                    move();
                    turnLeft();
                }
            }
            else {
                putBeeper();
                turnAround();
                moveTwo();
            }
        } 
        else {
            turnRight();
            move();
            if(!nextToABeeper()) {
                turnAround();
                moveTwo();
                if(!nextToABeeper()) {
                    turnAround();
                    move();
                    turnLeft();
                }
                else {
                    pickBeeper();
                    turnAround();
                    move();
                    turnLeft();
                }
            }
            else {
                pickBeeper();
                turnAround();
                moveTwo();;
            }
        }
    }  
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    
   
}

