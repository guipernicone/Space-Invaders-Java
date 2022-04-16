package com.soul.components;

import com.soul.commons.*;

import javax.swing.*;
import java.awt.*;

public class Spaceship extends BasicComponent{
    public Spaceship() {
        Image image = new ImageIcon(Properties.SPACESHIP_IMAGE_PATH).getImage();
        this.setImage(image.getScaledInstance(Properties.SPACESHIP_WIDTH, Properties.SPACESHIP_HEIGHT, Image.SCALE_SMOOTH));
        this.setComponentHeight(Properties.SPACESHIP_HEIGHT);
        this.setComponentWidth(Properties.SPACESHIP_WIDTH);
        this.setComponentPositionX(Properties.SPACESHIP_X);
        this.setComponentPositionY(Properties.SPACESHIP_Y);
    }
}
