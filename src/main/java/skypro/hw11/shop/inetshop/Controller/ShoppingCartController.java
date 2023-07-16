package skypro.hw11.shop.inetshop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.hw11.shop.inetshop.Service.ShoppingCartSvc;

import java.util.List;

@RestController
public class ShoppingCartController {

    private final ShoppingCartSvc shoppingCartSvc;

    public ShoppingCartController(ShoppingCartSvc shoppingCartSvc) {
        this.shoppingCartSvc = shoppingCartSvc;
    }


//Учесть, что ID могут повторяться. Выбрать соответствующую коллекцию в корзине
    // я это понимаю как "человек хочет купить несколько штук одного товара", что вполне допустимо
    // для логики магазина. Поэтому - лист, а не сет

    @RequestMapping("/add")
    void addIds(@RequestParam(value = "id") List<Integer> ids) {
        shoppingCartSvc.add(ids);
        System.out.println("id:" + ids);
    }

    @RequestMapping("/get")
    List<Integer> getIds() {
        return shoppingCartSvc.get();
    }


}
