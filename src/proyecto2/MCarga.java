package proyecto2;

import Listas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static proyecto2.NegocioSi.Fecha;

public class MCarga extends MReservaciones {

    //  Aqui se Realizan las lecturas de los archivos 
    JLabel lbClientes;
    JLabel lbReservaciones;
    JLabel lbPaquetes;
    JLabel lbDestinoTur;
    JLabel lbLugaresEsp;
    JLabel lbTransportes;
    JLabel lbAsientos;
    JLabel lbHospedaje;
    JLabel lbHabitacion;
    JLabel lbCrucero;
    JLabel lbCamarot;
    JLabel lbRentaAuto;
    JLabel lbEntidad;

    JTextField txClientes;
    JTextField txReservaciones;
    JTextField txPaquetes;
    JTextField txDestinoTur;
    JTextField txLugaresEsp;
    JTextField txTransportes;
    JTextField txAsientos;
    JTextField txHospedaje;
    JTextField txHabitacion;
    JTextField txCrucero;
    JTextField txCamarot;
    JTextField txRentaAuto;
    JTextField txEntidad;

    JButton btCargar;
    JButton btCargar1;
    JButton btCargar2;
    JButton btCargar3;
    JButton btCargar4;
    JButton btCargar5;
    JButton btCargar6;
    JButton btCargar7;
    JButton btCargar8;
    JButton btCargar9;
    JButton btCargar10;
    JButton btCargar11;
    JButton btCargar12;
    JButton back;

    String url;
    ArrayList<Clientes> clientes = new ArrayList();
    ArrayList<Crucero> crucero = new ArrayList();
    ArrayList<Destino> destino = new ArrayList();
    ArrayList<Hospedaje> hospedajes = new ArrayList();
    ArrayList<LugaresTuristicos> lugTu = new ArrayList();
    ArrayList<Paquete> paq = new ArrayList();
    ArrayList<Transportes> transp = new ArrayList();
    ArrayList<Reservaciones> reserva = new ArrayList();
    ArrayList<Asientos> asiento = new ArrayList();
    ArrayList<Camarote> camarot = new ArrayList();
    ArrayList<RentaAut> renta = new ArrayList();
    ArrayList<EntidadFin> entidadfin = new ArrayList();
    ArrayList<Habitacion> habitacion = new ArrayList();

    int cont = 0;
    int aum = 0;

