package a13Tp1.Prototype;

public class PrototypeRegistry {
    private Prototype[] prototypes;

    public PrototypeRegistry(Prototype[] prototypes) {
        this.prototypes = prototypes;
    }

    public Prototype createPrototype(int index) {
        return this.prototypes[index].clone();
    }
}
