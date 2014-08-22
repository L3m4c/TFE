package service;

import dto.ToiletHelpingDto;
import entity.BoarderRepository;
import entity.ToiletHelping;
import entity.ToiletHelpingRepository;
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
public class ToiletHelpingService {

    @Resource
    ToiletHelpingRepository toiletHelpingRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<ToiletHelpingDto> findAll() {
        Iterator i = toiletHelpingRepository.findAll().iterator();
        List<ToiletHelpingDto> listToiletHelping = new ArrayList<ToiletHelpingDto>();
        while (i.hasNext()) {
            listToiletHelping.add(new ToiletHelpingDto((ToiletHelping) i.next()));
        }
        return listToiletHelping;
    }

    public ToiletHelpingDto findById(long id) {
        return new ToiletHelpingDto(toiletHelpingRepository.findOne(id));
    }

    public void delete(long id) {
        toiletHelpingRepository.delete(id);
    }

    public ToiletHelpingDto save(long idBoarder, Date date, boolean move) {
        ToiletHelping toiletHelping = new ToiletHelping();
        User current = userService.getCurrentUser();
        toiletHelping.setBoarder(boarderRepository.findOne(idBoarder));
        toiletHelping.setUser(current);

        if(date != null) {
            toiletHelping.setDate(date);
        }
        toiletHelping.setMove(move);

        return new ToiletHelpingDto(toiletHelpingRepository.save(toiletHelping));
    }

    public ToiletHelpingDto update(long id, long idBoarder, Date date, boolean move) {
        ToiletHelping toiletHelping = toiletHelpingRepository.findOne(id);
        if(id != -1) {
            toiletHelping.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            toiletHelping.setDate(date);
        toiletHelping.setMove(move);

        return new ToiletHelpingDto(toiletHelpingRepository.save(toiletHelping));

    }
}