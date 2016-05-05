/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

/**
 *
 * @author Michel
 */
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu primeiro frame em Java");
		
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//janela.add(meuPainel);
		janela.setSize(600,400);
		janela.setVisible(true);
	}

}
