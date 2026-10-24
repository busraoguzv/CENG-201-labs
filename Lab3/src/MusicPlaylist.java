/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Hanife Büşra Oğuz
 * Your Student ID:  240444012
 * Your Date:        19.10.2026
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current
    private SongNode head;
    private SongNode tail;
    private SongNode current;


    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist() {
        this.head=null;
        this.tail=null;
        this.current=null;

    }

    // Add a song to the end of the playlist
    public void addSong(String title) {

        // 1. Create a new SongNode
        SongNode song1=new SongNode( title);
        // 2. If the playlist is empty, make the new node
        //    head, tail and current
        if(head==null){
            head=song1;
            tail=song1;
            current=song1;

        }else{
            // 3. Otherwise, add the new node after tail
            // 4. Update both next and prev pointer
            song1.prev=tail;
            tail.next=song1;
            // 5. Update tail
            tail=song1;

        }
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        if(head==null){
            System.out.println("Playlist is empty.");
            return;
        }

        // 1. Search for the song
        SongNode temp=head;
        while(temp!=null && !temp.title.equals(title)){
            temp=temp.next;
        }
        // 2. If the song does not exist, display a message as: "The song isn't in the playlist"
        if(temp==null){
            System.out.println("The song isn't in the playlist");
            return;
        }



        // 5. Handle removing head
        if(temp==head){
            head=head.next;//update the head
            if(head!=null){
                head.prev=null;//there is no other element before head
            }else{
                tail=null;//list is empty now
            }

        }
        // 6. Handle removing tail
        else if (temp==tail) {
            tail=tail.prev;//Previous element from tail is new tail
            tail.next=null;//disconnect the next song of the playlist to delete it

        }else{
            // 7. remove a song in the middle
            temp.prev.next=temp.next;//before temp and after the temp link next each other
            temp.next.prev=temp.prev;//before temp and after the temp link prev each other
        }
        System.out.println("Removed: "+temp.title);
    }



    // Move to the next song
    public void nextSong() {
        if(current==null){
            System.out.println("Playlist is empty.");
        }
        // If current is not null and current.next exists,
        if(current!=null){
            // move current to current.next.
            current=current.next;
            System.out.println("Playing: "+current.title);
        }
        else{
            // Otherwise, display:
            // "Already at the last song of the playlist."
            System.out.println("Already at the last song of the playlist.");
        }
    }


    // Move to the previous song
    public void previousSong() {
        if(current==null){
            System.out.println("Playlist is empty.");
        }
        // If current is not null and current.prev exists,
        if(current!=null&&current.next!=null){
            // move current to current.prev.
            current=current.prev;
            System.out.println("Playing: "+current.title);
        }
        // Otherwise, display:
        // "Already at the first song of the playlist."
        else{
            System.out.println("Already at the first song of the playlist.");
        }
    }


    // Display the current song
    public void displayCurrentSong() {
        // Display the title of the current song.
        if(current!=null){
            System.out.println("Current Song: "+current.title);
        }else{
            System.out.println("No song is playing.");
        }
    }


    // Display all songs
    public void displayPlaylist() {
        // Start from head and follow next pointer.
        if(head==null){
            System.out.println("Playlist is empty.");
        }
        SongNode temp=head;
        while(temp!=null){
            System.out.print(temp.title+" <-> ");
            temp=temp.next;

        }
        System.out.print("END");
        System.out.println();
    }
}