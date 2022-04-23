package pro.sky.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping(path = "/order")
@RestController
@Scope(scopeName = "session")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/add")
    public Map<String, Integer> add(@RequestParam(value = "id", required = false) String id) {
        return cartService.add(id);
    }

    @GetMapping(path = "/get")
    public Map get() {
        return cartService.get();
    }


}//class
