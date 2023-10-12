/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hogwarts.packagetwo;

/**
 *
 * @author user
 */
public final class Magic {
    private final int id;
    private String Spells;
    private String Founder;
    private int Mana_cost;

    public Magic(int id, String spells, String founder, int mana_cost) {
        this.id = id;
        this.Spells = spells;
        this.Founder = founder;
        this.Mana_cost = mana_cost;
    }

    public int getId() {
        return id;
    }

    public String getSpells() {
        return Spells;
    }

    public void setSpells(String spells) {
        this.Spells = spells;
    }

    public String getFounder() {
        return Founder;
    }

    public void setFounder(String founder) {
        this.Founder = founder;
    }

    public int getMana_cost() {
        return Mana_cost;
    }

    public void setMana_cost(int mana_cost) {
        this.Mana_cost = mana_cost;
    }
}
