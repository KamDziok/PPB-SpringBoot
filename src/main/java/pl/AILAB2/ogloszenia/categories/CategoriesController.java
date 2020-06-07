package pl.AILAB2.ogloszenia.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoriesController {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @GetMapping
    private ArrayList<Categories> getAllCategories(){
        return (ArrayList<Categories>) categoriesRepository.findAll();
    }

    @PostMapping
    private Categories addCategories(@RequestBody Categories categories){
        return categoriesRepository.save(categories);
    }

    @PutMapping
    private Categories updateCategories(@RequestBody Categories categories){
        return categoriesRepository.save(categories);
    }

    @DeleteMapping
    private Categories deleteCategories(@RequestBody Categories categories){
        categoriesRepository.delete(categories);
        return categories;
    }
}
