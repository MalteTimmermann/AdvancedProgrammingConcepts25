package homework8.exercise1and2and3;

public class ShapeFactory {
    public static Shape fromString(String input){
        String[] parts1 = input.split(":");
        String type = parts1[0].trim();
        String[] parts2 = parts1[1].trim().split(",");

        switch (type) {
            case "Circle":
                double radius = Double.parseDouble(parts2[0].trim().replace("radius=", ""));
                return new Circle(radius);
            case "Rectangle":
                double width = Double.parseDouble(parts2[0].trim().replace("width=", ""));
                double length = Double.parseDouble(parts2[1].trim().replace("length=", ""));
                return new Rectangle(length, width);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
