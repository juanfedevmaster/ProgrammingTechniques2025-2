/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.loginjavaswing;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jufeq
 */
public class LoginJavaSwing {

    private static Main main;

    public static void main(String[] args) {
        main = new Main();
        main.setVisible(true);

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (pantalla.width - main.getWidth()) / 2;
        int y = (pantalla.height - main.getHeight()) / 2;

        main.setLocation(x, y);
    }
}
