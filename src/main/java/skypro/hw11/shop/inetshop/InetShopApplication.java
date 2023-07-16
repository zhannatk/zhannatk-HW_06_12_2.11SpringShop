package skypro.hw11.shop.inetshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import skypro.hw11.shop.inetshop.Service.ShoppingCartServiceImpl;
import skypro.hw11.shop.inetshop.Service.ShoppingCartSvc;

@SpringBootApplication
public class InetShopApplication {
    ShoppingCartSvc shoppingCartSvc =new ShoppingCartServiceImpl();

    public static void main(String[] args) {
        SpringApplication.run(InetShopApplication.class, args);
    }

}
