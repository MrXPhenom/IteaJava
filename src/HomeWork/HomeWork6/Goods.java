package HomeWork.HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Goods {

    private int price;
    private String color;
    private String name;

    public Goods(int price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Goods car1 = new Goods(48000, "Red", "Mitsubishi Lancer Evolution X");
        Goods car2 = new Goods(53000, "Blue", "BMW M3 Evolution");
        Goods car3 = new Goods(59500, "Gray", "Mazda RX-7 Spirit R");
        Goods car4 = new Goods(70500, "Red", "Audi S5 Sportback");
        Goods car5 = new Goods(73000, "Black", "Nissan Skyline GT-R LE");

        List<Goods> goods = new ArrayList<>();
        goods.add(car1);
        goods.add(car2);
        goods.add(car3);
        goods.add(car4);
        goods.add(car5);

        List<Goods> goodsListAll = goods.stream().collect(Collectors.toList());
        List<Goods> goodsListUpdated = goods.stream().filter(good -> good.getColor().equalsIgnoreCase("red")).collect(Collectors.toList());
        List<Goods> goodsListUpdated2 = goods.stream().filter(good -> good.getPrice() > 60000).collect(Collectors.toList());
        System.out.println(goodsListAll + "\n" + goodsListUpdated + "\n" + goodsListUpdated2);
    }
}
