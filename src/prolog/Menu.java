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
import java.util.Hashtable;
import java.util.Map;
import javax.swing.*;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

public class Menu {

    public Menu() {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

//             JOptionPane.showMessageDialog(null, "Qual o nome da Pessoa");
                JPanel panelUser = new JPanel();
                panelUser.add(new JLabel("Selecione o tipo de Usuário"));
                DefaultComboBoxModel modelUser = new DefaultComboBoxModel();
                modelUser.addElement("Agência");
                modelUser.addElement("Cliente");
                modelUser.addElement("Hotel");
                JComboBox comboBoxUser = new JComboBox(modelUser);
                panelUser.add(comboBoxUser);

                int resultUser = JOptionPane.showConfirmDialog(null, panelUser, "Sistema de Reservas", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch (resultUser) {
                    case JOptionPane.OK_OPTION:
                        if (comboBoxUser.getSelectedItem() == "Hotel") {

                            final JFrame janela = new JFrame("Sistema de Reservas :: Menu");
                            final JButton btConfirma = new JButton("Confirma");
                            final JButton btCancelar = new JButton("Cancelar");
                            
                            final JComboBox ckCampos = new JComboBox<String>();

                            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            janela.setSize(400,200);
                            
                            JPanel painel = new JPanel();
                            
                            /*CONECTANDO AO PROLOG
                             BUSCANDO HOTEIS
                             */
                            String c = "consult('hoteis.pl')";
                            if (!Query.hasSolution(c)) {
                                System.out.println(c + "Falhou");
                            }

                            Variable X = new Variable("X");
                            Query qHotel = new Query("hotel", new Term[]{X});

                            Map<String, Term>[] solutions = qHotel.allSolutions();

                            ckCampos.addItem(" - SELECIONE - ");
                            for (int i = 0; i < solutions.length; i++) {
                                ckCampos.addItem(solutions[i].get("X").toString());
                                
                            }
                            ImageIcon logo = new ImageIcon("hotel.gif");
                            JLabel logoMarca = new JLabel(logo);
                            logoMarca.setHorizontalAlignment(JLabel.CENTER);
                            painel.add(logoMarca);
                            painel.add(ckCampos);
                            painel.add(btConfirma);
                            painel.add(btCancelar);
                            janela.getContentPane().add(painel);
                            janela.setVisible(true);
                            
                        } else {
                            System.out.println("Outro");
                        }
                        break;
                }

            }
        });
    }
}
