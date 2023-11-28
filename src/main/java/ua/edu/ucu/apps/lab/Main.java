package ua.edu.ucu.apps.lab;

import ua.edu.ucu.apps.lab.decorators.DiscountDecorator;
import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

public class Main {
    private static final int idOne = 1;
    private static final int idTwo = 2;
    private static final FlowerType flowerType = FlowerType.ROSE;
    private static final int price = 90;
    private static final double sepalLength = 0.8;
    private static final FlowerColor color = FlowerColor.RED;
    
    public static void main(String[] args) {
        Item item = new Flower(idOne, flowerType, price, sepalLength, color);
        item = new DiscountDecorator(new PaperDecorator(item));
        System.out.println(item.price());

        Item itemTwo = new Flower(idTwo, flowerType, price, sepalLength, color);
        itemTwo = new PaperDecorator(new DiscountDecorator(itemTwo));
        System.out.println(itemTwo.price());
    }
}
