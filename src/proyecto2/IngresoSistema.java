
package proyecto2;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static proyecto2.MReservaciones.dpi;


public class IngresoSistema extends JFrame {
    private JLabel Fondo;

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
         //add(pasword);
         //add(Pasword);
        add(Aceptar);
        add(Cancelar);
        //prop
        
        Fondo = new JLabel();
        add(Fondo);//Agregar de Ultimo
        
        Fondo.setSize(320, 220);
        
        ImageIcon imagen = new ImageIcon("src/proyecto2/00.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        Aceptar.setHorizontalTextPosition(SwingConstants.CENTER);
        Aceptar.setVerticalTextPosition(SwingConstants.BOTTOM);

        Cancelar.setHorizontalTextPosition(SwingConstants.CENTER);
        Cancelar.setVerticalTextPosition(SwingConstants.BOTTOM);

        //posicionar
        // .reshape(x,y,dimx,dimy);
        usuario.reshape(30, 40, 70, 20);
        usuario.setForeground(Color.WHITE);
        Usuario.reshape(90, 40, 100, 20);
        // pasword.reshape(20, 45, 100, 20);
         //Pasword.reshape(120, 45, 100, 20);
        Aceptar.reshape(200, 40, 100, 20);
        Cancelar.reshape(200, 65, 100, 20);
 //igualando valores usuarip
                 
        
        //events
        //BOTON ACEPTAR ACCION
        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AceptarActionPerformed(evt);
            }

            private void AceptarActionPerformed(ActionEvent evt) {
                
                if (Usuario.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Introdusca un Usuario");
                    Usuario.requestFocusInWindow();
                    return;
                }

                //validadndo
                UsuariosPro UP = new UsuariosPro();
       
                if (UP.Us(Usuario.getText())) {
                    UA = Usuario.getText();
                    Usuario.setText("");
                    setVisible(false);
                    Administrador MR = new Administrador();
                    MR.setVisible(true);
                    MR.setLocationRelativeTo(null);

                } else {
                    Usuario.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario o Contraceña Invalido");

                }

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