/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class Item {
    private String name;
    private int qty;
    private int unitPrice;

    public Item(String name, int qty, int unitPrice) {
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.unitPrice * qty;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public String toString(){
        return this.name + ": " + this.qty;
    }
    
    public int getQty(){
        return this.qty;
    }
}
