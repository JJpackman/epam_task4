package shape_generator.utils.data.enums;

public enum ShapeColors {
    BLACK,
    RED,
    GREEN,
    YELLOW,
    BLUE,
    PURPLE,
    CYAN,
    WHITE;

    public String getColor() {
        return this.name().toLowerCase();
    }
}
