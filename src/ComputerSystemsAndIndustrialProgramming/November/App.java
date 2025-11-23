package ComputerSystemsAndIndustrialProgramming.November;

import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.Animal;
import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.AnimalBuilder;
import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.FastFoodRestaurant;
//import ComputerSystemsAndIndustrialProgramming.November.BuilderExample.FastfoodRestaurantBuiler;
import ComputerSystemsAndIndustrialProgramming.November.CacheImpl.CacheTypeEnum;
import ComputerSystemsAndIndustrialProgramming.November.CacheImpl.FIFOCache;
import ComputerSystemsAndIndustrialProgramming.November.CacheImpl.LRUCacheBuilder;
import ComputerSystemsAndIndustrialProgramming.November.Interfaces.ICache;

public class App {
    public static void main(String[] args) {
//        testFIFO();
//        testFIFOwithFactory();
//        testLRUwithFactory();
//        testLRUCacheBuilder();

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
