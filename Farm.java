/**
 * @(#)Farm.java
 * create an arraylist of Animals
 *Populate ir with various types of Animals
 * Polymorphism- ta daaa
 * @author
 * @version 1.00 2023/3/8
 */
import java.util.ArrayList;

public class Farm {

    public Farm() {
    
            ArrayList<Animal> animals = new ArrayList<>();

            animals.add(new Cow());

            for(Animal a: animals)
            {
                for(int i=0; i<5; i++)
                {
                    a.eat();
                }
            }
            for(Animal a: animals)
            {
                a.speak();
                if(a.age>12)
                {
                    a.kill();
                }
                System.out.println(a);
            }
        }

    }


