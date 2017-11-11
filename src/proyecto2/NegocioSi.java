package proyecto2;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static proyecto2.MClientes.cont;
import static proyecto2.MReservaciones.DatosC;
import static proyecto2.MReservaciones.DatosP;
import static proyecto2.MReservaciones.PaqueteCreado;

public class NegocioSi extends MReservaciones {
   
private JLabel Fondo;
    private JLabel lbIDPaq;
    private JLabel lbTipPaq;
    private JLabel lbClasPaq;
    private JLabel lbCantViaj;
    private JLabel lbIDTransporte;
    private JLabel lbIDHospedaje;
    private JLabel lbIDCrucero;
    private JLabel lbIDRentadora;
    private JLabel lbIDDestino;
    private JLabel lbIDLugar;
    private JLabel lbCostoPaq;

    private JTextField txIDPaq;
    private JTextField txTipPaq;
    private JTextField txClasPaq;
    private JTextField txCantViaj;
    
    private JComboBox cbIDTransporte;
    private JComboBox cbIDHospedaje;
    private JComboBox cbIDCrucero;
    private JComboBox cbIDRentadora;
    private JComboBox cbIDDestino;
    private JComboBox cbIDLugar;
    
    private JTextField txCostoPaq;

    private JButton back;
    private JButton Guardar;
    private JButton Borrar;
    private JButton Info;
    private int ver = 0;
    static String cbTra[]= new String[60];
    static String cbHos[]= new String[60];
    static String cbCru[]= new String[60];
    static String cbRen[]= new String[60];
    static String cbDes[]= new String[60];
    static String cbLug[]= new String[60];
     static String Fecha;
     int cont1=0;
    public NegocioSi() {
        setSize(920, 620);
        setTitle("Creacion De Paquetes");
        setLayout(null);
        setDefaultCloseOperation(NegocioSi.EXIT_ON_CLOSE);
        setResizable(false);
        for (int i = 0; i < 60; i++) {
            cbTra[i]=DatosT[i][4];
        }
        for (int i = 0; i < 60; i++) {
            cbHos[i]=DatosHO[i][3];
        }
        for (int i = 0; i < 60; i++) {
            cbCru[i]=DatosCR[i][5];
        }
        for (int i = 0; i < 60; i++) {
            cbRen[i]=DatosRA[i][6];
        }
        for (int i = 0; i < 60; i++) {
            cbDes[i]=DatosD[i][4];
        }
        for (int i = 0; i < 60; i++) {
            cbLug[i]=DatosLT[i][6];
        }
        
        
        
        lbIDPaq = new JLabel("ID Paq: ");
        lbTipPaq = new JLabel("Tipo Paq: ");
        lbClasPaq = new JLabel("Clasificacion: ");
        lbCantViaj = new JLabel("Cant Viajeros: ");
        lbIDTransporte = new JLabel("ID Transporte: ");
        lbIDHospedaje = new JLabel("ID Hospedaje: ");
        lbIDCrucero = new JLabel("ID Crucero: ");
        lbIDRentadora = new JLabel("ID Rentadora: ");
        lbIDDestino = new JLabel("ID Destino: ");
        lbIDLugar = new JLabel("ID Lugar: ");
        lbCostoPaq = new JLabel("Costo Paq: ");

        txIDPaq = new JTextField();
        txTipPaq = new JTextField();
        txClasPaq = new JTextField();
        txCantViaj = new JTextField();
        
        cbIDTransporte = new JComboBox(cbTra);
        cbIDHospedaje = new JComboBox(cbHos);
        cbIDCrucero = new JComboBox(cbCru);
        cbIDRentadora = new JComboBox(cbRen);
        cbIDDestino = new JComboBox(cbDes);
        cbIDLugar = new JComboBox(cbLug);
        
        txCostoPaq = new JTextField();

        back = new JButton("Atras");
        Guardar = new JButton("Crear");
        Borrar = new JButton("Eliminar");
        Info = new JButton("Informacion");
        
           Fondo = new JLabel();
        

        add(lbIDPaq);
        add(lbTipPaq);
        add(lbClasPaq);
        add(lbCantViaj);
        add(lbIDTransporte);
        add(lbIDHospedaje);
        add(lbIDCrucero);
        add(lbIDRentadora);
        add(lbIDDestino);
        add(lbIDLugar);
        add(lbCostoPaq);

        add(txIDPaq);
        add(txTipPaq);
        add(txClasPaq);
        add(txCantViaj);
        add(cbIDTransporte);
        add(cbIDHospedaje);
        add(cbIDCrucero);
        add(cbIDRentadora);
        add(cbIDDestino);
        add(cbIDLugar);
        add(txCostoPaq);

        add(Guardar);
        add(Borrar);
        add(back);
        add(Info);
        
        add(Fondo);//Agregar de Ultimo
        
        Fondo.setSize(920, 620);
        
        lbIDPaq.setForeground(Color.WHITE);
        lbTipPaq.setForeground(Color.WHITE);
        lbClasPaq .setForeground(Color.WHITE);
        lbCantViaj.setForeground(Color.WHITE);
        lbIDTransporte.setForeground(Color.WHITE);
        lbIDHospedaje .setForeground(Color.WHITE);
        lbIDCrucero .setForeground(Color.WHITE);
        lbIDRentadora.setForeground(Color.WHITE);
        lbIDDestino.setForeground(Color.WHITE);
        lbIDLugar .setForeground(Color.WHITE);
        lbCostoPaq.setForeground(Color.WHITE);

        lbIDPaq.reshape(20, 20, 100, 20);
        txIDPaq.reshape(130, 20, 100, 20);

        lbTipPaq.reshape(20, 60, 100, 20);
        txTipPaq.reshape(130, 60, 100, 20);

        lbClasPaq.reshape(20, 100, 100, 20);
        txClasPaq.reshape(130, 100, 100, 20);

        lbCantViaj.reshape(20, 140, 100, 20);
        txCantViaj.reshape(130, 140, 100, 20);

        lbIDTransporte.reshape(20, 180, 100, 20);
        cbIDTransporte.reshape(130, 180, 100, 20);

        lbIDHospedaje.reshape(20, 220, 100, 20);
        cbIDHospedaje.reshape(130, 220, 100, 20);

        lbIDCrucero.reshape(20, 260, 100, 20);
        cbIDCrucero.reshape(130, 260, 100, 20);

        lbIDRentadora.reshape(20, 300, 100, 20);
        cbIDRentadora.reshape(130, 300, 100, 20);

        lbIDDestino.reshape(20, 340, 100, 20);
        cbIDDestino.reshape(130, 340, 100, 20);

        lbIDLugar.reshape(20, 380, 100, 20);
        cbIDLugar.reshape(130, 380, 100, 20);

        lbCostoPaq.reshape(20, 420, 100, 20);
        txCostoPaq.reshape(130, 420, 100, 20);

        Info.reshape(260, 20, 150, 20);
        Guardar.reshape(20, 460, 100, 20);
        Borrar.reshape(140, 460, 100, 20);
        back.reshape(760, 460, 100, 20);
        
        ImageIcon imagen = new ImageIcon("src/proyecto2/ne.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();
        
        Info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                InfoActionPerformed(evt);
            }

            private void InfoActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {
                    if (txIDPaq.getText().equals(DatosP[i][7])) {
                        
                        
                        
                txTipPaq.setText(DatosP[i][0]);
                txCantViaj.setText(DatosP[i][1]);
                txClasPaq.setText(DatosP[i][2]);
                txCostoPaq.setText(DatosP[i][10]);
                        
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
                    if (DatosP[i][7] != null) {
                        ver++;
                    }
                }

                DatosP[ver][0] = txTipPaq.getText();
                DatosP[ver][1] = txCantViaj.getText();
                DatosP[ver][2] = txClasPaq.getText();
                DatosP[ver][3] = (String) cbIDCrucero.getSelectedItem();
                DatosP[ver][4] = (String) cbIDDestino.getSelectedItem();
                DatosP[ver][5] = (String) cbIDHospedaje.getSelectedItem();
                DatosP[ver][6] = (String) cbIDLugar.getSelectedItem();
                DatosP[ver][7] = txIDPaq.getText();
                DatosP[ver][8] = (String) cbIDRentadora.getSelectedItem();
                DatosP[ver][9] = (String) cbIDTransporte.getSelectedItem();
                DatosP[ver][10] = txCostoPaq.getText();

                
                JOptionPane.showMessageDialog(null, "Paquete Creado Correctamente" + ver);
                
                Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                
                for (int i = 0; i < 60; i++) {
                    if (PaqueteCreado[i][1] != null) {
                        cont1++;
                    }
                }
                
                
                PaqueteCreado[cont1][0]=Fecha;
                PaqueteCreado[cont1][1]=txIDPaq.getText();
                PaqueteCreado[cont1][2]= txTipPaq.getText();
                PaqueteCreado[cont1][3]= (String) cbIDTransporte.getSelectedItem();
                PaqueteCreado[cont1][4]= (String) cbIDHospedaje.getSelectedItem();
                PaqueteCreado[cont1][5]= (String) cbIDCrucero.getSelectedItem();
                PaqueteCreado[cont1][6]= (String) cbIDRentadora.getSelectedItem();
                PaqueteCreado[cont1][7]= (String) cbIDDestino.getSelectedItem();
                PaqueteCreado[cont1][8]= (String) cbIDLugar.getSelectedItem();
                PaqueteCreado[cont1][9]=  Integer.parseInt(txCostoPaq.getText());
                
                cont1=0;
ver = 0;


            }
        });
        
        
        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BorrarActionPerformed(evt);
            }

            private void BorrarActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 60; i++) {
                    if (DatosP[i][7].equals(txIDPaq.getText())) {
                        
                DatosP[i][0] = null;
                DatosP[i][1] = null;
                DatosP[i][2] = null;
                DatosP[i][3] = null;
                DatosP[i][4] = null;
                DatosP[i][5] = null;
                DatosP[i][6] = null;
                DatosP[i][7] = null;
                DatosP[i][8] = null;
                DatosP[i][9] = null;
                DatosP[i][10] = null;
                
                        
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
                Administrador A = new Administrador();
                A.setLocationRelativeTo(null);
                A.setVisible(true);
            }

        });

    }

}
