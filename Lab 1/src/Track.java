/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Name:Hanife Büşra Oğuz
 * Student ID:240444012
 * Date:05.10.2026
 */
public class Track {

    // Instance variables
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // Full constructor (all four parameters).
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title=title;
        this.artist=artist;
        this.durationSeconds=durationSeconds;
        this.isExplicit=isExplicit;
        //Validate durationSeconds must be >= 0.
        if(durationSeconds>=0){
            //If valid set duration
            this.durationSeconds=durationSeconds;
        }else{
            //If invalid, print warning message
            System.out.println("Warning: Invalid duration. Setting to 0.");
            //Set duration to 0
            this.durationSeconds=0;
        }

    }


    //Title + artist constructor.
    public Track(String title, String artist) {
        //Call the full constructor using this(...)
        this(title,artist,0,false);
    }


    //Title-only constructor.
    public Track(String title) {
        //Call the full constructor using this(...)
        this(title,"Unknown Artist", 0,false);
    }

    //Default constructor.
    public Track() {
        //Call the full constructor using this(...).
        this("Unknown Title","Unknown Artist", 0,false);
    }


    //Getters for all four fields.
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getDurationSeconds(){
        return durationSeconds;
    }
    public boolean isExplicit() {
        return isExplicit;
    }


    public String getDurationFormatted() {
        //Returns duration as "m:ss"
        int minutes=durationSeconds / 60;
        int seconds=durationSeconds % 60;
        //Using String.format to ensure seconds is always two digits: "%02d"
        return String.format("%d:%02d",minutes,seconds);
    }

    @Override
    public String toString() {
        //Writing all information
        String result=String.format("\"%s\" by %s [%s]",title,artist,getDurationFormatted());
        if(isExplicit==true){
            //Only append " [EXPLICIT]" if isExplicit is true.
            result+="[EXPLICIT]";
        }
        return result;
    }
}