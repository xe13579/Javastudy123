package AbstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
//getColor(String color) 和 getShape(String shape) 是抽象方法。这两个方法只有声明而没有实现，它们强制要求任何继承 AbstractFactory 的子类都必须提供这两个方法的具体实现。
//AbstractFactory 是一个抽象类，因为它被声明为 abstract。这意味着你不能创建 AbstractFactory 类的实例，它只能被用作其他类的基类。