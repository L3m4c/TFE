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

    public BoarderDto save(int room, String name , String surname, int age, String dateBirth, String mutuel, String personResponsible, String phone) {
        Boarder boarder = new Boarder();
        boarder.setRoom(room);
        boarder.setName(name);
        boarder.setSurname(surname);
        boarder.setAge(age);
        boarder.setDateBirth(dateBirth);
        boarder.setMutuel(mutuel);
        boarder.setPersonResponsible(personResponsible);
        boarder.setPhone(phone);
        return new BoarderDto(boarderRepository.save(boarder));
    }

    public BoarderDto update(long id, int room, String name, String surname, int age, String dateBirth, String mutuel, String personResponsible, String phone) {
        Boarder boarder = boarderRepository.findOne(id);
        if(id!=-1)
            boarder.setRoom(room);
        if(name != null)
            boarder.setName(name);
        if(surname != null)
        boarder.setSurname(surname);
        if(age != 0)
            boarder.setAge(age);
        if(dateBirth != null)
            boarder.setDateBirth(dateBirth);
        if(mutuel != null)
            boarder.setMutuel(mutuel);
        if(personResponsible != null)
            boarder.setPersonResponsible(personResponsible);
        if(phone != null)
            boarder.setPhone(phone);
        return new BoarderDto(boarderRepository.save(boarder));
    }
}
