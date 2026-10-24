/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Hanife Büşra Oğuz
 * Your Student ID:  240444012
 * Your Date:        19.10.2026
 */
public class SongNode {
    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}