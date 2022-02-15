package product;

public class MagicCard implements Product{
    private final String name;
    private final String color;
    private final int ageInYears;

    public MagicCard(String name, String color) {
        this.name = name;
        this.color = color;
        this.ageInYears = 1;
    }

    public MagicCard(String name, String color, int ageInYears) {
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;
    }

    public Double getPrice() {
        if (this.name.equals("Magic: The Gathering - Black Lotus")) {
            return 40000.0;
        }

        return switch (color) {
            case "blue" -> isMoreThan10YearsOld() ? 2.5 : 5.0;
            case "red" -> 3.5;
            case "green" -> 4.40;
            case "black" -> 6.80;
            default -> 2.0;
        };
    }

    private boolean isMoreThan10YearsOld() {
        return ageInYears > 10;
    }
}
