package controller;

import entity.Cart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CartServiceImpl;

@RestController
@RequestMapping("/api")
public class CartRestController {
    private final CartServiceImpl service = new CartServiceImpl();

    @PostMapping("/cart/create")
    public Cart createCart(@RequestBody Cart cart) {
        return service.createCart(cart);
    }
}
