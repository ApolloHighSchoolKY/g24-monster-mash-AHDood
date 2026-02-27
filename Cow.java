/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private double milkProduced;
    public Cow()
    {
        super(0,"Moo");
        milkProduced =0.0;
    }
    
    public void eat()
    {
    if (isAlive())
    {
        super.eat();
        milkProduced += 1.5;
    }
    }
    public String speak()
    {
        if (isAlive())
        {
            System.out.println("milk produced: "+milkProduced);
        }
        else{
            System.out.println("the cow is no longer with us...");
        }
        return null;
    }
    public String toString(){
        if(isAlive())
        {
            return super.toString()+ " milk produced: " + milkProduced;
            
        }else{
            return "the cow has died at age : " + age + " and has produced: " + milkProduced + " gallons of milk..";
        }
    }
}