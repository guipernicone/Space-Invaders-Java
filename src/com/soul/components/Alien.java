package com.soul.components;

import com.soul.commons.Properties;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Alien extends BasicComponent{
    public Alien(String path, int x, int y) {
        Image image = new ImageIcon(path).getImage();
        this.setImage(image.getScaledInstance(Properties.ALIEN_WIDTH, Properties.ALIEN_HEIGHT, Image.SCALE_SMOOTH));
        this.setComponentHeight(Properties.ALIEN_HEIGHT);
        this.setComponentWidth(Properties.ALIEN_WIDTH);
        this.setComponentPositionX(x);
        this.setComponentPositionY(y);
    }
}
