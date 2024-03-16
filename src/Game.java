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
                System.out.println("1)Go to the city center\n2)Go to the cave\n3)Go to the forest\n4)To see your ınventory");
                int select_Region=in.nextInt();
                switch (select_Region){
                    case 1:
                        System.out.println("1)Go to tavern\n2)Go to Blacksmith\n3)Go to Potion Seller");
                        int select_Citycenter=in.nextInt();
                        switch (select_Citycenter){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                break;}
    }

}
