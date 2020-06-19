package decorator;

// 具体装饰器：添加滚动条
public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator(Display display) {
        super(display);
    }
    
    @Override
    public void show() {
        System.out.println("添加滚动条");
        super.show(); // 调用父类的show方法，即被装饰对象的show方法
    }
}
