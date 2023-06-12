package t1_pbo;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class Formlogin extends javax.swing.JFrame {
    static String username = "root";
    static String password = "";
    static String connector = "jdbc:mysql://localhost:3306/uas_pbo";
    static String comClass = "com.mysql.jdbc.Driver";
    Connection con = null;
    PreparedStatement stat2 = null;
    ResultSet rs;
    String sql = null;
    
    int q, delete_data, nim, j;
    public Formlogin() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
    }
public void updateTable(){
        try{
            
            Class.forName(comClass);
            con = DriverManager.getConnection(connector, username, password);
            stat2 = con.prepareStatement("select * from  data_ktm");
            
            rs = stat2.executeQuery();
            ResultSetMetaData data = rs.getMetaData();
            
            q = data.getColumnCount();
            
            DefaultTableModel recordTb = (DefaultTableModel)table_ktm.getModel();
            recordTb.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(j = 1; j <= q; j++ ){
                    columnData.add(rs.getInt("NIM"));
                    columnData.add(rs.getString("Nama"));
                    columnData.add(rs.getInt("KTM"));
                    columnData.add(rs.getString("PRODI"));
                    columnData.add(rs.getString("Kelamin"));
                }
                recordTb.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKTM = new javax.swing.JTextField();
        CbLaki = new javax.swing.JCheckBox();
        CbCewe = new javax.swing.JCheckBox();
        ComProdi = new javax.swing.JComboBox<>();
        BtnSimpan = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ktm = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pendataan KTM Mahasiswa Fakultas IT");

        jLabel2.setText("NAMA :");

        jLabel3.setText("NIM :");

        jLabel4.setText("No. KTM :");

        jLabel5.setText("PRODI :");

        jLabel6.setText("Jenis Kelamin :");

        CbLaki.setText("Laki-Laki");

        CbCewe.setText("Perempuan");

        ComProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "INFORMATIKA", "SISTEM INFORMASI", "ILMU KOMPUTER" }));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CbCewe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(55, 55, 55)
                                            .addComponent(ComProdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtKTM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)
                                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnKembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnHapus)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CbLaki)
                        .addComponent(CbCewe)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali)
                    .addComponent(BtnSimpan)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnHapus))
                .addGap(39, 39, 39))
        );

        table_ktm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "KTM", "PRODI", "JENIS KELAMIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_ktm);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new Login().show(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed


    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String kelamin = "", Prodi = "";
        if (CbLaki.isSelected()){
            kelamin = "Laki-Laki";
            CbCewe.setSelected(false);
        }else if (CbCewe.isSelected()){
            kelamin = "Perempuan";
            CbLaki.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(null, "Isi CheckBox Jenis Kelamin . . .");
        }
        
        Object Selecteditem = ComProdi.getSelectedItem();
        if (Selecteditem.equals("...")){
            JOptionPane.showMessageDialog(null, "Pilih Prodi Dahulu");
        }else{
            Prodi = Selecteditem.toString();
        }
        try{
            sql = "SELECT * FROM data_ktm WHERE NIM = ? AND KTM = ?";
            stat2 = con.prepareStatement(sql);
            stat2.setString(1, txtNIM.getText());
            stat2.setString(2, txtKTM.getText());
            rs = stat2.executeQuery();
            if (rs.next()){
                if (txtNIM.getText().equals(rs.getString("NIM"))||txtKTM.getText().equals(rs.getString("KTM"))){
                    JOptionPane.showMessageDialog(null, "Data sudah ada sebelumnya . . . ");
                    txtNIM.requestFocus();
                    txtNIM.setText("");
                    txtKTM.setText("");
                }
            }else{
                try{
                    sql = "INSERT INTO data_ktm (NIM, Nama, KTM, PRODI, Kelamin) VALUES (?,?,?,?,?)";
                    stat2 = con.prepareStatement(sql);
                    stat2.setInt(1, Integer.parseInt(txtNIM.getText()));
                    stat2.setString(2, txtNama.getText());
                    stat2.setInt(3, Integer.parseInt(txtKTM.getText()));
                    stat2.setString(4, Prodi);
                    stat2.setString(5, kelamin);
                    stat2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhasil di Tambah");
                    updateTable();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Data Gagal Di Tambahkan 2 . . .");
                } 
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Di Tambahkan");
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        String kelamin = "", Prodi = "";
        if (CbLaki.isSelected()){
            kelamin = "Laki-Laki";
            CbCewe.setSelected(false);
        }else if (CbCewe.isSelected()){
            kelamin = "Perempuan";
            CbLaki.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(null, "Isi CheckBox Jenis Kelamin . . .");
        }
        
        Object Selecteditem = ComProdi.getSelectedItem();
        if (Selecteditem.equals("...")){
            JOptionPane.showMessageDialog(null, "Pilih Prodi Dahulu");
        }else{
            Prodi = Selecteditem.toString();
        }
        try{
            sql = "UPDATE data_ktm SET Nama = ?, KTM = ?, PRODI = ?, Kelamin = ? WHERE NIM = ?";
            stat2 = con.prepareStatement(sql);
            stat2.setString(1, txtNama.getText());
            stat2.setInt(2, Integer.parseInt(txtKTM.getText()));
            stat2.setString(3, Prodi);
            stat2.setString(4, kelamin);
            stat2.setInt(5, Integer.parseInt(txtNIM.getText()));
            stat2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di Update");
            updateTable();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Data Gagal Di Tambahkan . . .");
                } 
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        table_ktm.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = table_ktm.getSelectedRow();
                Object value1 = table_ktm.getValueAt(selectedRow, 0);
                Object value2 = table_ktm.getValueAt(selectedRow, 1);
                Object value3 = table_ktm.getValueAt(selectedRow, 2);
                Object value4 = table_ktm.getValueAt(selectedRow, 3);
                Object value5 = table_ktm.getValueAt(selectedRow, 4);
                String txtValue1 = value1.toString();
                String txtValue2 = value2.toString();
                String txtValue3 = value3.toString();
                String txtValue4 = value4.toString();
                String txtValue5 = value5.toString();
                txtNIM.setText(txtValue1);
                txtNama.setText(txtValue2);
                txtKTM.setText(txtValue3);
                ComProdi.setSelectedItem(txtValue4);
                if (txtValue5.equals("Perempuan")){
                    CbCewe.setSelected(true);
                    CbLaki.setSelected(false);
                }else{
                    CbLaki.setSelected(true);
                    CbCewe.setSelected(false);
                }
                
            }
        });
    }//GEN-LAST:event_formWindowOpened
public void Clear(){
    txtNIM.setText("");
    txtNama.setText("");
    txtKTM.setText("");
    ComProdi.setSelectedIndex(0);
    CbCewe.setSelected(false);
    CbLaki.setSelected(false);
}
    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try{
            nim = Integer.parseInt(txtNIM.getText());
            delete_data = JOptionPane.showConfirmDialog(null,"Yakin Untuk Menghapus? ", "Warning", JOptionPane.YES_NO_OPTION);
            if (delete_data == JOptionPane.YES_OPTION){
                sql = "DELETE FROM data_ktm WHERE NIM = ?";
                stat2 = con.prepareStatement(sql);
                stat2.setInt(1, nim);
                stat2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
                updateTable();
                Clear();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus . . .");
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formlogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JCheckBox CbCewe;
    private javax.swing.JCheckBox CbLaki;
    private javax.swing.JComboBox<String> ComProdi;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ktm;
    private javax.swing.JTextField txtKTM;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
