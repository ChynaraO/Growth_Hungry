package ComputerSystemsAndIndustrialProgramming.November.Interfaces;

//Defines methods for cache
public interface ICache {
    //put new pair {key:value} to cache
    void put(String key, int value);
    //get value by key
    Integer get(String key);
    //remove item in cache by key
    void remove(String key);
    void clear();
    int getSize();
    boolean containsKey(String key);

}
