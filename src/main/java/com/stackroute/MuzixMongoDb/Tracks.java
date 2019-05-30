package com.stackroute.MuzixMongoDb;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tracks {

    @Id
    private int TrackId;
    private String TrackName;
    private String SingerName;
    private String Comments;


    public Tracks(int trackId, String trackName, String singerName, String comments) {
        this.TrackId = trackId;
        this.TrackName = trackName;
        this.SingerName = singerName;
        this.Comments = comments;
    }

    public Tracks(){}

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }

    public String getTrackName() {
        return TrackName;
    }

    public void setTrackName(String trackName) {
        TrackName = trackName;
    }

    public String getSingerName() {
        return SingerName;
    }

    public void setSingerName(String singerName) {
        SingerName = singerName;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }


}
