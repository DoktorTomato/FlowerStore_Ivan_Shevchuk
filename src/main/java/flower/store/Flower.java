package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor
public class Flower {
    private FlowerType type;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public Flower(Flower flower){
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }

    public String getColor(){
        if (this.color == null) {
            return null;
        }
        return color.toString();
    }
}

