/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class CartHandelerMB {
    List<CartBind> cartList=new ArrayList<CartBind>();
    
int productid;
   String productname;
    int quantity;
    double price;
    double total;
    int cardsize;
    String item ="item";
Map<Integer,CartBind> map=new HashMap<Integer,CartBind>();

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCardsize() {
        return cardsize;
    }

    public void setCardsize(int cardsize) {
        this.cardsize = cardsize;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public Map<Integer, CartBind> getMap() {
        return map;
    }

    public void setMap(Map<Integer, CartBind> map) {
        this.map = map;
    }

    public List<CartBind> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartBind> cartList) {
        this.cartList = cartList;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String processCart( int qty){
    CartBind car=new CartBind();
    quantity=qty;
    car.setProductname(productname);
    car.setQuantity(quantity);
    car.setPrice(price);
    car.setTotal(quantity*price);
    cartList.add(car);
    map.put(productid, car);
    cardsize=cartList.size();
    if(cardsize>1){
    
    item="items";
    }
    return null;
    }
    
}