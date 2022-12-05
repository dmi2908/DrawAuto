import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class DrawAuto {
    public static void main(String[] args) {
        int w = 1100;
        int h = 700;
        JFrame f = new JFrame();
        Map<Integer, Color> colorMap = new HashMap<Integer, Color>();
        colorMap.put(0, Color.YELLOW);
        colorMap.put(1, Color.BLACK);
        DrawingCanvas dc = new DrawingCanvas(w,h,colorMap);
        f.setSize(w,h);
        f.setTitle("Автомобиль");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
