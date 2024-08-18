package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;
    private String color;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq. units, base1: " + firstBase
                + " units, base2: " + secondBase
                + " units, height: " + height
                + " units, color: " + color);
    }
}
