public class JackFrost extends Monster {
    public static char[] catchPhrase;

    public JackFrost(String name){
        super(name);
    }
    public String kill(){
     return getName()  + " killed a victim. the sliding of ice fills the room.\n";   
    }

    public String catchPhrase(){
        return getName() + " utters his iconic catchphrase. 'Hee-Hoo!'";
    }
}
