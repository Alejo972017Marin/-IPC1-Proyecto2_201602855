//Aqui sirve para registrar toda la informacion del cliente
//REFISTRAR CLIENTES
//De IGUAL MANERA PARA CONTROLAR LA FRECUENCIA CON LA QUE ADQUIERE EL SERVICIO 
package proyecto2;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static proyecto2.MReservaciones.DatosC;

public class MClientes extends MReservaciones {

    Administrador AD = new Administrador();
    JButton back;
    static int add = 0;
    static int cont = 0;

    String DPI;
    String Nombres;
    String Apellidos;
    String NumTarjeta;
    String FechaDeNacimiento;
    String NumTelef;
    String NumMovil;
    String DireccionHabitacion;

    private JLabel Fondo;
    JLabel lbDPI;
    JLabel lbNombre;
    JLabel lbApellido;
    JLabel lbNumTarjeta;
    JLabel lbFechNac;
    JLabel lbTel;
    JLabel lbMovil;
    JLabel lbDirecHabt;

    JTextField txDPI;
    JTextField txNombre;
    JTextField txApellido;
    JTextField txNumTarjeta;
    JTextField txFechNac;
    JTextField txTel;
    JTextField txMovil;
    JTextField txDirecHabt;

    JButton Agregar;
    JButton Cancelar;
    private JButton Info;
    private JButton Borrar;
    private JButton Modificar;

