package proyecto2;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Administrador extends JFrame {

    private JLabel Fondo;
    private JButton Clientes;
    private JButton Reservas;
    private JButton Negocios;
    private JButton Reportes;
    private JButton Carga;
    private JButton Agregar;
    private JButton back;
IngresoSistema IS = new IngresoSistema();
    public Administrador() {
        setSize(950, 650);
        setTitle("Administracion");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        Clientes = new JButton("Clientes");
        Reservas = new JButton("Reservas");
        Negocios = new JButton("Reservar Por Paquetes");
        Reportes = new JButton("Reportes");
        Carga = new JButton("Carga");
        Agregar = new JButton("Negocios");
        back = new JButton("Atras");
        Fondo = new JLabel();
        Reportes.setVisible(false);
        Carga.setVisible(false);
        

        add(Clientes);
        add(Reservas);
        add(Negocios);
        add(Reportes);
        add(Carga);
        add(Agregar);
        add(back);
        add(Fondo);//Agregar de Ultimo

        if (IS.Usuario.getText().equals("ipc1Admin")) {
            Reportes.setVisible(true);
            Carga.setVisible(true);

            Clientes.reshape(200, 150, 200, 50);
            Reservas.reshape(200, 250, 200, 50);
            Negocios.reshape(200, 350, 200, 50);
            Reportes.reshape(500, 350, 200, 50);
            Carga.reshape(500, 250, 200, 50);
            Agregar.reshape(500, 150, 200, 50);

        } else {
            Clientes.reshape(225, 200, 200, 50);
            Reservas.reshape(225, 300, 200, 50);
            Agregar.reshape(525, 200, 200, 50);
            Negocios.reshape(525, 300, 200, 50);

        }

        Fondo.setSize(950, 650);

        back.reshape(700, 450, 100, 20);

        ImageIcon imagen = new ImageIcon("src/proyecto2/res.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        Clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ClientesActionPerformed(evt);
            }

            private void ClientesActionPerformed(ActionEvent evt) {
                setVisible(false);
                MClientes MC = new MClientes();
                // MC.setExtendedState(JFrame.MAXIMIZED_BOTH);
                MC.setVisible(true);
                MC.setLocationRelativeTo(null);
            }

        });

        Reservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ReservasActionPerformed(evt);
            }

            private void ReservasActionPerformed(ActionEvent evt) {
                setVisible(false);
                MReservaciones MR = new MReservaciones();
                MR.Verificacion();
                MR.setVisible(true);
                MR.setLocationRelativeTo(null);
            }

        });

        Negocios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                NegociosActionPerformed(evt);
            }

            private void NegociosActionPerformed(ActionEvent evt) {
                setVisible(false);
                MNegocios MN = new MNegocios();
                MN.MNegocios();
                MN.setLocationRelativeTo(null);
                MN.setVisible(true);

            }

        });

        Reportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ReportesActionPerformed(evt);
            }

            private void ReportesActionPerformed(ActionEvent evt) {
                setVisible(false);
                MReportes MR = new MReportes();
                MR.MReportes();
                MR.setVisible(true);
                MR.setLocationRelativeTo(null);
            }

        });

        Carga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CargaActionPerformed(evt);
            }

            private void CargaActionPerformed(ActionEvent evt) {
                setVisible(false);
                MCarga MC = new MCarga();
                MC.MCarga();
                MC.setLocationRelativeTo(null);
                MC.setVisible(true);
            }

        });

        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AgregarActionPerformed(evt);
            }

            private void AgregarActionPerformed(ActionEvent evt) {
                setVisible(false);
                NegocioSi NS = new NegocioSi();
                NS.setLocationRelativeTo(null);
                NS.setVisible(true);

            }

        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                IngresoSistema IS = new IngresoSistema();
                setVisible(false);
                IS.setLocationRelativeTo(null);
                IS.setVisible(true);
                IS.Usuario.setText("");

            }

        });

    }

}
