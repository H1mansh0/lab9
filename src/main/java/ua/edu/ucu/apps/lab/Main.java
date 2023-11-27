package ua.edu.ucu.apps.lab;

import ua.edu.ucu.apps.lab.decorators.DiscountDecorator;
import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

public class Main {
    public static void main(String[] args) {
        Item item = new Flower(1, FlowerType.ROSE, 90, 0.8, FlowerColor.RED);
        item = new DiscountDecorator(new PaperDecorator(item));
        System.out.println(item.price());

        Item item2 = new Flower(2, FlowerType.ROSE, 90, 0.8, FlowerColor.RED);
        item2 = new PaperDecorator(new DiscountDecorator(item2));
        System.out.println(item2.price());
    }
}
