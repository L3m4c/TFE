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

    public BoarderDto findById(long id) {
        return new BoarderDto(boarderRepository.findOne(id));
    }

    public void delete(long id) {
        boarderRepository.delete(id);
    }

    public BoarderDto save(int chambre, String name , String surname) {
        Boarder boarder = new Boarder();
        boarder.setChambre(chambre);
        boarder.setName(name);
        boarder.setSurname(surname);
        return new BoarderDto(boarderRepository.save(boarder));
    }

    public BoarderDto update(long id, int chambre, String name, String surname) {
        Boarder boarder = boarderRepository.findOne(id);
        if(id!=-1)
            boarder.setChambre(chambre);
        if(name != null)
            boarder.setName(name);
        if(surname != null)
        boarder.setSurname(surname);
        return new BoarderDto(boarderRepository.save(boarder));
    }
}
