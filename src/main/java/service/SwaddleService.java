package service;

import dto.SwaddleDto;
import entity.BoarderRepository;
import entity.Swaddle;
import entity.User;
import entity.SwaddleRepository;
import entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 2/07/2014.
 */
public class SwaddleService {

    @Resource
    SwaddleRepository swaddleRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Resource
    UserRepository userRepository;
    @Autowired
    UserService userService;

    /**
     * Save a swaddle. If date == null : date = new Date();
     * @param idBoarder
     * @param idUser
     * @param date
     * @return
     */

    public SwaddleDto save(long idBoarder, long idUser, Date date) {
        User current = userService.getCurrentUser();

        Swaddle swaddle = new Swaddle();
        swaddle.setBoarder(boarderRepository.findOne(idBoarder));
        swaddle.setUser(userRepository.findOne(idUser));
        swaddle.setUser(current);
        if(date != null) {
            swaddle.setDate(date);
        }
        return new SwaddleDto(swaddleRepository.save(swaddle));
    }

    public SwaddleDto findById(long id) {
        return new SwaddleDto(swaddleRepository.findOne(id));
    }

    public List<SwaddleDto> findAll() {
        Iterator i = swaddleRepository.findAll().iterator();
        List<SwaddleDto> listSwaddle = new ArrayList<SwaddleDto>();
        while(i.hasNext()) {
            listSwaddle.add(new SwaddleDto((Swaddle)i.next()));
        }
        return listSwaddle;
    }

    public void delete(long id) {
        swaddleRepository.delete(id);
    }

    /**
     * Update a swaddle. If date == null : date = new Date();
     * @param id
     * @param idBoarder
     * @param date
     * @return
     */
    public SwaddleDto update(long id, long idBoarder, long idUser, Date date) {
        Swaddle swaddle = swaddleRepository.findOne(id);
        if(id != -1) {
            swaddle.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(id != -1) {
            swaddle.setUser(userRepository.findOne(idUser));
        }
        if(date != null) {
            swaddle.setDate(date);
        }
        return new SwaddleDto(swaddleRepository.save(swaddle));
    }

}