    public void MCarga() {
        setSize(920, 620);
        setTitle("Modulo de Carga");
        setLayout(null);
        setDefaultCloseOperation(MCarga.EXIT_ON_CLOSE);
        setResizable(false);

        lbClientes = new JLabel("Clientes: ");
        lbReservaciones = new JLabel("Reservaciones: ");
        lbPaquetes = new JLabel("Paquetes: ");
        lbDestinoTur = new JLabel("Destinos: ");
        lbLugaresEsp = new JLabel("Atractivos Tour: ");
        lbTransportes = new JLabel("Transportes: ");
        lbAsientos = new JLabel("Asientos: ");
        lbHospedaje = new JLabel("Hospedajes: ");
        lbHabitacion = new JLabel("Habitaciones: ");
        lbCrucero = new JLabel("Cruceros: ");
        lbCamarot = new JLabel("Camarotes: ");
        lbRentaAuto = new JLabel("Renta Autos: ");
        lbEntidad = new JLabel("Entidad Finan: ");

        txClientes = new JTextField();
        txReservaciones = new JTextField();
        txPaquetes = new JTextField();
        txDestinoTur = new JTextField();
        txLugaresEsp = new JTextField();
        txTransportes = new JTextField();
        txAsientos = new JTextField();
        txHospedaje = new JTextField();
        txHabitacion = new JTextField();
        txCrucero = new JTextField();
        txCamarot = new JTextField();
        txRentaAuto = new JTextField();
        txEntidad = new JTextField();

        btCargar = new JButton("Cargar");
        btCargar1 = new JButton("cargar");
        btCargar2 = new JButton("Cargar");
        btCargar3 = new JButton("cargar");
        btCargar4 = new JButton("Cargar");
        btCargar5 = new JButton("cargar");
        btCargar6 = new JButton("Cargar");
        btCargar7 = new JButton("cargar");
        btCargar8 = new JButton("Cargar");
        btCargar9 = new JButton("cargar");
        btCargar10 = new JButton("Cargar");
        btCargar11 = new JButton("cargar");
        btCargar12 = new JButton("Cargar");

        back = new JButton("Atras");

        add(lbClientes);
        add(lbReservaciones);
        add(lbPaquetes);
        add(lbDestinoTur);
        add(lbLugaresEsp);
        add(lbTransportes);
        add(lbAsientos);
        add(lbHospedaje);
        add(lbHabitacion);
        add(lbCrucero);
        add(lbCamarot);
        add(lbRentaAuto);
        add(lbEntidad);

        add(txClientes);
        add(txReservaciones);
        add(txPaquetes);
        add(txDestinoTur);
        add(txLugaresEsp);
        add(txTransportes);
        add(txAsientos);
        add(txHospedaje);
        add(txHabitacion);
        add(txCrucero);
        add(txCamarot);
        add(txRentaAuto);
        add(txEntidad);

        add(btCargar);
        add(btCargar1);
        add(btCargar2);
        add(btCargar3);
        add(btCargar4);
        add(btCargar5);
        add(btCargar6);
        add(btCargar7);
        add(btCargar8);
        add(btCargar9);
        add(btCargar10);
        add(btCargar11);
        add(btCargar12);

        add(back);

        lbClientes.reshape(20, 20, 150, 20);
        txClientes.reshape(160, 20, 600, 20);
        btCargar.reshape(800, 20, 100, 20);

        lbReservaciones.reshape(20, 60, 150, 20);
        txReservaciones.reshape(160, 60, 600, 20);
        btCargar1.reshape(800, 60, 100, 20);

        lbPaquetes.reshape(20, 100, 150, 20);
        txPaquetes.reshape(160, 100, 600, 20);
        btCargar2.reshape(800, 100, 100, 20);

        lbDestinoTur.reshape(20, 140, 150, 20);
        txDestinoTur.reshape(160, 140, 600, 20);
        btCargar3.reshape(800, 140, 100, 20);

        lbLugaresEsp.reshape(20, 180, 150, 20);
        txLugaresEsp.reshape(160, 180, 600, 20);
        btCargar4.reshape(800, 180, 100, 20);

        lbTransportes.reshape(20, 220, 150, 20);
        txTransportes.reshape(160, 220, 600, 20);
        btCargar5.reshape(800, 220, 100, 20);

        lbAsientos.reshape(20, 260, 150, 20);
        txAsientos.reshape(160, 260, 600, 20);
        btCargar6.reshape(800, 260, 100, 20);

        lbHospedaje.reshape(20, 300, 150, 20);
        txHospedaje.reshape(160, 300, 600, 20);
        btCargar7.reshape(800, 300, 100, 20);

        lbHabitacion.reshape(20, 340, 150, 20);
        txHabitacion.reshape(160, 340, 600, 20);
        btCargar8.reshape(800, 340, 100, 20);

        lbCrucero.reshape(20, 380, 150, 20);
        txCrucero.reshape(160, 380, 600, 20);
        btCargar9.reshape(800, 380, 100, 20);

        lbCamarot.reshape(20, 420, 150, 20);
        txCamarot.reshape(160, 420, 600, 20);
        btCargar10.reshape(800, 420, 100, 20);

        lbRentaAuto.reshape(20, 460, 150, 20);
        txRentaAuto.reshape(160, 460, 600, 20);
        btCargar11.reshape(800, 460, 100, 20);

        lbEntidad.reshape(20, 500, 150, 20);
        txEntidad.reshape(160, 500, 600, 20);
        btCargar12.reshape(800, 500, 100, 20);

        back.reshape(120, 530, 100, 20);

        btCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargarActionPerformed(evt);
            }

