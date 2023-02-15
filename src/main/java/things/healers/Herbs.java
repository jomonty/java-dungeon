package things.healers;

import behaviours.IHeal;
import behaviours.Targetable;

public class Herbs implements IHeal {
    // Initialisation
    private int healValue;
    public Herbs() {
        this.healValue = 10;
    }
    // Getters and setters
    public int getHealValue() {
        return this.healValue;
    }
    public void setHealValue() {
        this.healValue = healValue;
    }
    // Methods
    public void heal(Targetable target) {
        target.increaseHealth(this.healValue);
    }
}
