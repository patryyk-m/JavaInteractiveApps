package Part4;



import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class MyAlbum {
    // Vector to hold album items sports/animals
    Vector<AlbumItem> albumItems;
    JLabel imageLabel;
    JTextArea factsArea;
    // Index to keep track of the current item displayed
    int currentIndex = -1;

    public MyAlbum() {
        // Initialize the albumItems vector
        albumItems = new Vector<>();
        JFrame frame = new JFrame("My Album");
        frame.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        factsArea = new JTextArea(5, 20);
        factsArea.setEditable(false); // Make the facts area non-editable

        JButton forwardButton = new JButton("Forward");
        forwardButton.addActionListener(e -> displayNextItem());

        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(new JScrollPane(factsArea), BorderLayout.SOUTH);
        frame.add(forwardButton, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    // Function to display the next item in the album
    public void displayNextItem() {
        // Return immediately if there are no items
        if (albumItems.size() == 0) return;
        // Move to the next item in the list. If at the end, go back to the first item
        currentIndex = (currentIndex + 1) % albumItems.size();
        // Get the current item and update UI components
        AlbumItem item = albumItems.get(currentIndex);
        imageLabel.setIcon(item.getImage());
        factsArea.setText(item.getFacts());
    }

    // Function to add a new item to the album
    public void addAlbumItem(AlbumItem item) {
        albumItems.add(item);
    }


    public static void main(String[] args) {
        MyAlbum myAlbum = new MyAlbum();
        myAlbum.addAlbumItem(new FavouriteSport("Football", "11", "images/football.png"));
        myAlbum.addAlbumItem(new FavouriteSport("Rugby", "15", "images/rugby.png"));
        myAlbum.addAlbumItem(new FavouriteSport("Basketball", "5", "images/basketball.png"));
        myAlbum.addAlbumItem(new FavouriteAnimal("Lion", "Grasslands", "images/lion.png"));
        myAlbum.addAlbumItem(new FavouriteAnimal("Elephant", "Forests", "images/elephant.png"));

        myAlbum.displayNextItem();
    }
}
