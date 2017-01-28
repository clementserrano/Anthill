/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anthill.view;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author clementserrano
 */
public class Form extends javax.swing.JPanel {

    private GUI gui;
    
    /**
     * Creates new form Form
     * @param gui
     */
    public Form(GUI gui) {
        initComponents();
        this.gui = gui;
        
        textNbFourmis.setText("1");
        textTimeSleep.setText("500");
        
        File folder = new File("src/Anthill/ressources/cartes");
        File[] listOfFiles = folder.listFiles();
        
        if(listOfFiles == null){
            System.out.println("Aucune carte présente, vérifier src/Anthill/ressources/cartes");
            System.exit(-3);
        }
        
        for (File file : listOfFiles) {
            if (file.isFile()) {
                comboBoxCartes.addItem(file.getName());
            }
        }
        
        buttonLancer.addActionListener((ActionEvent ae) -> {
            lancerSimulation();
        });
    }
    
    private void lancerSimulation(){
        if(textNbFourmis.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Aucun nombre de fourmis entré");
            return;
        }
        
        if(textTimeSleep.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Aucun temps entre chaque tour entré");
            return;
        }
        
        String carte = (String)comboBoxCartes.getSelectedItem();
        int nbFourmis = Integer.parseInt(textNbFourmis.getText());
        int timeSleep = Integer.parseInt(textTimeSleep.getText());
        int qteNourriture = Integer.parseInt(textQteNourriture.getText());
        gui.setCarte(carte);
        gui.setNbFourmis(nbFourmis);
        gui.setTimeSleep(timeSleep);
        gui.setQteNourriture(qteNourriture);
        gui.setReady(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNbFourmis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textNbFourmis = new javax.swing.JTextPane();
        labelTimeSleep = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textTimeSleep = new javax.swing.JTextPane();
        comboBoxCartes = new javax.swing.JComboBox<>();
        buttonLancer = new javax.swing.JButton();
        labelQteNourriture = new javax.swing.JLabel();
        labelCarte = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textQteNourriture = new javax.swing.JTextPane();

        labelNbFourmis.setText("Nombre de fourmis : ");

        jScrollPane1.setViewportView(textNbFourmis);

        labelTimeSleep.setText("Temps entre chaque tour (ms) : ");

        jScrollPane2.setViewportView(textTimeSleep);

        buttonLancer.setText("Lancer la simulation");

        labelQteNourriture.setText("Quantité de nourriture par source");

        labelCarte.setText("Carte : ");

        jScrollPane3.setViewportView(textQteNourriture);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCarte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(comboBoxCartes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTimeSleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNbFourmis)
                            .addComponent(labelQteNourriture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxCartes, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(labelCarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNbFourmis, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTimeSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQteNourriture, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(buttonLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLancer;
    private javax.swing.JComboBox<String> comboBoxCartes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCarte;
    private javax.swing.JLabel labelNbFourmis;
    private javax.swing.JLabel labelQteNourriture;
    private javax.swing.JLabel labelTimeSleep;
    private javax.swing.JTextPane textNbFourmis;
    private javax.swing.JTextPane textQteNourriture;
    private javax.swing.JTextPane textTimeSleep;
    // End of variables declaration//GEN-END:variables
}
