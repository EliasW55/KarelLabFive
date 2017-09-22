
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while(findClues()==true) {
            moveAlong();
        }
        
           
        
            
        
    }
    
    public void moveAlong() {
        while(!nextToABeeper()) {
            move();
        }
    }
    
    public boolean findClues() {
        int i=0;
        while(nextToABeeper()) {
            pickBeeper();
            i++;
        }
        if(i==1) {
            faceNorth();
            return true;
        }
        else if(i==2) {
            faceEast();
            return true;
        }
        else if(i==3) {
            faceSouth();
            return true;
        }
        else if(i==4) {
            faceWest();
            return true;
        }
        else {
            return false;
        }
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
}

