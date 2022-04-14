
/**
 * Write a description of class LCIntersection here.
 *
 * @author  Bill Viggers
 * @version Apr14-2022
 */
public class LCIntersection
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class LCIntersection
     */
    public LCIntersection()
    {
        // line variables; y=mx+c
        // start with y=x;
        int lineM=1;
        int lineC=0;
        
        // circle variables; center point and raidus
        int circleX=10;
        int circleY=10;
        int circleR=5;
        
        // idea is step one, we work out line y when lineX X is
        // the center of the circle.
        int lineY=lineM*circleX+lineC;
        
        // we can calculate the closest point to the center 
        // using the sine rule
        
        //First
        // c = the Y axis distance from circle center to line when
        // a plumb line is dropped down.
        int c= circleY-lineY;
        
        
        
        

    }

}
