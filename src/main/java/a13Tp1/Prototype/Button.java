package a13Tp1.Prototype;

public class Button implements Prototype {
    private String label;

    public Button(String text) {
        this.label = text;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public Button clone() {
        return new Button(this.label);
    }

}
