package service;

import java.io.FileWriter;
import java.io.IOException;

import entity.Cart;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CartServiceImpl implements CartService{

    @Override
    public Cart createCart(Cart cart) {
        JSONObject newCart = new JSONObject();
        JSONObject cartItem = new JSONObject();
        try {
            newCart.put("cart","cartItem");
            JSONArray array = new JSONArray();
            array.put(newCart);

            FileWriter file = new FileWriter("cart.json");
            file.write(array.toString());
            file.flush();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
