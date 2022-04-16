package com.soul.panel;

import com.soul.commons.Properties;
import com.soul.components.Background;
import com.soul.control.AlienControl;
import com.soul.entity.AlienEntity;
import com.soul.entity.LaserEntity;
import com.soul.entity.Player;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private Background background;
    private Player player;
    private AlienControl alienControl;
    public GamePanel(Player player, AlienControl alienControl){
        this.player = player;
        this.alienControl = alienControl;
        this.setLayout( new BorderLayout());
        background = new Background();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawLine(Properties.FRAME_WIDTH/2, 0, Properties.FRAME_WIDTH/2, Properties.FRAME_HEIGHT);
        g.drawLine(0, Properties.FRAME_HEIGHT/2, Properties.FRAME_WIDTH, Properties.FRAME_HEIGHT/2);
        background.drawBackground(g, this);
        player.drawComponent(g, this);
        for (LaserEntity laserEntity: player.getLasershotList()){
            if (laserEntity.getVisible()){
                laserEntity.drawComponent(g, this);
            }
        }

        AlienEntity[][] alienEntities = alienControl.getAlienEntity();
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                if (alienEntities[y][x].getVisible()) {
                    alienEntities[y][x].drawComponent(g, this);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(background.getBackgroundWidth(this), background.getBackgroundHeight(this));
    }


}
