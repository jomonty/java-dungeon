package things.healers;

import behaviours.IHeal;
import behaviours.Targetable;

public class Potion implements IHeal {
    // Initialisation
    private int healValue;
    public Potion() {
        this.healValue = 20;
    }
    // Getters and setters
    @Override
    public int getHealValue() {
        return this.healValue;
    }
    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }
    // Methods
    @Override
    public void heal(Targetable target) {
        target.increaseHealth(this.healValue);
    }
}
