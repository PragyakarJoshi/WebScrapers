/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragyakar.moviescrapper.GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pragyakar
 */
public class ScrapperUI extends javax.swing.JFrame {

    /**
     * Creates new form ScrapperUI
     */
    public ScrapperUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblTitle = new javax.swing.JLabel();
        lblNowShowing = new javax.swing.JLabel();
        lblCommingSoon = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();
        btnRefresh2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNowShowing = new javax.swing.JTextArea();
        lblName = new javax.swing.JLabel();
        lblReleaseDate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtReleaseDate = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QFX Cinemas Nepal Scrapper");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblTitle.setText("QFX Cinemas Nepal Scraper");

        lblNowShowing.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblNowShowing.setText("Now Showing");

        lblCommingSoon.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblCommingSoon.setText("Comming Soon");

        btnRefresh1.setText("Refresh ");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        btnRefresh2.setText("Refresh");
        btnRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh2ActionPerformed(evt);
            }
        });

        txtNowShowing.setEditable(false);
        txtNowShowing.setColumns(20);
        txtNowShowing.setRows(5);
        jScrollPane1.setViewportView(txtNowShowing);

        lblName.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblName.setText("Name");

        lblReleaseDate.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblReleaseDate.setText("Release Date");

        txtName.setEditable(false);
        txtName.setColumns(10);
        txtName.setRows(5);
        txtName.setAutoscrolls(false);
        jScrollPane4.setViewportView(txtName);

        txtReleaseDate.setEditable(false);
        txtReleaseDate.setColumns(10);
        txtReleaseDate.setRows(5);
        jScrollPane5.setViewportView(txtReleaseDate);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReleaseDate)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNowShowing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommingSoon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addComponent(btnRefresh2)))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNowShowing)
                    .addComponent(btnRefresh1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCommingSoon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblReleaseDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        try {
            if(txtNowShowing.getText()!=null){
                txtNowShowing.setText("");
            }
            URL url = new URL("http://qfx.com.np/Home/Index");
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String regex1 = "<h4 class=\"movie-title\">(.*?)</h4>\\n(.*?)<p class=\"movie-type\">(.*?)</p>\\n(.*?)</div>";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(content);

            int a = 1;
            while (matcher1.find()) {
                txtNowShowing.append(a + ". " + matcher1.group(1) + " (" + matcher1.group(3) + ") \n");
                a++;
            }
        } catch (IOException ioe) {
            System.out.println("Error while refreshing Now Showing");
        }
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh2ActionPerformed
        try {
            if(txtName.getText()!=null && txtReleaseDate.getText()!= null){
                txtName.setText("");
                txtReleaseDate.setText("");
            }
            URL url = new URL("http://qfx.com.np/Home/Index");
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String regex2 = "<h4 class=\"movie-title\">(.*?)</h4>\\n(.*?)<p class=\"movie-type\">(.*?)</p>\\n(.*?)<p class=\"movie-date\">\\n(.*?)</p>";
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(content);
            
            int b = 1;
            while (matcher2.find()) {
                txtName.append(b + ". " + matcher2.group(1) + " (" + matcher2.group(3) + ") \n");
                txtReleaseDate.append(matcher2.group(5) + "\n");
                b++;
            }
            
        } catch (IOException ioe) {
            System.out.println("Error while refreshing comming soon.");
        }
    }//GEN-LAST:event_btnRefresh2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScrapperUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScrapperUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScrapperUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScrapperUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScrapperUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnRefresh2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCommingSoon;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNowShowing;
    private javax.swing.JLabel lblReleaseDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtName;
    private javax.swing.JTextArea txtNowShowing;
    private javax.swing.JTextArea txtReleaseDate;
    // End of variables declaration//GEN-END:variables
}
