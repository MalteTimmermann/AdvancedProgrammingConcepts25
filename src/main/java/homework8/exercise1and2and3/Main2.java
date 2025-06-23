package homework8.exercise1and2and3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 4.0));
        shapes.add(new Circle(1.0));
        shapes.add(new Rectangle(5.0, 5.0));
        shapes.add(new Circle(3.5));
        System.out.println("All Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // filter shapes with area >= 15
        System.out.println("\nShapes with area >= 15:");
        List<Shape> filtered = ShapeAnalyzer
                .filterByMinArea(shapes, 15);
        for (Shape shape : filtered) {
            System.out.println(shape);
        }

        // find shape with max area
        Shape maxShape = ShapeAnalyzer
                .findShapeWithMaxArea(shapes);
        System.out.println("\nShape with max area:");
        System.out.println(maxShape);

        // group by type
        Map<String, List<Shape>> grouped = ShapeAnalyzer
                .groupByType(shapes);
        // print
        System.out.println("\nGrouped by type:");
        for (Map.Entry<String, List<Shape>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Shape shape : entry.getValue()) {
                System.out.println(" " + shape);
            }

        }
    }
}

/*
    Fragen:
    1. Es müssen Wildcards verwendet werden, da die Methoden in ShapeAnalyzer generisch mit allen Unterklassen von Shape arbeiten müssen. Non-Generic-Parameter würden dies nicht erlauben,
       da sie nur auf die Klasse Shape selbst beschränkt wären (Invariance). "? extends Shape" erlaubt es, alle Instanzen der Unterklassen von Shape zu lesen, jedoch nicht zu schreiben,
       das führt zu einer besseren Lesbarkeit und Einschränkung der Typen.
    2. In der Methode "groupedByType" wird kein Wildcard verwendet, da die Metbode die Shape-Instanzen sowohl lesen als auch schreiben muss, daher wird der generische Typ T verwendet.
    3. Die Methoden sind static, da sie als Utility-Methoden fungieren, die auf einer Sammlung von Shapes arbeiten, ohne dass eine Instanz von ShapeAnalyzer benötigt wird. Dadurch können sie direkt aufgerufen werden,
       ohne ein Objekt der Klasse zu erstellen. Sie dienen als Hilfsfunktionen.
 */
