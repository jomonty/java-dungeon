package characters.players.fighters;

import behaviours.IWeapon;
import behaviours.Targetable;
import characters.players.Player;

public abstract class Fighter extends Player {
    // Initialisation
    private IWeapon weapon;
    public Fighter(String name, int health, IWeapon weapon) {
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
