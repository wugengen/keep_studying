package decorator;

// 抽象装饰器：实现Display接口并持有一个Display对象
public abstract class Decorator implements Display {
    protected Display display;
    
    public Decorator(Display display) {
        this.display = display;
    }
    
    @Override
    public void show() {
        display.show(); // 调用被装饰对象的show方法
    }
}
