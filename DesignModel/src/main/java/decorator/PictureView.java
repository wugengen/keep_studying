package decorator;

// 具体组件：图片显示类
public class PictureView implements Display {
    private String imageName;
    
    public PictureView(String imageName) {
        this.imageName = imageName;
    }
    
    @Override
    public void show() {
        System.out.println("显示图片: " + imageName);
    }
}
