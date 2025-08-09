package pixel.academy.restaurant.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantRestController {
    @GetMapping("/menu")
    public String menu() {
        return "Restaurant Menu : "        +
                "Zeama - 50 lei"           +
                "Pizza - 150 lei"          +
                "Desert special - 120 lei" +
                "Gyros de pui - 140 lei"   +
                "Tocana cu mamaliga - 200 lei ";
    }

    @GetMapping("/menu-discount")
    public String menuDiscount() {
        return "Restaurant Menu : "        +
                " Zeama - 25 lei "           +
                " Pizza - 75 lei "           +
                " Desert special - 60 lei "  +
                " Gyros de pui - 70 lei "    +
                " Tocana cu mamaliga - 100 lei ";
    }

}
