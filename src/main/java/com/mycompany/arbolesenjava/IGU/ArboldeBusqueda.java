/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.arbolesenjava.IGU;

import com.mycompany.arbolesenjava.ArbolBB;
import com.mycompany.arbolesenjava.ArchivoTexto;
import com.mycompany.arbolesenjava.EncriptacionArboles;
import com.mycompany.arbolesenjava.ExpresionGraficaABB;
import com.mycompany.arbolesenjava.Nodo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MiriamMas
 */
public class ArboldeBusqueda extends javax.swing.JFrame {
private ArbolBB arbolito;
    /**
     * Creates new form AbrirArchivo
     */
    public ArboldeBusqueda() {
        initComponents();
BotonIn.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonInActionPerformed(evt);
    }
});
BotonPre.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonPreActionPerformed(evt);
    }
});
BotonPost.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonPostActionPerformed(evt);
    }
});


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        modificarDatos = new javax.swing.JButton();
        encriptar = new javax.swing.JButton();
        Desencriptar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        BotonIn = new javax.swing.JButton();
        BotonPre = new javax.swing.JButton();
        BotonPost = new javax.swing.JButton();
        textBuscar = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        Insertar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNuevoNom = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        textNuevoDPI = new java.awt.TextField();
        salir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        JTextArea.setColumns(20);
        JTextArea.setRows(5);
        jScrollPane1.setViewportView(JTextArea);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar archivo");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        modificarDatos.setText("Modificar Datos");
        modificarDatos.setEnabled(false);
        modificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDatosActionPerformed(evt);
            }
        });

        encriptar.setText("Encriptar");
        encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarActionPerformed(evt);
            }
        });

        Desencriptar.setText("Desencriptar");
        Desencriptar.setEnabled(false);
        Desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesencriptarActionPerformed(evt);
            }
        });

        Buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mirya\\Documents\\NetBeansProjects\\ArbolesEnJava\\src\\main\\java\\com\\mycompany\\arbolesenjava\\IGU\\buscar (1).png")); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mirya\\Documents\\NetBeansProjects\\ArbolesEnJava\\src\\main\\java\\com\\mycompany\\arbolesenjava\\IGU\\eliminar (1).png")); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        BotonIn.setText("InOrden");
        BotonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInActionPerformed(evt);
            }
        });

        BotonPre.setText("PreOrden");
        BotonPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPreActionPerformed(evt);
            }
        });

        BotonPost.setText("PostOrden");
        BotonPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPostActionPerformed(evt);
            }
        });

        textBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar))
                    .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarDatos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(encriptar)
                        .addGap(32, 32, 32)
                        .addComponent(Desencriptar)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonPre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonPost, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonIn)
                        .addComponent(BotonPre)
                        .addComponent(BotonPost)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Desencriptar)
                        .addComponent(encriptar)
                        .addComponent(modificarDatos)
                        .addComponent(Eliminar))
                    .addComponent(Buscar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("AÑADIR UN NUEVO REGISTRO");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES Y APELLIDOS");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NO. DE DPI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textNuevoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNuevoDPI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(textNuevoNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(textNuevoDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Insertar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        salir.setBackground(new java.awt.Color(204, 153, 255));
        salir.setForeground(new java.awt.Color(60, 63, 65));
        salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\mirya\\Documents\\NetBeansProjects\\ArbolesEnJava\\src\\main\\java\\com\\mycompany\\arbolesenjava\\IGU\\depositphotos_70266601-stock-ill.jpg")); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jButton2.setText("Ver ArbolABB");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(salir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(jButton1)))
                                .addGap(17, 17, 17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        arbolito=new ArbolBB();
        JFileChooser fc= new JFileChooser();//creando objeto
        
        //creando un filtro para archivos txt
        FileNameExtensionFilter filtro=new FileNameExtensionFilter(".TXT", "txt");
        
        //indicamos el filtro
        fc.setFileFilter(filtro);
        
        //abriendo ventana, guardamos la opcion seleccionada por el usuario        
        int seleccion=fc.showOpenDialog(this);
        
        //si el usuario selecciona aceptar
        if (seleccion==JFileChooser.APPROVE_OPTION){
            //seleccionamos el fichero
            File fichero=fc.getSelectedFile();
             
            //Escribe la ruta del fichero sleccionado en el campo de texto
            this.textField1.setText(fichero.getAbsolutePath());
            int LI =Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero de linea INICIAL que desea cargar"));
            int LF =Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero de linea FINAL que desea cargar"));
 
           
            //agregando al arbol
            ArchivoTexto.cargarDatosDeArchivo(arbolito, fichero.getAbsolutePath(), LI, LF); 
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
   

    
    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_textField1ActionPerformed

    private void BotonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInActionPerformed
        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.InOrden(arbolito.raiz,sb);
    
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    
    }//GEN-LAST:event_BotonInActionPerformed

    private void BotonPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPreActionPerformed

        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.PreOrden(arbolito.raiz,sb);
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    }//GEN-LAST:event_BotonPreActionPerformed

    private void BotonPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPostActionPerformed
      
        StringBuilder sb=new StringBuilder();
        
        JTextArea.setText("");//limpiar Text
        
        //llamar al metodo InOrden y capturar la salida en el StringBuilder
        if(arbolito != null && !arbolito.EstaVacio()){
            arbolito.PostOrden(arbolito.raiz,sb);
        }
        JTextArea.setText(sb.toString());//mostrar la salida en el text
    }//GEN-LAST:event_BotonPostActionPerformed

    private void textBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarActionPerformed
        
    }//GEN-LAST:event_textBuscarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
   
       if(!arbolito.EstaVacio()){
       String dpi1=textBuscar.getText();
       
       long dpi = Long.parseLong(dpi1);
        Nodo tmp;
        tmp=arbolito.BuscarNodo(dpi);
        if(tmp==null){
        JOptionPane.showMessageDialog(null,"el nodo a buscar no se encuenta","error",JOptionPane.QUESTION_MESSAGE);
        }else{
                    JTextArea.setText("");//limpiar Text
                   JTextArea.setText(tmp.getNombre());//mostrar la salida en el text  
                   modificarDatos.setEnabled(true);
        }
           }else{
           JOptionPane.showMessageDialog(null, "esta vacio", "error", JOptionPane.INFORMATION_MESSAGE);
             }
       
       
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
  
        
           if(!arbolito.EstaVacio()){
               String dat=textBuscar.getText();
               long dato=Long.parseLong(dat);
      
           if (arbolito.EliminarNodo(dato)==false){
            JOptionPane.showMessageDialog(null, "El Nodo a Eliminar no se encuentra en el Arbol","Nodo no Encontrado",JOptionPane.INFORMATION_MESSAGE);
               }else{
               JOptionPane.showMessageDialog(null, "El Nodo ha sido eliminado del Arbol","Nodo Eliminado",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                   JOptionPane.showMessageDialog(null, "El Arbol esta vacio","Error",JOptionPane.INFORMATION_MESSAGE);
                    }

    }//GEN-LAST:event_EliminarActionPerformed


    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
ExpresionGraficaABB graf= new ExpresionGraficaABB(arbolito);
JFrame ventana=new JFrame();
ventana.getContentPane().add(graf);
ventana.setSize(800, 600);
ventana.setVisible(true);
ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:
        String nuevoD=textNuevoDPI.getText();
 try {
    long dato = Long.parseLong(nuevoD);
    String nombre = textNuevoNom.getText();
    arbolito.AgregarNodo(dato, nombre, "", "", "", "", "", "", "");
} catch (NumberFormatException e) {
    // Maneja el caso de error cuando el texto ingresado no es un número válido
    System.out.println("El valor ingresado para el DPI no es un número válido.");
} catch (Exception e) {
    // Maneja cualquier otra excepción que pueda ocurrir
    System.out.println("Error al insertar nodo en el árbol: " + e.getMessage());
}
    }//GEN-LAST:event_InsertarActionPerformed

    private void modificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDatosActionPerformed
        // TODO add your handling code here:
           String dep=JOptionPane.showInputDialog(null,"Departamento");
           String muni=JOptionPane.showInputDialog(null,"municipalidad");
           String Dosis=JOptionPane.showInputDialog(null,"Dosis");
           String Fecha1=JOptionPane.showInputDialog(null,"Fecha 1");
           String Fecha2=JOptionPane.showInputDialog(null,"Fecha 2");
           String Fecha3=JOptionPane.showInputDialog(null,"Fecha 3");
           String Lugar=JOptionPane.showInputDialog(null,"Lugar de Vacunacion");

           arbolito.modificar(dep, muni, Dosis, Fecha1, Fecha2, Fecha3, Lugar);
           arbolito.datosdeNodo();
    }//GEN-LAST:event_modificarDatosActionPerformed

    
    private void encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarActionPerformed
    EncriptacionArboles en=new EncriptacionArboles();
        
    try {
        en.encriptarArbol(arbolito.raiz);
        en.encriptarArchivo(en.getMiArchivoBBT());
      Desencriptar.setEnabled(true);
    } catch (IOException ex) {
        Logger.getLogger(ArboldeBusqueda.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    }//GEN-LAST:event_encriptarActionPerformed


        
    private void DesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesencriptarActionPerformed
        // TODO add your handling code here:
    EncriptacionArboles en=new EncriptacionArboles();
    
        try {
        en.desencriptarArbol(arbolito.raiz);
        en.desencriptarArchivo(en.getMiArchivoBBT());
           } catch (IOException ex) {
        Logger.getLogger(ArboldeBusqueda.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    }//GEN-LAST:event_DesencriptarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        Ventana pantalla = new Ventana();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirActionPerformed


    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIn;
    private javax.swing.JButton BotonPost;
    private javax.swing.JButton BotonPre;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Desencriptar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JButton encriptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarDatos;
    private javax.swing.JButton salir;
    private java.awt.TextField textBuscar;
    private java.awt.TextField textField1;
    private java.awt.TextField textNuevoDPI;
    private java.awt.TextField textNuevoNom;
    // End of variables declaration//GEN-END:variables
}

