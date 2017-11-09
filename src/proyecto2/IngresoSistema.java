
package proyecto2;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class IngresoSistema extends JFrame {
    

    public  JTextField Usuario;
    private JLabel usuario;
    private JTextField Pasword;
    private JLabel pasword;
    private JButton Aceptar;
    private JButton Cancelar;
    public static String UA;
    public  IngresoSistema() {
        setSize(320, 220);
        setTitle("Bienvenido");
        setLayout(null);
        setDefaultCloseOperation(IngresoSistema.EXIT_ON_CLOSE);
        setResizable(true);

        //Inicializar 
        Usuario = new JTextField(UA);
        usuario = new JLabel("USUARIO:");
         Pasword = new JTextField(10);
         pasword = new JLabel("PIN:");
        Aceptar = new JButton("Confirmar");
        Cancelar = new JButton("Cancelar");
     
      

        //agregar
        //add();
        add(usuario);
        add(Usuario);
         add(pasword);
         add(Pasword);
        add(Aceptar);
        add(Cancelar);
        //prop

        Aceptar.setHorizontalTextPosition(SwingConstants.CENTER);
        Aceptar.setVerticalTextPosition(SwingConstants.BOTTOM);

        Cancelar.setHorizontalTextPosition(SwingConstants.CENTER);
        Cancelar.setVerticalTextPosition(SwingConstants.BOTTOM);

        //posicionar
        // .reshape(x,y,dimx,dimy);
        usuario.reshape(20, 20, 100, 20);
        Usuario.reshape(120, 20, 100, 20);
         pasword.reshape(20, 45, 100, 20);
         Pasword.reshape(120, 45, 100, 20);
        Aceptar.reshape(20, 67, 95, 30);
        Cancelar.reshape(120, 67, 95, 30);
 //igualando valores usuarip
                 
        
        //events
        //BOTON ACEPTAR ACCION
        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AceptarActionPerformed(evt);
            }

            private void AceptarActionPerformed(ActionEvent evt) {

            }

        });
        //BOTTON CANCELAR ACCION
        Cancelar.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent evt) {
                CancelarActionPerformed(evt);
            }

            private void CancelarActionPerformed(ActionEvent evt) {

                Usuario.setText("");
                Pasword.setText("");

            }

        });

    }
    


}