package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.decorators.RibbonDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.Item;

class DecoratorTest {

    @Test
    public void decoratorTester() {
        Item treeOne = new PaperDecorator(new Flower());
        Assertions.assertEquals(treeOne.getDescription(),
                "Flower in paper");

        Item treeTwo = new RibbonDecorator(
            new PaperDecorator(new PaperDecorator(new Flower())));
        Assertions.assertEquals(treeTwo.getDescription(),
                "Flower in paper in paper in ribbon");
    }

}
