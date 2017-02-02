
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simeon
 */
public final class Declaration extends JFrame {

    private String AddressFrom;
    private String AddressTo;
    private boolean InternationalTransport;
    private String CountryFrom;
    private String CountryTo;
    private String CargoType;
    private Integer Quantity;
    private Double GrossWeight;
    private String TransportType;
    private boolean CapeGoodHope;
    private String Consignee;

    public boolean isInternationalTransport() {
        return InternationalTransport;
    }

    public String getCountryFrom() {
        return CountryFrom;
    }

    public String getCountryTo() {
        return CountryTo;
    }

    public String getCargoType() {
        return CargoType;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public Double getGrossWeight() {
        return GrossWeight;
    }

    public String getTransportType() {
        return TransportType;
    }

    public boolean isCapeGoodHope() {
        return CapeGoodHope;
    }

    public String getConsignee() {
        return Consignee;
    }

    public void setInternationalTransport(boolean InternationalTransport) {
        this.InternationalTransport = InternationalTransport;
    }

    public void setCountryFrom(String CountryFrom) {
        this.CountryFrom = CountryFrom;
    }

    public void setCountryTo(String CountryTo) {
        this.CountryTo = CountryTo;
    }

    public void setCargoType(String CargoType) {
        this.CargoType = CargoType;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public void setGrossWeight(Double GrossWeight) {
        this.GrossWeight = GrossWeight;
    }

    public void setTransportType(String TransportType) {
        this.TransportType = TransportType;
    }

    public void setCapeGoodHope(boolean CapeGoodHope) {
        this.CapeGoodHope = CapeGoodHope;
    }

    public void setConsignee(String Consignee) {
        this.Consignee = Consignee;
    }
    

    public String getAddressFrom() {
        return AddressFrom;
    }

    public String getAddressTo() {
        return AddressTo;
    }

    public void setAddressFrom(String AddressFrom) {
        this.AddressFrom = AddressFrom;
    }

    public void setAddressTo(String AddressTo) {
        this.AddressTo = AddressTo;
    }
    
    
  private final JTextArea jtaAddressFrom;
  private final JTextArea jtaAddressTo = new JTextArea(6, 15);
   private JComboBox jcboCargoType = new JComboBox(new String[] {
    "set", "Gross Weight exceeds value" } );
  private final JTextField jtfQuantity = new JTextField();
  private final JTextField jtfGrossWeight = new JTextField();
  private final JTextField jtfConsignee = new JTextField();
  private final JButton jbtCalculateRisk = new JButton("Calculate Risk score");
  private JLabel jlblStatus = new JLabel();
  
  
  public Declaration() {
        this.jtaAddressFrom = new JTextArea(6, 15);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    
    JPanel jPanel2_0 = new JPanel();
    JPanel jPanel2_1 = new JPanel();
    JPanel jPanel2_2 = new JPanel();
    JPanel jPanel2_2_countryFrom = new JPanel();
    JPanel jPanel2_2_countryTo = new JPanel();
    JPanel jPanel_TransportType = new JPanel();
    
    jPanel_TransportType.setLayout(new FlowLayout());
    
    final JRadioButton radLand = new JRadioButton("Land", true);
    final JRadioButton radAir = new JRadioButton("Air");
    final JRadioButton radSea = new JRadioButton("Sea");
    final JCheckBox jcbCapeGoodHope = new JCheckBox("Cape Good Hope");
               
    ButtonGroup group = new ButtonGroup();
      
    group.add(radLand);
    group.add(radAir);
    group.add(radSea);
      
       jPanel_TransportType.add(radLand);
       jPanel_TransportType.add(radAir);
       jPanel_TransportType.add(radSea);
       jPanel_TransportType.add(jcbCapeGoodHope);
       
       jcbCapeGoodHope.setEnabled(false);
       jcbCapeGoodHope.setSelected(false);
       
       
       if (radLand.isSelected()) {setTransportType("Land");}
       else if (radAir.isSelected()) {setTransportType("Air");}
       else {setTransportType("Sea");}
       
    JCheckBox jcbInternational = new JCheckBox("International", true);
    JComboBox countryFrom=new JComboBox(getAllCountries());
    JComboBox countryTo=new JComboBox(getAllCountries());
    
    jPanel2_0.setBorder(new TitledBorder("Address FROM:"));
  //  jPanel2_0.add(jPanel1, BorderLayout.NORTH);
    jPanel2_0.add(new JScrollPane(jtaAddressFrom));

    jPanel2_1.setBorder(new TitledBorder("Address TO:"));
  //  jPanel2_0.add(jPanel1, BorderLayout.NORTH);
    jPanel2_1.add(new JScrollPane(jtaAddressTo));
    
    jPanel2_2.setLayout(new BorderLayout());
    jPanel2_2.setBorder(new TitledBorder("Local/International Transport:"));
  //  jPanel2_0.add(jPanel1, BorderLayout.NORTH);
    jPanel2_2.add(jcbInternational, BorderLayout.NORTH);
    
    jPanel2_2_countryFrom.add(new JLabel("Country From:") );
    jPanel2_2_countryFrom.add(countryFrom);
    
    jPanel2_2_countryTo.add(new JLabel("Country To:") );
    jPanel2_2_countryTo.add(countryTo);
    
    jcbInternational.setEnabled(true);
    jPanel2_2_countryFrom.setEnabled(false);
    jPanel2_2_countryTo.setEnabled(false);
    
    jPanel2_2.add(jPanel2_2_countryFrom, BorderLayout.CENTER);
    jPanel2_2.add(jPanel2_2_countryTo, BorderLayout.SOUTH);
    
    jPanel2.add(jPanel2_0, BorderLayout.NORTH);
    jPanel2.add(jPanel2_1, BorderLayout.CENTER);
    jPanel2.add(jPanel2_2, BorderLayout.SOUTH);
    
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(5, 0));
    jPanel3.add(new JLabel("Cargo Type"));
    jPanel3.add(new JLabel("Quantity"));
    jPanel3.add(new JLabel("Gross Weight (Kg)"));
    jPanel3.add(new JLabel("Transport type:"));
    jPanel3.add(new JLabel("Consignee"));

    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(5, 0));
    jcboCargoType.setEditable(true);
    jPanel4.add(jcboCargoType);
    jtfQuantity.setEditable(true);
    jPanel4.add(jtfQuantity);
    jPanel4.add(jtfGrossWeight);
    jPanel4.add(jPanel_TransportType);
    jPanel4.add(jtfConsignee);

    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    jPanel5.setBorder(new TitledBorder("Declaration Master data"));
    jPanel5.add(jbtCalculateRisk, BorderLayout.SOUTH);
    jPanel5.add(jPanel3, BorderLayout.WEST);
    jPanel5.add(jPanel4, BorderLayout.CENTER);

    add(jlblStatus, BorderLayout.SOUTH);
    add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
      jPanel2, jPanel5), BorderLayout.CENTER);
    
    setInternationalTransport(true);
    setCountryFrom("Greece");       // Initialize Country From, in Address
    setCountryTo("Denmark");      // Initialize Country To, in Address
    setQuantity(1);
    setCargoType("set");
   setTransportType("Land");
   
  jtfQuantity.setText("1");
  jtfGrossWeight.setText("10");
  jtfConsignee.setText("Intrasoft International");
  
   jtaAddressFrom.setText("19km Markopoulou-Paianias Ave.\nPaiania, GR. 19002");
   jtaAddressTo.setText("3 Varvaki Str.\nThessaloniki, GR. 54633");
   
    if (jcbInternational.isSelected()) {
        countryFrom.setEnabled(true);
        countryTo.setEnabled(true);
    }
        
     jcbInternational.addItemListener( new ItemListener() {
         
         @Override
         public void itemStateChanged(ItemEvent e) {         
            if (e.getStateChange() == 1) {
                setInternationalTransport(true);
                countryFrom.setEnabled(true);
                countryTo.setEnabled(true);
            } else {              
                    setInternationalTransport(false);
                    countryFrom.setEnabled(false);
                    countryTo.setEnabled(false);  
            }          
         }           
      } );
     
     radSea.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {             
            if (e.getStateChange()== 1)  {
                    setTransportType("Sea");
                    jcbCapeGoodHope.setEnabled(true);
            } else {
                jcbCapeGoodHope.setEnabled(false);
                jcbCapeGoodHope.setSelected(false);
            }            
         }
     });           
     
     radLand.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {             
            if (e.getStateChange()== 1)  {
                setTransportType("Land");
               }     
         }
     });           
     
     radAir.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {             
            if (e.getStateChange()== 1)  {
            setTransportType("Air");
            }     
         }
     });           
     
     jcbCapeGoodHope.addItemListener( new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {         
            if (e.getStateChange() == 1) {
                setCapeGoodHope(true);
            } else {              
               setCapeGoodHope(false);
            }          
         }           
      } );
     
     countryFrom.addActionListener( new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
       if (countryFrom.getSelectedItem().toString() != null)
    setCountryFrom(countryFrom.getSelectedItem().toString());
    }
} );
     
    countryTo.addActionListener( new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
       if (countryTo.getSelectedItem().toString() != null)
    setCountryTo(countryTo.getSelectedItem().toString());
    }
} );
    
    jcboCargoType.addActionListener( new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
       if (jcboCargoType.getSelectedItem().toString() != null)
    setCargoType(jcboCargoType.getSelectedItem().toString());
    }
} );
      
    jbtCalculateRisk.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        try {
          calculateRiskScore();
        }
        catch (Exception ex) {
          jlblStatus.setText(ex.toString());
        }
      }
    });
  }
  
        public String[] getAllCountries() {
            String[] countries = new String[Locale.getISOCountries().length];
            String[] countryCodes = Locale.getISOCountries();
            for (int i = 0; i < countryCodes.length; i++) {
                Locale obj = new Locale("", countryCodes[i]);
                countries[i] = obj.getDisplayCountry();
            }
            return countries;
         }
        
  
  private void calculateRiskScore() throws Exception {
   double internationalFactor;
   
   System.out.println("-----------LOG OUTPUT---------------------------");
// Start Logging Form Values 
    setAddressFrom(jtaAddressFrom.getText());       // Adress From
    System.out.println("FROM: " + jtaAddressFrom.getText());
    
     setAddressTo(jtaAddressTo.getText());          // Address To
    System.out.println("TO: " + jtaAddressTo.getText());
    
    
    if (isInternationalTransport()) {               // International Transport
        System.out.println("This is an International Transport Shipment");
         internationalFactor = 2;
    }
    else {                                       // Local/National Transport
        System.out.println("This is a National/Local Transport Shipment");
        internationalFactor = 1;
    }
    
    System.out.println("Country From = " + getCountryFrom());    // Country From
    System.out.println("Country To = " + getCountryTo());        // Country To
    System.out.println("Cargo Type = " + getCargoType());        // Cargo Type
    
    setQuantity( Integer.valueOf(jtfQuantity.getText()) );
    setGrossWeight( Double.valueOf(jtfGrossWeight.getText()) );
    setConsignee( jtfConsignee.getText() );
    
    System.out.println("Quantity = " + jtfQuantity.getText());        // Quantity
    System.out.println("Gross Weight = " + jtfGrossWeight.getText()); // Gross Weight
    System.out.println("Consignee = " + jtfConsignee.getText());    // Consignee
    System.out.println("TransportType = " + getTransportType());    // TransportType
    Double weight;
    
    if (isCapeGoodHope()) {               // International Transport
        System.out.println("Ship route goes South of Africa (Cape Good Hope)");
        weight = getGrossWeight();
    }
    else {                                       // Local/National Transport
        System.out.println("Ship route does NOT go South of Africa (Cape Good Hope)");
        weight = getGrossWeight() - 0.15 * getGrossWeight();       // Net Weight
    }
        double transportTypeFactor;
    
    if (null == getTransportType()) transportTypeFactor=1.2;
    else switch (getTransportType()) {
            case "Land":
                transportTypeFactor=1;
                break;
            case "Air":
                transportTypeFactor=1.6;
                break;
            default:
                transportTypeFactor=1.2;
                break;
        }

// This calculation here is random and superficial, do not have info yet how to calculate this score factor
// Just came up with a formula to do something
    double riskScore = weight * getQuantity() * internationalFactor * transportTypeFactor;
        System.out.println("Final Risk Score for this Declarations is: " + String.valueOf(riskScore));
  }

    public static void main(String args[]) {
    JFrame frame = new Declaration();
    frame.setTitle("Declaration");
    frame.setSize(700, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

    

