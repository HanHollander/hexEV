package GUI;

/**
 * Created by han on 31-10-16.
 */

import javax.swing.*;
import java.awt.*;

public class PuzzleScreen {

    public static void main(String[] args) {
        JFrame puzzleFrame = new JFrame("Nonogram Puzzle Solver");
        setPuzzleFrameAttr(puzzleFrame, 1024, 768);
        Panel panel = new Panel();
        puzzleFrame.getContentPane().add(panel);
        JButton b = new JButton("OK");
        panel.add(b);
    }

    public static void setPuzzleFrameAttr(JFrame fr, int w, int h) {
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setSize(w, h);
    }
}
