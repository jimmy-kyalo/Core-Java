import javax.swing.*;
import java.awt.*;

public class TestComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            var frame = new TextComponentFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
