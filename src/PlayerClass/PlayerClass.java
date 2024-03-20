package PlayerClass;

public class PlayerClass {
    private int classID;
    private String className;
    private int classHealth;
    private int classDefaultHealth;
    private int classDamage;
    private int classStrength;
    private int classDexterity;
    private int classConstitution;
    private int classIntelligence;
    private int classWisdom;
    private int classCharisma;
    private int classArmor;
    private int classMoney;

    public PlayerClass(int classID, String className, int classHealth, int classDefaultHealth,
                       int classDamage, int classStrength, int classDexterity, int classConstitution,
                       int classIntelligence, int classWisdom, int classCharisma ,int classArmor,int classMoney)
    {
        this.classID = classID;
        this.className = className;
        this.classHealth = classHealth;
        this.classDefaultHealth = classDefaultHealth;
        this.classDamage = classDamage;
        this.classStrength = classStrength;
        this.classDexterity = classDexterity;
        this.classConstitution = classConstitution;
        this.classIntelligence = classIntelligence;
        this.classWisdom = classWisdom;
        this.classCharisma = classCharisma;
        this.classArmor=classArmor;
        this.classMoney=classMoney;
    }

     /*Getter Setter methods

    ------------------------------------------------------------


    */

    public int getClassMoney() {
        return classMoney;
    }

    public void setClassMoney(int classMoney) {
        this.classMoney = classMoney;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassHealth() {
        return classHealth;
    }

    public void setClassHealth(int classHealth) {
        this.classHealth = classHealth;
    }

    public int getClassDefaultHealth() {
        return classDefaultHealth;
    }

    public void setClassDefaultHealth(int classDefaultHealth) {
        this.classDefaultHealth = classDefaultHealth;
    }

    public int getClassDamage() {
        return classDamage;
    }

    public void setClassDamage(int classDamage) {
        this.classDamage = classDamage;
    }

    public int getClassStrength() {
        return classStrength;
    }

    public void setClassStrength(int classStrength) {
        this.classStrength = classStrength;
    }

    public int getClassDexterity() {
        return classDexterity;
    }

    public void setClassDexterity(int classDexterity) {
        this.classDexterity = classDexterity;
    }

    public int getClassConstitution() {
        return classConstitution;
    }

    public void setClassConstitution(int classConstitution) {
        this.classConstitution = classConstitution;
    }

    public int getClassIntelligence() {
        return classIntelligence;
    }

    public void setClassIntelligence(int classIntelligence) {
        this.classIntelligence = classIntelligence;
    }

    public int getClassWisdom() {
        return classWisdom;
    }

    public void setClassWisdom(int classWisdom) {
        this.classWisdom = classWisdom;
    }

    public int getClassCharisma() {
        return classCharisma;
    }

    public void setClassCharisma(int classCharisma) {
        this.classCharisma = classCharisma;
    }

    public int getClassArmor() {
        return classArmor;
    }

    public void setClassArmor(int classArmor) {
        this.classArmor = classArmor;
    }
}
