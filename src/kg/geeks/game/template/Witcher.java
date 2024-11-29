package kg.geeks.game.template;


public class Witcher extends Hero {
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.WITCH);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero: heroes){
            if (hero.getHealth() <= 0){
                hero.setHealth(this.getHealth()+hero.getHealth());
                this.setHealth(0);
                System.out.println("Witcher returned " + hero.getName());
                break;
            }
        }
    }
}
