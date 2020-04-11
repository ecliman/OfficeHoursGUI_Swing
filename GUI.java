//////////////////////////////////////////////////////////////////////
//                                                                  //
//     															    //
//		OPTION 1 IS STORED IN VARIABLE R							//
//		OPTION2 OID STORED IN VARIABLE opt2                 		//          
//		OPTION 2 StuNumber STORED IN VARIABLE opt2ID
// OPTION 3: THE CRN IS STORED IN VARIABLE NAME crn					//			
//																	//
//		see the readme for complete list of where variables are stored 															//
//																	//
//////////////////////////////////////////////////////////////////////
package mainprogram;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI {
  private static JFrame     frame;
  private static JPanel     panel;
  private static JButton    btnSubmitDelete;
  private static JButton    btnSubmitBook;
  private static JButton    btnSubmitSeeSched;
  private static JButton    btnSubmitAddOH;
  private static JLabel     lbResult;
  private static JTextField tfInput;
  private static  JTextField option2;
  private static JTextField option2ID;
  private static  JTextField option3CRN;
  private static  JTextField q4_date;
  private static  JTextField q4_TAsid;
  private static  JTextField OH_startTime;
  private static  JTextField OH_endTime;
  private static JLabel     option2Result;
  private static JLabel option2Label;
  private static JLabel option1Label;
  private static JLabel     stuIDopt2;
  private static JLabel     Q3;
  private static JLabel     Q3info;
  private static JLabel     Q4;
  private static JLabel     Q4_1_info;
  private static JLabel     Q4_2_info;
  private static JLabel     Q4_3_info;
  private static JLabel     Q4_4_info;
 

  // Constructor
  public GUI() {
    // Create the textfield to read input

    tfInput = new JTextField( 30 );
    tfInput.setBounds( 10, 50, 240, 20 );
    option2 = new JTextField( 30 );
    option2.setBounds( 10, 130, 240, 20 );
    option2ID = new JTextField( 30 );
    option2ID.setBounds( 10, 180, 240, 20 );
    option3CRN = new JTextField( 30 );
    option3CRN.setBounds( 10, 290, 240, 20 );
    q4_TAsid = new JTextField( 30 );
    q4_TAsid.setBounds( 10, 400, 240, 20 );
    q4_date = new JTextField( 30 );
    q4_date.setBounds( 10, 450, 240, 20 );
    OH_startTime = new JTextField( 30 );
    OH_startTime.setBounds( 10, 500, 240, 20 );
    OH_endTime = new JTextField( 30 );
    OH_endTime.setBounds( 10, 540, 240, 20 );
    
   
   
  
    
    

    // Create the button to submit the value
    btnSubmitDelete = new JButton( "Submit" );
    btnSubmitDelete.addActionListener( new btnSubmitAction( this ) );
    btnSubmitDelete.setBounds( 260, 50, 100, 20 );
    
    btnSubmitBook = new JButton( "Submit Booking" );
    btnSubmitBook.addActionListener( new btnSubmitAction( this ) );
    btnSubmitBook.setBounds( 10, 220, 120, 20 );
    
    btnSubmitSeeSched = new JButton( "Click to see schedule" );
    btnSubmitSeeSched.addActionListener( new btnSubmitAction( this ) );
    btnSubmitSeeSched.setBounds( 10, 320, 160, 20 );
    
    btnSubmitAddOH = new JButton( "Click to add new Office Hours" );
    btnSubmitAddOH.addActionListener( new btnSubmitAction( this ) );
    btnSubmitAddOH.setBounds( 10, 575, 200, 20 );
    
    

    // Create the label to display the result
    lbResult = new JLabel( "Enter your student number to delete your Office Hours Resevation(s)");
    lbResult.setBounds( 10, 30, 500, 20 );
    option2Result = new JLabel( "please enter the office hour ID that you'd like to book");
    option2Result.setBounds( 10, 100, 500, 20 );
    option2Label = new JLabel( "OPTION 2 (Enter Both Fields to Submit)");
    option2Label.setFont(option2Label.getFont().deriveFont(Font.BOLD, 16f));
    option2Label.setBounds( 10, 80, 500, 20 );
    option1Label = new JLabel( "OPTION 1");
    option1Label.setFont(option1Label.getFont().deriveFont(Font.BOLD, 16f));
    option1Label.setBounds( 10, 10, 500, 20 );
    stuIDopt2 = new JLabel( "please enter the student number that this will be booked by");
    stuIDopt2.setBounds( 10, 160, 500, 20 );
    Q3info = new JLabel( "Enter the crn to see the office hours schedule");
    Q3info.setBounds( 10, 270, 500, 20 );
    Q4_1_info = new JLabel( "1. Enter your TA SID to set your office hours");
    Q4_1_info.setBounds( 10, 375, 500, 20 );
    Q4_2_info = new JLabel( "2. Enter The date which you'll office hours on");
    Q4_2_info.setBounds( 10, 423, 500, 20 );
    Q4_3_info = new JLabel( "3. Enter the start time of these office hours");
    Q4_3_info.setBounds( 10, 475, 500, 20 );
    Q4_4_info = new JLabel( "4. Enter the end time of these office hours");
    Q4_4_info.setBounds( 10, 522, 500, 20 );
    option1Label.setForeground(Color.RED);
    option2Label.setForeground(Color.RED);
    Q3 = new JLabel("OPTION 3");
    Q3.setBounds( 10, 250, 500, 20 );
    Q3.setFont(Q3.getFont().deriveFont(Font.BOLD, 16f));
    Q3.setForeground(Color.RED);
    Q4 = new JLabel("OPTION 4 (Enter All 3 Fields To Submit)");
    Q4.setBounds( 10, 350, 500, 20 );
    Q4.setFont(Q3.getFont().deriveFont(Font.BOLD, 16f));
    Q4.setForeground(Color.RED);
    


    // Create the panel to hold the button, label, and textfield
    panel = new JPanel( null );
    panel.add( btnSubmitDelete );
    panel.add(OH_endTime);
    panel.add(q4_TAsid);
    panel.add(q4_date);
    panel.add(OH_startTime);
    panel.add(Q4_1_info);
    panel.add(Q4_4_info);
    panel.add(Q4_3_info);
    panel.add( btnSubmitBook );
    panel.add(btnSubmitSeeSched);
    panel.add(btnSubmitAddOH);
    panel.add( lbResult );
    panel.add(Q4);
    panel.add(Q3info);
    panel.add(Q4_2_info);
    panel.add(option3CRN);
    panel.add( stuIDopt2 );
    panel.add( option2Result );
    panel.add( tfInput );
    panel.add( option2 );
    panel.add( option2ID );
    panel.add(option2Label);
    panel.add(option1Label);
    panel.add(Q3);
    panel.setPreferredSize( new Dimension(600, 600) );

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
    String crn = option3CRN.getText();
    String ohdate = q4_date.getText();
    String startTime = OH_startTime.getText();
    String endTime = OH_endTime.getText();
    String TAsid = q4_TAsid.getText();
    System.out.println(TAsid + " created on an office hour on :" + ohdate + " starting at: " + startTime + " and ending at : " + endTime);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(r + " wants to cancel their appointment");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("OH ID BOOKED: " + opt2);
    System.out.println("student number booked by: " + opt2ID);
    System.out.println("schedule presented is for CRN #: "+ crn);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    
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
  
 
    
    
  }
}
