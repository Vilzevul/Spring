package pro.sky.Spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.HashMap;


@Component
@Scope(scopeName = "session")
public class Cart {

    HashMap<String, Integer> mapCart = new HashMap<>();

    public Cart(HashMap<String, Integer> mapCart) {
        this.mapCart = mapCart;
    }

    public HashMap<String, Integer> getMapCart() {
        return mapCart;
    }

    public void setMapCart(HashMap<String, Integer> mapCart) {
        this.mapCart = mapCart;
    }
}
