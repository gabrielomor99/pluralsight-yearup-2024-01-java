package com.pluralsight.models;

import java.util.ArrayList;

public abstract class Order
{
    public static int currentOrderId = 1001;

    private int orderId;
    private String name;
    private String progress;
    private ArrayList<Pizza> pizzas;

    public Order(String name)
    {

        orderId = currentOrderId++;
        this.name = name;
        progress = "ordered";
        this.pizzas = new ArrayList<>();
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getName()
    {
        return name;
    }

    public String getProgress()
    {
        return progress;
    }

    public ArrayList<Pizza> getPizzas()
    {
        return pizzas;
    }

    public double getTotal()
    {
        double price = 0;

        for(Pizza pizza : pizzas)
        {
            price += pizza.getTotalPrice();
        }

        return price;
    }

    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }
}
