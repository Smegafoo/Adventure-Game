import PlayerClass.PlayerClass;

import java.util.Scanner;

public class Game {
    Player p1=new Player();
    PlayerClass pc1;
    public static void main(String[] args) {



    }
    public void Start_game(){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game \n1)Play \n2)Quit");
        int select_start=in.nextInt();
        switch (select_start){
            case 1:
                p1.selectName();
                p1.selectClass();

                break;
            case 2:
                break;}
    }

}
