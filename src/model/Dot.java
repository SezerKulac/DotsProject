package model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Sezer on 4/02/2015.
 */
public class Dot extends JButton{

    private int x;
    private int y;
    private int kleurIndicator;
    private Color color;
    private int kleurGetal;
    private boolean isClicked;
    Random rand = new Random();
    CoordinatenTest model = new CoordinatenTest();

    public void setClicked(boolean isClicked) {
        this.isClicked = isClicked;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public Dot(){
        kleurGetal = rand.nextInt(4)+1;

        switch (kleurGetal) {
            case 1:
                this.kleurIndicator = 1;
                color = Color.orange;
                isClicked = false;
                setIcon(new ImageIcon("image/geel.png"));
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Dot.this.model.doeZet(x, y);
                    }
                });
                break;
            case 2:
                this.kleurIndicator = 2;
                color = Color.blue;
                isClicked = false;
                setIcon(new ImageIcon("image/blauw.png"));
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Dot.this.model.doeZet(x, y);
                    }
                });
                break;
            case 3:
                this.kleurIndicator = 3;
                color = color.red;
                isClicked = false;
                setIcon(new ImageIcon("image/rood.png"));
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Dot.this.model.doeZet(x, y);
                    }
                });
                break;
            case 4:
                this.kleurIndicator = 4;
                color = color.green;
                isClicked = false;

                setIcon(new ImageIcon("image/dankgreen.png"));
                addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Dot.this.model.doeZet(x, y);
                    }
                });
                break;
            default:break;
        }
    }

    public void setKleurGetal() {

        kleurGetal = rand.nextInt(4)+1;
        switch (kleurGetal) {
            case 1:
                this.kleurIndicator = 1;
                color = Color.orange;
                setIcon(new ImageIcon("image/geel.png"));
                break;
            case 2:
                this.kleurIndicator = 2;
                color = Color.blue;
                setIcon(new ImageIcon("image/blauw.png"));
                break;
            case 3:
                this.kleurIndicator = 3;
                color = color.red;
                setIcon(new ImageIcon("image/rood.png"));
                break;
            case 4:
                this.kleurIndicator = 4;
                color = color.green;
                setIcon(new ImageIcon("image/dankgreen.png"));
                break;
            default:
                break;
        }
    }

    public int getColorIndicator() {
        return kleurIndicator;
    }

    public void setX(int x) {
        if (x >= 0) this.x = x;
    }

    public void setY(int y) {
        if (y >= 0) this.y = y;
    }

    public int gogetX() {
        return x;
    }

    public int gogetY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

}