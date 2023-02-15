package characters;

import behaviours.Targetable;

public abstract class Character implements Targetable {
    // Initialisation
    private String name;
    private int health;
    private final int maxHealth = 100;
    private Boolean alive;
    public Character(String name, int health) {
        if (health <= maxHealth) {
            this.health = health;
        } else {
            this.health = maxHealth;
        }
        this.name = name;
        this.alive = true;
    }
    // Getters and setters
    public String getName() {
        return this.name;
    }
    @Override
    public int getHealth() {
        return this.health;
    }
    @Override
    public Boolean  isAlive() {
        return this.alive;
    }
    // Methods
    @Override
    public void decreaseHealth(int healthAdjustment) {
        if (this.health - healthAdjustment <= 0) {
            this.health = 0;
            this.alive = false;
        } else {
            this.health -= healthAdjustment;
        }
    }
    @Override
    public void increaseHealth(int healthAdjustment) {
        if (this.health + healthAdjustment >= maxHealth) {
            this.health = maxHealth;
        } else {
            this.health += healthAdjustment;
        }
    }
}
