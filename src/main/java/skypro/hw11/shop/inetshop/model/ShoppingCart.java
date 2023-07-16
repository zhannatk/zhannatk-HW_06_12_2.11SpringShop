package skypro.hw11.shop.inetshop.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> ids=new ArrayList<>();

    public void setIds(List<Integer> ids) {
        this.ids.addAll(ids);
    }
    public List<Integer> getIds() {
        return ids;
    }



}
