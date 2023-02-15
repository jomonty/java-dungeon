package characters.enemies;

import behaviours.IWeapon;
import behaviours.Targetable;

public class Troll extends Enemy {
    // Initialisation
    private IWeapon weapon;
    public Troll(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
    // Getters and setters
    public IWeapon getWeapon() {
        return this.weapon;
    }
    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
    // Methods
    public void attack(Targetable target) {
        weapon.attack(target);
    }
}
