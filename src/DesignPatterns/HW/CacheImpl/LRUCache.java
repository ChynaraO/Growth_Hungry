package DesignPatterns.HW.CacheImpl;

import DesignPatterns.HW.Interfaces.ICache;

public class LRUCache implements ICache {
    int capacity;
    String name;
    String serverName;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @param key
     * @param value
     */
    @Override
    public void put(String key, int value) {

    }

    /**
     * @param key
     * @return
     */
    @Override
    public int get(String key) {
        return 0;
    }

    /**
     * @param key
     */
    @Override
    public void remove(String key) {
    }

    /**
     *
     */
    @Override
    public void clear() {

    }

    /**
     * @return
     */
    @Override
    public int getSize() {
        return 0;
    }

    /**
     * @param key
     * @return
     */
    @Override
    public boolean containsKey(String key) {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

}
