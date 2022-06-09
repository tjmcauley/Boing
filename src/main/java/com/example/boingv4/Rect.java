package com.example.boingv4;

/**
 * Rect.java
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
 * Rect is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the rectangle's bounding rectangle.
 */

public class Rect extends ClosedShape {
    private int width;
    private int height;

    /**
     * Creates a rectangle.
     *
     * @param insertionTime  The time delay until the shape
     *                       will appear on the canvas.
     * @param x        The display component's x position.
     * @param y        The display component's y position.
     * @param vx       The display component's x velocity.
     * @param vy       The display component's y velocity.
     * @param width    The width of the rectangle (in pixels).
     * @param height   The height of the rectangle (in pixels).
     * @param colour   The line colour or fill colour.
     * @param isFilled True if the oval is filled with colour, false if opaque.
     */

    public Rect(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        setWidth(width);
        setHeight(height);
    }

    /**
     *
     * @param width set the width of the rectangle
     */
    private void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @return the width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @param height set the height of the rectangle
     */
    private void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return the height of the rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method to draw the rectangle object on the canvas
     *
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled) {
            g.fillRect(x, y, width, height);
        } else {
            g.strokeRect(x, y, width, height);
        }
    }

    /**
     *
     * @return rectangle as a string
     */
    public String toString() {
        String result = "This is a rectangle\n";
        result += super.toString();
        result += "Its width is " + getWidth() + " and its height is " + getHeight() + "\n";
        return result;
    }
}

