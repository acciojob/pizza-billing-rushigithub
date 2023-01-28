package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;

    boolean isExtraCheese;

    boolean isExtraTopping;

    boolean isTakeAway;

    boolean isBillGen;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraTopping = false;
        this.isTakeAway = false;
        this.isBillGen = false;

        this.bill = "";
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price +"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price = this.price + cheese;
            this.isExtraCheese = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price += toppings;
            this.isExtraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(!isBillGen){
            if(isExtraCheese){
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            }
            if(isExtraTopping){
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: "+ "20"+"\n";
            }

            this.bill+= "Total Price: "+ this.price +"\n";
            isBillGen = true;
        }
        return this.bill;
    }
}
