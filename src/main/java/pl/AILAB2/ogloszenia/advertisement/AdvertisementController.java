package pl.AILAB2.ogloszenia.advertisement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/advertisement")
@CrossOrigin
public class AdvertisementController {

    @Autowired
    private AdvertisementsRepository advertisementsRepository;

    @GetMapping
    private ArrayList<Advertisement> getAllAdvertisement(){
        return (ArrayList<Advertisement>) advertisementsRepository.findAll();
    }

    @PostMapping
    private Advertisement addAdvertisement(@RequestBody Advertisement advertisement){
        return advertisementsRepository.save(advertisement);
    }

    @PutMapping
    private Advertisement updateAdvertisement(@RequestBody Advertisement advertisement){
        return advertisementsRepository.save(advertisement);
    }

    @DeleteMapping
    private Advertisement deleteAdvertisement(@RequestBody Advertisement advertisement){
        advertisementsRepository.delete(advertisement);
        return advertisement;
    }
}
