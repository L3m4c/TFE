package service;

import dto.ClothingDto;
import entity.BoarderRepository;
import entity.Clothing;
import entity.ClothingRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class ClothingService {

    @Resource
    ClothingRepository clothingRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public ClothingDto save(long idBoarder, Date date, boolean clothingComplete, boolean stimulated) {
        Clothing clothing = new Clothing();
        User current = userService.getCurrentUser();
        clothing.setBoarder(boarderRepository.findOne(idBoarder));
        clothing.setUser(current);

        if(date != null) {
            clothing.setDate(date);
        }
        clothing.setClothingComplete(clothingComplete);
        clothing.setStimulated(stimulated);

        return new ClothingDto(clothingRepository.save(clothing));
    }

    public ClothingDto update(long id, long idBoarder, Date date, boolean clothingComplete, boolean stimulated) {
        Clothing clothing = clothingRepository.findOne(id);
        if(id != -1) {
            clothing.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            clothing.setDate(date);
        clothing.setClothingComplete(clothingComplete);
        clothing.setStimulated(stimulated);

        return new ClothingDto(clothingRepository.save(clothing));
    }






}
