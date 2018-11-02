package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Start {
    static int maxAmountOfShapes = 10;
    public static Random rand = new Random();

    public static void main(String[] args) {
        Shape[] array = new Shape[(rand.nextInt(maxAmountOfShapes - 1) + 1)];

        Map<Integer, ShapeBuilder> fig = new HashMap<>();
        fig.put(1, new CircleBuilder());
        fig.put(2, new SquareBuilder());
        fig.put(3, new TrapezeBuilder());
        fig.put(4, new TriangleBuilder());

        for (int i = 0; i < array.length; i++) {
            array[i] = fig.get(rand.nextInt(fig.size()) + 1).BuildShape();
        }

        for (Shape i : array) {
            i.draw();
        }
    }
}
