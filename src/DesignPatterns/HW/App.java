package DesignPatterns.HW;

//import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.FastfoodRestaurantBuiler;
import DesignPatterns.HW.CacheImpl.CacheTypeEnum;
import DesignPatterns.HW.CacheImpl.FIFOCache;
        import DesignPatterns.HW.Interfaces.ICache;

public class App {
    public static void main(String[] args) {
        testFIFO();
        testFIFOWithFactory();
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
