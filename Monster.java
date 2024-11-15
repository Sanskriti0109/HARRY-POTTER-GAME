/**
 * This class manages all the common properties of all types of monsters.
 * It inherits from the Role class, and implements the Fight interface.
 * It is the super class for all specific monster classes. 
 */
public class Monster extends Role implements Fight{
    protected double damage;
    protected double defenseStat;
    protected double dodgeChance;
    protected String monsterMarker;

    public Monster() {}

    public Monster(String name, int level, double damage, double defenseStat, double dodgeChance) {
        super(name, level);

        this.damage = damage;
        this.defenseStat = defenseStat;
        this.setDodgeChance(dodgeChance);
    }

    public void setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance * 0.01;
    }

    /*
        Check if the monster is dead.
     */
    public boolean isDead() { return hp <= 0; }

    /*
        Override the attack() method in the Fight interface.
     */
    @Override
    public void attack() {}

    /*
        Overload the attack() method above.
     */
    public void attack(Hero hero, Map map) {
        String heroName = hero.name;
        double heroDodgeChance = hero.dodgeChance;

        // Determine if the hero can dodge this attack
        double rand = Math.random();

        Cell[][] m = map.getMap();

        // Cave cells boost the agility of any hero who is inside them by 10%
        if (m[hero.row][hero.col] instanceof CaveCell) { heroDodgeChance *= 1.1; }

        // The hero failed to dodged the attack
        double totalDamage = damage;

        if (rand <= heroDodgeChance) {
            // The hero has dodged the attack
            NotificationCenter.inflict(2, this, totalDamage, hero);
            NotificationCenter.monsterAction(1, monsterMarker, hero.heroMarker, name, heroName);
            return;
        }

        if (hero.equippedArmor != null) {
            // If the hero has equipped an armor, the damage will be reduced for some amount
            totalDamage -= hero.equippedArmor.getDamageReduction();

            // Hero's armor may reduce the ENTIRE or PART OF the incoming damage
            if (totalDamage > 0) { NotificationCenter.armorProtection(1, heroName, hero.equippedArmor); }
            else { NotificationCenter.armorProtection(2, heroName, hero.equippedArmor); return; }
        }

        // Deduct hero's HP
        hero.hp -= totalDamage;

        // Show "who caused how much damage to whom"
        NotificationCenter.inflict(1, this, totalDamage, hero);

        // Check and process the status of the hero after being inflicted
        processHeroStatus(hero);
    }

    /*
        After a round of fight, check the hero's status.
     */
    public void processHeroStatus(Hero hero) {
        String info = "Hero " + hero.name;

        if (!hero.hasDead()) {
            // The hero is still alive
            NotificationCenter.aliveOrDead(1, info, hero.hp);
        } else {
            // The hero has fainted
            NotificationCenter.aliveOrDead(2, info, 0);
        }
    }
}