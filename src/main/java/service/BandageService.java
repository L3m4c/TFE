package service;

import dto.BandageDto;
import entity.Bandage;
import entity.BandageRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class BandageService {


    @Resource
    BandageRepository bandageRepository;

    public List<BandageDto> findAll() {
        Iterator i = bandageRepository.findAll().iterator();
        List<BandageDto> listBandage = new ArrayList<BandageDto>();
        while(i.hasNext()) {
            listBandage.add(new BandageDto((Bandage)i.next()));
        }
        return listBandage;
    }

    public BandageDto findById(long id) {
        return new BandageDto(bandageRepository.findOne(id));
    }

    public void delete(long id) {
        bandageRepository.delete(id);
    }

    public BandageDto save(String product, String bandageCovering, String comment) {
        Bandage bandage = new Bandage();
        bandage.setProduct(product);
        bandage.setBandageCovering(bandageCovering);
        bandage.setComment(comment);
        return new BandageDto(bandageRepository.save(bandage));
    }

    public BandageDto update(long id, String product, String bandageCovering, String comment) {
        Bandage bandage = bandageRepository.findOne(id);

        if(product != null)
            bandage.setProduct(product);
        if(bandageCovering != null)
            bandage.setBandageCovering(bandageCovering);
        if(comment != null)
            bandage.setComment(comment);
        return new BandageDto(bandageRepository.save(bandage));
    }



}
