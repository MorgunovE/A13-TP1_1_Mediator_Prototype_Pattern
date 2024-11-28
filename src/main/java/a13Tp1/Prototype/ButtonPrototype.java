package a13Tp1.Prototype;

public class ButtonPrototype implements Prototype {
    private String label;

    public ButtonPrototype(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public ButtonPrototype clone() {
        return new ButtonPrototype(this.label);
    }
}
