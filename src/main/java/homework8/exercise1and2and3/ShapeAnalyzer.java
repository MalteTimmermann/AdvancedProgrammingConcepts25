package homework8.exercise1and2and3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ShapeAnalyzer {
    static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        List<Shape> filteredShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getArea() >= minArea) {
                filteredShapes.add(shape);
            }
        }
        return filteredShapes;
    }

    static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        if (shapes.isEmpty()) {
            return null;
        }

        Shape maxShape = null;
        double maxArea = 0.0;

        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea) {
                maxArea = shape.getArea();
                maxShape = shape;
            }
        }
        return maxShape;
    }

    static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
        Map<String, List<T>> groupedShapes = new java.util.HashMap<>();
        for (T shape : shapes) {
            String type = shape.getClass().getSimpleName();
            groupedShapes.computeIfAbsent(type, k -> new ArrayList<>()).add(shape);
        }
        return groupedShapes;
    }
}
