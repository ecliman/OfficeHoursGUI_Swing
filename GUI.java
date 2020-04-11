//////////////////////////////////////////////////////////////////////
//                                                                  //
//     															    //
//		OPTION 1 IS STORED IN VARIABLE R							//
//		OPTION2 OID STORED IN VARIABLE opt2                 		//          
//		OPTION 2 StuNumber STORED IN VARIABLE opt2ID				//
//////////////////////////////////////////////////////////////////////
package mainprogram;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
  private static JFrame     frame;
  private static JPanel     panel;
  private static JButton    btnSubmitDelete;
  private static JButton    btnSubmitBook;
  private static JLabel     lbResult;
  private static JTextField tfInput;
  private static  JTextField option2;
  private static JTextField option2ID;
  private static JLabel     option2Result;
  private static JLabel option2Label;
  private static JLabel option1Label;
  private static JLabel     stuIDopt2;
 

  // Constructor
  public GUI() {
    // Create the textfield to read input
    tfInput = new JTextField( 30 );
    tfInput.setBounds( 10, 50, 240, 20 );
    option2 = new JTextField( 30 );
    option2.setBounds( 10, 130, 240, 20 );
    option2ID = new JTextField( 30 );
    option2ID.setBounds( 10, 180, 240, 20 );
    
    

    // Create the button to submit the value
    btnSubmitDelete = new JButton( "Submit" );
    btnSubmitDelete.addActionListener( new btnSubmitAction( this ) );
    btnSubmitDelete.setBounds( 260, 50, 100, 20 );
    btnSubmitBook = new JButton( "Submit Booking" );
    btnSubmitBook.addActionListener( new btnSubmitAction( this ) );
    btnSubmitBook.setBounds( 10, 220, 120, 20 );

    // Create the label to display the result
    lbResult = new JLabel( "Enter your student number to delete your Office Hours Resevation(s)");
    lbResult.setBounds( 10, 30, 500, 20 );
    option2Result = new JLabel( "please enter the office hour ID that you'd like to book");
    option2Result.setBounds( 10, 100, 500, 20 );
    option2Label = new JLabel( "OPTION 2 (Enter Both Fields to Submit)");
    option2Label.setBounds( 10, 80, 500, 20 );
    option1Label = new JLabel( "OPTION 1");
    option1Label.setBounds( 10, 10, 500, 20 );
    stuIDopt2 = new JLabel( "please enter the student number that this will be booked by");
    stuIDopt2.setBounds( 10, 160, 500, 20 );
    


    // Create the panel to hold the button, label, and textfield
    panel = new JPanel( null );
    panel.add( btnSubmitDelete );
    panel.add( btnSubmitBook );
    panel.add( lbResult );
    panel.add( stuIDopt2 );
    panel.add( option2Result );
    panel.add( tfInput );
    panel.add( option2 );
    panel.add( option2ID );
    panel.add(option2Label);
    panel.add(option1Label);
    panel.setPreferredSize( new Dimension(600, 400) );

    // Create the frame which is a window
    frame = new JFrame( "Comp421 Group 33 P3 GUI" );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.getContentPane().add( panel );
    frame.pack();
    frame.setVisible( true );
  }

  public String getTextFieldInput() {
    String r = tfInput.getText();
    String opt2 = option2.getText();
    String opt2ID = option2ID.getText();
    System.out.println(opt2);
    System.out.println(r);
    System.out.println(opt2ID);
    
    return "";
 
  }

  public void setTextLabelResult( String s ) {
    lbResult.setText( s );
    
 
  }

  public static void main( String[] args ) {
    new GUI();
  
  }
}

class btnSubmitAction implements ActionListener {
  private GUI g;
  

  public btnSubmitAction( GUI g ) {
    this.g = g;
    
 
 
  }


  @Override
  public void actionPerformed( ActionEvent e ) {
    String s = g.getTextFieldInput();
  
 
    System.out.println(s); //this is where you can get the first data entry
    
  }
}
