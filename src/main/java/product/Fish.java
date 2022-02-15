package product;

public class Fish implements Product{
    private final Double basePrice;
    private final String color;

    public Fish(Double basePrice, String color) {
        this.basePrice = basePrice;
        this.color = color;
    }

    public Double getPrice() {
        return switch (color) {
            case "blue" -> basePrice+0.1;
            case "gold" -> basePrice*100;
            default -> basePrice;
        };
    }
}
