package Alishev;/*
Задача о рюкзаке. Как в него поместить максимальный объем с максимальной ценностью
 */

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final  int w = 7; // вместимость рюкзака
        int weightSoFar = 0; //аккумулируем текущий вес
        double valueSoFar = 0; //аккумулируем нбранную ценность
        int currentItem = 0; // индекс текущего предмета

        final  Item item1 = new Item(4, 20);
        final  Item item2 = new Item(3, 18);
        final  Item item3 = new Item(2, 14);
        final  Item[] items = {item1, item2, item3};

            // сортируем массив по удельной ценности методом valuePerUnitOfWeight
            //  и разворачиваем от большего к меньшему с помощью компаратора
            // сложность O(N*log(N))
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        while (currentItem < items.length && weightSoFar != w) {
            if (weightSoFar + items[currentItem].getWeight() < w) {
                // берем объект целиком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                // берем только часть объекта
                valueSoFar += ((w- weightSoFar) / (double)items[currentItem].getWeight()) *
                        items[currentItem].getValue();
                weightSoFar = w; // рюкзак стал полным
            }
            currentItem++;
        }
        System.out.println("Ценность лучшего набора: " + valueSoFar);
    }
}

//класс предмет
class Item {

    private int weight; // вес
    private int value; // ценность

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double)weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "{w: " + weight + ", v: " + value + "}";
    }
}
