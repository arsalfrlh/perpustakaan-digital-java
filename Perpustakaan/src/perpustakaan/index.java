package perpustakaan;
import perpustakaan.login.Session; //untuk memanggil class session pada file login
import javax.swing.JOptionPane;

public class index extends javax.swing.JFrame {

    public index() {
        if(Session.getUserID() == 0 || Session.getUserName() == null){ //jika belum login session id_user dan username maka akan 0/null
            JOptionPane.showMessageDialog(null, "Anda Belum Login");
            new login().setVisible(true); //mengarahkannya ke halaman login
            this.dispose(); //menutup halaman index
        }else{ //jika sudah login session id_user dan username akan terisi dan user dapat mengakses halaman index
            initComponents();
            lbl_nama.setText(Session.getNama()); //mengisi JLabel nama dengan mengambil session nama
            lbl_username.setText(Session.getUserName()); //mengisi JLabel username dengan mengambil session username
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        daftar_buku = new javax.swing.JMenu();
        daftar_peminjaman = new javax.swing.JMenu();
        daftar_user = new javax.swing.JMenu();
        profile = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selamat Datang Di Perpustakaan Digital");

        jLabel2.setText("Username");

        jLabel3.setText("Nama");

        daftar_buku.setText("Daftar Buku");
        daftar_buku.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                daftar_bukuMenuSelected(evt);
            }
        });
        jMenuBar1.add(daftar_buku);

        daftar_peminjaman.setText("Daftar Peminjaman");
        daftar_peminjaman.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                daftar_peminjamanMenuSelected(evt);
            }
        });
        jMenuBar1.add(daftar_peminjaman);

        daftar_user.setText("Daftar User");
        daftar_user.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                daftar_userMenuSelected(evt);
            }
        });
        jMenuBar1.add(daftar_user);

        profile.setText("Profile");
        profile.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                profileMenuSelected(evt);
            }
        });
        jMenuBar1.add(profile);

        logout.setText("Logout");
        logout.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                logoutMenuSelected(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_logoutMenuSelected
        Session.setUserID(0); //akan menubah session id_user jadi 0
        Session.setNama(null); //akan mengubah session nama jadi null
        Session.setUserName(null); //akan mengubah session username jadi null
        JOptionPane.showMessageDialog(null,"Anda Telah Logout"); //akan menampilkan pesan logout
        new login().setVisible(true); //akan mengarahkan ke halaman login
        this.dispose(); //akan menutup halaman index
    }//GEN-LAST:event_logoutMenuSelected

    private void daftar_bukuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_daftar_bukuMenuSelected
        new buku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftar_bukuMenuSelected

    private void daftar_peminjamanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_daftar_peminjamanMenuSelected
        new peminjaman().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftar_peminjamanMenuSelected

    private void daftar_userMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_daftar_userMenuSelected
        new user().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftar_userMenuSelected

    private void profileMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_profileMenuSelected
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMenuSelected

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu daftar_buku;
    private javax.swing.JMenu daftar_peminjaman;
    private javax.swing.JMenu daftar_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JMenu logout;
    private javax.swing.JMenu profile;
    // End of variables declaration//GEN-END:variables
}
