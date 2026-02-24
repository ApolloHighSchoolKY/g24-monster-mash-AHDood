public class MonsterMash{
  public static void main(String[] args){

    //Monster monster = new Monster(); //NOT ALLOWED
    //Because Monster has a modified constructor but not
    //a default constructor, Monster does not INHERIT a
    //default constructor

    Monster dracula= new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());
//Declare a Monster of your new Type
//Declare your new Type of Monster
//Bonus Challenge: add an instance field
    Monster jackFrost = new JackFrost("Jack Frost");

    System.out.println(jackFrost);

    System.out.println(jackFrost.kill());

    System.out.println(((JackFrost)jackFrost).catchPhrase());
  }
}
