import characters.enemies.Troll;
import characters.players.clerics.Cleric;
import characters.players.fighters.Barbarian;
import characters.players.fighters.Fighter;
import characters.players.mages.Mage;
import characters.players.mages.Wizard;
import org.junit.Before;
import org.junit.Test;
import things.familiars.Dragon;
import things.healers.Herbs;
import things.spells.FireBall;
import things.weapons.Axe;
import things.weapons.Club;

import static org.junit.Assert.assertEquals;

public class testAttackAndHeal {
    private Cleric cleric;
    private Fighter fighter;
    private Mage mage;
    private Troll troll;
    @Before
    public void setup() {
        // Set up players
        cleric = new Cleric("Healy McHealFace", 100, new Herbs());
        fighter = new Barbarian("Balls McLovin", 100, new Axe());
        mage = new Wizard("Cloaks", 100, new FireBall(), new Dragon());
        // Set up enemy
        troll = new Troll("Fatso", 100, new Club());

    }
    @Test
    public void fighterCanDamageEnemy() {
        fighter.attack(troll);
        assertEquals(70, troll.getHealth());
    }
    @Test
    public void mageCanCastEnemy() {
        mage.cast(troll);
        assertEquals(75, troll.getHealth());
    }
    @Test
    public void trollCanDamagePlayer() {
        troll.attack(fighter);
        assertEquals(80, fighter.getHealth());
    }
    @Test
    public void clericCanHeal() {
        troll.attack(fighter);
        cleric.heal(fighter);
        assertEquals(90, fighter.getHealth());
    }
}
