package com.company;

class Boll
{
    private int rad;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}

public class Main {

    public static void main(String[] args) {

        Boll f = new Boll();
        f.setRad(10);
        System.out.println(f.getRad());
    }
}
