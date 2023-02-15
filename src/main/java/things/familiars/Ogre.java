package things.familiars;

import behaviours.IDefend;
import behaviours.Targetable;

public class Ogre implements IDefend {
    // Initialisation
    private int defendValue;
    public Ogre() {
        this.defendValue = 30;
    }
    // Getters and setters
    @Override
    public int getDefendValue() {
        return this.defendValue;
    }
    public void setDamageValue(int damageValue) {
        this.defendValue = damageValue;
    }
    // Methods
    public void defend(Targetable target) {
        target.decreaseHealth(this.defendValue);
    }
}
