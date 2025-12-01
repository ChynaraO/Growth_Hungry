package DesignPatterns.HW.BuilderExample;
import DesignPatterns.BuilderExample.FastFoodRestaurant;
public class FastFoodRestaurantBuilder {
    private FastFoodRestaurant fastFoodRestaurant;
        public FastFoodRestaurantBuilder(){
            fastFoodRestaurant = new DesignPatterns.BuilderExample.FastFoodRestaurant();
        }
        public FastFoodRestaurantBuilder buildKidsMenu(){
            fastFoodRestaurant.setBurger(1);
            fastFoodRestaurant.setFries(1);
            fastFoodRestaurant.setCoke(1);
            fastFoodRestaurant.setToy(1);
            return this;
        }
        public FastFoodRestaurantBuilder buildCristmasMenu(){
            fastFoodRestaurant.setBurger(1);
            fastFoodRestaurant.setFries(1);
            fastFoodRestaurant.setCoke(1);
            fastFoodRestaurant.setToy(1);
            return this;
        }
        public FastFoodRestaurant build(){

            return fastFoodRestaurant;
        }
}
