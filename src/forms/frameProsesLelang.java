/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import database.koneksi;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class frameProsesLelang extends javax.swing.JFrame {

    koneksi myObject;
    
    public DefaultTableModel modelTabelProsesLelang;
    
    /**
     * Creates new form frameProsesLelang
     */
    public frameProsesLelang() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        myObject = new koneksi();
        modelTabelProsesLelang = new DefaultTableModel();
        tabelProsesLelang.setModel(modelTabelProsesLelang);
        modelTabelProsesLelang.addColumn("ID Proses Lelang");
        modelTabelProsesLelang.addColumn("ID Buka Lelang");
        modelTabelProsesLelang.addColumn("ID Petani");
        modelTabelProsesLelang.addColumn("ID Pembeli");
        modelTabelProsesLelang.addColumn("ID Komoditas");
        modelTabelProsesLelang.addColumn("Harga Bid");
        tampilDataProsesLelang();
    }

    public void tampilDataProsesLelang() {
        try {
            modelTabelProsesLelang.getDataVector().removeAllElements();
            modelTabelProsesLelang.fireTableDataChanged();
            
            PreparedStatement query = myObject.konek.prepareStatement("SELECT * FROM proses_lelang");
            ResultSet data = query.executeQuery();
            while (data.next()) {                
                Object[] baris = new Object[6];
                baris[0] = data.getString("id_proseslelang");
                baris[1] = data.getString("id_bukalelang");
                baris[2] = data.getString("id_petani");
                baris[3] = data.getString("id_pembeli");
                baris[4] = data.getString("id_komoditas");
                baris[5] = data.getString("harga_bid");
                modelTabelProsesLelang.addRow(baris);   
            }
            query.close();
            data.close();
        } catch (Exception e) {
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDPembeli = new javax.swing.JTextField();
        txtIDKomoditas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHargaBid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDBukaLelang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDPetani = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProsesLelang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtIDProsesLelang = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tambah Data Proses Lelang");

        jLabel5.setText("ID Komoditas");

        jLabel6.setText("Harga Bid");

        jLabel3.setText("ID Buka Lelang");

        jLabel4.setText("ID Petani");

        jLabel7.setText("ID Pembeli");

        jButton1.setText("Simpan Statement");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan PreparedStatement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubah Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabelProsesLelang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelProsesLelang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProsesLelangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProsesLelang);

        jLabel8.setText("ID Proses Lelang");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        jLabel10.setText("Cari Data");

        jButton5.setText("Cetak Data");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIDProsesLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIDBukaLelang, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIDPetani, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIDPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIDKomoditas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtHargaBid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHargaBid, txtIDBukaLelang, txtIDKomoditas, txtIDPembeli, txtIDPetani});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel8)
                    .addComponent(txtIDProsesLelang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIDBukaLelang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIDPetani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtIDPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIDKomoditas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHargaBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDProsesLelang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Proses lelang belum di isi!");
                txtIDProsesLelang.requestFocus();
            } else if (txtIDBukaLelang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Buka lelang belum di isi!");
                txtIDBukaLelang.requestFocus();
            } else if (txtIDPetani.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Petani belum di isi!");
                txtIDPetani.requestFocus();
            } else if (txtIDPembeli.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Pembeli belum di isi!");
                txtIDPembeli.requestFocus();
            } else if (txtIDKomoditas.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Komoditas belum di isi!");
                txtIDPetani.requestFocus();
            } else if (txtHargaBid.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Harga bid belum di isi!");
                txtHargaBid.requestFocus();
            } else {
                String sql = "insert into proses_lelang value ('"+txtIDProsesLelang.getText()+"','"+txtIDBukaLelang.getText()+"','"+txtIDPetani.getText()+"','"+txtIDPembeli.getText()+"','"+txtIDKomoditas.getText()+"','"+txtHargaBid.getText()+"')";
                myObject.konek.createStatement().execute(sql);
                tampilDataProsesLelang();
                JOptionPane.showMessageDialog(this, "Data berhasil di simpan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDProsesLelang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Proses lelang belum di isi!");
                txtIDProsesLelang.requestFocus();
            } else if (txtIDBukaLelang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Buka lelang belum di isi!");
                txtIDBukaLelang.requestFocus();
            } else if (txtIDPetani.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Petani belum di isi!");
                txtIDPetani.requestFocus();
            } else if (txtIDPembeli.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Pembeli belum di isi!");
                txtIDPembeli.requestFocus();
            } else if (txtIDKomoditas.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID Komoditas belum di isi!");
                txtIDPetani.requestFocus();
            } else if (txtHargaBid.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Harga bid belum di isi!");
                txtHargaBid.requestFocus();
            } else {
                String sqlCari = "SELECT * FROM proses_lelang WHERE id_proseslelang ='"+txtIDProsesLelang.getText()+"'";
                ResultSet cari = myObject.konek.createStatement().executeQuery(sqlCari);
                if(cari.next()){
                    JOptionPane.showMessageDialog(this, "ID Proses lelang sudah terdaftar!!!");
                                         
                    txtIDBukaLelang.setText(cari.getString(2));
                    txtIDPetani.setText(cari.getString(3));
                    txtIDPembeli.setText(cari.getString(4));
                    txtIDKomoditas.setText(cari.getString(5));
                    txtHargaBid.setText(cari.getString(6));
                    
                } else {
                    String sql = "INSERT INTO proses_lelang VALUE (?, ?, ?, ?, ?, ?)";
                    PreparedStatement simpan = myObject.konek.prepareStatement(sql);
                    simpan.setString(1, txtIDProsesLelang.getText());
                    simpan.setString(2, txtIDBukaLelang.getText());
                    simpan.setString(3, txtIDPetani.getText());
                    simpan.setString(4, txtIDPembeli.getText());
                    simpan.setString(5, txtIDKomoditas.getText());
                    simpan.setString(6, txtHargaBid.getText());
                    simpan.executeUpdate();
                    tampilDataProsesLelang();
                    JOptionPane.showMessageDialog(this, "Data berhasil di simpan");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                    (txtIDProsesLelang.getText().isEmpty()) &&
                    (txtIDBukaLelang.getText().isEmpty()) &&
                    (txtIDPetani.getText().isEmpty()) &&
                    (txtIDPembeli.getText().isEmpty()) &&
                    (txtIDKomoditas.getText().isEmpty()) &&
                    (txtHargaBid.getText().isEmpty())
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "UPDATE proses_lelang SET id_bukalelang=?, id_petani=?, id_pembeli=?, id_komoditas=?, harga_bid=? WHERE id_proseslelang=?";
                PreparedStatement ubah = myObject.konek.prepareStatement(sql);
                ubah.setString(1, txtIDBukaLelang.getText());
                ubah.setString(2, txtIDPetani.getText());
                ubah.setString(3, txtIDPembeli.getText());
                ubah.setString(4, txtIDKomoditas.getText());
                ubah.setString(5, txtHargaBid.getText());
                ubah.setString(6, txtIDProsesLelang.getText());
                ubah.executeUpdate();
                tampilDataProsesLelang();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                    (txtIDProsesLelang.getText().isEmpty()) &&
                    (txtIDBukaLelang.getText().isEmpty()) &&
                    (txtIDPetani.getText().isEmpty()) &&
                    (txtIDPembeli.getText().isEmpty()) &&
                    (txtIDKomoditas.getText().isEmpty()) &&
                    (txtHargaBid.getText().isEmpty())
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "DELETE FROM proses_lelang WHERE id_proseslelang=?";
                PreparedStatement hapus = myObject.konek.prepareStatement(sql);
                hapus.setString(1, txtIDProsesLelang.getText());
                hapus.executeUpdate();
                tampilDataProsesLelang();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabelProsesLelangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProsesLelangMouseClicked
        // TODO add your handling code here:
        int baris = tabelProsesLelang.getSelectedRow();
        String id_proseslelang = tabelProsesLelang.getValueAt(baris, 0).toString();
        String id_bukalelang = tabelProsesLelang.getValueAt(baris, 1).toString();
        String id_petani = tabelProsesLelang.getValueAt(baris, 2).toString();
        String id_pembeli = tabelProsesLelang.getValueAt(baris, 3).toString();
        String id_komoditas = tabelProsesLelang.getValueAt(baris, 4).toString();
        String harga_bid = tabelProsesLelang.getValueAt(baris, 5).toString();
        txtIDProsesLelang.setText(id_proseslelang);
        txtIDBukaLelang.setText(id_bukalelang);
        txtIDPetani.setText(id_petani);
        txtIDPembeli.setText(id_pembeli);
        txtIDKomoditas.setText(id_komoditas);
        txtHargaBid.setText(harga_bid);
    }//GEN-LAST:event_tabelProsesLelangMouseClicked

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        // TODO add your handling code here:
        modelTabelProsesLelang.getDataVector().removeAllElements();
        modelTabelProsesLelang.fireTableDataChanged();
        try {
            String sqlcari = "SELECT * FROM proses_lelang WHERE id_proseslelang LIKE '%"+txtCari.getText()+"%' "
                        + "OR id_bukalelang LIKE '%"+txtCari.getText()+"%' OR id_petani LIKE '%"+txtCari.getText()+"%'"
                        + "OR id_pembeli LIKE '%"+txtCari.getText()+"%' OR id_komoditas LIKE '%"+txtCari.getText()+"%'"
                        + "OR harga_bid LIKE '%"+txtCari.getText()+"%'";
            Statement cari = myObject.konek.createStatement();
            ResultSet data = cari.executeQuery(sqlcari);
            while (data.next()) {                
                Object[] baris = new Object[6];
                baris[0] = data.getString("id_proseslelang");
                baris[1] = data.getString("id_bukalelang");
                baris[2] = data.getString("id_petani");
                baris[3] = data.getString("id_pembeli");
                baris[4] = data.getString("id_komoditas");
                baris[5] = data.getString("harga_bid");
                modelTabelProsesLelang.addRow(baris);   
            }
            cari.close();
            data.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtCariKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String reportPath = "src/report/reportProsesLelang.jasper";
            Connection konek = koneksi.konek;
            HashMap<String, Object> parameters = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters,konek);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(frameProsesLelang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameProsesLelang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameProsesLelang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameProsesLelang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameProsesLelang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelProsesLelang;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHargaBid;
    private javax.swing.JTextField txtIDBukaLelang;
    private javax.swing.JTextField txtIDKomoditas;
    private javax.swing.JTextField txtIDPembeli;
    private javax.swing.JTextField txtIDPetani;
    private javax.swing.JTextField txtIDProsesLelang;
    // End of variables declaration//GEN-END:variables
}
