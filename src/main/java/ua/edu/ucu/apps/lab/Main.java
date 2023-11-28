package ua.edu.ucu.apps.lab;

import ua.edu.ucu.apps.lab.decorators.DiscountDecorator;
import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;
import ua.edu.ucu.apps.lab.flowers.Item;

public class Main {
    private static final int IDONE = 1;
    private static final int IDTWO = 2;
    private static final FlowerType FLOWERTYPE = FlowerType.ROSE;
    private static final int PRICE = 90;
    private static final double SEPALLENGTH = 0.8;
    private static final FlowerColor COLOR = FlowerColor.RED;
    
    public static void main(String[] args) {
        Item item = new Flower(IDONE, FLOWERTYPE, PRICE, SEPALLENGTH, COLOR);
        item = new DiscountDecorator(new PaperDecorator(item));
        System.out.println(item.price());

        Item itemTwo = new Flower(IDTWO, FLOWERTYPE, PRICE, SEPALLENGTH, COLOR);
        itemTwo = new PaperDecorator(new DiscountDecorator(itemTwo));
        System.out.println(itemTwo.price());
    }
}
