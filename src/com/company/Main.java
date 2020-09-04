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

class Dog
{
    private String scale;

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}

class Book
{
    private int numberOfPage;

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}


public class Main {

    public static void main(String[] args) {

        Boll f = new Boll();
        Dog a = new Dog();
        Book b = new Book();

        f.setRad(10);
        a.setScale("big");
        b.setNumberOfPage(1337);
        System.out.println(
                "Радиус мяча: " + f.getRad()+"\n" +
                "Размер собаки: " + a.getScale()+"\n"+
                "Кол-во страний: " + b.getNumberOfPage());
    }
}
