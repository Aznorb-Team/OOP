abstract class Character{
    public String name;
    public int health;
    public int maxHealth = 100;
    public int magicEnergy;
    public int endurance;
    
    public int luck;
    public int magicPower;
    public int skill;
    
    public Weapon weapon;
    
    
    public Character(String name, Weapon weapon, int health, int enegry, int endur, int luck, int mPower, int skill)
    {
        this.name = name;
        magicEnergy = enegry;
        endurance = endur;
        this.luck = luck;
        magicPower = mPower;
        this.skill = skill;
        this.weapon = weapon;
        this.health = health;
        Info();
    }

    public void Info(){
        System.out.println("Состояние персонажа");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Magic Energy: " + magicEnergy);
        System.out.println("Endurance: " + endurance);
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Special: " + weapon.getSpecial().getName());
        //System.out.println("");
    }
    
    public int Attack(){
        weapon.Attack(endurance,skill,luck, magicPower, magicEnergy, health, maxHealth);
        endurance = weapon.getEnduranceResult();
        magicPower = weapon.getMagicPower();
        magicEnergy = weapon.getMagicEnergy();
        health = weapon.getHealth();
        
        return weapon.getDamage();
    }
    public int specialAttack(){
        weapon.getSpecial().specialAttack(health,skill,luck, magicPower, magicEnergy, weapon);
        health = weapon.getSpecial().getHealth();
        magicPower = weapon.getSpecial().getMagicPower();
        magicEnergy = weapon.getSpecial().getMagicEnergy();
        
        return weapon.getSpecial().getDamage();
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}