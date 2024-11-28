package a13Tp1.Prototype;

import javafx.scene.paint.Color;

public class ButtonPrototype implements Prototype {
    private String label;
    private Color backgroundColor;
    private Color textColor;
    private double fontSize;
    private double x;
    private double y;
    private String fontWeight;

    public ButtonPrototype(String label, Color backgroundColor, Color textColor, double fontSize, double x, double y, String fontWeight) {
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.fontSize = fontSize;
        this.x = x;
        this.y = y;
        this.fontWeight = fontWeight;
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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    @Override
    public ButtonPrototype clone() {
        return new ButtonPrototype(this.label, this.backgroundColor, this.textColor, this.fontSize, this.x, this.y, this.fontWeight);
    }
}