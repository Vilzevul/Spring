package pro.sky.Spring;

import java.util.Map;

public interface CartService {
    Map<String, Integer> add(String id);
    Map get();
}
