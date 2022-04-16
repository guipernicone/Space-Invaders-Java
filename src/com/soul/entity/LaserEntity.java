package com.soul.entity;

import com.soul.commons.Properties;
import com.soul.components.Alien;
import com.soul.components.Lasershot;

public class LaserEntity extends BasicEntity{
    Boolean isVisible;
    public LaserEntity(int spaceshipPositionX, int spaceshipPositionY){
        this.setComponent(new Lasershot(spaceshipPositionX, spaceshipPositionY));
        this.isVisible = true;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public void checkSpaceLaser(AlienEntity[][] alienEntities){
        Lasershot lasershot = (Lasershot) component;
        if (isVisible) {
            lasershot.setComponentPositionY(lasershot.getComponentPositionY() - Properties.LASERSHOT_MOVEMENT);
            this.checkOutOfLimit(lasershot);
            this.checkIfHitAlien(lasershot, alienEntities);
        }
    }

    private void checkOutOfLimit(Lasershot lasershot){
        if ( lasershot.getComponentPositionY() <= Properties.FRAME_INIT_HEIGHT){
            setVisible(false);
        }
    }

    private void checkIfHitAlien(Lasershot lasershot, AlienEntity[][] alienEntities) {
        for(int y = 0; y <  Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                AlienEntity alienEntity = alienEntities[y][x];
                Alien alien = (Alien) alienEntity.getComponent();
                if (
                        alienEntity.getVisible() &&
                        alien.getComponentPositionX() <= lasershot.getComponentPositionX() &&
                        alien.getComponentPositionX() + alien.getComponentWidth() >= lasershot.getComponentPositionX() &&
                        alien.getComponentPositionY() <= lasershot.getComponentPositionY() &&
                        alien.getComponentPositionY() + alien.getComponentHeight() >= lasershot.getComponentPositionY()
                ) {
                    setVisible(false);
                    alienEntity.setDead();
                    System.out.printf("Y[%d]X[%d] - %s\n", y, x, alienEntity.getVisible().toString());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "LaserEntity{" +
                "isVisible=" + isVisible +
                '}';
    }
}
