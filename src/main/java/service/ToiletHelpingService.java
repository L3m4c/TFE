package service;

import dto.ToiletHelpingDto;
import entity.ToiletHelping;
import entity.ToiletHelpingRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class ToiletHelpingService {

    @Resource
    ToiletHelpingRepository toiletHelpingRepository;

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

    public ToiletHelpingDto save(boolean move) {
        ToiletHelping toiletHelping = new ToiletHelping();
        toiletHelping.setMove(move);

        return new ToiletHelpingDto(toiletHelpingRepository.save(toiletHelping));
    }

    public ToiletHelpingDto update(long id, boolean move) {
        ToiletHelping toiletHelping = toiletHelpingRepository.findOne(id);

        toiletHelping.setMove(move);

        return new ToiletHelpingDto(toiletHelpingRepository.save(toiletHelping));

    }
}