            private void btCargarActionPerformed(ActionEvent evt) {

                Clientes();
                setVisible(false);
                setVisible(true);

            }

        });

        btCargar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar1ActionPerformed(evt);
            }

            private void btCargar1ActionPerformed(ActionEvent evt) {

                Reservaciones();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar2ActionPerformed(evt);
            }

            private void btCargar2ActionPerformed(ActionEvent evt) {

                Paquetes();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar3ActionPerformed(evt);
            }

            private void btCargar3ActionPerformed(ActionEvent evt) {

                DestinoTur();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar4ActionPerformed(evt);
            }

            private void btCargar4ActionPerformed(ActionEvent evt) {

                LugaresEsp();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar5ActionPerformed(evt);
            }

            private void btCargar5ActionPerformed(ActionEvent evt) {

                Transportes();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar6ActionPerformed(evt);
            }

            private void btCargar6ActionPerformed(ActionEvent evt) {
                Asiento();

                setVisible(false);
                setVisible(true);
            }

        });

        btCargar7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar7ActionPerformed(evt);
            }

            private void btCargar7ActionPerformed(ActionEvent evt) {

                Hospedaj();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar8ActionPerformed(evt);
            }

            private void btCargar8ActionPerformed(ActionEvent evt) {
                Habitacion();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar9ActionPerformed(evt);
            }

            private void btCargar9ActionPerformed(ActionEvent evt) {

                Cruser();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar10ActionPerformed(evt);
            }

            private void btCargar10ActionPerformed(ActionEvent evt) {

                Camarot();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar11ActionPerformed(evt);
            }

            private void btCargar11ActionPerformed(ActionEvent evt) {

                RentaAuto();
                setVisible(false);
                setVisible(true);
            }

        });

        btCargar12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btCargar12ActionPerformed(evt);
            }

            private void btCargar12ActionPerformed(ActionEvent evt) {

                EntidadFinanciera();

                setVisible(false);
                setVisible(true);
            }

        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                Administrador ADM = new Administrador();
                ADM.setVisible(true);

            }

        });

    }
