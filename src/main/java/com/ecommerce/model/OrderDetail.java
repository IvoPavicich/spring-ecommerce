package com.ecommerce.model;

public class OrderDetail {
    private int id;
    private String name;
    private int amount;
    private Double price;
    private Double total;

    public OrderDetail() {
    }

    public OrderDetail(int id, String name, int amount, Double price, Double total) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
