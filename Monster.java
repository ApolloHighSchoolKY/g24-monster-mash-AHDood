public class Monster
{
  private String myName;


  public Monster( String name ) {
      myName = "Monster";
  }

  public String getName(){
    return myName;
  }

  public String kill(){
    return myName + " killed a victim.  Screams were heard.\n";
  }

  public String toString() {
     return "Monster name :: " + myName + "\n";
  }
}