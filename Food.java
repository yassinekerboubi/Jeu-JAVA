package Lybrinth;

import java.awt.*;

/**
 * Represents food in the game, which is a type of SolidThing.
 * When the hero encounters food, it can be used to increase health.
 */
public class Food extends SolidThings {
    
    /**
     * Constructs a Lybrinth.Food object with a specified position and image.
     * The food is represented visually with the provided image.
     *
     * @param x The X-coordinate of the food.
     * @param y The Y-coordinate of the food.
     * @param image The image associated with the food.
     */
    public Food(int x, int y, Image image) {
        super(x, y, image);
    }
}
