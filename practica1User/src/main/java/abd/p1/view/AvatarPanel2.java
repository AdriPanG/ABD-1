/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.view;

import java.util.List;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import abd.p1.controller.UserController;
import abd.p1.model.Usuario;

/**
 *
 * @author adrianpanaderogonzalez
 */
public class AvatarPanel2 extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private abd.p1.view.UserPanel userPanel1;
    // End of variables declaration//GEN-END:variables

	/**
     * Creates new form AvatarPanel2
     */
    public AvatarPanel2(java.awt.Frame parent, boolean modal,Usuario u, boolean miPerfil, UserController c) {
    	super(parent, modal);
        initComponents(u,miPerfil, c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Usuario u, boolean miPerfil, UserController c) {

        userPanel1 = new abd.p1.view.UserPanel(u, miPerfil, c);
        userPanel1.addAncestorListener(new AncestorListener() {
			
			@Override
			public void ancestorRemoved(AncestorEvent event) {
				cerrar();
			}
			
			@Override
			public void ancestorMoved(AncestorEvent event) {

				
			}
			
			@Override
			public void ancestorAdded(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}
		});

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cerrar(){
    	this.setVisible(false);
    }
}