IngresoSistema IS = new IngresoSistema();
//Listo
private String Fecha;
private String Hora;
private String Nomb;
    int contador=0;
    public void Clientes() {
        
        String URL = "";

        if (txClientes.getText() != null) {
            URL = txClientes.getText();
            
        }
        
        
        Nomb = "Datos de clientes";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String id = datos[0];
                String Nombres = datos[1];
                String Apellido = datos[2];
                String Tarjeta = datos[3];
                String Movil = datos[4];
                String Tel = datos[5];
                String Nac = datos[6];
                String Residencia = datos[7];
                String Frec = datos[8];
                String ClacifMonto = datos[9];

                clientes.add(new Clientes(id, Nombres, Apellido, Tarjeta, Movil, Tel, Nac, Residencia, Frec, ClacifMonto));

                Clientes C = new Clientes(id, Nombres, Apellido, Tarjeta, Movil, Tel, Nac, Residencia, Frec, ClacifMonto);

                for (int i = 0; i < 60; i++) {
                    if (DatosC[i][3] != null) {
                        cont++;
                    }
                }

                DatosC[cont][1] = C.getNombre();
                DatosC[cont][2] = C.getApellido();
                DatosC[cont][3] = C.getId();
                DatosC[cont][4] = C.getTarjeta();
                DatosC[cont][5] = C.getNac();
                DatosC[cont][6] = C.getTel();
                DatosC[cont][7] = C.getMovil();
                DatosC[cont][8] = C.getResidencia();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Fin Listo
    public void Reservaciones() {

        String URL = "";

        if (txReservaciones.getText() != null) {
            URL = txReservaciones.getText();

        }
        
        
        Nomb = "Datos de las Reservaciones.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        
        
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idRes = datos[0];
                String idPaq = datos[1];
                String idCli = datos[2];
                String FechaIn = datos[3];
                String FechaOut = datos[4];
                String CantDias = datos[5];
                String EstadoRes = datos[6];
                String SaldoPend = datos[7];

                reserva.add(new Reservaciones(idRes, idPaq, idCli, FechaIn, FechaOut, CantDias, EstadoRes, SaldoPend));

                Reservaciones R = new Reservaciones(idRes, idPaq, idCli, FechaIn, FechaOut, CantDias, EstadoRes, SaldoPend);

                for (int i = 0; i < 60; i++) {
                    if (DatosR[i][0] != null) {
                        cont++;
                    }
                }
                DatosR[cont][0] = R.getReIDRes();
                DatosR[cont][1] = R.getReIDPaq();
                DatosR[cont][2] = R.getReCantDias();
                DatosR[cont][3] = R.getReIDCli();
                DatosR[cont][4] = R.getReFechaIn();
                DatosR[cont][5] = R.getReFechaOut();
                DatosR[cont][6] = R.getReEstadoRes();
                DatosR[cont][7] = R.getReSaldoPendiente();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void Paquetes() {

        String URL = null;

        if (txPaquetes.getText() != null) {
            URL = txPaquetes.getText();

        }
        
        
        
        
        Nomb = "Datos de los Paquetes.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idPaq = datos[0];
                String tipoPaq = datos[1];
                String clasifPaq = datos[2];
                String cantViajers = datos[3];
                String idTrans = datos[4];
                String idHospedaje = datos[5];
                String idCrucero = datos[6];
                String idRentadora = datos[7];
                String idDestino = datos[8];
                String idLugar = datos[9];
                String montoPaq = datos[10];

                paq.add(new Paquete(idPaq, tipoPaq, clasifPaq, cantViajers, idTrans, idHospedaje, idCrucero, idRentadora, idDestino, idLugar, montoPaq));
                Paquete P = new Paquete(idPaq, tipoPaq, clasifPaq, cantViajers, idTrans, idHospedaje, idCrucero, idRentadora, idDestino, idLugar, montoPaq);

                for (int i = 0; i < 60; i++) {
                    if (DatosP[i][7] != null) {
                        cont++;
                    }
                }
                DatosP[cont][0] = P.getTipoPaq();
                DatosP[cont][1] = P.getCantViajeros();
                DatosP[cont][2] = P.getClasifPaq();
                DatosP[cont][3] = P.getIDCrucero();
                DatosP[cont][4] = P.getIDDestino();
                DatosP[cont][5] = P.getIDHospedaje();
                DatosP[cont][6] = P.getIDLugar();
                DatosP[cont][7] = P.getIDPaquete();
                DatosP[cont][8] = P.getIDRentadora();
                DatosP[cont][9] = P.getIDTransporte();
                DatosP[cont][10] = P.getMontoPaq();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void DestinoTur() {
        String URL = null;

        if (txDestinoTur.getText() != null) {
            URL = txDestinoTur.getText();

        }
        
        
        Nomb = "Datos de Los Destinos Turisticos.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        
        
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idDestino = datos[0];
                String pais = datos[1];
                String ciudad = datos[2];
                String direccion = datos[3];
                String nomDestino = datos[4];
                String DescripDestino = datos[5];
                String MedidSeguridad = datos[6];

                destino.add(new Destino(idDestino, pais, ciudad, direccion, nomDestino, DescripDestino, MedidSeguridad));
                Destino D = new Destino(idDestino, pais, ciudad, direccion, nomDestino, DescripDestino, MedidSeguridad);

                for (int i = 0; i < 60; i++) {
                    if (DatosD[i][4] != null) {
                        cont++;
                    }
                }

                DatosD[cont][0] = D.getCiudad();
                DatosD[cont][1] = D.getDescMedidasSeguridad();
                DatosD[cont][2] = D.getDescripcionDestino();
                DatosD[cont][3] = D.getDireccion();
                DatosD[cont][4] = D.getIDDestino();
                DatosD[cont][5] = D.getNombreDestino();
                DatosD[cont][6] = D.getPais();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void LugaresEsp() {
        String URL = null;

        if (txLugaresEsp.getText() != null) {
            URL = txLugaresEsp.getText();

        }
        
        
        
        Nomb = "Datos de los Lugares de Espectaculo y Entretenimiento.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idLugar = datos[0];
                String nombreLugar = datos[1];
                String DescLugar = datos[2];
                String pais = datos[3];
                String ciudad = datos[4];
                String direccion = datos[5];
                String limitEdad = datos[6];
                String horIniActiv = datos[7];
                String horfun = datos[8];
                String recomSeguridad = datos[9];
                String idDestino = datos[10];

                lugTu.add(new LugaresTuristicos(idLugar, nombreLugar, DescLugar, pais, ciudad, direccion, limitEdad, horIniActiv, horfun, recomSeguridad, idDestino));

                LugaresTuristicos LT = new LugaresTuristicos(idLugar, nombreLugar, DescLugar, pais, ciudad, direccion, limitEdad, horIniActiv, horfun, recomSeguridad, idDestino);

                for (int i = 0; i < 60; i++) {
                    if (DatosLT[i][6] != null) {
                        cont++;
                    }
                }

                DatosLT[cont][0] = LT.getCiudad();
                DatosLT[cont][1] = LT.getDescripcionLugar();
                DatosLT[cont][2] = LT.getDireccion();
                DatosLT[cont][3] = LT.getHorFunciones();
                DatosLT[cont][4] = LT.getHorInicActiv();
                DatosLT[cont][5] = LT.getIDDestino();
                DatosLT[cont][6] = LT.getIDLugar();
                DatosLT[cont][7] = LT.getLimitEdadPerm();
                DatosLT[cont][8] = LT.getNombreLugar();
                DatosLT[cont][9] = LT.getPais();
                DatosLT[cont][10] = LT.getRecomendacionSeguridad();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Transportes() {

        String URL = null;

        if (txTransportes.getText() != null) {
            URL = txTransportes.getText();

        }
        
        
        Nomb = "Datos de los Transportes.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idTransporte = datos[0];
                String horaSalida = datos[1];
                String horaLlegada = datos[2];
                String capacidadPasajeros = datos[3];
                String idDestino = datos[4];

                transp.add(new Transportes(idTransporte, horaSalida, horaLlegada, capacidadPasajeros, idDestino));

                Transportes T = new Transportes(idTransporte, horaSalida, horaLlegada, capacidadPasajeros, idDestino);

                for (int i = 0; i < 60; i++) {
                    if (DatosT[i][4] != null) {
                        cont++;
                    }
                }

                DatosT[cont][0] = T.getCapacidaPasajeros();
                DatosT[cont][1] = T.getHoraLLegada();
                DatosT[cont][2] = T.getHoraSalida();
                DatosT[cont][3] = T.getIDDestino();
                DatosT[cont][4] = T.getIDTransporte();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Asiento() {

        String URL = null;

        if (txAsientos.getText() != null) {
            URL = txAsientos.getText();

        }
        
        
        Nomb = "Datos de Los Asientos de los Transportes.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idTransporte = datos[0];
                String idReservacion = datos[1];
                String asientoViajero = datos[2];
                String claseAsiento = datos[3];
                String costoPasaje = datos[4];

                asiento.add(new Asientos(idTransporte, idReservacion, asientoViajero, claseAsiento, costoPasaje));

                Asientos AS = new Asientos(idTransporte, idReservacion, asientoViajero, claseAsiento, costoPasaje);

                for (int i = 0; i < 60; i++) {
                    if (DatosAS[i][4] != null) {
                        cont++;
                    }
                }

                DatosAS[cont][0] = AS.getAsientoViajero();
                DatosAS[cont][1] = AS.getClaseAsiento();
                DatosAS[cont][2] = AS.getCostoPasaje();
                DatosAS[cont][3] = AS.getIDReservacion();
                DatosAS[cont][4] = AS.getIDtransporte();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Hospedaj() {

        String URL = null;

        if (txHospedaje.getText() != null) {
            URL = txHospedaje.getText();

        }
        
        
        Nomb = "Datos de los Hoteles.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idHospedaje = datos[0];
                String direccion = datos[1];
                String cantCuartDisp = datos[2];
                String idDestino = datos[3];

                hospedajes.add(new Hospedaje(idHospedaje, direccion, cantCuartDisp, idDestino));
                Hospedaje HO = new Hospedaje(idHospedaje, direccion, cantCuartDisp, idDestino);

                for (int i = 0; i < 60; i++) {
                    if (DatosHO[i][3] != null) {
                        cont++;
                    }
                }

                DatosHO[cont][0] = HO.getCantCuartDisp();
                DatosHO[cont][1] = HO.getDireccion();
                DatosHO[cont][2] = HO.getIDDestino();
                DatosHO[cont][3] = HO.getIDHospedaje();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Habitacion() {
        String URL = null;

        if (txHabitacion.getText() != null) {
            URL = txHabitacion.getText();

        }
        
        Nomb = "Datos de Habitaciones de los Hoteles.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idHospedaje = datos[0];
                String noHabitacion = datos[1];
                String idReservacion = datos[2];
                String cantPersxHabit = datos[3];
                String costoHabt = datos[4];
                String claseHabit = datos[5];

                habitacion.add(new Habitacion(idHospedaje, noHabitacion, idReservacion, cantPersxHabit, costoHabt, claseHabit));

                Habitacion HA = new Habitacion(idHospedaje, noHabitacion, idReservacion, cantPersxHabit, costoHabt, claseHabit);

                for (int i = 0; i < 60; i++) {
                    if (DatosHA[i][3] != null) {
                        cont++;
                    }
                }
                DatosHA[cont][0] = HA.getCantPersonasxHabit();
                DatosHA[cont][1] = HA.getClaseHabit();
                DatosHA[cont][2] = HA.getCostoHabitacion();
                DatosHA[cont][3] = HA.getIDHospedaje();
                DatosHA[cont][4] = HA.getIDReservacion();
                DatosHA[cont][5] = HA.getNoHabitacion();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Cruser() {
        String URL = null;

        if (txCrucero.getText() != null) {
            URL = txCrucero.getText();

        }
        
        
        Nomb = "Datos de los Cruceros.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idCrucero = datos[0];
                String fechaSalida = datos[1];
                String fechaLlegada = datos[2];
                String capaPasajeros = datos[3];
                String duracionCrucero = datos[4];
                String condicion = datos[5];
                String idDestino = datos[6];

                crucero.add(new Crucero(idCrucero, fechaSalida, fechaLlegada, capaPasajeros, duracionCrucero, condicion, idDestino));

                Crucero CR = new Crucero(idCrucero, fechaSalida, fechaLlegada, capaPasajeros, duracionCrucero, condicion, idDestino);

                for (int i = 0; i < 60; i++) {
                    if (DatosCR[i][5] != null) {
                        cont++;
                    }
                }

                DatosCR[cont][0] = CR.getCapacidadPasajeros();
                DatosCR[cont][1] = CR.getCondicion();
                DatosCR[cont][2] = CR.getDuracionCrucero();
                DatosCR[cont][3] = CR.getFechaLLegada();
                DatosCR[cont][4] = CR.getFechaSalida();
                DatosCR[cont][5] = CR.getIDCrucero();
                DatosCR[cont][6] = CR.getIDDestino();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Camarot() {
        String URL = null;

        if (txCamarot.getText() != null) {
            URL = txCamarot.getText();

        }
        
        
        Nomb = "Datos de los camarotes de cada crucero.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idCrucero = datos[0];
                String idReservacion = datos[1];
                String habitacionPasajero = datos[2];
                String costoPasaje = datos[3];

                camarot.add(new Camarote(idCrucero, idReservacion, habitacionPasajero, costoPasaje));

                Camarote CT = new Camarote(idCrucero, idReservacion, habitacionPasajero, costoPasaje);

                for (int i = 0; i < 60; i++) {
                    if (DatosCT[i][2] != null) {
                        cont++;
                    }
                }

                DatosCT[cont][0] = CT.getCostoPasaje();
                DatosCT[cont][1] = CT.getHabitacionPasajero();
                DatosCT[cont][2] = CT.getIDCrucero();
                DatosCT[cont][3] = CT.getIDReservacion();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void RentaAuto() {
        String URL = null;

        if (txRentaAuto.getText() != null) {
            URL = txRentaAuto.getText();

        }
        
        
        Nomb = "Datos De Renta Autos.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idEmpresaRent = datos[0];
                String idCliente = datos[1];
                String cantPasajero = datos[2];
                String tipoTerreno = datos[3];
                String diasAutilizar = datos[4];
                String montoTot = datos[5];
                String fechaEntrega = datos[6];
                String fechaDevol = datos[7];
                String condiciones = datos[8];

                renta.add(new RentaAut(idEmpresaRent, idCliente, cantPasajero, tipoTerreno, diasAutilizar, montoTot, fechaEntrega, fechaDevol, condiciones));

                RentaAut RA = new RentaAut(idEmpresaRent, idCliente, cantPasajero, tipoTerreno, diasAutilizar, montoTot, fechaEntrega, fechaDevol, condiciones);

                for (int i = 0; i < 60; i++) {
                    if (DatosRA[i][3] != null) {
                        cont++;
                    }
                }
                DatosRA[cont][0] = RA.getCantPasajero();
                DatosRA[cont][1] = RA.getCondiciones();
                DatosRA[cont][2] = RA.getDiasAutilizar();
                DatosRA[cont][3] = RA.getFechaDevol();
                DatosRA[cont][4] = RA.getFechaEntreg();
                DatosRA[cont][5] = RA.getIDCliente();
                DatosRA[cont][6] = RA.getIDEmpresaRenta();
                DatosRA[cont][7] = RA.getMontoTot();
                DatosRA[cont][8] = RA.getTipoTerreno();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void EntidadFinanciera() {
        String URL = null;

        if (txEntidad.getText() != null) {
            URL = txEntidad.getText();

        }
        
        
        Nomb = "Datos de Entidades Financieras.";
        
        Calendar fecha = new GregorianCalendar();
                int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hor=fecha.get(Calendar.HOUR);
                int min= fecha.get(Calendar.MINUTE);
                
                Fecha =Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(año);
                Hora =Integer.toString(hor)+":"+Integer.toString(min);
        
        for (int i = 0; i < 10; i++) {
            if (DatosCarga[i][0]!=null) {
                contador++;
            }
            
        }
        
        DatosCarga[contador][0]=IS.Usuario.getText();
        DatosCarga[contador][1]= Nomb;
        DatosCarga[contador][2]=URL;
        DatosCarga[contador][3]= Fecha;
        DatosCarga[contador][4]= Hora;
        
        
        contador=0;
        
         
        

        String csvFile = URL;
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");

                String idEntidad = datos[0];
                String idCliente = datos[1];
                String tipoTarj = datos[2];
                String codigoTarj = datos[3];
                String saldo = datos[4];
                String montoMax = datos[5];

                entidadfin.add(new EntidadFin(idEntidad, idCliente, tipoTarj, codigoTarj, saldo, montoMax));

                EntidadFin E = new EntidadFin(idEntidad, idCliente, tipoTarj, codigoTarj, saldo, montoMax);

                for (int i = 0; i < 60; i++) {
                    if (DatosE[i][2] != null) {
                        cont++;
                    }
                }
                DatosE[cont][0] = E.getCodigoTarj();
                DatosE[cont][1] = E.getIDCliente();
                DatosE[cont][2] = E.getIDEntidad();
                DatosE[cont][3] = E.getMontoMax();
                DatosE[cont][4] = E.getSaldo();
                DatosE[cont][5] = E.getTipoTarj();

                cont++;
                cont = 0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
