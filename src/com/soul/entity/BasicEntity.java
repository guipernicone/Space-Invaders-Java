package com.soul.entity;

import com.soul.components.*;

import javax.swing.*;
import java.awt.*;

public class BasicEntity {
    protected BasicComponent component;

    public void drawComponent(Graphics g, JPanel jPanel){
        g.drawImage(component.getImage(), component.getComponentPositionX(), component.getComponentPositionY(), jPanel);
    }

    public BasicComponent getComponent() {
        return component;
    }

    public void setComponent(BasicComponent component) {
        this.component = component;
    }


}
