package Task3;

public class Car implements Comparable<Car> { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car o) {
        int priceComparison = this.price - o.price;
        int speedComparison = this.speed - o.speed;
        int modelComparison = this.model.compareTo(o.model);
        int colorComparison = this.color.compareTo(o.color);

        if (speedComparison == 0) {
            if (priceComparison == 0) {
                if (modelComparison == 0) {
                    return colorComparison;
                }
                return modelComparison;
            }
            return priceComparison;
        }
        return speedComparison;
        /*int temp = this.speed - o.speed; //int temp = this.speed - o.speed;
        if (temp == 0) {
            return this.price - o.price;
        } else {
            return temp;
        }*/
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}