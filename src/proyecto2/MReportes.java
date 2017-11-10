package proyecto2;

//PARA LLEVAR EL CONTROL DE LAS ACCIONES REALIZADAS Y EL CONTROL DE LAS GANANCIAS ADQUIRIDAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static proyecto2.MReservaciones.DatosD;
import static proyecto2.MReservaciones.DatosP;
import static proyecto2.MReservaciones.DatosR;

public class MReportes extends MReservaciones {

    private JButton Clientes;
    private JButton Reservas;
    private JButton Negocios;

    private JButton Carga;
    private JButton Agregar;
    private JButton back;

    public void MReportes() {
        setSize(950, 450);
        setTitle("Modulo de Reportes");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

        Clientes = new JButton("Clientes");
        Reservas = new JButton("Reservaciones");
        Negocios = new JButton("Negocios");
        Carga = new JButton("Carga");
        Agregar = new JButton("Estadisticos");
        back = new JButton("Atras");

        add(Clientes);
        add(Reservas);
        add(Negocios);

        add(Carga);
        add(Agregar);
        add(back);

        Clientes.reshape(100, 60, 200, 40);
        Reservas.reshape(100, 120, 200, 40);
        Negocios.reshape(100, 180, 200, 40);
        Carga.reshape(100, 240, 200, 40);
        Agregar.reshape(100, 300, 200, 40);
        back.reshape(700, 340, 100, 20);
        MReportes RR = new MReportes();

        Clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ClientesActionPerformed(evt);
            }

