package pl.akademiakodu.Shops.Model;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/*
romi nam tabele w bazie danych o nazwie shop
 */

@NoArgsConstructor  //tworzy pusty konstruktow Shop() jesli nie istnieje
@AllArgsConstructor // konstruktor z wszysktimi argumentami
@Data
@Entity
public class Shop {
    /*
    tworzy klucz glowny, gdzie id beda w sposob automatyczny generowane za nas
    kazdy ID jest o 1 wiekszy niz poprzedni
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;

    /*
    To pole nie jest tworzonw jako kolumna w bazie danych
     */

    @Transient
    private String description;

    @Override
    public String toString(){
        return getName()+" "+getAddress();
    }

    private List<Comment> comments = new ArrayList<>();
    

}
