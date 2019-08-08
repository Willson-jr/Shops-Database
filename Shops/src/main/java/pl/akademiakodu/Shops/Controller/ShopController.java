package pl.akademiakodu.Shops.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.Shops.Model.Comment;
import pl.akademiakodu.Shops.Model.Shop;
import pl.akademiakodu.Shops.Repository.ShopRepository;

@Controller
public class ShopController {
    /*
    ShopRepository to interfejst z metodami sava find all i td
    Spring szuka  beana, ktora imlementuje interfejs ShopRepositrory
    Beize generacje beana na siebie, generuje klase z implemetacjami tych metod
     */
    @Autowired
    private ShopRepository shopRepository;


    @GetMapping("/")
    public String home(ModelMap map){
        map.put("shops",shopRepository.findAll());
        map.put("shop", new Shop());
    return "home";
    }

    @PostMapping("/shops")
    public String create(@ModelAttribute Shop shop){
        shopRepository.save(shop);
        return "redirect:/";
    }

    //shops/2
    @GetMapping("/shops/{id}")
    public String show(@PathVariable Integer id,ModelMap map){
        Shop shop = shopRepository.findById(id).get();
        map.put("shop", shop);
        Comment comment = new Comment();
        comment.setShop(shop);
        map.put("comment", comment);
        return "show";
    }


}
