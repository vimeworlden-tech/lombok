import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor
@ToString(exclude = "quantity")
@EqualsAndHashCode
class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Corolla", "Toyota", 2022, 95000.0, "Silver", 5);
        Car car2 = new Car("Camry", "Toyota", 2023, 120000.0, "White", 3);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("Red");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is: " + car2.hashCode());
        System.out.println("The HashCode of this object is: " + car1.hashCode());
    }
}