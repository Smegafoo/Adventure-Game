import PlayerClass.PlayerClass;

import java.util.Scanner;

public class Game {
    Player p1=new Player();
    Inventory i1=new Inventory(p1);

    private Location location;
    PlayerClass pc1;
    public static void main(String[] args) {



    }
    //Method that starting the game.
    public void Start_game(){
        Scanner in=new Scanner(System.in);
        int select_start;
        System.out.println("Welcome to the Adventure Game \n1)Play \n2)Quit");
        select_start=in.nextInt();
        switch (select_start){
            case 1:
                p1.selectName();
                p1.selectClass();
                selectRegion();
                break;
            case 2:
                break;
            default:
                break;
        }



    }
    //Method that after the select name and class,We select the place where we want to go and see our ınventory.

    public void selectRegion() {
        Scanner in =new Scanner(System.in);
        Location location1=new CityCenter(p1,i1);
        int select_Region;
        do{
            System.out.println("1)Go to the city center\n2)Go to the cave\n3)Go to the forest\n4)To see your ınventory\n5)Exit");
            select_Region=in.nextInt();
            switch (select_Region){
                case 1:
                    location1.onLocation();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Water Number:"+i1.getWater_number()+"\nBeer Number:"+i1.getBeer_number()+
                            "\nBread Number:"+i1.getBread_number()+"\nYour Money:"+p1.getPlayerMoney());

                    break;
                default:
                    break;
            }
        }while(select_Region!=5);

    }
}


