/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

/**
 * Classe pour afficher les pions 
 * @author grigm
 */
public class Pion {
    private boolean reine; 
    private boolean blanc; 
    private int x; 
    private int y; 

    public boolean isReine() {
        return reine;
    }

    public boolean isBlanc() {
        return blanc;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setReine(boolean reine) {
        this.reine = reine;
    }

    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
