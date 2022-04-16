package com.soul.components;

import com.soul.commons.*;

import javax.swing.*;
import java.awt.*;

public class Background{
    private Image backgroundImage;
    private int backgroundWidth;
    private int backgroundHeight;

    public Background() {
        backgroundImage = new ImageIcon(Properties.BACKGROUND_SPACE_IMAGE_PATH).getImage();
    }

    public void drawBackground(Graphics g, JPanel jPanel){
        g.drawImage(backgroundImage, 0, 0, jPanel);
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getBackgroundWidth(JPanel jPanel) {
        return  backgroundImage.getWidth(jPanel);
    }

    public int getBackgroundHeight(JPanel jPanel) {
        return backgroundImage.getHeight(jPanel);
    }
}
