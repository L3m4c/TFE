package dto;

import entity.Drug;

/**
 * Created by Dams on 2/08/2014.
 */
public class DrugDto {

    private long id;
    private String name;
    private String unit;
    private int dosage;

    public DrugDto(Drug drug) {
        this.id = drug.getId();
        this.name = drug.getName();
        this.unit = drug.getUnit();
        this.dosage = drug.getDosage();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
