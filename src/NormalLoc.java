public abstract class NormalLoc extends Location{
    NormalLoc(Player player,Inventory inventory,String name){
        super(player,inventory,name);
    }

    @Override

    public  abstract boolean onLocation();

}
