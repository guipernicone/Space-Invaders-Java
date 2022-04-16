package com.soul.control;

import com.soul.commons.Properties;
import com.soul.entity.LaserEntity;
import com.soul.entity.Player;
import com.soul.panel.GamePanel;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GameControl {
    JPanel gamePanel;
    Player player;
    AlienControl alienControl;

    public GameControl(){
        player = new Player();
        alienControl = new AlienControl();
        gamePanel = new GamePanel(player, alienControl);

        gamePanel.addKeyListener(new KeyAdapter());
        gamePanel.setFocusable(true);
        Timer gameTimer = new Timer(Properties.GAME_DELEY, new GameCycle());
        gameTimer.start();
    }

    public JPanel getGamePanel() {
        return gamePanel;
    }

    private void update() {
        for (LaserEntity laserEntity: player.getLasershotList()){
            laserEntity.checkSpaceLaser(alienControl.getAlienEntity());
        }
        player.cleanLasers();
        alienControl.alienRun();
        gamePanel.repaint();
        this.gameStatus();
    }

    private void gameStatus() {
        if(!alienControl.hasAlienAlive()) {
            System.out.println("WIN");
        }
        if(alienControl.hasAlienWin()) {
            System.out.println("GAME OVER");
        }
    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            update();
        }
    }

    private class KeyAdapter extends java.awt.event.KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }
}
