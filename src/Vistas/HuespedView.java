/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Datos.HuespedData;
import Entidades.Huesped;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class HuespedView extends javax.swing.JInternalFrame {
    private HuespedData hueData= new HuespedData();
    private Huesped huespedActual=null;

    /**
     * Creates new form HuespedView
     */
    public HuespedView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTdocumento = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        jTdomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jTnuevo = new javax.swing.JButton();
        jTcelular = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Huespedes");

        jLabel2.setText("Documento:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jlabel.setText("Domicilio");

        jLabel5.setText("Celular");

        jLabel6.setText("Correo");

        jBnuevo.setText("Limpiar Campos");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jTnuevo.setText("Nuevo");
        jTnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(jTdocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTdomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcelular)
                            .addComponent(jTcorreo))
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jTnuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jTnuevo))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try{
        Integer dni=Integer.parseInt(jTdocumento.getText());
        huespedActual=hueData.buscarHuespedDni(dni);
        if(huespedActual!=null){
            
            jTnombre.setText(huespedActual.getNombre());
            jTdomicilio.setText(huespedActual.getDomicilio());
            jTcelular.setText(Integer.toString(huespedActual.getCelular()));
            jTcorreo.setText(huespedActual.getCorreo());
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"ingrese un numero valido");  
        }        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        limpiarCampos();
        huespedActual=null;
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try{
            Integer dni=Integer.parseInt(jTdocumento.getText());
            String nombre=jTnombre.getText();
            String domicilio=jTdomicilio.getText();
            String correo=jTcorreo.getText();
            Integer celular=Integer.parseInt(jTcelular.getText());
            if(nombre.isEmpty()|| domicilio.isEmpty()||correo.isEmpty()){
                JOptionPane.showMessageDialog(this,"no puede haber campos vacios");
            }
            
            if(huespedActual!=null){
                
                huespedActual.setDni(dni);
                huespedActual.setNombre(nombre);
                huespedActual.setDomicilio(domicilio);
                huespedActual.setCorreo(correo);
                huespedActual.setCelular(celular);
                hueData.actualizarHuesped(huespedActual, dni);
            }else {
                
                huespedActual= new Huesped(nombre, dni, domicilio, correo, celular);
                hueData.guardarHuesped(huespedActual);
                
            }
            
        
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, " ingresar datos correctamente");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnuevoActionPerformed
        try{
            Integer dni=Integer.parseInt(jTdocumento.getText());
            String nombre=jTnombre.getText();
            String domicilio=jTdomicilio.getText();
            Integer celular=Integer.parseInt(jTcelular.getText());
            String correo=jTcorreo.getText();
            
            if(nombre.isEmpty()||domicilio.isEmpty()||correo.isEmpty()){
                JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            }
            if(huespedActual==null){
                huespedActual= new Huesped(nombre, dni, domicilio, correo, celular);
                hueData.guardarHuesped(huespedActual);
            }
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "ingresar numeros validos");
        }
    }//GEN-LAST:event_jTnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        hueData.eliminarHuesped(Integer.parseInt(jTdocumento.getText()));
       
    }//GEN-LAST:event_jBeliminarActionPerformed
    
    private void limpiarCampos(){
    
        jTnombre.setText("");
        jTdocumento.setText("");
        jTcelular.setText("");
        jTcorreo.setText("");
        jTdomicilio.setText("");
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTcelular;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jTnuevo;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
