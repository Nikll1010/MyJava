package lession1;

import java.util.Scanner;

public class Animal {
    private int leg;
    public void eat(){
        System.out.println("I like eating");
    }
    public void move(){
        System.out.println("I want move");
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }
}
