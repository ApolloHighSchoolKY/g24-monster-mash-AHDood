/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Animal
{
	protected int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
	    public Animal()
	    {
			age=0;
			alive=true;
			sound="Moo";
	    }
		public Animal(int a, String s)
		{
			age=a;
			alive=true;
			sound=s;

		}
	    /**
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			return alive;
		}
     	/**
     	* Make the animal die :(
     	*/
     	public void kill()
     	{
			alive=false;
     	}

     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
     	public String speak()
     	{
		if(alive)
		{
		return "Moo";
		}	
		else{
			return "..";
		}	
     		
     	}
public void eat(){
	if(alive)
	{
		age++;
	}
}
     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
			if(alive)
			{
     		return "age:" + age + " sound: " + sound;
			}
			else
			{
				return "the animal is dead at age: " + age;
			}
		}
}