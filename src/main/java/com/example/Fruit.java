package com.example;

public class Fruit implements Comparable<Fruit> {

    private String fruitName;
    private String fruitDescription;
    private int fruitQty;


    // Constructors
    public Fruit() {
    }


    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    public Fruit(String fruitName, String fruitDescription, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitDescription = fruitDescription;
        this.fruitQty = fruitQty;
    }

    // Getters and Setters
    public String getFruitName() {
        return this.fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDescription() {
        return this.fruitDescription;
    }

    public void setFruitDescription(String fruitDescription) {
        this.fruitDescription = fruitDescription;
    }

    public int getFruitQty() {
        return this.fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
            .append("Fruit {fruitName='")
            .append(getFruitName())
            .append("', fruitDescription='")
            .append(getFruitDescription())
            .append("', fruitQty='")
            .append(getFruitQty())
            .append("'}");
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit that) {

        if (this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        }

        else if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        }

        else {
            if (this.fruitQty < that.fruitQty) {
                return -1;
            }

            else if (this.fruitQty > that.fruitQty) {
                return 1;
            }

            else return 0;
        }
    }
}
