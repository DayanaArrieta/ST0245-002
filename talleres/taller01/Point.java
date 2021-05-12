package Taller1;

/**
 * This is an algorithm that defines an abstract type of data to
 * represent a point in two dimensions
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 27/01/2021
 */

public class Point {
    private double x;
    private double y;
    public Point (double x, double y ){
        this.x = x;
        this.y = y;
    }
    
    public double x(){
        return x;
    }

    public double y(){
        return y;
    }

    public double polarRadio(){
        double radio;
        radio = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return radio;
    }

    public double polarAngle(){
        return Math.atan(y/x);
    }

    public double euclidianDistance(Point newOne){
        double x2 = newOne.x;
        double y2 = newOne.y;
        double dist = Math.sqrt( Math.pow((x2-x),2)+Math.pow((y2-y),2));
        return dist;
    }
}