    public MClientes() {

        setSize(920, 620);
        setTitle("Modulo Clientes");
        setLayout(null);
        setDefaultCloseOperation(MClientes.EXIT_ON_CLOSE);
        setResizable(false);

        lbDPI = new JLabel("DPI: ");
        lbNombre = new JLabel("Nombres: ");
        lbApellido = new JLabel("Apellidos: ");
        lbNumTarjeta = new JLabel("#Tarjeta: ");
        lbFechNac = new JLabel("Fecha \n de\n nacimiento: ");
        lbTel = new JLabel("No.Tel: ");
        lbMovil = new JLabel("No.Movil: ");
        lbDirecHabt = new JLabel("Direccion \n de \n Habitacion: ");
        txDPI = new JTextField();
        txNombre = new JTextField();
        txApellido = new JTextField();
        txNumTarjeta = new JTextField();
        txFechNac = new JTextField();
        txTel = new JTextField();
        txMovil = new JTextField();
        txDirecHabt = new JTextField();
        Agregar = new JButton("Agregar");
        Cancelar = new JButton("Nuevo");
        Fondo = new JLabel();
        back = new JButton("Atras");
        Info = new JButton("Datos");
        Modificar = new JButton("Modificar");
        Borrar = new JButton("Eliminar");

        add(lbDPI);
        add(lbNombre);
        add(lbApellido);
        add(lbNumTarjeta);
        add(lbFechNac);
        add(lbTel);
        add(lbMovil);
        add(lbDirecHabt);
        add(txDPI);
        add(txNombre);
        add(txApellido);
        add(txNumTarjeta);
        add(txFechNac);
        add(txTel);
        add(txMovil);
        add(txDirecHabt);
        add(Agregar);
        add(Cancelar);
        add(back);
        add(Info);
        add(Modificar);
        add(Borrar);
        add(Fondo);

        Fondo.setSize(920, 620);

        lbNombre.reshape(20, 20, 100, 20);
        txNombre.reshape(120, 20, 100, 20);
        Info.reshape(300, 20, 100, 20);

        lbApellido.reshape(20, 60, 100, 20);
        txApellido.reshape(120, 60, 100, 20);
        Modificar.reshape(300, 60, 100, 20);

        lbDPI.reshape(20, 100, 100, 20);
        txDPI.reshape(120, 100, 100, 20);
        Borrar.reshape(300, 100, 100, 20);

        lbNumTarjeta.reshape(20, 140, 100, 20);
        txNumTarjeta.reshape(120, 140, 100, 20);
        lbFechNac.reshape(20, 180, 100, 20);
        txFechNac.reshape(120, 180, 100, 20);
        lbTel.reshape(20, 220, 100, 20);
        txTel.reshape(120, 220, 100, 20);
        lbMovil.reshape(20, 260, 100, 20);
        txMovil.reshape(120, 260, 100, 20);
        lbDirecHabt.reshape(20, 300, 100, 20);
        txDirecHabt.reshape(120, 300, 100, 20);

        Agregar.reshape(20, 360, 100, 20);
        Cancelar.reshape(160, 360, 100, 20);
        back.reshape(20, 410, 100, 20);

        ImageIcon imagen = new ImageIcon("src/proyecto2/Travel2.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AgregarActionPerformed(evt);
            }

            private void AgregarActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {
                    if (DatosC[i][3] != null) {
                        cont++;
                    }
                }

                DatosC[cont][0] = Integer.toString(cont);
                DatosC[cont][1] = txNombre.getText();
                DatosC[cont][2] = txApellido.getText();
                DatosC[cont][3] = txDPI.getText();
                DatosC[cont][4] = txNumTarjeta.getText();
                DatosC[cont][5] = txFechNac.getText();
                DatosC[cont][6] = txTel.getText();
                DatosC[cont][7] = txMovil.getText();
                DatosC[cont][8] = txDirecHabt.getText();

                JOptionPane.showMessageDialog(null, "Guardado " + cont);
                cont = 0;

            }
        });

        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CancelarActionPerformed(evt);
            }

            private void CancelarActionPerformed(ActionEvent evt) {

                txNombre.setText("");
                txApellido.setText("");
                txDPI.setText("");
                txNumTarjeta.setText("");
                txFechNac.setText("");
                txTel.setText("");
                txMovil.setText("");
                txDirecHabt.setText("");

            }
        });

        Info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                InfoActionPerformed(evt);
            }

            private void InfoActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {

                    if (txDPI.getText().equals(DatosC[i][3])) {

                        txNombre.setText(DatosC[i][1]);
                        txApellido.setText(DatosC[i][2]);
                        txDPI.setText(txDPI.getText());
                        txDPI.setEditable(false);
                        txNumTarjeta.setText(DatosC[i][4]);
                        txFechNac.setText(DatosC[i][5]);
                        txTel.setText(DatosC[i][6]);
                        txMovil.setText(DatosC[i][7]);
                        txDirecHabt.setText(DatosC[i][8]);

                    }

                }

            }

        });

        Modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ModificarActionPerformed(evt);
            }

            private void ModificarActionPerformed(ActionEvent evt) {

                for (int i = 0; i < 60; i++) {

                    if (txDPI.getText().equals(DatosC[i][3])) {

                        DatosC[i][0] = Integer.toString(cont);
                        DatosC[i][1] = txNombre.getText();
                        DatosC[i][2] = txApellido.getText();
                        DatosC[i][3] = txDPI.getText();
                        DatosC[i][4] = txNumTarjeta.getText();
                        DatosC[i][5] = txFechNac.getText();
                        DatosC[i][6] = txTel.getText();
                        DatosC[i][7] = txMovil.getText();
                        DatosC[i][8] = txDirecHabt.getText();

                    }

                }
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa.");

            }

        });

        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BorrarActionPerformed(evt);
            }

            private void BorrarActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {
                    if (txDPI.getText().equals(DatosC[i][3])) {

                        DatosC[i][0] = null;
                        DatosC[i][1] = null;
                        DatosC[i][2] = null;
                        DatosC[i][3] = null;
                        DatosC[i][4] = null;
                        DatosC[i][5] = null;
                        DatosC[i][6] = null;
                        DatosC[i][7] = null;
                        DatosC[i][8] = null;

                    }
                }
                JOptionPane.showMessageDialog(null, "Eliminacion Exitosa.");

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                AD.setVisible(true);
            }

        });

    }

}
