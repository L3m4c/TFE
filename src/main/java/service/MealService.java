package service;

import dto.MealDto;
import entity.BoarderRepository;
import entity.Meal;
import entity.MealRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class MealService {

    @Resource
    MealRepository mealRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    /**
     * Save a meal. If date == null : date = new Date();
     * @param idBoarder
     * @param date
     * @return
     */
    public MealDto save(long idBoarder, Date date) {
        User current = userService.getCurrentUser();

        Meal meal = new Meal();
        meal.setBoarder(boarderRepository.findOne(idBoarder));
        meal.setUser(current);
        if(date != null) {
            meal.setDate(date);
        }
        return new MealDto(mealRepository.save(meal));
    }

    public MealDto findById(long id) {
        return new MealDto(mealRepository.findOne(id));
    }

    public List<MealDto> findAll() {
        Iterator i = mealRepository.findAll().iterator();
        List<MealDto> listMeal = new ArrayList<MealDto>();
        while(i.hasNext()) {
           listMeal.add(new MealDto((Meal)i.next()));
        }
        return listMeal;
    }

    public void delete(long id) {
        mealRepository.delete(id);
    }

    /**
     * Update a meal. If date == null : date = new Date();
     * @param id
     * @param idBoarder
     * @param date
     * @return
     */
    public MealDto update(long id, long idBoarder, Date date) {
        Meal meal = mealRepository.findOne(id);
        if(id != -1) {
            meal.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null) {
            meal.setDate(date);
        }
        return new MealDto(mealRepository.save(meal));
    }

}
