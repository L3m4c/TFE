package service;

import dto.ClothingDto;
import entity.Clothing;
import entity.ClothingRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class ClothingService {

    @Resource
    ClothingRepository clothingRepository;

    public List<ClothingDto> findAll() {
        Iterator i = clothingRepository.findAll().iterator();
        List<ClothingDto> listClothing = new ArrayList<ClothingDto>();
        while(i.hasNext()) {
            listClothing.add(new ClothingDto((Clothing)i.next()));
        }
        return listClothing;
    }

    public ClothingDto findById(long id) {
        return new ClothingDto(clothingRepository.findOne(id));
    }

    public void delete(long id) {
        clothingRepository.delete(id);
    }

    public ClothingDto save(boolean clothingComplete, boolean stimulated) {
        Clothing clothing = new Clothing();
        clothing.setClothingComplete(clothingComplete);
        clothing.setStimulated(stimulated);

        return new ClothingDto(clothingRepository.save(clothing));
    }

    public ClothingDto update(long id, boolean clothingComplete, boolean stimulated) {
        Clothing clothing = clothingRepository.findOne(id);

        clothing.setClothingComplete(clothingComplete);
        clothing.setStimulated(stimulated);

        return new ClothingDto(clothingRepository.save(clothing));
    }






}
