package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class DiscountDecorator extends ItemDecorator{
    public DiscountDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() * 0.8;
    }
}
