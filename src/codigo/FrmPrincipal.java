/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import com.sun.istack.internal.logging.Logger;
import java.awt.Color;
import static java.awt.Color.BLUE;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import static java_cup.emit.parser;
import java_cup.parser;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

/**
 *
 * @author garci
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
                   
    }
    Nodo nombre;
public void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtCodigo.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtLexico.setText(resultado);
                return;
            }
            switch (token) {
                case Libreria:
                    cont++;
                    resultado += "  <Libreria>\t" + lexer.lexeme + "\n";
                    break;
                case Include:
                    cont++;
                    resultado += "  <Reservada include>\t" + lexer.lexeme + "\n";
                    break;
                case Hashtag:
                    cont++;
                    resultado += "  <Reservado hashtag>\t" + lexer.lexeme + "\n";
                    break;
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLexico = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        btnAnalizarL = new javax.swing.JButton();
        btnLimpiarL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAnalizarS = new javax.swing.JButton();
        btnLimpiarS = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        btnArbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 745));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Octocom", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        txtLexico.setEditable(false);
        txtLexico.setColumns(20);
        txtLexico.setRows(5);
        jScrollPane2.setViewportView(txtLexico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        btnAbrir.setBackground(new java.awt.Color(0, 0, 0));
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnAnalizarL.setBackground(new java.awt.Color(0, 0, 0));
        btnAnalizarL.setForeground(new java.awt.Color(204, 255, 255));
        btnAnalizarL.setText("Analizar");
        btnAnalizarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLActionPerformed(evt);
            }
        });

        btnLimpiarL.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarL.setForeground(new java.awt.Color(204, 255, 255));
        btnLimpiarL.setText("Limpiar");
        btnLimpiarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalizarL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarL)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnAnalizarL)
                    .addComponent(btnLimpiarL))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analisis Sintactico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        btnAnalizarS.setBackground(new java.awt.Color(0, 0, 0));
        btnAnalizarS.setForeground(new java.awt.Color(204, 255, 255));
        btnAnalizarS.setText("Analizar");
        btnAnalizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSActionPerformed(evt);
            }
        });

        btnLimpiarS.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarS.setForeground(new java.awt.Color(204, 255, 255));
        btnLimpiarS.setText("Limpiar");
        btnLimpiarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSActionPerformed(evt);
            }
        });

        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane3.setViewportView(txtSintactico);

        btnArbol.setBackground(new java.awt.Color(0, 0, 0));
        btnArbol.setForeground(new java.awt.Color(204, 255, 255));
        btnArbol.setText("Arbol");
        btnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalizarS)
                        .addGap(234, 234, 234)
                        .addComponent(btnArbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarS))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarS)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalizarS)
                        .addComponent(btnArbol)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        try{
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtCodigo.setText(ST);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLActionPerformed
        public void graficar(Nodo raiz){
        FileWriter archivo = null;
        PrintWriter pw = null;
        String cadena = graficarNodo(raiz);
        
        
        try{
            archivo = new FileWriter("C:/Users/garci/Documents/NetBeansProjects/Octocom/arbol.dot");
            pw = new PrintWriter(archivo);
            pw.println("digraph G {node[shape=box, style=filled, color=blanchedalmond]; edge[color=chocolate3];rankdir=UD \n");
            pw.println(cadena);
            pw.println("\n}");
            archivo.close();
        }catch (Exception e) {
            System.out.println(e +" 1");
        }
        
        try {
            String doPath = "C:/Program Files (x86)/Graphviz2.38/bin/dot.exe";
            String fileInputPath = "C:/Users/garci/Documents/NetBeansProjects/Octocom/arbol.dot";
            String fileOutputPath = "C:/Users/garci/Documents/NetBeansProjects/Octocom/arbol.png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            //String cmd = "C:/Users/garci/Documents/NetBeansProjects/Octocom> dot.exe -Tpng C:/Users/garci/Documents/NetBeansProjects/Octocom/arbol.dot -o C:/Users/garci/Documents/NetBeansProjects/Octocom/arbol.png";
            String [] cmd = new String[5];
            cmd [0] = doPath;
            cmd [1] = tParam;
            cmd [2] = fileInputPath;
            cmd [3] = tOParam;
            cmd [4] = fileOutputPath;
            
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println(ioe +" 2");
        }
        
    }
    public String graficarNodo(Nodo nodo){
        String cadena = "";
        for(Nodo hijos : nodo.getHijos())
        {
            cadena += "\"" + nodo.getNumNodo() + "_" + nodo.getNombre() + " -> " + nodo.getValor() + "\"->\"" + hijos.getNumNodo() + "_" + hijos.getNombre() + " -> " + hijos.getValor() + "\"\n";
            cadena += graficarNodo(hijos);
            System.out.println(cadena);
        }
        return cadena;
    }
    
    private void btnLimpiarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLActionPerformed
        txtCodigo.setText("");
        txtLexico.setText("");
    }//GEN-LAST:event_btnLimpiarLActionPerformed

    private void btnAnalizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSActionPerformed
        String ST = txtCodigo.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader (ST)));
        
        try {
            s.parse();
            txtSintactico.setText("Analisis realizado correctamente");
            txtSintactico.setForeground(new Color(25,111,61));
            System.out.println(s.padre);
            //graficar(s.padre);
            nombre = s.padre;
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtSintactico.setText("Error de sintaxis. Linea: " + (sym.right + 1)+ " Columna: "+(sym.left+1)+", Texto: \"" + sym.value + "\"");
            txtSintactico.setForeground(Color.red);            
        }
    }//GEN-LAST:event_btnAnalizarSActionPerformed

    private void btnLimpiarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSActionPerformed
        txtSintactico.setText("");
    }//GEN-LAST:event_btnLimpiarSActionPerformed

    private void btnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolActionPerformed

            
        graficar(nombre);
    }//GEN-LAST:event_btnArbolActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizarL;
    private javax.swing.JButton btnAnalizarS;
    private javax.swing.JButton btnArbol;
    private javax.swing.JButton btnLimpiarL;
    private javax.swing.JButton btnLimpiarS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtLexico;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables
}
