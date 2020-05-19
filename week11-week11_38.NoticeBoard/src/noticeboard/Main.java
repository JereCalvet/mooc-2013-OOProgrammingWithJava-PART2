/*
Tema: Trabajando con action events listeners y usando objetos dentro de los mismos
*/
package noticeboard;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new NoticeBoard());
    }
}
