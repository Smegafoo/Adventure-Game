public abstract class Location {
    private Player player;
    private Inventory inventory;
    private String locationName;

    public Location(Player player, Inventory inventory, String locationName) {
        this.player = player;
        this.locationName = locationName;
        this.inventory = inventory;
    }
    public abstract boolean onLocation();

}


