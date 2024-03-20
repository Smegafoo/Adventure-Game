import java.util.Scanner;

public class CityCenter extends NormalLoc{
    private Inventory inventory;
    private Player player;
    private Game game;

    public CityCenter(Player player,Inventory inventory){
        super(player, inventory,"City Center");
        this.player=player;
        this.inventory=inventory;
    }

    @Override
    public boolean onLocation(){
        int select_city_center;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the City Center\n1)Go to the Tavern\n2)Go to the Potion Seller\n3)Go to the Blacksmith\n4)Exit");
        select_city_center=in.nextInt();
        switch (select_city_center){
            case 1:
                EnterTavern();
                break;
            case 2:
                EnterPotionSeller();
                break;
            case 3:
                EnterBlacksmith();
                break;
            case 4:

                break;
        }
        return true;

    }

    public void EnterTavern(){
        int select_tavern;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Tavern\n1)Buy water\n2)Buy beer\n3)Exit");
        select_tavern=in.nextInt();
        switch (select_tavern){
            case 1:
                System.out.println("water");
                break;
            case 2:
                System.out.println("beer");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
        }
    }

    public void EnterPotionSeller(){
        int select_potion_seller;
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to the potion seller\n1)Heal Potion\n2)Increase damage potion\n3)Exit");
        select_potion_seller=in.nextInt();
        switch (select_potion_seller){
            case 1:
                System.out.println("Heal Potion");
                break;
            case 2:
                System.out.println("Damage Potion");
                break;
            case 3:
                break;


        }
    }

    public void EnterBlacksmith(){
        int select_blacksmith;
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to the blacksmith\n1)Buy armor\n2)Buy weapon\n3)Exit ");
        select_blacksmith=in.nextInt();
        switch (select_blacksmith){
            case 1:
                System.out.println("Armor");
                break;
            case 2:
                System.out.println("Weapon");
                break;
            case 3:
                break;
        }
    }

}
