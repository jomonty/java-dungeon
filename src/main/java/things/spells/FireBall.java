package things.spells;

import behaviours.ISpell;
import behaviours.Targetable;

public class FireBall implements ISpell {
    // Initialisation
    private int damageValue;
    public FireBall() {
        this.damageValue = 25;
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
    @Override
    public void cast(Targetable target) {
        target.decreaseHealth(this.damageValue);
    }
}
