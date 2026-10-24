/**
 * MusicPlayerDemo.java
 * Tests the playlist

 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        //create the playlist object
        MusicPlaylist playlist1=new MusicPlaylist();


        // Add songs
        playlist1.addSong("Shape of You - Ed Sheeran");
        playlist1.addSong("Save Me - BTS");
        playlist1.addSong("Snap - Manifest");
        playlist1.addSong("like JENNIE - JENNIE");


        System.out.println("=== PLAYLIST ===");
        //display the playlist
        playlist1.displayPlaylist();



        System.out.println("\n=== CURRENT SONG PLAYING ===");
        //display the current song playing
        playlist1.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go the next song of the playlist and display it
        playlist1.nextSong();


        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go the next song of the playlist and display it
        playlist1.nextSong();


        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        // go the previous song of the playlist and display it
        playlist1.previousSong();


        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        // remove the song called "Shape of You - Ed Sheeran" from the playlist
        playlist1.removeSong("Shape of You - Ed Sheeran");
        //Then display the Playlist
        playlist1.displayPlaylist();



        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest" from the playlist
        playlist1.removeSong("Snap - Manifest");
        //Then display the Playlist
        playlist1.displayPlaylist();

    }
}