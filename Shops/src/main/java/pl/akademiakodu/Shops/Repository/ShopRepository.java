package pl.akademiakodu.Shops.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Shops.Model.Shop;

public interface ShopRepository extends CrudRepository <Shop, Integer> {

}
