package Decorator;

import javax.swing.plaf.PanelUI;

public abstract class Beverage {
    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
