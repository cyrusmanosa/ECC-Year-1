package com.example.m230118.Helper;

import android.content.Context;
import android.widget.Toast;

import com.example.m230118.Domain.FoodDomain;
import com.example.m230118.Interface.ChangeNumberItemsListener;

import java.util.ArrayList;

public class ManagementCart {
    private Context context;
    private TinyDB tinyDB;
    public ManagementCart(Context context){
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }
    public void  insertFood (FoodDomain item){
        ArrayList<FoodDomain> listFood = getListCart();
        boolean existAlready = false;
        int n = 0;
        for( int i = 0; i < listFood.size(); i++){
            if(listFood.get(i).getTitle().equals ( item.getTitle() ) ){
                existAlready = true;
                n = i;
                break;
            }
        }
        if( existAlready ){
            listFood.get(n).setNumberInCart(item.getNumberInCart());
        }else{
            listFood.add(item);
        }
        tinyDB.putListObject("CardList",listFood);
        Toast.makeText(context,"Added To Your Cart",Toast.LENGTH_SHORT).show();
    }
    public ArrayList<FoodDomain> getListCart(){
        return tinyDB.getListObject("CartList");
    }

    public void plusNumberFood(ArrayList<FoodDomain>listFood, int post, ChangeNumberItemsListener changeNumberItemsListener){
        listFood.get(post).setNumberInCart(listFood.get(post).getNumberInCart()+1);
        tinyDB.putListObject("CartList",listFood);
        changeNumberItemsListener.changed();
    }
    public void minusNumberFood(ArrayList<FoodDomain>listFood, int post, ChangeNumberItemsListener changeNumberItemsListener){
        if(listFood.get(post).getNumberInCart() == 1){
            listFood.remove(post);
        }else {
            listFood.get(post).setNumberInCart(listFood.get(post).getNumberInCart() - 1);
        }
        tinyDB.putListObject("CartList",listFood);
        changeNumberItemsListener.changed();
    }

    public Double getTotalFee(){
        ArrayList<FoodDomain> listfood = getListCart();
        double fee = 0;
        for (int i = 0; i < listfood.size(); i++){
            fee = fee + (listfood.get(i).getFee() * listfood.get(i).getNumberInCart());
        }
        return fee;
    }
}
