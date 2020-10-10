package com.company;

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
