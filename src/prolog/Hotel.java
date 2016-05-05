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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jpl7.Query;

public class Hotel{

    
    public Hotel() {
        
        
        //System.out.println(t2 + " é " + (q2.hasMoreSolutions() ? "É irmão" : "Não é irmão" ));
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

//             JOptionPane.showMessageDialog(null, "Qual o nome da Pessoa");
                JPanel panel = new JPanel();
                panel.add(new JLabel("Escolha uma opção"));
                DefaultComboBoxModel model = new  DefaultComboBoxModel();
                model.addElement("Alterar dados");
                model.addElement("Ver reservas");
                model.addElement("Gerir quartos");
                model.addElement("Gerir lista de espera");
                model.addElement("Gerir lista de espera");
                model.addElement("Fazer check-in");
                model.addElement("Fazer check-out");
                model.addElement("Gerir contas");
                JComboBox comboBox = new JComboBox(model);
                panel.add(comboBox);

                int result = JOptionPane.showConfirmDialog(null, panel, "Menu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch (result) {
                    case JOptionPane.OK_OPTION:
                        System.out.println("You selected " + comboBox.getSelectedItem());
                        break;
                }

            }
        });
    }
}
