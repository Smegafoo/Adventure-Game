import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Character c1;

    }
    public void Start_game(){
        Character Character[]={new Archer()};
        System.out.println("Please select your Character Type ");
        for (Character mc1: Arrays.asList(Character)) {
            System.out.println("Character name:"+ mc1.getName()+
                    "\nCharacter damage:"+mc1.getDamage()+"\nCharacter HP:"+mc1.getHp()+"\nCharacter Money:"+mc1.getMoney());

        }

    }

}
