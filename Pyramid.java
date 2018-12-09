/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author Ramez
 */
public class Pyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        PyramidGame game = new PyramidGame();
        game.setVisible(true);
       JOptionPane.showMessageDialog(null, "The goal of Pyramid is clear in order to win you have to tap two card that add up to 13 \n Jacks are worth 11, queen are worth 12. king are worth 13");

        game.setDefaultCloseOperation(game.EXIT_ON_CLOSE);
    }
    
}
