package decorator;

// 客户端测试类
public class Client {
    public static void main(String[] args) {
        // 创建基本的文本显示组件
        Display textView = new TextView("Hello, World!");
        
        // 为文本添加滚动条
//        Display textWithScroll = new ScrollBarDecorator(textView);
        
        // 为文本同时添加滚动条和黑色边框
        Display textWithScrollAndBorder = new BlackBorderDecorator(
            new ScrollBarDecorator(textView)
        );
        
//        // 创建基本的图片显示组件
//        Display pictureView = new PictureView("风景图.jpg");
//
//        // 为图片添加黑色边框
//        Display pictureWithBorder = new BlackBorderDecorator(pictureView);
//
//        // 为图片同时添加黑色边框和滚动条
//        Display pictureWithBorderAndScroll = new ScrollBarDecorator(
//            new BlackBorderDecorator(pictureView)
//        );
        
//        System.out.println("===== 文本显示 =====");
//        textView.show();
//        System.out.println("\n===== 带滚动条的文本 =====");
//        textWithScroll.show();
        System.out.println("\n===== 带滚动条和边框的文本 =====");
        textWithScrollAndBorder.show();
        
  /*      System.out.println("\n===== 图片显示 =====");
        pictureView.show();
        System.out.println("\n===== 带边框的图片 =====");
        pictureWithBorder.show();
        System.out.println("\n===== 带边框和滚动条的图片 =====");
        pictureWithBorderAndScroll.show();*/
    }
}
