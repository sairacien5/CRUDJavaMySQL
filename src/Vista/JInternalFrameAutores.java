//
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import static javafx.scene.control.ButtonType.OK;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*** @author Saira Urbina Cienfuegos*/
public class JInternalFrameAutores extends javax.swing.JInternalFrame {
 
    public JInternalFrameAutores() {
        initComponents();
        jTextIdAutor.setEnabled(false); //Deshabilitar campo de IdAutor
   }
    //Método para listar datos dentro de la tabla
    public void obtenerDatos(){
        //Se crea una lista que almacena los datos obtenidos
        List<Autor> autores=new DAOAutor().ObtenerDatos();
        //Define un modelo para la tabla
        DefaultTableModel modelo= new DefaultTableModel();
        //Arreglo con nombre de columnas de la tabla
        String[] columnas={"id_autor","Nombres", "Apellidos", 
            "Email","Cédula", "FechaNac"};
        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for(Autor au:autores){ //Recorre cada elemento de la lista y los agrega
            //al modelo de la tabla
            String[]renglon={Integer.toString(au.getId_autor()),au.getCedula(),
                au.getNombres(),au.getApellidos(), au.getEmail(),
                au.getFechaNac().toString()};
                modelo.addRow(renglon);
        }
        jTableAutor.setModel(modelo); // Ubica los datos del modelo en la tabla     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEditar1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jTextNombres = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFechaNac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextIdAutor = new javax.swing.JTextField();

        jBEditar1.setText("Editar");

        jTextField4.setText("jTextField1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Autores");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autores Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jTableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTableAutor);

        jPanel2.add(jScrollPane1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transacciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        jBBuscar.setForeground(new java.awt.Color(0, 51, 204));
        jBBuscar.setText("Buscar");

        jBAgregar.setForeground(new java.awt.Color(0, 51, 204));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEditar.setForeground(new java.awt.Color(0, 51, 204));
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBBorrar.setForeground(new java.awt.Color(0, 51, 204));
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBactualizar.setForeground(new java.awt.Color(0, 51, 204));
        jBactualizar.setText("Actualiza");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBactualizar))
                    .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextBuscar))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jBAgregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEditar)
                    .addComponent(jBactualizar))
                .addGap(18, 18, 18)
                .addComponent(jBBorrar)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar / Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Nombres");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Apellidos");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Email");

        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Fecha Nac");

        jTextFechaNac.setText("yyyy-mm-dd");
        jTextFechaNac.setToolTipText("yyyy-mm-dd");

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Cédula");

        jLabelID.setForeground(new java.awt.Color(0, 0, 204));
        jLabelID.setText("ID");

        jTextIdAutor.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNombres))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCedula)
                            .addComponent(jTextFechaNac)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(jTextEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(49, 49, 49)
                        .addComponent(jTextIdAutor)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // Captura datos de la cajas de texto
        String nomb=jTextNombres.getText();
        String apell=jTextApellidos.getText();
        String ema=jTextEmail.getText();
        String ced=jTextCedula.getText();
        String fecN=jTextFechaNac.getText();
        //Comprueba que las cajas de texto no esten vacías
        if(nomb.contentEquals("")||apell.contentEquals("")||
            ema.contentEquals("")||ced.contentEquals("")||
            fecN.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, 
                    "Todos los campos son obligatorios");
        }else{
            try{
                //Convierte de String a Date
                Date fech=Date.valueOf(fecN);//Usar formato de fecha: yyyy-mm-dd
                //Objeto para acceder al método Insertar de DAOAutor
                Autor au=new DAOAutor().Insertar(ced, nomb, apell, ema, fech);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agregó el registro");
            }
        }
        obtenerDatos(); //llama a este método para que se muestre el nuevo 
        //registro en la tabla del formulario
        limpiarCampos();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int fila=this.jTableAutor.getSelectedRow(); //Se obtiene #fila seleccionado
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
        }
        else{ //Se toma cada campo de la tabla del registro seleccionado
            // y se asgina a una variable
            try{
            int id=Integer.parseInt((String)this.jTableAutor.getValueAt(fila, 0).toString());
            String nom=(String)this.jTableAutor.getValueAt(fila,1);
            String ape=(String)this.jTableAutor.getValueAt(fila,2);
            String corr=(String)this.jTableAutor.getValueAt(fila,3);
            String ced=(String)this.jTableAutor.getValueAt(fila,4);
            Date fec=Date.valueOf((String)this.jTableAutor.getValueAt(fila,5).toString());
            //Se ubican en las cajas de textos los datos capturados de la tabla
            jTextIdAutor.setText(""+id);
            jTextNombres.setText(nom);
            jTextApellidos.setText(ape);
            jTextEmail.setText(corr);
            jTextCedula.setText(ced);
            jTextFechaNac.setText(String.valueOf(fec)); 
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }          
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
         actualizarAutor();
         obtenerDatos();
         limpiarCampos();
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int fila=this.jTableAutor.getSelectedRow();
       if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
       }
       else{
//            //JOptionPane.OK_CANCEL_OPTION();
        JDialog.setDefaultLookAndFeelDecorated(true);
        int resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?","Aceptar",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp==JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(rootPane, "Registro no borrado");
        }else{
            if(resp==JOptionPane.YES_OPTION){
           int id=Integer.parseInt((String)this.jTableAutor.getValueAt(fila, 0).toString());
            DAOAutor dao=new DAOAutor();
            dao.Eliminar(id);
            obtenerDatos();
                }
                }if(resp==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(rootPane, "Ninguna acción realizada");
                }
//            int id=Integer.parseInt((String)this.jTableAutor.getValueAt(fila, 0).toString());
//            DAOAutor dao=new DAOAutor();
//            dao.Eliminar(id);
//            obtenerDatos();
         }     
        
    }//GEN-LAST:event_jBBorrarActionPerformed
    public void actualizarAutor(){
            int id=Integer.parseInt(this.jTextIdAutor.getText());
            String nom=this.jTextNombres.getText();
            String ape=this.jTextApellidos.getText();
            String corr=this.jTextEmail.getText();
            String ced=this.jTextCedula.getText();
            Date fec=Date.valueOf(this.jTextFechaNac.getText());
            
            DAOAutor dao=new DAOAutor();
            int res=dao.Actualizar(id,nom,ape,corr,ced,fec);
            if(res==1){
                JOptionPane.showMessageDialog(rootPane, "¡Autor Actualizado!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");
            }
        }
    public void limpiarCampos(){
        jTextIdAutor.setText("");
            jTextNombres.setText("");
            jTextApellidos.setText("");
            jTextEmail.setText("");
            jTextCedula.setText("");
            jTextFechaNac.setText("");
    }
    public void dialogo(){
        JDialog.setDefaultLookAndFeelDecorated(true);
        int resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?","Eliminando....",
                JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Registro no borrado");
           // return;
        }else{
        if(resp==JOptionPane.YES_OPTION){
            
        }
        }if(resp==JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Ninguna acción realizada");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEditar1;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAutor;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFechaNac;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextIdAutor;
    private javax.swing.JTextField jTextNombres;
    // End of variables declaration//GEN-END:variables
}
