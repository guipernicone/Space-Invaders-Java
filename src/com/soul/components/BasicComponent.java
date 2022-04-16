package com.soul.components;

import java.awt.*;

public class BasicComponent {
    private Image componentImage;
    private int componentWidth;
    private int componentHeight;
    private int componentPositionX;
    private int componentPositionY;

    public Image getImage(){
        return componentImage;
    }

    public void setImage(Image image){
        componentImage = image;
    }

    public Image getComponentImage() {
        return componentImage;
    }

    public void setComponentImage(Image componentImage) {
        this.componentImage = componentImage;
    }

    public int getComponentWidth() {
        return componentWidth;
    }

    public void setComponentWidth(int componentWidth) {
        this.componentWidth = componentWidth;
    }

    public int getComponentHeight() {
        return componentHeight;
    }

    public void setComponentHeight(int componentHeight) {
        this.componentHeight = componentHeight;
    }

    public int getComponentPositionX() {
        return componentPositionX;
    }

    public void setComponentPositionX(int componentPositionX) {
        this.componentPositionX = componentPositionX;
    }

    public int getComponentPositionY() {
        return componentPositionY;
    }

    public void setComponentPositionY(int componentPositionY) {
        this.componentPositionY = componentPositionY;
    }
}
