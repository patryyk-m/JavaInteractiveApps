package Part4;

import javax.swing.ImageIcon;


public class FavouriteAnimal extends AlbumItem {
    private String animalName;
    private String habitat;
    private String imagePath;

    public FavouriteAnimal(String animalName, String habitat, String imagePath) {
        this.animalName = animalName;
        this.habitat = habitat;
        this.imagePath = imagePath;
    }

    public ImageIcon getImage() {
        return new ImageIcon(imagePath);
    }

    public String getFacts() {
        return "Animal: " + animalName + ", Habitat: " + habitat;
    }
}
