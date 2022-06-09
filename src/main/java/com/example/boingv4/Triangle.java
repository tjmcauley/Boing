package com.example.boingv4;

/**
 * Triangle.java
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
 * Triangle is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the triangle's bounding rectangle.
 */

public class Triangle extends ClosedShape {

    private static final int nPoints = 3;
    private int height;
    private int width;
    private double[] xCoords;
    private double[] yCoords;

    /**
     * Creates a triangle.
     *
     * @param insertionTime  The time delay until the shape
     *                       will appear on the canvas.
     * @param x        The display component's x position.
     * @param y        The display component's y position.
     * @param vx       The display component's x velocity.
     * @param vy       The display component's y velocity.
     * @param width    The width of the triangle (in pixels).
     * @param height   The height of the triangle (in pixels).
     * @param colour   The line colour or fill colour.
     * @param isFilled True if the oval is filled with colour, false if opaque.
     */

    public Triangle(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        setWidth(width);
        setHeight(height);
        xCoords = new double[] {x + getWidth(), x + getWidth(), x - getWidth()};
        yCoords = new double[] {y + getHeight(), y, y + (height / 2)};
    }

    /**
     *
     * @param width the width the triangle should be set to
     */
    private void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @return the width of the triangle
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @param height the height that the triangle should be set to
     */
    private void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return the height of the triangle
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return the x coordinates of where the triangle will be plotted
     */
    public double[] getXCoords() {
        return xCoords;
    }

    /**
     *
     * @return the y coordinates of where the triangle will be plotted
     */
    public double[] getYCoords() {
        return yCoords;
    }

    /**
     * Method to draw the triangle object on the canvas
     *
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        xCoords = new double[] {x, x + getWidth(), x + getWidth()};
        yCoords = new double[] {y + (height / 2), y, y + getHeight()};

        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled) {
            g.fillPolygon(getXCoords(), getYCoords(), nPoints);
        } else {
            g.strokePolygon(getXCoords(), getYCoords(), nPoints);
        }
    }

    /**
     *
     * @return triangle as a string
     */
    public String toString() {
        String result = "This is a triangle\n";
        result += super.toString();
        result += "Its width is " + getWidth() + " and its height is " + getHeight() + "\n";
        return result;
    }

}
