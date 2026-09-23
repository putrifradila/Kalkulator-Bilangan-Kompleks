
/**
 * Anggota Kelompok :
 * 1. Putri Fradila R.  (5002221046)
 * 2. Marsyanda Auditya (5002221055)     
 */

import java.awt.Color;
import javax.swing.JOptionPane;

public class KalkulatorBilanganKompleks extends javax.swing.JFrame {

    public KalkulatorBilanganKompleks() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pInputData = new javax.swing.JPanel();
        rbZ1 = new javax.swing.JRadioButton();
        rbZ2 = new javax.swing.JRadioButton();
        rbHasil = new javax.swing.JRadioButton();
        tfA1 = new javax.swing.JTextField();
        tfA2 = new javax.swing.JTextField();
        lbT1 = new javax.swing.JLabel();
        lbT2 = new javax.swing.JLabel();
        tfB1 = new javax.swing.JTextField();
        tfB2 = new javax.swing.JTextField();
        lbI1 = new javax.swing.JLabel();
        lbI2 = new javax.swing.JLabel();
        bA1B1 = new javax.swing.JButton();
        bA2B2 = new javax.swing.JButton();
        tfHasil = new javax.swing.JTextField();
        pOperasi = new javax.swing.JPanel();
        bHapus = new javax.swing.JButton();
        bModulus = new javax.swing.JButton();
        bArgumen = new javax.swing.JButton();
        bKonjugat = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        bKurang = new javax.swing.JButton();
        bKali = new javax.swing.JButton();
        bKuadrat = new javax.swing.JButton();
        bKubik = new javax.swing.JButton();
        bPolar = new javax.swing.JButton();
        bSalin = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();
        pDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        cbBGDisplay = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":: KALKULATOR BILANGAN KOMPLEKS ::");

        pInputData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Input Data ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        buttonGroup1.add(rbZ1);
        rbZ1.setText("   Bilangan Kompleks 1 (Z1)");

        buttonGroup1.add(rbZ2);
        rbZ2.setText("   Bilangan Kompleks 2 (Z2)");

        buttonGroup1.add(rbHasil);
        rbHasil.setText("   Hasil Operasi");

        tfA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbT1.setText("+");
        lbT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbT2.setText("+");
        lbT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbI1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbI1.setText("i");
        lbI1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbI2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbI2.setText("i");
        lbI2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bA1B1.setText(">>");
        bA1B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bA1B1ActionPerformed(evt);
            }
        });

        bA2B2.setText(">>");
        bA2B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bA2B2ActionPerformed(evt);
            }
        });

        tfHasil.setEditable(false);
        tfHasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHasil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pInputDataLayout = new javax.swing.GroupLayout(pInputData);
        pInputData.setLayout(pInputDataLayout);
        pInputDataLayout.setHorizontalGroup(
            pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pInputDataLayout.createSequentialGroup()
                        .addComponent(rbHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHasil))
                    .addGroup(pInputDataLayout.createSequentialGroup()
                        .addComponent(rbZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfA2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfB2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbI2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bA2B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputDataLayout.createSequentialGroup()
                        .addComponent(rbZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfA1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfB1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbI1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bA1B1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInputDataLayout.setVerticalGroup(
            pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputDataLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbI1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bA1B1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbI2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bA2B2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pOperasi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Operasi ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bModulus.setText("Modulus");
        bModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModulusActionPerformed(evt);
            }
        });

        bArgumen.setText("Argumen");
        bArgumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArgumenActionPerformed(evt);
            }
        });

        bKonjugat.setText("Konjugat");
        bKonjugat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKonjugatActionPerformed(evt);
            }
        });

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bKurang.setText("Kurang");
        bKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKurangActionPerformed(evt);
            }
        });

        bKali.setText("Kali");
        bKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKaliActionPerformed(evt);
            }
        });

        bKuadrat.setText("x^2");
        bKuadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKuadratActionPerformed(evt);
            }
        });

        bKubik.setText("x^3");
        bKubik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKubikActionPerformed(evt);
            }
        });

        bPolar.setText("Polar");
        bPolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPolarActionPerformed(evt);
            }
        });

        bSalin.setText("Salin Hasil");
        bSalin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalinActionPerformed(evt);
            }
        });

        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOperasiLayout = new javax.swing.GroupLayout(pOperasi);
        pOperasi.setLayout(pOperasiLayout);
        pOperasiLayout.setHorizontalGroup(
            pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOperasiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSalin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pOperasiLayout.createSequentialGroup()
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pOperasiLayout.createSequentialGroup()
                                .addComponent(bKuadrat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bKubik, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bPolar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pOperasiLayout.createSequentialGroup()
                                    .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bKali, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pOperasiLayout.createSequentialGroup()
                                    .addComponent(bModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bArgumen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bKonjugat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(bTutup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pOperasiLayout.setVerticalGroup(
            pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOperasiLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOperasiLayout.createSequentialGroup()
                        .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bArgumen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKonjugat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKali, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pOperasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bKuadrat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKubik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPolar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSalin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Display ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        taDisplay.setEditable(false);
        taDisplay.setColumns(20);
        taDisplay.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        taDisplay.setRows(5);
        taDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(taDisplay);

        javax.swing.GroupLayout pDisplayLayout = new javax.swing.GroupLayout(pDisplay);
        pDisplay.setLayout(pDisplayLayout);
        pDisplayLayout.setHorizontalGroup(
            pDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDisplayLayout.setVerticalGroup(
            pDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbBGDisplay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih background display --", "Abu", "Biru", "Putih" }));
        cbBGDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBGDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOperasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBGDisplay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBGDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bA1B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bA1B1ActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        
        String pesan1 = " Bilangan kompleks 1 :\n";
        String pesan2 = "       " + a1 + " + " + b1 + "i\n";
        taDisplay.append(pesan1 + pesan2);
    }//GEN-LAST:event_bA1B1ActionPerformed

    private void bA2B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bA2B2ActionPerformed
        String a = tfA2.getText();
        String b = tfB2.getText();
        
        Integer a2 = Integer.parseInt(a);
        Integer b2 = Integer.parseInt(b);
        
        String pesan1 = " Bilangan kompleks 2 :\n";
        String pesan2 = "       " + a2 + " + " + b2 + "i\n";
        taDisplay.append(pesan1 + pesan2);
    }//GEN-LAST:event_bA2B2ActionPerformed

    private void bModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModulusActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            int x = ((a1*a1)+(b1*b1));
            double z = Math.sqrt(x);
            
            String pesan = z + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            int x = ((a2*a2)+(b2*b2));
            double z = Math.sqrt(x);
            
            String pesan = z + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bModulusActionPerformed

    private void bArgumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArgumenActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            String pesan = "tan^-1 (" + (b1/a1) + ")\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            String pesan = "tan^-1 (" + (b2/a2) + ")\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bArgumenActionPerformed

    private void bKonjugatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKonjugatActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            String pesan = a1 + " + " + (b1*-1) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            String pesan = a2 + " + " + (b2*-1) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bKonjugatActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        String pesan = (a1+a2) + " + " + (b1+b2) + "i\n";
        tfHasil.setText(pesan);
    }//GEN-LAST:event_bTambahActionPerformed

    private void bKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKurangActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        String pesan = (a1-a2) + " + " + (b1-b2) + "i\n";
        tfHasil.setText(pesan);
    }//GEN-LAST:event_bKurangActionPerformed

    private void bKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKaliActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);

        String pesan = ((a1*a2)+((b1*b2)*-1)) + " + " + ((a1*b2)+(a2*b1)) + "i\n";
        tfHasil.setText(pesan);
    }//GEN-LAST:event_bKaliActionPerformed

    private void bKuadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKuadratActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            String pesan = ((a1*a1)+((b1*b1)*-1)) + " + " + ((a1*b1)+(a1*b1)) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            String pesan = ((a2*a2)+((b2*b2)*-1)) + " + " + ((a2*b2)+(a2*b2)) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bKuadratActionPerformed

    private void bKubikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKubikActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            int a3 = ((a1*a1)+((b1*b1)*-1));
            int b3 = ((a1*b1)+(a1*b1));
                    
            String pesan = ((a3*a1)+((b3*b1)*-1)) + " + " + ((a3*b1)+(a1*b3)) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            int a3 = ((a2*a2)+((b2*b2)*-1));
            int b3 = ((a2*b2)+(a2*b2));
            
            String pesan = ((a3*a2)+((b3*b2)*-1)) + " + " + ((a3*b2)+(a2*b3)) + "i\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bKubikActionPerformed

    private void bPolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPolarActionPerformed
        String a = tfA1.getText();
        String b = tfB1.getText();
        String c = tfA2.getText();
        String d = tfB2.getText();
        
        Integer a1 = Integer.parseInt(a);
        Integer b1 = Integer.parseInt(b);
        Integer a2 = Integer.parseInt(c);
        Integer b2 = Integer.parseInt(d);
        
        if (rbZ1.isSelected()) {
            int x = ((a1*a1)+(b1*b1));
            double z = Math.sqrt(x);
            
            String pesan = z + "cis(tan^-1(" + (b1/a1) + "))\n";
            tfHasil.setText(pesan);
        } 
        
        else if (rbZ2.isSelected()) {
            int x = ((a2*a2)+(b2*b2));
            double z = Math.sqrt(x);
            
            String pesan = z + "cis(tan^-1(" + (b2/a2) + "))\n";
            tfHasil.setText(pesan);
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Pilih bilangan kompleks.");
        }
    }//GEN-LAST:event_bPolarActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        taDisplay.setText("");
        tfHasil.setText("");
        tfA1.setText("");
        tfB1.setText(""); 
        tfA2.setText("");
        tfB2.setText("");
    }//GEN-LAST:event_bHapusActionPerformed

    private void bSalinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalinActionPerformed
        String pesan1 = " Hasil operasi :\n";
        String pesan2 = "       " + tfHasil.getText() + "\n";
        taDisplay.append(pesan1 + pesan2);
    }//GEN-LAST:event_bSalinActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        this.dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void cbBGDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBGDisplayActionPerformed
        String warna = cbBGDisplay.getSelectedItem().toString(); 
        if (warna.equals("Abu"))
            taDisplay.setBackground(Color.lightGray);
        if (warna.equals("Biru"))
            taDisplay.setBackground(Color.cyan);
        if (warna.equals("Putih"))
            taDisplay.setBackground(Color.white);
    }//GEN-LAST:event_cbBGDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorBilanganKompleks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBilanganKompleks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBilanganKompleks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBilanganKompleks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorBilanganKompleks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bA1B1;
    private javax.swing.JButton bA2B2;
    private javax.swing.JButton bArgumen;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKali;
    private javax.swing.JButton bKonjugat;
    private javax.swing.JButton bKuadrat;
    private javax.swing.JButton bKubik;
    private javax.swing.JButton bKurang;
    private javax.swing.JButton bModulus;
    private javax.swing.JButton bPolar;
    private javax.swing.JButton bSalin;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTutup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBGDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbI1;
    private javax.swing.JLabel lbI2;
    private javax.swing.JLabel lbT1;
    private javax.swing.JLabel lbT2;
    private javax.swing.JPanel pDisplay;
    private javax.swing.JPanel pInputData;
    private javax.swing.JPanel pOperasi;
    private javax.swing.JRadioButton rbHasil;
    private javax.swing.JRadioButton rbZ1;
    private javax.swing.JRadioButton rbZ2;
    private javax.swing.JTextArea taDisplay;
    private javax.swing.JTextField tfA1;
    private javax.swing.JTextField tfA2;
    private javax.swing.JTextField tfB1;
    private javax.swing.JTextField tfB2;
    private javax.swing.JTextField tfHasil;
    // End of variables declaration//GEN-END:variables
}
