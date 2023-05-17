
package com.mycompany.calculator;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;


public class Calculator extends javax.swing.JFrame {
    Double num1, resultado;
    String operacion;
    Boolean reiniciar = false;
    public Calculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Operacion = new javax.swing.JLabel();
        Btn_D = new javax.swing.JButton();
        Btn_M = new javax.swing.JButton();
        Btn_E = new javax.swing.JButton();
        Btn_Porcentaje = new javax.swing.JButton();
        Btn_R = new javax.swing.JButton();
        Btn_S = new javax.swing.JButton();
        Btn_Resultado = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn_C = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnPunto = new javax.swing.JButton();
        JL_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(380, 500));

        JL_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Btn_D.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_D.setForeground(new java.awt.Color(153, 255, 255));
        Btn_D.setText("/");
        Btn_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DActionPerformed(evt);
            }
        });

        Btn_M.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_M.setForeground(new java.awt.Color(153, 255, 255));
        Btn_M.setText("*");
        Btn_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MActionPerformed(evt);
            }
        });

        Btn_E.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_E.setForeground(new java.awt.Color(153, 255, 255));
        Btn_E.setText("←");
        Btn_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EActionPerformed(evt);
            }
        });

        Btn_Porcentaje.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_Porcentaje.setForeground(new java.awt.Color(153, 255, 255));
        Btn_Porcentaje.setText("%");
        Btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PorcentajeActionPerformed(evt);
            }
        });

        Btn_R.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_R.setForeground(new java.awt.Color(153, 255, 255));
        Btn_R.setText("-");
        Btn_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RActionPerformed(evt);
            }
        });

        Btn_S.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_S.setForeground(new java.awt.Color(153, 255, 255));
        Btn_S.setText("+");
        Btn_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SActionPerformed(evt);
            }
        });

        Btn_Resultado.setBackground(new java.awt.Color(153, 255, 255));
        Btn_Resultado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_Resultado.setForeground(new java.awt.Color(15, 17, 16));
        Btn_Resultado.setText("=");
        Btn_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResultadoActionPerformed(evt);
            }
        });

        Btn7.setBackground(new java.awt.Color(15, 17, 26));
        Btn7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn7.setForeground(new java.awt.Color(255, 255, 255));
        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn_C.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn_C.setForeground(new java.awt.Color(153, 255, 255));
        Btn_C.setText("C");
        Btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CActionPerformed(evt);
            }
        });

        Btn9.setBackground(new java.awt.Color(15, 17, 26));
        Btn9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn9.setForeground(new java.awt.Color(255, 255, 255));
        Btn9.setText("9");
        Btn9.setToolTipText("");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn6.setBackground(new java.awt.Color(15, 17, 26));
        Btn6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn6.setForeground(new java.awt.Color(255, 255, 255));
        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn8.setBackground(new java.awt.Color(15, 17, 26));
        Btn8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn8.setForeground(new java.awt.Color(255, 255, 255));
        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(15, 17, 26));
        Btn3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 255, 255));
        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn1.setBackground(new java.awt.Color(15, 17, 26));
        Btn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Btn1.setText("1\n");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(15, 17, 26));
        Btn4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn4.setForeground(new java.awt.Color(255, 255, 255));
        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setBackground(new java.awt.Color(15, 17, 26));
        Btn5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn5.setForeground(new java.awt.Color(255, 255, 255));
        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(15, 17, 26));
        Btn2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn0.setBackground(new java.awt.Color(15, 17, 26));
        Btn0.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Btn0.setForeground(new java.awt.Color(255, 255, 255));
        Btn0.setText("0\n");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnPunto.setBackground(new java.awt.Color(15, 17, 26));
        BtnPunto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BtnPunto.setForeground(new java.awt.Color(255, 255, 255));
        BtnPunto.setText(".\n");
        BtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntoActionPerformed(evt);
            }
        });

        JL_Resultado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        JL_Resultado.setForeground(new java.awt.Color(255, 255, 255));
        JL_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_Operacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_Resultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_C, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(Btn_E, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_S, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_R, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_Porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_D, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_M, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JL_Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_E, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn_Porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn_D, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn_C, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_M, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_R, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_S, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BtnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CActionPerformed
        JL_Resultado.setText("");
        JL_Operacion.setText("");
    }//GEN-LAST:event_Btn_CActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        addNumber("5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        addNumber("0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_BtnPuntoActionPerformed

    private void Btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PorcentajeActionPerformed
        try{
            Double num = Double.valueOf(JL_Resultado.getText());
        if (JL_Resultado.getText().equals("")) {
            return;
        }
        resultado = num / 100;
        Resultado(); 
        }catch(Exception e){
        }
    }//GEN-LAST:event_Btn_PorcentajeActionPerformed

    private void Btn_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DActionPerformed
        Operaciones("division", "/");
    }//GEN-LAST:event_Btn_DActionPerformed

    private void Btn_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MActionPerformed
        Operaciones("multiplicacion", "*");
    }//GEN-LAST:event_Btn_MActionPerformed

    private void Btn_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RActionPerformed
        Operaciones("resta", "-");
    }//GEN-LAST:event_Btn_RActionPerformed

    private void Btn_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SActionPerformed
        Operaciones("suma", "+");
    }//GEN-LAST:event_Btn_SActionPerformed

    private void Btn_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResultadoActionPerformed
            try{
                Double num2 = Double.valueOf(JL_Resultado.getText());
            switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                Resultado();
                break;
            case "resta":
                resultado = num1 - num2;
                Resultado();
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                Resultado();
                break;
            case "division":
                resultado = num1 / num2;
                Resultado();
                break;
            default:
                JL_Resultado.setText("Sintax ERROR");
                break;
            }
        }catch(Exception e){}
    }//GEN-LAST:event_Btn_ResultadoActionPerformed

    private void Btn_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EActionPerformed
        try{
            String borrar = JL_Resultado.getText().substring(0, JL_Resultado.getText().length() - 1);
            JL_Resultado.setText(borrar);
        }catch(Exception e){}
    }//GEN-LAST:event_Btn_EActionPerformed
    
    public void Operaciones(String TipoOperacion, String signo) {
        try {
            char lastChar = JL_Resultado.getText().charAt(JL_Resultado.getText().length() - 1);
            String lastValue = new String(new char[]{lastChar});
            if (JL_Resultado.getText().equals("") || lastValue.equals(signo)) {
                return;
            }
            num1 = Double.valueOf(JL_Resultado.getText());
            operacion = TipoOperacion;
            JL_Operacion.setText(JL_Resultado.getText() + signo);
            JL_Resultado.setText("");
        } catch (Exception e) {
        }
    }
    
    public void Resultado(){
                String total = String.valueOf(resultado);
                JL_Resultado.setText("");
                JL_Resultado.setText(total);
                reiniciar = true;
    }
    
    public void addNumber(String num){
        if (reiniciar == true) {
            JL_Resultado.setText("");
            reiniciar = false;
        }
        JL_Resultado.setText(JL_Resultado.getText() + num);
        
    }
   
    public static void main(String args[]) {
        FlatMaterialDeepOceanIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnPunto;
    private javax.swing.JButton Btn_C;
    private javax.swing.JButton Btn_D;
    private javax.swing.JButton Btn_E;
    private javax.swing.JButton Btn_M;
    private javax.swing.JButton Btn_Porcentaje;
    private javax.swing.JButton Btn_R;
    private javax.swing.JButton Btn_Resultado;
    private javax.swing.JButton Btn_S;
    private javax.swing.JLabel JL_Operacion;
    private javax.swing.JLabel JL_Resultado;
    // End of variables declaration//GEN-END:variables
}
