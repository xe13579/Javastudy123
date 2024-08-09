package FactoryPattern;//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。


public class Main{
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 =shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 =shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 =shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}