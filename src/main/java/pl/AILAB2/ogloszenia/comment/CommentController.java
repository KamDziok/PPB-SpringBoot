package pl.AILAB2.ogloszenia.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    private ArrayList<Comment> getAllComment(){
        return (ArrayList<Comment>) commentRepository.findAll();
    }

    @PostMapping
    private Comment addComment(@RequestBody Comment comment){
        return commentRepository.save(comment);
    }

    @PutMapping
    private Comment updateComment(@RequestBody Comment comment){
        return commentRepository.save(comment);
    }

    @DeleteMapping
    private Comment deleteComment(@RequestBody Comment comment){
        commentRepository.delete(comment);
        return comment;
    }
}
