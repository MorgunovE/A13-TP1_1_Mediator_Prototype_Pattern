package a13Tp1.Prototype.model;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

/**
 * Represents a prototype for a button with various properties.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
public class ButtonPrototype implements Prototype {
    private String label;
    private Color backgroundColor;
    private Color textColor;
    private double fontSize;
    private double x;
    private double y;
    private String fontWeight;
    private double animationDuration;
    private DropShadow shadowEffect;

    /**
     * Constructs a ButtonPrototype with the specified properties.
     *
     * @param label the label of the button
     * @param backgroundColor the background color of the button
     * @param textColor the text color of the button
     * @param fontSize the font size of the button text
     * @param x the x-coordinate of the button
     * @param y the y-coordinate of the button
     * @param fontWeight the font weight of the button text
     * @param animationDuration the duration of the button's animation
     * @param shadowEffect the shadow effect of the button
     */
    public ButtonPrototype(String label, Color backgroundColor, Color textColor, double fontSize, double x, double y, String fontWeight, double animationDuration, DropShadow shadowEffect) {
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.fontSize = fontSize;
        this.x = x;
        this.y = y;
        this.fontWeight = fontWeight;
        this.animationDuration = animationDuration;
        this.shadowEffect = shadowEffect;
    }

    // Getters for button properties
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

    public double getAnimationDuration() {
        return animationDuration;
    }

    public DropShadow getShadowEffect() {
        return shadowEffect;
    }

    /**
     * Creates a copy of this ButtonPrototype.
     *
     * @return a clone of this ButtonPrototype
     */
    @Override
    public ButtonPrototype clone() {
        return new ButtonPrototype(this.label, this.backgroundColor, this.textColor, this.fontSize, this.x, this.y, this.fontWeight, this.animationDuration, this.shadowEffect);
    }
}