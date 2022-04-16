package com.soul.components;

import com.soul.commons.*;

import javax.swing.*;
import java.awt.*;

public class Lasershot extends BasicComponent {
    public Lasershot(int x, int y) {
        Image image = new ImageIcon(Properties.LASERSHOT_IMAGE_PATH).getImage();
        this.setImage(image.getScaledInstance(Properties.LASERSHOT_WIDTH, Properties.LASERSHOT_HEIGHT, Image.SCALE_SMOOTH));
        this.setComponentHeight(Properties.LASERSHOT_HEIGHT);
        this.setComponentWidth(Properties.LASERSHOT_WIDTH);
        this.setComponentPositionX(x);
        this.setComponentPositionY(y);
    }


}
