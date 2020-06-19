package decorator;

// 具体装饰器：添加黑色边框
public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Display display) {
        super(display);
    }
    
    @Override
    public void show() {
        System.out.println("添加黑色边框");
        super.show(); // 调用父类的show方法，即被装饰对象的show方法
    }
}
