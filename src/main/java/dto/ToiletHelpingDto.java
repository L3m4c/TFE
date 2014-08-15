package dto;

import entity.ToiletHelping;

/**
 * Created by Dams on 9/08/2014.
 */
public class ToiletHelpingDto {

    private long id;
    private boolean move;

    public ToiletHelpingDto() {}

    public ToiletHelpingDto(ToiletHelping toiletHelping) {
        this.id = toiletHelping.getId();
        this.move = toiletHelping.isMove();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
}
