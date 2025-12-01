package DesignPatterns.HW;

import DesignPatterns.HW.CacheImpl.CacheTypeEnum;
import DesignPatterns.HW.CacheImpl.FIFOCache;

import DesignPatterns.HW.CacheImpl.LRUCache;
import DesignPatterns.HW.Interfaces.ICache;

import java.text.MessageFormat;

public class CacheFactory {
    public ICache createCashInstance(CacheTypeEnum cacheTypeEnum, int capacity){
        switch (cacheTypeEnum){
            case FIFO:
                return new FIFOCache(capacity);
            case LRU:
                return new LRUCache(capacity);
            default:
                System.out.println(MessageFormat.format("Cache with type {0} is not implemented yet.", cacheTypeEnum));
                throw new AssertionError();
        }

    }
}
