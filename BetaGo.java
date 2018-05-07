/*
AI BetaGo
 */
package TicTacToeAI;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike Kong
 */
public class BetaGo extends javax.swing.JFrame {

    static JButton[][] board = new JButton[3][3];
    /**
     *
     */
    static int i, tie = 1;
    static boolean win = false;

    public BetaGo() {
        initComponents();
        board[0][0] = jButton1;
        board[0][1] = jButton2;
        board[0][2] = jButton3;
        board[1][0] = jButton4;
        board[1][1] = jButton5;
        board[1][2] = jButton6;
        board[2][0] = jButton7;
        board[2][1] = jButton8;
        board[2][2] = jButton9;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("AI BetaGo");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("-");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("-");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("New Game");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(title)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        i = 0;
        for (int a = 0; a < 3; a++) {
            for (int c = 0; c < 3; c++) {
                board[a][c].setText("-");
            }
        }
        win = false;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        play(board, 0, 0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        play(board, 0, 1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        play(board, 0, 2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        play(board, 1, 0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        play(board, 1, 1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        play(board, 1, 2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        play(board, 2, 0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        play(board, 2, 1);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        play(board, 2, 2);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(BetaGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BetaGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BetaGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BetaGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BetaGo().setVisible(true);
            }
        });
        //  System.out.print(i);
    }

    /*
    show the result if player or AI win the game
     */
    public static void check(String s) {

        for (int i = 0; i < 3; i++) {
            int count = 0;
            //check the vertical arrays
            for (int c = 0; c < 3; c++) {
                if (board[i][c].getText().equals(s)) {
                    count += 1;
                }
                if (count == 3) {
                    win = true;
                }
            }
        }
        //check the horizontal arrays
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int c = 0; c < 3; c++) {
                if (board[c][i].getText().equals(s)) {
                    count += 1;
                }
                if (count == 3) {
                    win = true;
                }
            }
        }
        //check diagnose
        if ((board[1][1].getText().equals(s)) && (board[0][0].getText().equals(s)) && (board[2][2].getText().equals(s))) {
            win = true;
        }
        //check another diagnose
        if ((board[1][1].getText().equals(s)) && (board[2][0].getText().equals(s)) && (board[0][2].getText().equals(s))) {
            win = true;
        }
        //display the result
        if (win) {
            if (s.equals("O")) {//human player play the "O", AI play the "X"
                JOptionPane.showMessageDialog(null, "You won the Game!");
            } else {
                JOptionPane.showMessageDialog(null, "AI won the Game!");
            }
        }
        //count the number of blanks
        tie = 0;
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                if (board[c][i].getText().equals("-")) {
                    tie++;
                }
            }
        }
        //if no space left while no one win the game, result is "Tie"
        if (tie == 0 && !win) {
            JOptionPane.showMessageDialog(null, "Tie!");
            win = true;
        }
    }

    /*
*   Change designated button's icon 
     */
    public static void play(JButton[][] x, int a, int b) {
        if (x[a][b].getText().equals("-")) {//only if the button has not been played 
            x[a][b].setText("O");
            check("O");
            if (tie != 0 && !win) {//check if the game is not over yet
                aiPlayer();
            }
        }
    }

    public static void aiPlayer() {
        int x = 0, y = 0;//coordinate
        boolean check = false;
        //offensive
        //Vertical
        if (!check) {
            for (int i = 0; i < 3; i++) {
                int count_ = 0, countX = 0;
                for (int c = 0; c < 3; c++) {
                    if (board[i][c].getText().equals("-")) {
                        x = i;
                        y = c;
                        count_++;
                    } else if (board[i][c].getText().equals("X")) {
                        countX++;
                    }
                }
                if (count_ == 1 && countX == 2) {
                    board[x][y].setText("X");
                    check = true;
                    check("X");
                }
            }
        }
        //Horizontal
        if (!check) {
            for (int i = 0; i < 3; i++) {
                int count_ = 0, countX = 0;
                for (int c = 0; c < 3; c++) {
                    if (board[c][i].getText().equals("-")) {
                        x = c;
                        y = i;
                        count_++;
                    } else if (board[c][i].getText().equals("X")) {
                        countX++;
                    }
                }
                if (count_ == 1 && countX == 2) {
                    board[x][y].setText("X");
                    check = true;
                    check("X");
                }
            }
        }
        //Diagnose1
        if (!check) {
            int count_ = 0, countX = 0;
            for (int c = 0; c < 3; c++) {
                if (board[c][c].getText().equals("-")) {
                    x = c;
                    y = c;
                    count_++;
                } else if (board[c][c].getText().equals("X")) {
                    countX++;
                }
            }
            if (count_ == 1 && countX == 2) {
                board[x][y].setText("X");
                check = true;
                check("X");
            }
        }
        //Diagnose2
        if (!check) {
            int count_ = 0, countX = 0;
            for (int c = 0; c < 3; c++) {
                if (board[2 - c][c].getText().equals("-")) {
                    x = (2 - c);
                    y = c;
                    count_++;
                } else if (board[2 - c][c].getText().equals("X")) {
                    countX++;
                }
            }
            if (count_ == 1 && countX == 2) {
                board[x][y].setText("X");
                check("X");
                check = true;
            }
        }
        //Defence
        //Horizontal
        if (!check) {
            for (int i = 0; i < 3; i++) {
                int count_ = 0, countO = 0;
                for (int c = 0; c < 3; c++) {
                    if (board[i][c].getText().equals("-")) {
                        x = i;
                        y = c;
                        count_++;
                    } else if (board[i][c].getText().equals("O")) {
                        countO++;
                    }

                }
                System.out.println(countO + " " + count_);
                if (count_ == 1 && countO == 2) {
                    board[x][y].setText("X");
                    check = true;
                    check("X");
                }
            }
        }
        //Vertical 
        if (!check) {
            for (int i = 0; i < 3; i++) {
                int count_ = 0, countO = 0;
                for (int c = 0; c < 3; c++) {
                    if (board[c][i].getText().equals("-")) {
                        x = c;
                        y = i;
                        count_++;
                    } else if (board[c][i].getText().equals("O")) {
                        countO++;
                    }
                }
                //  System.out.println(countO+" "+count_);
                if (count_ == 1 && countO == 2) {
                    board[x][y].setText("X");
                    //System.out.println("Df Hor");
                    check = true;
                    check("X");
                }
            }
        }
        //Diagnose1
        if (!check) {
            int count_ = 0, countO = 0;
            for (int c = 0; c < 3; c++) {
                if (board[c][c].getText().equals("-")) {
                    x = c;
                    y = c;
                    count_++;
                } else if (board[c][c].getText().equals("O")) {
                    countO++;
                }
            }
            if (count_ == 1 && countO == 2) {
                board[x][y].setText("X");
                check = true;
                check("X");
            }
        }
        //Diagnose2
        if (!check) {
            int count_ = 0, countO = 0;
            for (int c = 0; c < 3; c++) {
                if (board[2 - c][c].getText().equals("-")) {
                    x = (2 - c);
                    y = c;
                    count_++;
                } else if (board[2 - c][c].getText().equals("O")) {
                    countO++;
                }
            }
            if (count_ == 1 && countO == 2) {
                board[x][y].setText("X");
                check("X");
                check = true;
            }
        }
        //Random Move
        if (!check) {
            boolean blank = true;
            if (tie == 0) {
                blank = false;
            }
            while (blank) {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
                if (board[x][y].getText().equals("-")) {
                    blank = false;
                }
            }
            board[x][y].setText("X");
            check("X");
            System.out.println("Random");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
