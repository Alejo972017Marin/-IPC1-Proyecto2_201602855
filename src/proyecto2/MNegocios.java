package proyecto2;

//NEGOSIAR LOS SERVIVIOS QUE SE BRINDA
import com.opencsv.CSVReader;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static proyecto2.MClientes.cont;
import static proyecto2.MReservaciones.DatosC;
import static proyecto2.MReservaciones.DatosCR;
import static proyecto2.MReservaciones.DatosD;
import static proyecto2.MReservaciones.DatosP;
import static proyecto2.MReservaciones.DatosR;
import static proyecto2.MReservaciones.DatosT;

//Aqui se manejaran los paquetes y los tipos de reservaciones 
public class MNegocios extends MReservaciones {

    private JLabel DPIC;
    private JTextField dpic;
    private JButton Verifi;
    private static String dpi;
    private JButton Individual;
    private JLabel Fondo;

    JButton back;
    Administrador ADM = new Administrador();
    int cont = 0;
    static int Pres = 0;

    public void MNegocios() {
        setSize(350, 200);
        setTitle("Verificacion de existencia");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        back = new JButton("Atras");

        DPIC = new JLabel("DPI: ");
        dpic = new JTextField(dpi);
        Verifi = new JButton("verificar");

        add(DPIC);
        add(dpic);
        add(Verifi);
        add(back);

        Fondo = new JLabel();
        add(Fondo);//Agregar de Ultimo

        Fondo.setSize(350, 200);

        ImageIcon imagen = new ImageIcon("src/proyecto2/06.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        MNegocios MN = new MNegocios();
        DPIC.reshape(20, 20, 50, 20);
        dpic.reshape(80, 20, 100, 20);
        Verifi.reshape(200, 20, 100, 20);

        back.reshape(200, 100, 100, 20);

        Verifi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                VerifiActionPerformed(evt);
            }

            private void VerifiActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {
                    if (dpic.getText().equals(DatosC[i][3])) {
                        dpi = dpic.getText();
                        setVisible(false);
                        MN.ReservaPorPaquete();
                        MN.setLocationRelativeTo(null);
                        MN.setVisible(true);
                    }

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
                ADM.setLocationRelativeTo(null);
                ADM.setVisible(true);
            }

        });

    }
    static String[] idCru = new String[60];
    static String[] idTran = new String[60];
    String Pais;
    String Ciudad;
    static String[] idPaq = new String[60];

    public void ReservaPorPaquete() {
        JButton Describir;
        JButton Almacenar;
        JComboBox IDPAQ;
        JButton btPagar;

        JLabel lbTipoPaq;
        JLabel lbClasPaq;
        JLabel lbCantViaj;
        JLabel lbTransporte;
        JLabel lbCrucero;
        JLabel lbDestino;
        JLabel lbLugar;
        JLabel lbCostoPaq;
        JLabel lbPago;
        JLabel lbDeudaA;
        JLabel lbDeudaB;

        JTextField txTipoPaq;
        JTextField txClasPaq;
        JTextField txCantViaj;
        JTextField txTransporte;
        JTextField txCrucero;
        JTextField txDestino;
        JTextField txLugar;
        JTextField txCostoPaq;
        JTextField txPago;
        JLabel lbIDP;

        JLabel lbFechaReserva;
        JLabel lbFechaSalida;
        JTextField txFechaReserva;
        JTextField txFechaSalida;

        setSize(950, 500);
        setTitle("Reservacion Por Paquete");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        back = new JButton("Atras");
        add(back);
        back.reshape(820, 400, 100, 20);

        for (int i = 0; i < 60; i++) {
            idPaq[i] = DatosP[i][7];
        }

        lbTipoPaq = new JLabel("Tipo: ");
        lbClasPaq = new JLabel("Clasificacion: ");
        lbCantViaj = new JLabel("Cant Viajeros: ");
        lbTransporte = new JLabel("Transporte: ");
        lbCrucero = new JLabel("Crucero: ");
        lbDestino = new JLabel("Destino: ");
        lbLugar = new JLabel("Lugar Entre:");
        lbCostoPaq = new JLabel("Costo: ");
        lbFechaReserva = new JLabel("Fecha Actual: ");
        lbFechaSalida = new JLabel("Fecha del Viaje: ");
        lbPago = new JLabel("Pago Inicial");
        lbDeudaA = new JLabel("Deuda: ");
        lbDeudaB = new JLabel();
        btPagar = new JButton("Pagar");
        lbIDP = new JLabel("Paquete: ");

        txTipoPaq = new JTextField();
        txClasPaq = new JTextField();
        txCantViaj = new JTextField();
        txTransporte = new JTextField();
        txCrucero = new JTextField();
        txDestino = new JTextField();
        txLugar = new JTextField();
        txCostoPaq = new JTextField();
        txFechaReserva = new JTextField();
        txFechaSalida = new JTextField();
        txPago = new JTextField();

        Describir = new JButton("Descripcion");
        Almacenar = new JButton("Guardar");

        IDPAQ = new JComboBox(idPaq);

        add(lbTipoPaq);
        add(lbClasPaq);
        add(lbCantViaj);
        add(lbTransporte);
        add(lbCrucero);
        add(lbDestino);
        add(lbLugar);
        add(lbCostoPaq);
        add(lbPago);
        add(lbDeudaA);
        add(lbDeudaB);
        add(btPagar);
        add(lbIDP);

        add(lbFechaReserva);
        add(lbFechaSalida);
        add(txFechaReserva);
        add(txFechaSalida);

        add(txPago);
        add(txTipoPaq);
        add(txClasPaq);
        add(txCantViaj);
        add(txTransporte);
        add(txCrucero);
        add(txDestino);
        add(txLugar);
        add(txCostoPaq);

        add(Describir);
        add(Almacenar);
        add(IDPAQ);

        Fondo = new JLabel();
        add(Fondo);//Agregar de Ultimo

        Fondo.setSize(950, 500);

        ImageIcon imagen = new ImageIcon("src/proyecto2/ne.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        Describir.reshape(100, 400, 150, 20);
        Almacenar.reshape(700, 400, 100, 20);
        IDPAQ.reshape(220, 20, 100, 30);

        lbIDP.reshape(100, 20, 100, 30);
        lbTipoPaq.reshape(100, 60, 100, 20);
        lbFechaReserva.reshape(700, 60, 100, 20);
        lbClasPaq.reshape(100, 100, 100, 20);
        lbFechaSalida.reshape(700, 100, 100, 20);
        lbCantViaj.reshape(100, 140, 100, 20);
        lbTransporte.reshape(100, 180, 100, 20);
        lbCrucero.reshape(100, 220, 100, 20);
        lbDestino.reshape(100, 260, 100, 20);
        lbLugar.reshape(100, 300, 100, 20);
        lbCostoPaq.reshape(100, 340, 100, 20);

        lbPago.reshape(700, 150, 100, 20);
        txPago.reshape(800, 150, 100, 20);
        btPagar.reshape(800, 180, 100, 20);
        lbDeudaA.reshape(700, 240, 100, 20);
        lbDeudaB.reshape(800, 240, 100, 20);

        lbIDP.setForeground(Color.WHITE);
        lbPago.setForeground(Color.WHITE);
        lbDeudaA.setForeground(Color.WHITE);
        lbDeudaB.setForeground(Color.WHITE);
        lbTipoPaq.setForeground(Color.WHITE);
        lbFechaReserva.setForeground(Color.WHITE);
        lbClasPaq.setForeground(Color.WHITE);
        lbFechaSalida.setForeground(Color.WHITE);
        lbCantViaj.setForeground(Color.WHITE);
        lbTransporte.setForeground(Color.WHITE);
        lbCrucero.setForeground(Color.WHITE);
        lbDestino.setForeground(Color.WHITE);
        lbLugar.setForeground(Color.WHITE);
        lbCostoPaq.setForeground(Color.WHITE);

        txTipoPaq.reshape(220, 60, 400, 20);
        txFechaReserva.reshape(800, 60, 100, 20);
        txClasPaq.reshape(220, 100, 400, 20);
        txFechaSalida.reshape(800, 100, 100, 20);
        txCantViaj.reshape(220, 140, 400, 20);
        txTransporte.reshape(220, 180, 400, 20);
        txCrucero.reshape(220, 220, 400, 20);
        txDestino.reshape(220, 260, 400, 20);
        txLugar.reshape(220, 300, 400, 20);
        txCostoPaq.reshape(220, 340, 400, 20);

        txTipoPaq.setEditable(false);
        txClasPaq.setEditable(false);
        txCantViaj.setEditable(false);
        txTransporte.setEditable(false);
        txCrucero.setEditable(false);
        txDestino.setEditable(false);
        txLugar.setEditable(false);
        txCostoPaq.setEditable(false);

        Describir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                DescribirActionPerformed(evt);
            }

            private void DescribirActionPerformed(ActionEvent evt) {
                //aqui busco la descripcion del transporte y al destino que se dirije
                if (IDPAQ.getSelectedItem() != null) {
                    for (int i = 0; i < 60; i++) {
                        if (DatosP[i][7].equals(IDPAQ.getSelectedItem())) {

                            txTipoPaq.setText(DatosP[i][0]);
                            txClasPaq.setText(DatosP[i][2]);
                            txCantViaj.setText(DatosP[i][1]);
                            txCostoPaq.setText(DatosP[i][10]);
                            if (DatosP[i][9].equals("0")) {
                                txTransporte.setText("No");
                            } else {
                                txTransporte.setText("Si");
                            }
                            if (DatosP[i][3].equals("0")) {
                                txCrucero.setText("No");
                            } else {
                                txCrucero.setText("Si");
                            }

                            for (int j = 0; j < 60; j++) {
                                if (DatosP[i][4].equals(DatosD[j][4])) {
                                    Pais = DatosD[j][6];
                                    Ciudad = DatosD[j][0];
                                }

                                txDestino.setText(Pais + "," + Ciudad);
                            }
                            for (int j = 0; j < 60; j++) {
                                if (DatosP[i][4].equals(DatosLT[j][5])) {
                                    txLugar.setText(DatosLT[j][0]);
                                }
                            }

                            //crucero idDestino DatosCR[cont][6]
                            //Datos iddestino DatosD[cont][4]    pais DatosD[cont][6]  ciudad DatosD[cont][0]
                        }
                    }
                }

            }

        });

        //Aqui genero el guardado de datos en los diferentes arreglos 
        Almacenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AlmacenarActionPerformed(evt);
            }

            private void AlmacenarActionPerformed(ActionEvent evt) {
                double Pago=0;
                double Deud=0;
                 Pago = Integer.parseInt(txPago.getText());

                for (int j = 0; j < 60; j++) {
                    if (IDPAQ.getSelectedItem().equals(DatosP[j][7])) {
                        double CostoP = Integer.parseInt(DatosP[j][10]);
                        double Oblig = CostoP * (0.20);
                        
                        if (Pago >= Oblig) {
                            Deud=CostoP -Pago;
                            lbDeudaB.setText(Double.toString(Deud));
                            for (int i = 0; i < 60; i++) {
                                if (DatosR[i][0] != null) {
                                    cont++;
                                }
                            }

                            DatosR[cont][0] = Integer.toString(cont);
                            DatosR[cont][1] = DatosP[j][7];
                            DatosR[cont][2] = "";
                            DatosR[cont][3] = dpi;
                            DatosR[cont][4] = txFechaReserva.getText();
                            DatosR[cont][5] = txFechaSalida.getText();
                            DatosR[cont][6] = "Pendiente";
                            DatosR[cont][7] = Double.toString(Deud) ;
                            cont = 0;
                            JOptionPane.showMessageDialog(null, "Reservacion realizada con exito.");
                        }else {
                        
                        JOptionPane.showMessageDialog(null, "El Pago debe ser mayor o igual al 20% del costo del paquete");
                        }

                    }

                }

                
                cont = 0;

            }

        });

        btPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {

            }

        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                ADM.setLocationRelativeTo(null);
                ADM.setVisible(true);
            }

        });

    }

}
