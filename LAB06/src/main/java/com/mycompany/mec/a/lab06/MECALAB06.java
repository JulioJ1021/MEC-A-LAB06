/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mec.a.lab06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julio
 */
public class MECALAB06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JFrame menu = new JFrame();
        JPanel panel = new JPanel();
        menu.setTitle("Casino Virtual");
        menu.setSize(300,170);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton dados = new JButton("Dados");
        JButton traga_m = new JButton("Traga Monedas");
        dados.setBounds(20, 150, 100, 30);
        traga_m.setBounds(170, 150, 100, 30);
        dados.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Dados dados_frame = new Dados();
                dados_frame.setVisible(true);
            }
            
        });
        traga_m.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                TragaMonedas tm_frame = new TragaMonedas();
                tm_frame.setVisible(true);
            }
            
        });
        panel.add(dados);
        panel.add(traga_m);
        menu.add(panel);
        menu.setVisible(true);
        
        
    }
}
 
