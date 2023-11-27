package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class DiscountDecorator extends ItemDecorator {
    private final double discount = 0.8;
    
    public DiscountDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() * discount;
    }
}
