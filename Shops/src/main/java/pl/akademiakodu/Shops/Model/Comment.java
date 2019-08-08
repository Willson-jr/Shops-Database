package pl.akademiakodu.Shops.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private boolean cheap;
    private Double price;

    /*
    OneToOne sprawia ze bedzie tworzony klucz opcy o nazwie shop_id, ktory bedzie odnosil sie do tabeli shop
     */
    @OneToOne
    private Shop shop;

    /*
    1. private int shop_id;
    2. w sposob automatyczny bedzie nam dzialc metoda getShop(), ktora bedzie zwraca sklep do ktore przypisany jast komentarz
     */

}
