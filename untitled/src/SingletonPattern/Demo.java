package SingletonPattern;

public class Demo {
    public static void main(String[] args){
        SingleObject object= SingleObject.getInstance();
        object.showMessage();
    }
}
//例子如打印机
