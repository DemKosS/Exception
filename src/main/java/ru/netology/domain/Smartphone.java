package ru.netology.domain;


public class Smartphone extends Product {
    private String producer;


    public Smartphone() {

    }

    public Smartphone(int id, String title, int price, String producer) {
        super(id, title, price);
        this.producer = producer;
    }


    public Smartphone(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}

