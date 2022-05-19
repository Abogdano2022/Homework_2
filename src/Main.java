public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    var box = 5;
        System.out.println(box);
    box = box + 2;
        System.out.println(box);
    box = box - 3;
        System.out.println(box);
    box = box *3;
        System.out.println(box);
    box = box/4;
        System.out.println(box);
    var liftingCapacity = 50;
    var staffWeight = 20;
    var capacityLeft = liftingCapacity - staffWeight;
    System.out.println("Еще можно положить " + capacityLeft + " кг вещей");
    var applesWeight = 2;
    var orangesWeight = 3;
    var fruitsWeight = applesWeight + orangesWeight;
    System.out.println ("Общий вес фруктов " + fruitsWeight);
    var meatWeight = 4;
    var waterWeight = 5;
    var tomatoesWeight = 2;
    var cucumbersWeight = 2;
    var peppersWeight = 2;
    var zucchiniWeight = 2;
    var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
    var productsWeight = fruitsWeight + vegetablesWeight + meatWeight + waterWeight;
    System.out.println ("Общий вес продуктов " + productsWeight + " кг!");

    var leftWeight = liftingCapacity - staffWeight - productsWeight;
    System.out.println ("Места осталось " + leftWeight + " кг!");
    productsWeight = productsWeight *2;
    System.out.println ("Теперь вес продуктов " + productsWeight + " кг");

    leftWeight = liftingCapacity - staffWeight - productsWeight;
    System.out.println ("Теперь места осталось " + leftWeight + " кг!");
    var overload = (staffWeight + productsWeight) % liftingCapacity;
    System.out.println ("Перегруз на " + overload + " кг!");

    var productsInOneCar = productsWeight / 2;
    System.out.println ("Продуктов в одной машине теперь " + productsInOneCar);

    int bananas = 200;
    System.out.println ("Бананов " + bananas + " кг!");

    float sugar = 3;
    float onePortion = sugar / 4;
    System.out.println ("Одна порция весит " + onePortion + " кг!");}




}

