import java.util.Scanner;

public class CityCenter extends NormalLoc{
    private Inventory inventory;
    private Player player;

    public CityCenter(Player player,Inventory inventory){
        super(player, inventory,"City Center");
        this.player=player;
        this.inventory=inventory;
    }
    //We use that method when the user select enter the city center.
    @Override
    public boolean onLocation(){
        int select_city_center;
        Scanner in=new Scanner(System.in);
        do{
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

        }while(select_city_center !=4);

        return true;

    }
    //Method that entering the tavern.
    public void EnterTavern(){
        int select_tavern;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Tavern\n1)Buy water(10cp)\n2)Buy beer(15 cp)\n3)Buy bread(20cp)\n4)Exit" +
                "\nYour money:"+player.getPlayerMoney()+"cp");
        select_tavern=in.nextInt();
        switch (select_tavern){
            case 1:
                buyWater();
                break;
            case 2:
                buyBeer();
                break;
            case 3:
                buyBread();
                break;
            case 4:
                //Exit
                break;
            default:
        }
    }
    //Method that entering the Potion Seller.

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
    //Method that entering the Blacksmith.

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
    //Method that buying water.

    public void buyWater(){
        Scanner in=new Scanner(System.in);
        int waterNumber;
        int waterCost=10;
        System.out.println("How many Water do you want!!");
        waterNumber=in.nextInt();
        int totalWaterCost=waterNumber*waterCost;
        if(totalWaterCost<=this.getPlayer().getPlayerMoney()) {
            this.getInventory().setWater_number(this.getInventory().getWater_number() + waterNumber);
            this.getPlayer().setPlayerMoney(this.getPlayer().getPlayerMoney() - totalWaterCost);
        }else{
            System.out.println("You dont have  enough money for that !!");

            }
    }
    //Method that buying beer.

    public void buyBeer(){
        Scanner in=new Scanner(System.in);
        int beerNumber;
        int beerCost=15;
        System.out.println("How many beer do you want!!");
        beerNumber=in.nextInt();
        int totalBeerCost=beerNumber*beerCost;
        if(totalBeerCost<=this.getPlayer().getPlayerMoney()) {
            this.getInventory().setBeer_number(this.getInventory().getBeer_number() + beerNumber);
            this.getPlayer().setPlayerMoney(this.getPlayer().getPlayerMoney() - totalBeerCost);
        }else{
            System.out.println("You dont have  enough money for that !!");

        }
    }
    //Method that buying bread.
    public void buyBread(){
        Scanner in=new Scanner(System.in);
        int breadNumber;
        int breadCost=20;
        System.out.println("How many bread do you want!!");
        breadNumber=in.nextInt();
        int totalBreadCost=breadCost*breadNumber;
        if(totalBreadCost<=this.getPlayer().getPlayerMoney()) {
            this.getInventory().setBread_number(this.getInventory().getBread_number() + breadCost);
            this.getPlayer().setPlayerMoney(this.getPlayer().getPlayerMoney() - totalBreadCost);
        }else{
            System.out.println("You dont have  enough money for that !!");

        }

    }

    /*Getter Setter methods

    ------------------------------------------------------------


    */
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
