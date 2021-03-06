/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFileChooser;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristiancvanega
 */
public class Index extends javax.swing.JFrame {

    Model modelFruitOntology = ModelFactory.createDefaultModel();

    /**
     * Creates new form Index
     */
    public Index() {
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

        txtRutaArchivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarArchivo = new javax.swing.JButton();
        btnCargarArchivo = new javax.swing.JButton();
        btnVisualizarOnt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRealizarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        txtNombreConsulta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnListConsult = new javax.swing.JButton();
        checkDeConsultaGuardada = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ruta ontología");

        btnBuscarArchivo.setText("Buscar en este pc");
        btnBuscarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArchivoActionPerformed(evt);
            }
        });

        btnCargarArchivo.setText("Cargar Archivo");
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });

        btnVisualizarOnt.setText("Visualizar ontología");
        btnVisualizarOnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarOntActionPerformed(evt);
            }
        });

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRealizarConsulta.setText("Realizar Consulta");
        btnRealizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarConsultaActionPerformed(evt);
            }
        });

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        jScrollPane1.setViewportView(txtConsulta);

        jLabel2.setText("Nombre de la Consulta (Opcional)");

        btnListConsult.setText("Listar Consultas");
        btnListConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListConsultActionPerformed(evt);
            }
        });

        checkDeConsultaGuardada.setText("de consulta guardada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizarConsulta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarArchivo)
                        .addGap(89, 89, 89)
                        .addComponent(jButton1))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarArchivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisualizarOnt))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkDeConsultaGuardada)
                        .addGap(132, 132, 132)
                        .addComponent(btnListConsult)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarArchivo)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarOnt)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListConsult)
                    .addComponent(checkDeConsultaGuardada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRealizarConsulta))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArchivoActionPerformed
        // TODO add your handling code here:  
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileHidingEnabled(false);
        fileChooser.showOpenDialog(null);
        this.txtRutaArchivo.setText(fileChooser.getSelectedFile().toString());
    }//GEN-LAST:event_btnBuscarArchivoActionPerformed

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
        // TODO add your handling code here:
        InputStream in1 = FileManager.get().open(this.txtRutaArchivo.getText());
        if (in1 == null) {
            throw new IllegalArgumentException("File: " + this.modelFruitOntology + " not found");
        }
        this.modelFruitOntology.read(in1, "");

        this.modelFruitOntology.write(System.out, "RDF/XML-ABBREV");
        this.modelFruitOntology.write(new PrintWriter(System.out));

        try {
            FileOutputStream fout = new FileOutputStream("RDFs/Fruit.rdf");
            this.modelFruitOntology.write(fout);
        } catch (IOException e) {
            System.out.println("Exception caught" + e.getMessage());
        }
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void btnVisualizarOntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarOntActionPerformed
        this.execCommand("java -jar ../Welkin_Visor_RDF/welkin.jar");
    }//GEN-LAST:event_btnVisualizarOntActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.execCommand("java -jar ../Welkin_Visor_RDF/welkin.jar");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRealizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarConsultaActionPerformed
        // TODO add your handling code here:
        String nombreConsulta = "";
        if (this.checkDeConsultaGuardada.isSelected()) {
            nombreConsulta = "consultas" + "/" + this.txtNombreConsulta.getText() + ".rq";
        } else {
            nombreConsulta = this.txtNombreConsulta.getText().equals("") ? "q1.rq" : this.txtNombreConsulta.getText() + ".rq";
            nombreConsulta = "consultas" + "/" + nombreConsulta;
            this.writeFile(nombreConsulta, this.txtConsulta.getText());
        }
        String command = "../apache-jena-2.13.0/bin/sparql --data=" + this.txtRutaArchivo.getText() + " --query=" + nombreConsulta;
        System.out.println(command);
        this.txtConsulta.setText(this.readFile(nombreConsulta));
        this.txtConsulta.append("\n ------------------------------");
        this.execCommand(command);

    }//GEN-LAST:event_btnRealizarConsultaActionPerformed

    private void btnListConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListConsultActionPerformed
        // TODO add your handling code here:
        this.txtConsulta.setText("");
        this.execCommand("ls consultas");
    }//GEN-LAST:event_btnListConsultActionPerformed

    private void writeFile(String nameFile, String contentFile) {
        BufferedWriter writer = null;
        try {
            //create a temporary file
            File file = new File(nameFile);

            // This will output the full path where the file will be written to...
            System.out.println(file.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(file));
            writer.write(contentFile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }

    private void execCommand(String command) {
        String s = null;
        String response = "";

        try {

            // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec(command);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                response += s + "\n";
            }
            this.txtConsulta.append(response);

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private String readFile(String file) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String response = "";

        try {
         // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(file);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                response += "\n" + linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
         // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return response;
    }

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarArchivo;
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnListConsult;
    private javax.swing.JButton btnRealizarConsulta;
    private javax.swing.JButton btnVisualizarOnt;
    private javax.swing.JCheckBox checkDeConsultaGuardada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextField txtNombreConsulta;
    private javax.swing.JTextField txtRutaArchivo;
    // End of variables declaration//GEN-END:variables
}
