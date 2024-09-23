package Part4;

import javax.swing.ImageIcon;


public class FavouriteSport extends AlbumItem {
    private String sportName;
    private String numberOfPlayers;
    private String imagePath;

    public FavouriteSport(String sportName, String numberOfPlayers, String imagePath) {
        this.sportName = sportName;
        this.numberOfPlayers = numberOfPlayers;
        this.imagePath = imagePath;
    }

    public ImageIcon getImage() {
        return new ImageIcon(imagePath);
    }

    public String getFacts() {
        return "Name: " + sportName + ", Number of players: " + numberOfPlayers;
    }
}
