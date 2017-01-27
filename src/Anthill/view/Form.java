/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anthill.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
        
        buttonLancer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                lancerSimulation();
            }
            
        });
    }
    
    private void lancerSimulation(){
        String carte = (String)comboBoxCartes.getSelectedItem();
        int nbFourmis = Integer.parseInt(textNbFourmis.getText());
        int timeSleep = Integer.parseInt(textTimeSleep.getText());
        gui.setCarte(carte);
        gui.setNbFourmis(nbFourmis);
        gui.setTimeSleep(timeSleep);
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

        labelNbFourmis.setText("Nombre de fourmis : ");

        jScrollPane1.setViewportView(textNbFourmis);

        labelTimeSleep.setText("Temps entre chaque tour : ");

        jScrollPane2.setViewportView(textTimeSleep);

        buttonLancer.setText("Lancer la simulation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxCartes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTimeSleep)
                                    .addComponent(labelNbFourmis))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(comboBoxCartes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNbFourmis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTimeSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(buttonLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLancer;
    private javax.swing.JComboBox<String> comboBoxCartes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNbFourmis;
    private javax.swing.JLabel labelTimeSleep;
    private javax.swing.JTextPane textNbFourmis;
    private javax.swing.JTextPane textTimeSleep;
    // End of variables declaration//GEN-END:variables
}
