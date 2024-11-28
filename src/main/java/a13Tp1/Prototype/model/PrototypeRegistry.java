package a13Tp1.Prototype.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a prototype for a button with various properties.
 */
public class PrototypeRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    // Add a prototype to the registry
    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    // Retrieve and clone a prototype from the registry
    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}