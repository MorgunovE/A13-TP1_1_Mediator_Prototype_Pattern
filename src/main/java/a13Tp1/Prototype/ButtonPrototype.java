package a13Tp1.Prototype;

import javafx.scene.paint.Color;

public class ButtonPrototype implements Prototype {
    private String label;
    private Color backgroundColor;
    private Color textColor;
    private double fontSize;

    public ButtonPrototype(String label, Color backgroundColor, Color textColor, double fontSize) {
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.fontSize = fontSize;
    }

    public String getLabel() {
        return label;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public double getFontSize() {
        return fontSize;
    }

    @Override
    public ButtonPrototype clone() {
        return new ButtonPrototype(this.label, this.backgroundColor, this.textColor, this.fontSize);
    }
}