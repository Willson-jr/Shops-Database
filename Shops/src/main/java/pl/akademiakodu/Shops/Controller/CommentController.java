package pl.akademiakodu.Shops.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.Shops.Model.Comment;
import pl.akademiakodu.Shops.Repository.CommentRepository;

@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/comments")
    public String create(@ModelAttribute Comment comment){
        commentRepository.save(comment);
        return "redirect:/";
    }

}
