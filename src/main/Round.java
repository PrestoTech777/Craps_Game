/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author caleblopresto30
 */
public class Round {
    private int dieA;
    private int dieB;
    private int roundPoint;
    private boolean win;
    private int numOfRolls = 0;
    
    public Round(){
        //come out roll
        roll();
        switch(getAddition()){
            case 2:
                setWin(false);
                break;
            case 3:
                setWin(false);
                break;
            case 7: 
                setWin(true);
                break;
            case 11:
                setWin(true);
                break;
            case 12:
                setWin(false);
            default: 
                setRoundPoint(getAddition());
        }
        
        //subsequent rolls
        roll();
        
    }
    
    private void roll(){
        this.setDieA((int)(Math.random() * 6) + 1);
        this.setDieB((int)(Math.random() * 6) + 1);
    }

    private int getDieA() {
        return dieA;
    }

    public void setDieA(int dieA) {
        this.dieA = dieA;
    }

    private int getDieB() {
        return dieB;
    }

    public void setDieB(int dieB) {
        this.dieB = dieB;
    }

    public int getRoundPoint() {
        return roundPoint;
    }

    private void setRoundPoint(int roundPoint) {
        this.roundPoint = roundPoint;
    }

    public boolean isWin() {
        return win;
    }

    private void setWin(boolean win) {
        this.win = win;
    }

    public int getNumOfRolls() {
        return numOfRolls;
    }

    public void setNumOfRolls(int numOfRolls) {
        this.numOfRolls = numOfRolls;
    }
    
    private int getAddition() {
        return this.getDieA() + this.getDieB();
    }
}
