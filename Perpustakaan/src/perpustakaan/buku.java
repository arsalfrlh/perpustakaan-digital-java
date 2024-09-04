package perpustakaan;
import java.util.ArrayList; //untuk membuat Array
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perpustakaan.login.Session; //untuk mengambil clas session pada file login

public class buku extends javax.swing.JFrame {

    public buku() {
        if(Session.getUserID() == 0 || Session.getUserName() == null){
            JOptionPane.showMessageDialog(null,"Anda Belum Login");
            new login().setVisible(true);
            this.dispose();
        }else{
        initComponents();
        tampil(); //memanggil function tampil
        kosong(); //memanggil function kosong
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_judul = new javax.swing.JTextField();
        txt_penulis = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        Pinjam = new javax.swing.JButton();
        txt_id = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Daftar Buku");

        jLabel2.setText("Judul");

        jLabel3.setText("Stok");

        jLabel5.setText("Penulis");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        Pinjam.setText("Pinjam");
        Pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinjamActionPerformed(evt);
            }
        });

        txt_id.setText("...");

        jMenu1.setText("Halaman Utama");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Daftar Peminjaman");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Daftar User");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Profile");
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Logout");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tambah))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pinjam)
                                    .addComponent(hapus)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pinjam)
                    .addComponent(txt_id))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<String> id_list = new ArrayList(); //membuat Array yang di simpan jadi id_list
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Stok");
        txt_id.setVisible(false); //untuk menyembunyikan id_buku yg di simpan pada txt_id
        
        try{
            String query = "SELECT * FROM tbl_buku";
            java.sql.Connection koneksi = Perpustakaan.config(); //nama file Perpustakaan dan class config()
            java.sql.Statement sql = koneksi.createStatement();
            java.sql.ResultSet hasil = sql.executeQuery(query);
            
            int no = 1;
            id_list.clear(); //untuk mengosongkan isi dari id_list
            while(hasil.next()){
                id_list.add(hasil.getString("id_buku")); //untuk menyimpan id_buku dari database ke dalam id_list
                model.addRow(new Object[]{no++,hasil.getString("judul"),hasil.getString("penulis"),hasil.getString("stok")});
            }
            tabel.setModel(model);
        }catch(Exception e){
            
        }
    }
    
    //function kosong
    public void kosong(){
        txt_id.setText(null);
        txt_judul.setText(null);
        txt_penulis.setText(null);
        txt_stok.setText(null);
    }
    
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        try{
            String query = "INSERT INTO tbl_buku (id_buku,judul,penulis,stok) VALUES ('0','"+txt_judul.getText()+"','"+txt_penulis.getText()+"','"+txt_stok.getText()+"')";
            java.sql.Connection koneksi = Perpustakaan.config();
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Menambahkan Buku");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        tampil();
        kosong();
    }//GEN-LAST:event_tambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.rowAtPoint(evt.getPoint());
        String id = id_list.get(baris); //menympan isi id_list(id_pinjam dari database) kedalam id
        txt_id.setText(id); //mengisi txt_id dari nilai id
        String judul = tabel.getValueAt(baris, 1).toString(); //mengambil data judul dari tabel dan menyimpannya kedalam judul
        txt_judul.setText(judul); //mengisi txt_juduk dari nilai judul
        String penulis = tabel.getValueAt(baris,2).toString();
        txt_penulis.setText(penulis);
        String stok = tabel.getValueAt(baris,3).toString();
        txt_stok.setText(stok);
    }//GEN-LAST:event_tabelMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            String query = "UPDATE tbl_buku SET judul='"+txt_judul.getText()+"', penulis='"+txt_penulis.getText()+"', stok='"+txt_stok.getText()+"' WHERE id_buku='"+txt_id.getText()+"'";
            java.sql.Connection koneksi = Perpustakaan.config();
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil edit data Buku");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        tampil();
        kosong();
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try{
            String query = "DELETE FROM tbl_buku WHERE id_buku='"+txt_id.getText()+"'";
            java.sql.Connection koneksi = Perpustakaan.config();
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Hapus Buku Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tampil();
        kosong();
    }//GEN-LAST:event_hapusActionPerformed

    private void PinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinjamActionPerformed
        try{
            String query = "INSERT INTO tbl_pinjam (id_pinjam,id_user,id_buku,jumlah,statuspinjam) VALUES ('0','"+Session.getUserID()+"','"+txt_id.getText()+"','"+txt_stok.getText()+"','dipinjam')";
            java.sql.Connection koneksi = Perpustakaan.config();
            java.sql.PreparedStatement pst = koneksi.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Meminjam Buku");
            new peminjaman().setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_PinjamActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        new index().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        Session.setUserID(0);
        Session.setNama(null);
        Session.setUserName(null);
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        new peminjaman().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        new user().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MenuSelected

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pinjam;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_penulis;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
