package homework7.exercise1and2and3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {
    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing shapes to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static List<Shape> loadShapesFromFile(String filename){
        List<Shape> shapes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null) {
                Shape shape = ShapeFactory.fromString(line);
                if (shape != null) {
                    shapes.add(shape);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return shapes;
    }

    public static void clearFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

        } catch (IOException e) {
            System.err.println("Error clearing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
