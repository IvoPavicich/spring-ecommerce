package com.ecommerce.model;
import java.util.Date;
public class Order {
    private int id;
    private Date created_at;
    private int total;

    public Order() {

    }

    public Order(int id, Date created_at, int total) {
        this.id = id;
        this.created_at = created_at;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", total=" + total +
                '}';
    }
}
