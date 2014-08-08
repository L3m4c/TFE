package dto;

import entity.Wound;

/**
 * Created by Dams on 7/08/2014.
 */
public class WoundDto {

    private long id;
    private String localisation;
    private String type;
    private String description;


    public WoundDto() {}

    public WoundDto(Wound wound) {
        this.id = wound.getId();
        if (wound.getLocalisation() != null)
            this.localisation = wound.getLocalisation();
        if (wound.getType() != null)
            this.type = wound.getType();
        if (wound.getDescription() != null)
            this.description = wound.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
