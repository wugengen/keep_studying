package decorator;

// 具体组件：文本显示类
public class TextView implements Display {
    private String text;
    
    public TextView(String text) {
        this.text = text;
    }
    
    @Override
    public void show() {
        System.out.println("显示文本: " + text);
    }
}
