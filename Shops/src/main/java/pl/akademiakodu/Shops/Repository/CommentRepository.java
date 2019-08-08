package pl.akademiakodu.Shops.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Shops.Model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
