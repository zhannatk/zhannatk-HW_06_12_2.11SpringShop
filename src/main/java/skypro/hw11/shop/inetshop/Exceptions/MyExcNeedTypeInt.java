package skypro.hw11.shop.inetshop.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MyExcNeedTypeInt extends  RuntimeException{
    public MyExcNeedTypeInt(String message) {
        super(message);
    }
}
