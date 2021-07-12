package com.company;

public class Orders {
    int id;
    double price;
    String status;

    public Orders(int id,double price, String status) {
        this.id =id;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
