package pl.AILAB2.ogloszenia.massage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/massage")
@CrossOrigin
public class MassageController {

    @Autowired
    private MassageRepository massageRepository;

    @GetMapping
    private ArrayList<Massage> getAllMassage(){
        return (ArrayList<Massage>) massageRepository.findAll();
    }

    @PostMapping
    private Massage addMassage(@RequestBody Massage massage){
        return massageRepository.save(massage);
    }

    @PutMapping
    private Massage updateMassage(@RequestBody Massage massage){
        return massageRepository.save(massage);
    }

    @DeleteMapping
    private Massage deleteMassage(@RequestBody Massage massage){
        massageRepository.delete(massage);
        return massage;
    }
}
