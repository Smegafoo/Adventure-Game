import PlayerClass.PlayerClass;
import PlayerClass.Archer;
import PlayerClass.Knight;
import PlayerClass.Wizard;
import java.util.Scanner;

import java.util.Arrays;

public class Player {
    PlayerClass pc2;
    private int playerID;
    private String playerName;
    private String playerClassName;
    private int playerHealth;
    private int playerDefaultHealth;
    private int playerDamage;
    private int playerStrength;
    private int playerDexterity;
    private int playerConstitution;
    private int playerIntelligence;
    private int playerWisdom;
    private int playerCharisma;
    private int playerArmor;
    private int playerMoney;

    public Player(){

    }
    public void selectName(){
        Scanner a=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String player_name="Smegafoo";
        System.out.println("Welcome to the Adventure Game "+player_name);
        this.playerName=player_name;
    }
    public void selectClass() {
        int selectClass;
        do {
            Scanner in = new Scanner(System.in);
            PlayerClass playerClasses[] = {new Archer(), new Knight(), new Wizard()};
            System.out.println("Please select your class (With ID) ");
            for (PlayerClass pc1 : Arrays.asList(playerClasses)) {
                System.out.println("Class ID:" + pc1.getClassID() + "   Class name:" + pc1.getClassName() + "  Class Damage:" + pc1.getClassDamage() + "   Class Health:" + pc1.getClassHealth() +
                        "   Class Strength:" + pc1.getClassStrength() + "   Class Dexterity:" + pc1.getClassDexterity() + "   Class Constitution:" + pc1.getClassConstitution() +
                        "   Class Intelligence:" + pc1.getClassIntelligence() + "   Class Wisdom:" + pc1.getClassWisdom() + "   Class Charisma:" + pc1.getClassCharisma());
            }
            selectClass = in.nextInt();
            {
                switch (selectClass) {
                    case 1:
                        initPlayerClass(new Archer());
                        break;
                    case 2:
                        initPlayerClass(new Knight());
                        break;
                    case 3:
                        initPlayerClass(new Wizard());
                        break;
                    default:
                        System.out.println("You enter wrong number please try again !!");
                        break;
                }
            }
            if(selectClass==1 || selectClass==2 || selectClass==3){
                System.out.println("Your Player information :\n");
                System.out.println("Player Class name:" + this.playerClassName + "  Player Damage:" + this.playerDamage + "   Player Health:" + this.playerHealth +
                        "   Player Strength:" + this.playerStrength + "   Player Dexterity:" + this.playerDexterity + "   Player Constitution:" + this.playerConstitution +
                        "   Player Intelligence:" + this.playerIntelligence + "   Player Wisdom:" + this.playerWisdom + "   Player Charisma:" + this.playerCharisma);
            }
        } while (selectClass != 1 && selectClass != 2 && selectClass != 3);
    }

    public void initPlayerClass(PlayerClass pc2){
        this.setPlayerID(pc2.getClassID());
        this.setPlayerClassName(pc2.getClassName());
        this.setPlayerHealth(pc2.getClassHealth());
        this.setPlayerDefaultHealth(pc2.getClassDefaultHealth());
        this.setPlayerDamage(pc2.getClassDamage());
        this.setPlayerStrength(pc2.getClassStrength());
        this.setPlayerDexterity(pc2.getClassDexterity());
        this.setPlayerConstitution(pc2.getClassConstitution());
        this.setPlayerIntelligence(pc2.getClassIntelligence());
        this.setPlayerWisdom(pc2.getClassWisdom());
        this.setPlayerCharisma(pc2.getClassCharisma());
        this.setPlayerArmor(pc2.getClassArmor());
        this.setPlayerMoney(pc2.getClassMoney());

    }

     /*Getter Setter methods

    ------------------------------------------------------------


    */

    public String getPlayerClassName() {
        return playerClassName;
    }

    public void setPlayerClassName(String playerClassName) {
        this.playerClassName = playerClassName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerDefaultHealth() {
        return playerDefaultHealth;
    }

    public void setPlayerDefaultHealth(int playerDefaultHealth) {
        this.playerDefaultHealth = playerDefaultHealth;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public int getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    public int getPlayerDexterity() {
        return playerDexterity;
    }

    public void setPlayerDexterity(int playerDexterity) {
        this.playerDexterity = playerDexterity;
    }

    public int getPlayerConstitution() {
        return playerConstitution;
    }

    public void setPlayerConstitution(int playerConstitution) {
        this.playerConstitution = playerConstitution;
    }

    public int getPlayerIntelligence() {
        return playerIntelligence;
    }

    public void setPlayerIntelligence(int playerIntelligence) {
        this.playerIntelligence = playerIntelligence;
    }

    public int getPlayerWisdom() {
        return playerWisdom;
    }

    public void setPlayerWisdom(int playerWisdom) {
        this.playerWisdom = playerWisdom;
    }

    public int getPlayerCharisma() {
        return playerCharisma;
    }

    public void setPlayerCharisma(int playerCharisma) {
        this.playerCharisma = playerCharisma;
    }

    public int getPlayerArmor() {
        return playerArmor;
    }

    public void setPlayerArmor(int playerArmor) {
        this.playerArmor = playerArmor;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }
}
