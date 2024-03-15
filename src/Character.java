public class Character {
    private String name;
    private int damage;
    private int hp;
    private int money;

    public Character(String name, int damage, int hp, int money) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
