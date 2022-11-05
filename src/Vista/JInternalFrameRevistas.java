//
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/*** @author Saira Urbina Cienfuegos*/
public class JInternalFrameRevistas extends javax.swing.JInternalFrame {
 
    public JInternalFrameRevistas() {
        initComponents();
        jTextNumero.setEnabled(false); //Deshabilitar campo de IdAutor
        timer();
   }
    //Método para listar datos dentro de la tabla
    public void obtenerDatos(){
        //Se crea una lista que almacena los datos obtenidos
        List<Revista> revistas=new DAORevista().ObtenerDatos();
        //Define un modelo para la tabla
        DefaultTableModel modelo= new DefaultTableModel();
        //Arreglo con nombre de columnas de la tabla
        String[] columnas={"Número","Título", "Año", 
            "ISSN","Precio", "Hora Venta"};
        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for(Revista re:revistas){ //Recorre cada elemento de la lista y los agrega
            //al modelo de la tabla
            String[]renglon={Integer.toString(re.getNumero()),re.getTitulo(),
                Integer.toString(re.getAyo()),re.getIssn(), Float.toString(re.getPrecio()),
                re.getHoraventa().toString()};
                modelo.addRow(renglon);
        }
        jTableRevista.setModel(modelo); // Ubica los datos del modelo en la tabla     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEditar1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRevista = new javax.swing.JTable();
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
        jTextHoraVenta = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextAyo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextIssn = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();

        jBEditar1.setText("Editar");

        jTextField4.setText("jTextField1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Revistas");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revistas Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jTableRevista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableRevista);

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
        jLabel1.setText("Título");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Año");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Hora Venta");

        jTextHoraVenta.setText("hh-mm-ss");

        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Precio");

        jTextPrecio.setToolTipText("yyyy-mm-dd");

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Issn");

        jLabelID.setForeground(new java.awt.Color(0, 0, 204));
        jLabelID.setText("Número");

        jTextNumero.setForeground(new java.awt.Color(51, 51, 255));

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
                        .addComponent(jTextAyo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIssn)
                            .addComponent(jTextPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(jTextHoraVenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(49, 49, 49)
                        .addComponent(jTextNumero)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextAyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextIssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextHoraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 23, Short.MAX_VALUE)))
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
        String tit=jTextTitulo.getText();
        String ay=jTextAyo.getText();
        String hov=jTextHoraVenta.getText();
        String iss=jTextIssn.getText();
        String pre=jTextPrecio.getText();
        //Comprueba que las cajas de texto no esten vacías
        if(tit.contentEquals("")||ay.contentEquals("")||
            hov.contentEquals("")||iss.contentEquals("")||
            pre.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, 
                    "Todos los campos son obligatorios");
        }else{
            try{
                //Convierte de String a time
                //Usar formato de fecha: HH:mm:ss
               java.sql.Time ti= java.sql.Time.valueOf(hov);
               int a=Integer.parseInt(ay);
               float p=Float.parseFloat(pre);
                //Objeto para acceder al método Insertar de DAORevist
                Revista re=new DAORevista().Insertar(tit, a, iss, p,ti );
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
        int fila=this.jTableRevista.getSelectedRow(); //Se obtiene #fila seleccionado
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
        }
        else{ //Se toma cada campo de la tabla del registro seleccionado
            // y se asgina a una variable
            try{
            int num=Integer.parseInt((String)this.jTableRevista.getValueAt(fila, 0).toString());
            String ti=(String)this.jTableRevista.getValueAt(fila,1);
            int ay=Integer.parseInt((String)this.jTableRevista.getValueAt(fila,2).toString());
            String iss=(String)this.jTableRevista.getValueAt(fila,3);
            float pre=Float.parseFloat(this.jTableRevista.getValueAt(fila,4).toString());
            java.sql.Time hov=Time.valueOf((String)this.jTableRevista.getValueAt(fila,5).toString());
            //Se ubican en las cajas de textos los datos capturados de la tabla
            jTextNumero.setText(""+num);
            jTextTitulo.setText(ti);
            jTextAyo.setText(String.valueOf(ay));
            jTextHoraVenta.setText(String.valueOf(hov));
            jTextIssn.setText(iss);
            jTextPrecio.setText(String.valueOf(pre)); 
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }          
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
         actualizarRevista();
         obtenerDatos();
         limpiarCampos();
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int fila=this.jTableRevista.getSelectedRow();
       if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
       }
       else{
//            
        JDialog.setDefaultLookAndFeelDecorated(true);
        int resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?","Aceptar",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp==JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(rootPane, "Registro no borrado");
        }else{
            if(resp==JOptionPane.YES_OPTION){
           int num=Integer.parseInt((String)this.jTableRevista.getValueAt(fila, 0).toString());
            DAORevista dao=new DAORevista();
            dao.Eliminar(num);
            obtenerDatos();
                }
                }if(resp==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(rootPane, "Ninguna acción realizada");
                }

         }     
        
    }//GEN-LAST:event_jBBorrarActionPerformed
    public void actualizarRevista(){
            int num=Integer.parseInt(this.jTextNumero.getText());
            String tit=this.jTextTitulo.getText();
            int ay=Integer.parseInt(this.jTextAyo.getText());
            float pre=Float.parseFloat(this.jTextPrecio.getText());
            String iss=this.jTextIssn.getText();
            java.sql.Time hov=java.sql.Time.valueOf(this.jTextHoraVenta.getText());
            
            DAORevista dao=new DAORevista();
            int res=dao.Actualizar(num, tit, ay, iss, pre, hov);
            if(res==1){
                JOptionPane.showMessageDialog(rootPane, "¡Revista Actualizado!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");
            }
        }
    public void limpiarCampos(){
        jTextNumero.setText("");
            jTextTitulo.setText("");
            jTextAyo.setText("");
            jTextHoraVenta.setText("");
            jTextIssn.setText("");
            jTextPrecio.setText("");
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
    public void timer(){
        SpinnerDateModel dateModel= new SpinnerDateModel();
        JSpinner spinner=new JSpinner(dateModel);
        JSpinner.DateEditor timeEditor=new JSpinner.DateEditor(spinner, "HH:mm:ss");
        spinner.setEditor(timeEditor);
        JOptionPane.showMessageDialog(null, spinner);
        java.sql.Time time=new java.sql.Time(dateModel.getDate().getTime());
        jTextHoraVenta.setText(time.toString());
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
    private javax.swing.JTable jTableRevista;
    private javax.swing.JTextField jTextAyo;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextHoraVenta;
    private javax.swing.JTextField jTextIssn;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
