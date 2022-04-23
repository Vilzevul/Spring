package pro.sky.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.*;
import java.util.logging.Logger;


@Service

@Scope(scopeName = "session")
public class CartServiceImpl implements CartService {
    static Logger log = Logger.getLogger(String.valueOf(CartServiceImpl.class));


    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @PostConstruct

    public void setup() {
        log.info("456");
    }

    @Override
    public Map<String, Integer> add(String id) {
        List<String> myList = new ArrayList<String>(Arrays.asList(id.split(" ")));
        for (String newId : myList) {
            if (!cart.getMapCart().containsKey(newId))
                cart.getMapCart().put(newId, 1);
            else {
                Integer quantity = cart.getMapCart().get(newId) + 1;
                cart.getMapCart().replace(newId, quantity);
            }
        }
        return cart.getMapCart();
    }


    @Override
    public Map get() {
        return cart.getMapCart();
    }
}
