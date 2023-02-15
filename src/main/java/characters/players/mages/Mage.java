package characters.players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import behaviours.Targetable;
import characters.Character;
import characters.players.Player;

public abstract class Mage extends Player {
    // Initialisation
    private ISpell spell;
    private IDefend familiar;
    public Mage(String name, int health, ISpell spell, IDefend familiar) {
        super(name, health);
        this.spell = spell;
        this.familiar = familiar;
    }
    // Getters and setters
    public ISpell getSpell() {
        return this.spell;
    }
    public void setSpell(ISpell spell) {
        this.spell = spell;
    }
    public IDefend getFamiliar() {
        return this.familiar;
    }
    public void setFamiliar(IDefend familiar) {
        this.familiar = familiar;
    }
    // Methods
    public void cast(Targetable target) {
        spell.cast(target);
    }
}
