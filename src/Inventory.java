public class Inventory {
    private String player_meele_weapon;
    private String player_armor;
    private int heal_potion;
    private int damage_potion;
    private Player player;
    private int water_number;
    private int bread_number;
    private int beer_number;
    public Inventory(Player player){
        this.player=player;
    }

     /*Getter Setter methods

    ------------------------------------------------------------


    */

    public int getBread_number() {
        return bread_number;
    }

    public void setBread_number(int bread_number) {
        this.bread_number = bread_number;
    }

    public String getPlayer_meele_weapon() {
        return player_meele_weapon;
    }

    public void setPlayer_meele_weapon(String player_meele_weapon) {
        this.player_meele_weapon = player_meele_weapon;
    }

    public String getPlayer_armor() {
        return player_armor;
    }

    public void setPlayer_armor(String player_armor) {
        this.player_armor = player_armor;
    }

    public int getHeal_potion() {
        return heal_potion;
    }

    public void setHeal_potion(int heal_potion) {
        this.heal_potion = heal_potion;
    }

    public int getDamage_potion() {
        return damage_potion;
    }

    public void setDamage_potion(int damage_potion) {
        this.damage_potion = damage_potion;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getWater_number() {
        return water_number;
    }

    public void setWater_number(int water_number) {
        this.water_number = water_number;
    }

    public int getBeer_number() {
        return beer_number;
    }

    public void setBeer_number(int beer_number) {
        this.beer_number = beer_number;
    }
}
