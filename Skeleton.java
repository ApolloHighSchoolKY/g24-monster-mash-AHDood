public class Skeleton extends Monster {
    private double speed;

    
    
    public Skeleton(String name){
        super(name);
        speed=100;
        
    }
    public Skeleton(String name, Double speed)
    {
        super(name);
        this.speed=speed;
    }


    public String toString(){
        return super.toString() + "runs with an amazing speed of" + speed + "MPH!\n";
    }
}
