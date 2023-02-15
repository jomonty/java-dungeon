package things.spells;

import behaviours.ISpell;
import behaviours.Targetable;

public class LightningStrike implements ISpell {
    // Initialisation
    private int damageValue;
    public LightningStrike() {
        this.damageValue = 50;
    }
    // Getters and setters
    @Override
    public int getDamageValue() {
        return this.damageValue;
    }
    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
    // Methods
    public void cast(Targetable target) {
        target.decreaseHealth(this.damageValue);
    }
}
