package characters.players.clerics;

import behaviours.IHeal;
import behaviours.Targetable;
import characters.players.Player;

public class Cleric extends Player {
    // Initialisation
    private IHeal healing;
    public Cleric(String name, int health, IHeal healing) {
        super(name, health);
        this.healing = healing;
    }
    // Getters and setters
    public IHeal getHealing() {
        return healing;
    }
    public void setHealing(IHeal healing) {
        this.healing = healing;
    }
    // Methods
    public void heal(Targetable target) {
        healing.heal(target);
    }
}
