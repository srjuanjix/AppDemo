/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.mod1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Window",
        id = "org.myorg.mod1.pruebaBoton"
)
@ActionRegistration(
        iconBase = "org/myorg/mod1/IconoBusquedaPequeño_16x16.png",
        displayName = "#CTL_pruebaBoton"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1300),
    @ActionReference(path = "Toolbars/File", position = 300)
})
@Messages("CTL_pruebaBoton=Simulacion de factura")
public final class pruebaBoton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
         topComponentTopComponent tc = topComponentTopComponent.findInstance();
         
         tc.mensaje();
         
    }
}
