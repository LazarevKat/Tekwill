/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg7;

/**
 *
 * @author Kate
 */
public class Invoce {

    String number;
    String description;
    int quantity;
    double price;

    Invoce(String n, String d, int q, double p) {
        this.number = n;
        this.description = d;
        this.price = p;
        this.quantity = q;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
   }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoceAmount() {
        if (quantity <= 0) {
            return 0;
        }
        if (price < 0) {
            return quantity * 0.0;
        } else {
            return quantity * price;
        }
    }

}
