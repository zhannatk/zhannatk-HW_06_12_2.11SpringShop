package skypro.hw11.shop.inetshop.Service;

import java.util.List;

public interface ShoppingCartSvc {
    List<Integer> get();
    void add (List<Integer> ids);

}
