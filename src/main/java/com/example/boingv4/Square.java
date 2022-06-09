package com.example.boingv4;
/**
 * Square.java
 *
 * @version 4.0.0
 * @author Thomas McAuley (2110735)
 * Last Modified - 24/02/2022
 * Copyrighted
 *
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Square is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the square's bounding rectangle.
 */

public class Square extends ClosedShape {
    private int side;

    /**
     * Creates a square.
     *
     * @param insertionTime  The time delay until the shape
     *                       will appear on the canvas.
     * @param x        The display component's x position.
     * @param y        The display component's y position.
     * @param vx       The display component's x velocity.
     * @param vy       The display component's y velocity.
     * @param side    The width of the square (in pixels).
     * @param colour   The line colour or fill colour.
     * @param isFilled True if the oval is filled with colour, false if opaque.
     */

    public Square(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        setSide(side);
    }

    /**
     *
     * @param side the length of the square's sides
     */
    private void setSide(int side) {
        this.side = side;
    }

    /**
     *
     * @return the length of the square's sides
     */
    public int getSide() {
        return this.side;
    }

    /**
     *
     * @return the width of the square
     */
    public int getWidth() {
        return getSide();
    }

    /**
     *
     * @return the height of the square
     */
    public int getHeight() {
        return getSide();
    }

    /**
     * Method to draw the square object on the canvas
     *
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled) {
            g.fillRect(x, y, side, side);
        } else {
            g.strokeRect(x, y, side, side);
        }
    }

    /**
     *
     * @return square as a string
     */
    public String toString() {
        String result = "This is a square\n";
        result += super.toString();
        result += "Its side is " + getSide() + "\n";
        return result;
    }
}

