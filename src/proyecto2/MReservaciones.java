package proyecto2;
//AQUI SE RESERVA EL PAQUETE SI EL CLIENTE EXCISTE DEBE DE PODER INGRESARSE CON EL NUMERO DE DPI EN CASO DE QUE NO REGISTRAR EN MODULO DE CLIENTES
//ADMINISTRAR LA IFORMACION DEL PAQUETE RESERVADO POR EL CLIENTE

import Listas.Clientes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MReservaciones extends JFrame {

    public static String[][] DatosC = new String[60][10];
    public static String[][] DatosR = new String[60][8];
    public static String[][] DatosT = new String[60][5];
    public static String[][] DatosHO = new String[60][4];
    public static String[][] DatosE = new String[60][6];
    public static String[][] DatosP = new String[60][11];
    public static String[][] DatosLT = new String[60][11];
    public static String[][] DatosRA = new String[60][9];
    public static String[][] DatosHA = new String[60][6];
    public static String[][] DatosD = new String[60][7];
    public static String[][] DatosCR = new String[60][7];
    public static String[][] DatosAS = new String[60][5];
    public static String[][] DatosCT = new String[60][4];

    Administrador AD = new Administrador();
    String Paquete;
    public static String dpi;
    String FechaRese;
    String FechaSal;
    int CantDias;
    int SaldoReserva;

    JLabel lbdpiver;
    JTextField txdpiver;

    //init DatClien
    JLabel lblDPI;
    JLabel lblNombres;
    JLabel lblApellidos;
    JLabel lblNoCuenta;
    JLabel lblFechaNac;
    JLabel lblNumTel;
    JLabel lblNumMov;
    JLabel lblRecidencia;

    JLabel lblDPI1;
    JLabel lblNombres1;
    JLabel lblApellidos1;
    JLabel lblNoCuenta1;
    JLabel lblFechaNac1;
    JLabel lblNumTel1;
    JLabel lblNumMov1;
    JLabel lblRecidencia1;

    //Fin DatClien
    JLabel lbPaqu;
    JLabel lbDPIR;
    JLabel lbFechRese;
    JLabel lbFechaOut;
    JLabel lbRango;
    JLabel lbCosto;

    JLabel lbPagar;
    JTextField txPagar;

    JTextField txPaqu;
    JTextField txDPIR;
    JTextField txFechRese;
    JTextField txFechaOut;
    JTextField txRango;
    JTextField txCosto;
    String Tot;

    public void Verificacion() {

        JButton Confirmar;
        JButton back;

        setSize(350, 150);
        setTitle("Verificacion de existencia");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        lbdpiver = new JLabel("DPI: ");
        txdpiver = new JTextField(dpi);
        Confirmar = new JButton("Confirmar");
        back = new JButton("Atras");

        add(lbdpiver);
        add(txdpiver);
        add(Confirmar);
        add(back);

        lbdpiver.reshape(20, 20, 100, 20);
        txdpiver.reshape(80, 20, 100, 20);
        Confirmar.reshape(20, 60, 100, 20);
        back.reshape(120, 60, 100, 20);

        Confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }

            private void ConfirmarActionPerformed(ActionEvent evt) {
                if (txdpiver.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Introdusca el DPI");
                    txdpiver.requestFocusInWindow();
                    return;
                }

                //validadndo
                UsuariosPro UP = new UsuariosPro();
                if (UP.UsuariosPro(txdpiver.getText())) {
                    dpi = txdpiver.getText();
                    txdpiver.setText("");
                    setVisible(false);
                    MReservaciones MR = new MReservaciones();
                    MR.MReservaciones();
                    MR.setVisible(true);
                    MR.setLocationRelativeTo(null);

                } else {
                    txdpiver.setText("");
                    JOptionPane.showMessageDialog(null, "Cliente No Registrado");

                }

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

    public void MReservaciones() {

        JButton Aceptar;
        JButton Cancelar;
        JButton Pagar;
        JButton Editar;
        JButton Guardar;

        setSize(950, 650);
        setTitle("Modulo de Reservaciones");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        lbPaqu = new JLabel("Paquete Contratado: ");
        lbDPIR = new JLabel("Estado : ");
        lbFechRese = new JLabel("Fecha de Reservacion: ");
        lbFechaOut = new JLabel("Fecha de Salida: ");
        lbRango = new JLabel("Rango de dias : ");
        lbCosto = new JLabel("Saldo Pendiente: ");
        txPaqu = new JTextField();
        txDPIR = new JTextField();
        txFechRese = new JTextField();
        txFechaOut = new JTextField();
        txRango = new JTextField();
        txCosto = new JTextField();

        //Datos Clientes
        lblDPI = new JLabel("DPI: ");
        lblDPI1 = new JLabel("");

        lblNombres = new JLabel("Nombres: ");
        lblNombres1 = new JLabel("");

        lblApellidos = new JLabel("Apellidos: ");
        lblApellidos1 = new JLabel("");

        lblNoCuenta = new JLabel("No Tarjeta Debito ");
        lblNoCuenta1 = new JLabel("");

        lblFechaNac = new JLabel("Nacio: ");
        lblFechaNac1 = new JLabel("");

        lblNumTel = new JLabel("Numero de Tel: ");
        lblNumTel1 = new JLabel("");

        lblNumMov = new JLabel("Numero de Movil: ");
        lblNumMov1 = new JLabel("");

        lblRecidencia = new JLabel("Recidencia: ");
        lblRecidencia1 = new JLabel("");

        lbPagar = new JLabel("Abono: ");
        txPagar = new JTextField();

        //Fin Dat Clien
        //Llenado del campo de datos del cliente en pantalla
        for (int i = 0; i < 60; i++) {
            if (dpi.equals(DatosC[i][3])) {
                lblNombres1.setText(DatosC[i][1]);
                lblApellidos1.setText(DatosC[i][2]);
                lblDPI1.setText(DatosC[i][3]);
                lblNoCuenta1.setText(DatosC[i][4]);
                lblFechaNac1.setText(DatosC[i][5]);
                lblNumTel1.setText(DatosC[i][6]);
                lblNumMov1.setText(DatosC[i][7]);
                lblRecidencia1.setText(DatosC[i][8]);
                for (int j = 0; j < 60; j++) {

                    if (dpi.equals(DatosR[j][3])) {
                        txPaqu.setText(DatosR[j][1]);
                        txDPIR.setText(DatosR[j][6]);
                        txFechRese.setText(DatosR[j][4]);
                        txFechaOut.setText(DatosR[j][5]);
                        txRango.setText(DatosR[j][2]);
                        txCosto.setText(DatosR[j][7]);
                    }

                }

            }
        }

        //Fin de llenado
        JPanel Tablero = new JPanel();

        Tablero.setBackground(Color.GRAY);
        Tablero.setBounds(5, 300, 925, 200);
        Tablero.setLayout(null);
        add(Tablero);

        Aceptar = new JButton("back");
        Cancelar = new JButton("Historial");
        Pagar = new JButton("Pagar");
        Editar = new JButton("Editar");
        Guardar = new JButton("Guardar");

        add(lbPaqu);
        add(lbDPIR);
        add(lbFechRese);
        add(lbFechaOut);
        add(lbRango);
        add(lbCosto);
        add(txPaqu);
        add(txDPIR);
        add(txFechRese);
        add(txFechaOut);
        add(txRango);
        add(txCosto);
        add(lbPagar);
        add(txPagar);
        add(Pagar);
        add(Aceptar);
        add(Cancelar);
        add(Editar);
        add(Guardar);

        txPaqu.setEditable(false);
        txDPIR.setEditable(false);
        txFechRese.setEditable(false);
        txFechaOut.setEditable(false);
        txRango.setEditable(false);
        txCosto.setEditable(false);
        /*
        txPaqu;
        txDPIR;
        txFechRese;
        txFechaOut;
        txRango;
        txCosto; */

        Tablero.add(lblDPI);
        Tablero.add(lblNombres);
        Tablero.add(lblApellidos);
        Tablero.add(lblNoCuenta);
        Tablero.add(lblFechaNac);
        Tablero.add(lblNumTel);
        Tablero.add(lblNumMov);
        Tablero.add(lblRecidencia);
        Tablero.add(lblDPI1);
        Tablero.add(lblNombres1);
        Tablero.add(lblApellidos1);
        Tablero.add(lblNoCuenta1);
        Tablero.add(lblFechaNac1);
        Tablero.add(lblNumTel1);
        Tablero.add(lblNumMov1);
        Tablero.add(lblRecidencia1);

        lblDPI.reshape(20, 20, 150, 20);
        lblDPI1.reshape(150, 20, 150, 20);
        lblFechaNac.reshape(400, 20, 150, 20);
        lblFechaNac1.reshape(520, 20, 150, 20);
        lblNombres.reshape(20, 60, 150, 20);
        lblNombres1.reshape(150, 60, 150, 20);
        lblApellidos.reshape(400, 60, 150, 20);
        lblApellidos1.reshape(520, 60, 150, 20);
        lblNoCuenta.reshape(20, 140, 150, 20);
        lblNoCuenta1.reshape(150, 140, 150, 20);
        lblNumTel.reshape(400, 100, 150, 20);
        lblNumTel1.reshape(520, 100, 150, 20);
        lblNumMov.reshape(20, 100, 150, 20);
        lblNumMov1.reshape(150, 100, 150, 20);
        lblRecidencia.reshape(400, 140, 150, 20);
        lblRecidencia1.reshape(520, 140, 150, 20);

        lbPaqu.reshape(20, 20, 150, 20);
        lbDPIR.reshape(20, 60, 150, 20);
        lbFechRese.reshape(20, 100, 150, 20);
        lbFechaOut.reshape(20, 140, 150, 20);
        lbRango.reshape(20, 180, 150, 20);
        txPaqu.reshape(160, 20, 770, 20);
        txDPIR.reshape(160, 60, 770, 20);
        txFechRese.reshape(160, 100, 770, 20);
        txFechaOut.reshape(160, 140, 770, 20);
        txRango.reshape(160, 180, 770, 20);
        lbCosto.reshape(20, 220, 150, 20);
        txCosto.reshape(160, 220, 770, 20);

        lbPagar.reshape(20, 260, 150, 20);
        txPagar.reshape(160, 260, 100, 20);

        Pagar.reshape(290, 260, 100, 20);
        Editar.reshape(700, 260, 100, 20);
        Guardar.reshape(830, 260, 100, 20);

        Aceptar.reshape(20, 550, 100, 20);
        Cancelar.reshape(130, 550, 100, 20);

        Pagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                PagarActionPerformed(evt);
            }

            private void PagarActionPerformed(ActionEvent evt) {
                //txPaqu
                for (int i = 0; i < 60; i++) {
                    if (txPaqu.getText().equals(DatosP[i][7])) {

                        for (int j = 0; j < 60; j++) {

                            //if (DatosP[i][5].equals(DatosHO[j][3])) {
                            if (DatosP[i][4].equals(DatosHO[j][2])) {
                                //DatosR[cont][7]= saldo pendiente
                                for (int k = 0; k < 60; k++) {
                                    if (lblDPI1.getText().equals(DatosR[k][3])) {

                                        int SaldoPen = Integer.parseInt(DatosR[k][7]);
                                        int Abonos = Integer.parseInt(txPagar.getText());
                                        
                                        if (Abonos > SaldoPen) {
                                            JOptionPane.showMessageDialog(null, "El tramite no puede ser realizado ,El Abono Exede la deuda ");
                                        } else {
                                            int Tot = SaldoPen - Abonos;
                                            DatosR[k][7] = "";
                                            DatosR[k][7] = Integer.toString(Tot);
                                            txCosto.setText(DatosR[k][7]);
                                        }

                                    }

                                }

                            }

                            //}
                        }

                    }

                }

            }

        });

        Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                GuardarActionPerformed(evt);
            }

            private void GuardarActionPerformed(ActionEvent evt) {

                for (int i = 0; i < 60; i++) {
                    if (dpi.equals(DatosR[i][3])) {
                        for (int j = 0; j < 60; j++) {
                            if (DatosR[i][1].equals(DatosP[j][7])) {

                                DatosR[i][1] = txPaqu.getText();
                                DatosR[i][2] = txRango.getText();
                                DatosR[i][6] = txDPIR.getText();
                                for (int k = 0; k < 60; k++) {
                                    if (DatosR[i][1].equals(DatosP[k][7])) {
                                        DatosR[i][7] = DatosP[k][10];
                                        txCosto.setText(DatosR[i][7]);

                                    }
                                }

                            }
                        }
                    }

                }
                txPaqu.setEditable(false);
                txRango.setEditable(false);
                txDPIR.setEditable(false);
                

            }

        });

        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                EditarActionPerformed(evt);
            }

            private void EditarActionPerformed(ActionEvent evt) {

                txPaqu.setEditable(true);
                txRango.setEditable(true);
                txDPIR.setEditable(true);
                

            }

        });

        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AceptarActionPerformed(evt);
            }

            private void AceptarActionPerformed(ActionEvent evt) {
                setVisible(false);
                AD.setVisible(true);
            }

        });

    }

}
