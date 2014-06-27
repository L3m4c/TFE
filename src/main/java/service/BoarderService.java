package service;

import dto.BoarderDto;
import entity.Boarder;
import entity.BoarderRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class BoarderService {

    @Resource
    BoarderRepository boarderRepository;

    public List<BoarderDto> findAll() {
        Iterator i = boarderRepository.findAll().iterator();
        List<BoarderDto> listBoarder = new ArrayList<BoarderDto>();
        while(i.hasNext()) {
            listBoarder.add(new BoarderDto((Boarder)i.next()));
        }
        return listBoarder;
    }

}
