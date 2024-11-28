package a13Tp1.Prototype.model;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * A registry for storing and retrieving prototypes.
 * This class provides methods to add and retrieve prototypes from a concurrent hash map.
 * Each prototype is associated with a unique key.
 *
 * @author Evgenii Morgunov
 * @version 1.0
 * @since 28-11-2024
 */
public class PrototypeRegistry {
    private Map<String, Prototype> prototypes =
            new ConcurrentHashMap<>();

    /**
     * Adds a prototype to the registry.
     *
     * @param key the key associated with the prototype
     * @param prototype the prototype to add
     */
    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    /**
     * Retrieves and clones a prototype from the registry.
     *
     * @param key the key associated with the prototype
     * @return a clone of the prototype
     */
    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}