            private void ClientesActionPerformed(ActionEvent evt) {
                setVisible(false);
                RR.RCliente();
                RR.setVisible(true);
                RR.setLocationRelativeTo(null);

            }

        });

        Reservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ReservasActionPerformed(evt);
            }

            private void ReservasActionPerformed(ActionEvent evt) {
                setVisible(false);
                RR.RReservacion();
                RR.setVisible(true);
                RR.setLocationRelativeTo(null);
            }

        });

        Negocios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                NegociosActionPerformed(evt);
            }

            private void NegociosActionPerformed(ActionEvent evt) {
                setVisible(false);
                RR.RNegocio();
                RR.setVisible(true);
                RR.setLocationRelativeTo(null);

            }

        });

        Carga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CargaActionPerformed(evt);
            }

            private void CargaActionPerformed(ActionEvent evt) {
                setVisible(false);
                RR.RCarga();
                RR.setVisible(true);
                RR.setLocationRelativeTo(null);
            }

        });

        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                AgregarActionPerformed(evt);
            }

            private void AgregarActionPerformed(ActionEvent evt) {
                setVisible(false);
                RR.REstadistica();
                RR.setVisible(true);
                RR.setLocationRelativeTo(null);

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

    static String stID[] = new String[60];
    static String IDC;
    static String NombreC;
    static String NViajes;
    static String destino;
    static String pais;
    private int NV=0;
    
    
   

    public void RCliente() {
        JLabel lbID;
        JComboBox cbID;
        JButton Imprimir;

        setSize(350, 200);
        setTitle("Reporte De Clientes");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

        for (int i = 0; i < 60; i++) {
            stID[i] = DatosC[i][3];

        }
        JButton back;
        back = new JButton("Atras");
        add(back);
        back.reshape(180, 70, 100, 20);

        lbID = new JLabel("DPI: ");
        cbID = new JComboBox(stID);
        Imprimir = new JButton("Imprimir");

        add(lbID);
        add(cbID);
        add(Imprimir);

        lbID.reshape(30, 40, 50, 20);
        cbID.reshape(70, 40, 100, 20);
        Imprimir.reshape(180, 40, 100, 20);

        Imprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }

            private void ImprimirActionPerformed(ActionEvent evt) {
                

                for (int i = 0; i < 60; i++) {
                    if (cbID.getSelectedItem().equals(DatosR[i][3])) {
                        
                        
                        for (int j = 0; j < 60; j++) {
                            
                            if (DatosR[i][3].equals(DatosC[j][3])) {
                                IDC=DatosC[j][3];
                            NombreC=DatosC[j][1];
                            }
                            
                        }
                        
                        for (int j = 0; j < 60; j++) {
                            if(IDC.equals(DatosR[j][3])){
                            NV++;
                            }
                            
                        }
                        
                        NViajes=Integer.toString(NV);
                            
                            
                        for (int j = 0; j < 60; j++) {
                            
                            if (DatosR[i][1].equals(DatosP[j][7])) {
                                for (int k = 0; k < 60; k++) {
                                    if (DatosP[j][4].equals(DatosD[k][4])) {
                                        destino = DatosD[k][5];
                                        pais = DatosD[k][6];

                                    }
                                }
                            }
                        }
                    }
                }
  
                System.out.println("ID Cliente: "+ IDC);
                System.out.println("Nom y Ape: "+ NombreC);
                System.out.println("Cantidad De Viajes Realizados: "+ NViajes);
                System.out.println("Destino: "+destino+", "+pais);
                
                

            }

        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                MReportes MR = new MReportes();
                MR.MReportes();
                MR.setVisible(true);
                MR.setLocationRelativeTo(null);
            }

        });

    }

    public void RReservacion() {
        JButton btFecha;
        JButton btClienteFec;
        JButton btCanselados;
        JButton btCosto;
        JButton btCliente;
        JButton back;

        JLabel lbDia;
        JLabel lbMes;
        JLabel lbDe;
        JLabel lbA;
        JLabel lbDPI;
        JLabel lbDe1;
        JLabel lbA1;

        JTextField txDia;
        JTextField txMes;
        JTextField txDPI;
        JTextField txDE1;
        JTextField txA1;
        JTextField txDE2;
        JTextField txA2;

        setSize(650, 450);
        setTitle("Reportes De Reservaciones");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

        btFecha = new JButton("Imprimir");
        btClienteFec = new JButton("Imprimir");
        btCanselados = new JButton("Canseladas");
        btCosto = new JButton("Costo");
        btCliente = new JButton("Cliente");
        back = new JButton("Atras");

        lbDia = new JLabel("Día: ");
        lbMes = new JLabel("Mes: ");
        lbDe = new JLabel("De");
        lbA = new JLabel("a");
        lbDe1 = new JLabel("De");
        lbA1 = new JLabel("a");
        lbDPI = new JLabel("DPI: ");

        txDia = new JTextField();
        txMes = new JTextField();
        txDPI = new JTextField();
        txDE1 = new JTextField();
        txA1 = new JTextField();
        txDE2 = new JTextField();
        txA2 = new JTextField();

        add(btFecha);
        add(btClienteFec);
        add(btCanselados);
        add(btCosto);
        add(btCliente);
        add(back);

        add(lbDia);
        add(lbMes);
        add(lbDe1);
        add(lbA1);
        add(lbDe);
        add(lbA);
        add(lbDPI);

        add(txDia);
        add(txMes);
        add(txDPI);
        add(txDE1);
        add(txA1);
        add(txDE2);
        add(txA2);

        lbDia.reshape(20, 60, 50, 20);
        txDia.reshape(70, 60, 100, 20);

        lbMes.reshape(20, 100, 50, 20);
        txMes.reshape(70, 100, 100, 20);

        lbDe1.reshape(40, 140, 20, 20);
        txDE1.reshape(70, 140, 100, 20);

        lbA1.reshape(175, 140, 10, 20);
        txA1.reshape(190, 140, 100, 20);

        btFecha.reshape(420, 140, 100, 20);

        lbDPI.reshape(20, 200, 50, 20);
        txDPI.reshape(70, 200, 100, 20);

        lbDe.reshape(40, 240, 20, 20);
        txDE2.reshape(70, 240, 100, 20);

        lbA.reshape(175, 240, 10, 20);
        txA2.reshape(190, 240, 100, 20);

        btClienteFec.reshape(420, 240, 100, 20);

        btCanselados.reshape(20, 300, 200, 20);
        btCosto.reshape(220, 300, 200, 20);
        btCliente.reshape(420, 300, 200, 20);
        back.reshape(20, 350, 100, 20);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                MReportes MR = new MReportes();
                MR.MReportes();
                MR.setVisible(true);
                MR.setLocationRelativeTo(null);
            }

        });

    }

    public void RNegocio() {
        /*
        btFecha
        btClienteFec
        btCanselados
        btCosto
        btCliente
        
        lbDia
        lbMes
        lbDe //Lo uso dos veces
        lbA  //Lo uso dos veces 
        lbDPI
        
        txDia
        txMes
        txDPI
        txDE1
        txA1
        txDE2
        txA2
       
        
         */

        setSize(950, 450);
        setTitle("Reportes De Negocios");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);

    }

    public void RCarga() {
        setSize(950, 450);
        setTitle("Reporte De Carga De Archivos");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
    }

    public void REstadistica() {
        setSize(950, 450);
        setTitle("Reporte Estadistico");
        setDefaultCloseOperation(MReservaciones.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
    }

}
