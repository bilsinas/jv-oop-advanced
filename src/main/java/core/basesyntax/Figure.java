package core.basesyntax;

abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

}
