
public class Punto {
    
    private double x;
    private double y;
    public Punto (double x, double y ){
         this.x = x;
         this.y = y;
    }
    
    
    public double x(){
        return x;
    }
    
    public double y (){
        return y;
    }
    
    public double radioPolar (){
        double radio;
        radio = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return radio;
    }
    
    public double anguloPolar(){
        return Math.atan(y/x);
    }
    
    public double ditanciaEuclidiana(Punto otro){
        double x2 = otro.x;
        double y2 = otro.y;
        double dist = Math.sqrt( Math.pow((x2-x),2)+Math.pow((y2-y),2));
        return dist;
    }
}