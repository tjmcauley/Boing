package com.example.boingv4;
/**
 * ReadShapeFile.java
 *
 * @version 4.0.0
 * @author Thomas McAuley (2110735)
 * Last Modified - 24/02/2022
 * Copyrighted
 *
 * A class that reads a .txt shape file and creates a shape object based on that
 * data, which will be enqueued
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadShapeFile {

    /**
     * Reads the data file used by the program and returns the constructed queue
     *
     * @param in the scanner of the file
     * @return the queue represented by the data file
     */
    private static Queue<ClosedShape> readLineByLine(Scanner in) {
        Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
        while (in.hasNext()) {
            String shapeType = in.next();

            try {
                if (shapeType.equals("circle")) {
                    readCircle(shapeQueue, in);
                } else if (shapeType.equals("oval")) {
                    readOval(shapeQueue, in);
                } else if (shapeType.equals("square")) {
                    readSquare(shapeQueue, in);
                } else if (shapeType.equals("rect")) {
                    readRect(shapeQueue, in);
                } else if (shapeType.equals("triangle")) {
                    readTriangle(shapeQueue, in);

                }
            } catch (NoSuchElementException e) {
                System.out.println("That isn't a valid shape");
            }
        }

        return shapeQueue;
    }


    /**
     * Method to read the file and return a queue of shapes from this file.
     *
     * @param filename the name of the file
     * @return the queue of shapes from the file
     */
    public static Queue<ClosedShape> readDataFile(String filename) {
        // HINT: You might want to open a file here.
        File fileReader = new File(filename);
        Scanner in = null; //null is not sensible. Please change
        try {
            in = new Scanner(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find: " + filename);
            System.exit(0);
        }
        return ReadShapeFile.readLineByLine(in);
    }

    /**
     * Method to read the data that will construct a Circle object
     * and place it on the shapeQueue
     *
     * @param shapeQueue the queue which the shape will be added to
     * @param in the scanner of the file
     */
    public static void readCircle(Queue shapeQueue, Scanner in) {
        int insertionTime = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        boolean isFilled = in.nextBoolean();
        int diameter = in.nextInt();
        int colourR = in.nextInt();
        int colourG = in.nextInt();
        int colourB = in.nextInt();
        Circle newCircle = new Circle(insertionTime, x, y, vx, vy, diameter, Color.rgb(colourR, colourG, colourB), isFilled);
        shapeQueue.enqueue(newCircle);
    }

    /**
     * Method to read the data that will construct an Oval object
     * and place it on the shapeQueue
     *
     * @param shapeQueue the queue which the shape will be added to
     * @param in the scanner of the file
     */
    public static void readOval(Queue shapeQueue, Scanner in) {
        int insertionTime = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        boolean isFilled = in.nextBoolean();
        int width = in.nextInt();
        int height = in.nextInt();
        int colourR = in.nextInt();
        int colourG = in.nextInt();
        int colourB = in.nextInt();
        Oval newOval = new Oval(insertionTime, x, y, vx, vy, width, height, Color.rgb(colourR, colourG, colourB), isFilled);
        shapeQueue.enqueue(newOval);
    }

    /**
     * Method to read the data that will construct a Square object
     * and place it on the shapeQueue
     *
     * @param shapeQueue the queue which the shape will be added to
     * @param in the scanner of the file
     */
    public static void readSquare(Queue shapeQueue, Scanner in) {
        int insertionTime = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        boolean isFilled = in.nextBoolean();
        int side = in.nextInt();
        int colourR = in.nextInt();
        int colourG = in.nextInt();
        int colourB = in.nextInt();
        Square newSquare = new Square(insertionTime, x, y, vx, vy, side, Color.rgb(colourR, colourG, colourB), isFilled);
        shapeQueue.enqueue(newSquare);
    }

    /**
     * Method to read the data that will construct a Rect object
     * and place it on the shapeQueue
     *
     * @param shapeQueue the queue which the shape will be added to
     * @param in the scanner of the file
     */
    public static void readRect(Queue shapeQueue, Scanner in) {
        int insertionTime = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        boolean isFilled = in.nextBoolean();
        int width = in.nextInt();
        int height = in.nextInt();
        int colourR = in.nextInt();
        int colourG = in.nextInt();
        int colourB = in.nextInt();
        Rect newRect = new Rect(insertionTime, x, y, vx, vy, width, height, Color.rgb(colourR, colourG, colourB), isFilled);
        shapeQueue.enqueue(newRect);
    }

    /**
     * Method to read the data that will construct a Triangle object
     * and place it on the shapeQueue
     *
     * @param shapeQueue the queue which the shape will be added to
     * @param in the scanner of the file
     */
    public static void readTriangle(Queue shapeQueue, Scanner in) {
        int insertionTime = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        boolean isFilled = in.nextBoolean();
        int width = in.nextInt();
        int height = in.nextInt();
        int colourR = in.nextInt();
        int colourG = in.nextInt();
        int colourB = in.nextInt();
        Triangle newTriangle = new Triangle(insertionTime, x, y, vx, vy, width, height, Color.rgb(colourR, colourG, colourB), isFilled);
        shapeQueue.enqueue(newTriangle);
    }
}
