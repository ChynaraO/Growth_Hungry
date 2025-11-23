package ComputerSystemsAndIndustrialProgramming.November.CacheImpl;

import ComputerSystemsAndIndustrialProgramming.November.Interfaces.ICache;

public class FIFOCache implements ICache {
    int capacity;
    public FIFOCache(int capacity){
        this.capacity = capacity;
    }
    /**
     * @param key
     * @param value
     */
    @Override
    public void put(String key, int value) {
        throw new UnsupportedOperationException("Unimplemented method 'put' ");
    }

    /**
     * @param key
     * @return
     */
    @Override
    public Integer get(String key) {
        throw new UnsupportedOperationException("Unimplemented method 'get' ");
    }

    /**
     * @param key
     */
    @Override
    public void remove(String key) {
        throw new UnsupportedOperationException("Unimplemented method 'remove' ");
    }

    /**
     *
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Unimplemented method 'clear' ");

    }

    /**
     * @return
     */
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Unimplemented method 'size' ");

    }

    /**
     * @param key
     * @return
     */
    @Override
    public boolean containsKey(String key) {
        throw new UnsupportedOperationException("Unimplemented method 'containsKey' ");

    }
}
