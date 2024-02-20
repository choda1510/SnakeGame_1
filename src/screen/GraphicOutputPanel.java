package screen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicOutputPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    public GraphicOutputPanel() {
        super();
    }
    @Override
    public void paintComponent(Graphics g) {
        Dimension parentDim = null;
        try {
            parentDim = getParent().getSize();
        } catch (NullPointerException nullPointerE) {
            return;
        } catch (Exception ignore) {
        }
        g.fillRect(0, 0, (int)parentDim.getWidth(), (int)parentDim.getHeight());
    }
}
