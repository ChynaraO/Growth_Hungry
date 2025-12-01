package DesignPatterns.HW;

//import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.FastfoodRestaurantBuiler;
import DesignPatterns.HW.BuilderExample.Animal;
import DesignPatterns.HW.BuilderExample.AnimalBuilder;
import DesignPatterns.HW.CacheImpl.CacheTypeEnum;
import DesignPatterns.HW.CacheImpl.FIFOCache;
import DesignPatterns.HW.CacheImpl.LRUCache;
import DesignPatterns.HW.CacheImpl.LRUCacheBuilder;
import DesignPatterns.HW.Interfaces.ICache;

public class App {
    public static void main(String[] args) {
        testFIFO();
        testFIFOWithFactory();
        testLRUCashBuilder();
        testAnimal();
    }
    private static void testAnimal(){
        AnimalBuilder builder = new AnimalBuilder();
        Animal dog = builder.setAge(5).setHeight(6).build();
        AnimalBuilder builderGiraffe = new AnimalBuilder();
        Animal giraffe = builderGiraffe.setHeight(6).build();
    }
    private static void testLRUCashBuilder(){
        LRUCacheBuilder lruCacheBuilder = new LRUCacheBuilder(15);
        LRUCache lruCache = lruCacheBuilder.setName("LRU custom cache").setServerName("localhost").build();
        ICache lruCacheFromInterface = lruCacheBuilder.setName("LRU custom cache").setServerName("localhost").build();

        lruCache.put("key1", 2);
        lruCache.put("key2", 2);
        lruCache.getSize(); //2
        System.out.println(lruCache.get("key1")); //1

        lruCache.remove("key1");
        System.out.println(lruCache.getSize()); //1

    }
    private static void testLRUWithFactory(){
        ICache fifoCache = new CacheFactory().createCashInstance(CacheTypeEnum.LRU, 9);
        fifoCache.put("key1", 2);
        fifoCache.put("key2", 2);
        fifoCache.getSize(); //2
        System.out.println(fifoCache.get("key1")); //1

        fifoCache.remove("key1");
        System.out.println(fifoCache.getSize()); //1
    }
    private static void testFIFOWithFactory(){
        ICache fifoCache = new CacheFactory().createCashInstance(CacheTypeEnum.FIFO, 10);
        fifoCache.put("key1", 2);
        fifoCache.put("key2", 2);
        fifoCache.getSize(); //2
        System.out.println(fifoCache.get("key1")); //1

        fifoCache.remove("key1");
        System.out.println(fifoCache.getSize()); //1
    }
    private static void testFIFO(){
        ICache fifoCache = new FIFOCache(9);
        fifoCache.put("key1", 2);
        fifoCache.put("key2", 2);
        fifoCache.getSize(); //2
        System.out.println(fifoCache.get("key1")); //1

        fifoCache.remove("key1");
        System.out.println(fifoCache.getSize()); //1
    }


}
