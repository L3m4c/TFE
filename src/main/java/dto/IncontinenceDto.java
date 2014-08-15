package dto;

import entity.Incontinence;

/**
 * Created by Dams on 9/08/2014.
 */
public class IncontinenceDto {

    private long id;
    private boolean diurnal;
    private boolean nocturnal;
    private boolean both;

    public IncontinenceDto() {}

    public IncontinenceDto(Incontinence incontinence) {
        this.id = incontinence.getId();
        this.diurnal = incontinence.isDiurnal();
        this.nocturnal = incontinence.isNocturnal();
        this.both = incontinence.isBoth();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDiurnal() {
        return diurnal;
    }

    public void setDiurnal(boolean diurnal) {
        this.diurnal = diurnal;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public boolean isBoth() {
        return both;
    }

    public void setBoth(boolean both) {
        this.both = both;
    }
}
