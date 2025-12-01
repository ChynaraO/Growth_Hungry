package DesignPatterns.HW.CacheImpl;

import DesignPatterns.HW.CacheImpl.LRUCache;

public class LRUCacheBuilder {
    private LRUCache lruCache;

    public LRUCacheBuilder(int capacity){
        lruCache = new LRUCache(capacity);
    }
    public LRUCacheBuilder setName(String name){
        lruCache.setName(name);
        return this;
    }
    public LRUCacheBuilder setServerName(String setServerName){
        lruCache.setServerName(setServerName);
        return this;
    }
    public LRUCache build(){
        return lruCache;
    }
}
