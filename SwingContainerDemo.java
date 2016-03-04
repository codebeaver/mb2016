package utils.mb;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.TextArea.*;
import java.math.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextArea.*;
import java.awt.event.ActionEvent;

import javax.swing.text.BadLocationException;
import javax.swing.GroupLayout.*;

import utils.mb.AwtControlDemo.MyCanvas;

import java.util.*;


public class SwingContainerDemo {
   private JFrame mainFrame;      // The main application window
   private JFrame jFrame1;        // 
   private JFrame jFrame2;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JPanel controlPanel1;
   private JLabel msglabel1;
   private JLabel msglabel2;
   private JLabel msglabel3;
   private JLabel msglabel4;
   private JLabel window1Title;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private final static String newline = "\n";
   private int windowwidth;
   private int windowheight;
   private int fontSize;
   private MyCanvas mc;
   //MyCanvas mc = new MyCanvas(width, height);
   
   
   public SwingContainerDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
	   
	   Color colors[] = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW };
	    for (int i = 0; i < 4; i++) {
	     // MainClass panel = new MainClass(colors[i]);
	     // frame.add(panel);
	    }

      SwingContainerDemo  swingContainerDemo = new SwingContainerDemo();  
      swingContainerDemo.showJFrameDemo();
   }
   
   //----------------------------------------------------------
   //
   //-------------------------------------------------------------

   private void prepareGUI(){
      mainFrame = new JFrame("New Test Application");
      mainFrame.setSize(800,600);
     int width = mainFrame.getWidth();  // These var will be reused in diff contexts.
     int height = mainFrame.getHeight();// These var will be reused in diff contexts.
      mainFrame.setLayout(new BorderLayout());
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      
      
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.LEFT);    

      statusLabel.setSize(350,100);
      msglabel1 = new JLabel("|-------------------------------------|", JLabel.CENTER);
      msglabel2 = new JLabel("|*************************************|", JLabel.CENTER);
      msglabel3 = new JLabel("|#####################################|", JLabel.CENTER);
      msglabel4 = new JLabel("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|", JLabel.CENTER);
      headerLabel.setText("Container in action: JFrame");   
      JRadioButton radMarriedYes = new JRadioButton("Yes?", true);
      JRadioButton radMarriedNo = new JRadioButton("No?", false);
      JRadioButton radGolfYes = new JRadioButton("Yes?", false);
      JRadioButton radGolfNo = new JRadioButton("No?", true);

      ButtonGroup radioGroup1 = new ButtonGroup();
      ButtonGroup radioGroup2 = new ButtonGroup();
    //--- The graphical panel
      //
      //      
      jPanel2 = new JPanel();
      jPanel2.setLayout(new GridLayout(1,1));
      jPanel2.setBackground(Color.black);
      width = jPanel2.getWidth();
      height = jPanel2.getHeight();
      mc = new MyCanvas(width, height);
      jPanel2.add(mc);
      //--- Sets control panel: Where application configuration and block data operations
      //
      //
      //
      controlPanel = new JPanel();
      controlPanel.setLayout(new GridLayout(8,1));
      JButton okButton = new JButton("Open a Frame");
      JButton testButton = new JButton("Test a Frame");
      controlPanel.add(okButton);
      controlPanel.add(testButton);

      //--- The panel holding buttons to instantiate N possible scenarios.
      //
      //
      //      
      jPanel1 = new JPanel();
      jPanel1.setLayout(new GridLayout(8,1));
      JButton jButton1 = new JButton("Button 1");
      JButton jButton2 = new JButton("Button 2");
      JButton jButton3 = new JButton("Button 3");
      JButton jButton4 = new JButton("Button 4");
      JButton jButton5 = new JButton("Button 5");
      JButton jButton6 = new JButton("Button 6");
      JButton jButton7 = new JButton("Button 7");
      JButton jButton8 = new JButton("Button 8");
      jPanel1.add(jButton1);
      jPanel1.add(jButton2);
      jPanel1.add(jButton3);
      jPanel1.add(jButton4);
      jPanel1.add(jButton5);
      jPanel1.add(jButton6);
      jPanel1.add(jButton7);
      jPanel1.add(jButton8);
      
      //------------------------------------------------
      // FRAMEWORK MENU
      //
      //
      //
      //-----------------------------------------------
      jButton1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 1 pressed."); 
             //textArea.setText("Button 1 was pressed");
             //textArea.append("This isand yet, another line." + newline);
             //
             showJFrame1Demo();
            
      } }); // end jButton1
    //-----------------------------------------------
      jButton2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 2 pressed."); 
            // showJFrame1Demo();
            mc.set_displayswitched(true);
            showCanvasDemo(mc);
            
            
      } }); // end jButton2
    //-----------------------------------------------
      jButton3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 3 pressed."); 
            // showJFrame1Demo();
             //mc.display();
             showConsole();
            
      } }); // end jButton3
    //-----------------------------------------------
      jButton4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 4 pressed."); 
             showConsole2();
            
      } }); // end jButton4
    //-----------------------------------------------
      jButton5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 5 pressed."); 
            // showJFrame1Demo();
            
      } }); // end jButton5
    //-----------------------------------------------
      jButton6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 6 pressed."); 
             //showJFrame1Demo();
            
      } }); // end jButton6
    //-----------------------------------------------
      jButton7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 7 pressed."); 
            // showJFrame1Demo();
            
      } }); // end jButton7
    //-----------------------------------------------
      jButton8.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Button 8 pressed."); 
         
      } }); // end jButton8
      //------------------------------------------------
      // CONTROLLER MENU
      //
      //
      //
      //-----------------------------------------------
      okButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("A Frame shown to the user.");
             //Graphics g = new Graphics();
             mc.set_displayswitched(true);
             //mc.paint(g);
             statusLabel.setText("VAR: displayswitched = true");
          }
       });
      testButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("A test performed on a Frame.");
             //showJFrame1Demo();
             //frame.setVisible(false);
             mc.set_displayswitched(false);
             statusLabel.setText("VAR: displayswitched = false"); 
          } 
       });
      
      mainFrame.add(headerLabel, BorderLayout.NORTH);
      mainFrame.add(controlPanel, BorderLayout.EAST);
      mainFrame.add(jPanel1, BorderLayout.WEST);
      mainFrame.add(jPanel2, BorderLayout.CENTER);
      mainFrame.add(statusLabel, BorderLayout.SOUTH);
      mainFrame.setVisible(true);  
      
      
   }
   //-------------------------------------------------------
   // MAIN Window for the application
   //
   // Called from main function.
   //----------------------------------------------------------
   private void showJFrameDemo(){
	  final JFrame frame = new JFrame();
	  // 
      String str = "This is the test str.";

      headerLabel.setText("Container in action: JFrame");   
      JRadioButton radMarriedYes = new JRadioButton("Yes?", true);
      JRadioButton radMarriedNo = new JRadioButton("No?", false);
      JRadioButton radGolfYes = new JRadioButton("Yes?", false);
      JRadioButton radGolfNo = new JRadioButton("No?", true);

      ButtonGroup radioGroup1 = new ButtonGroup();
      ButtonGroup radioGroup2 = new ButtonGroup();
      
      JTextArea textArea = new JTextArea(25, 60);
      //textArea.getDocument().addDocumentListener(frame);
      JScrollPane scrollPane = new JScrollPane(textArea); 
//      textArea.setEditable(true);
    //  textArea.append("This is test text to t4est the textarea" + newline);
    //  textArea.setFont(new Font("Serif", Font.ITALIC, 16));
    //  textArea.setLineWrap(true);
    //  textArea.setWrapStyleWord(true);
    //  textArea.setColumns(60);
    //  textArea.setRows(25);
    //  textArea.append("This is another line." + newline);
    //  windowwidth = textArea.getWidth();
    //  windowheight = textArea.getHeight();
//      System.out.println("Width: %d  Height: %d"+ 4+ 7);
     // System.out.println("1. Width: " + (int)windowwidth + "     2. Height: " + (int)windowheight);
    //  textArea.append("Width:" + "Height:" + newline);
      //windowwidth = mainFrame.getWidth();
      //windowheight = mainFrame.getHeight();
     
      frame.setSize(400, 200);
      frame.setLayout(new BorderLayout());       
         
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
     // jFrame1.addWindowListener(new WindowAdapter() {
     //     public void windowClosing(WindowEvent windowEvent){
     //        jFrame1.dispose();
     //     }        
     //  });  
    // jFrame2.addWindowListener(new WindowAdapter() {
     //     public void windowClosing(WindowEvent windowEvent){
     //        jFrame2.dispose();
     //     }        
     //  });  
     
      System.out.println("3. Width: " + (int)jPanel2.getWidth() + "    4. Height: " + (int)jPanel2.getHeight());  
   }
   //-------------------------------------------------------
   // MAIN Window for the application
   //
   // Called from main function.
   //----------------------------------------------------------
   private void showConsole(){
	  final JFrame frame = new JFrame();
	  frame.setSize(600, 600);
	  frame.setVisible(true);
	 
      //frame.setLayout(new BorderLayout());  
      JTextArea textArea = new JTextArea();
      //textArea.setFont(new Font("Serif", Font.ITALIC, 16));
      //textArea.getDocument().addDocumentListener(frame);
      textArea.setBackground(Color.black);
      textArea.setForeground(Color.yellow);
     
      textArea.setLineWrap(true);
      textArea.setWrapStyleWord(true);
      JScrollPane scrollPane = new JScrollPane(textArea); 
      textArea.setEditable(true);
      //frame.add(textArea);
      frame.add(scrollPane);
      textArea.setVisible(true);
    
    //  textArea.setFont(new Font("Serif", Font.ITALIC, 16));
    //  textArea.setLineWrap(true);
    //  textArea.setWrapStyleWord(true);
    //  textArea.setColumns(60);
    //  textArea.setRows(25);
    //  textArea.append("This is another line." + newline);
    //  windowwidth = textArea.getWidth();
    //  windowheight = textArea.getHeight();
//      System.out.println("Width: %d  Height: %d"+ 4+ 7);
     // System.out.println("1. Width: " + (int)windowwidth + "     2. Height: " + (int)windowheight);
      System.out.println("Before the loop");
      int numofrowa = textArea.getLineCount();
      for(int j = 0; j <100; j++){
    	 
    	  textArea.append(numofrowa +" This is a new test text to test the textarea" + newline);
    	  System.out.println(textArea.getText());
    	  numofrowa = textArea.getLineCount();
      }
      for(int k = 0; k <100; k++){
     	 
    	  System.out.println("Line "+ k);
    	  System.out.println(textArea.getText());
    	  numofrowa = textArea.getLineCount();
      }
      textArea.insert("New line inserted.",80);
      textArea.append("The end " + numofrowa + " lines." + newline);
      System.out.println("After the loop");
      textArea.append("Width:" + "Height:" + frame.getWidth() + " " + frame.getHeight() + newline);
      //textArea.setVisible(true);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
     // jFrame1.addWindowListener(new WindowAdapter() {
     //     public void windowClosing(WindowEvent windowEvent){
     //        jFrame1.dispose();
     //     }        
     //  });  
    // jFrame2.addWindowListener(new WindowAdapter() {
     //     public void windowClosing(WindowEvent windowEvent){
     //        jFrame2.dispose();
     //     }        
     //  });  
      frame.setVisible(true);
      System.out.println("3. Width: " + (int)jPanel2.getWidth() + "    4. Height: " + (int)jPanel2.getHeight());  
   }
   //-------------------------------------------------------
   // MAIN Window for the application
   //
   // Called from main function.
   //----------------------------------------------------------
   private void showConsole2(){
	  final JFrame frame = new JFrame();
	  frame.setSize(600, 600);
	  frame.setVisible(true);
	 
      //frame.setLayout(new BorderLayout());  
      JTextArea textArea = new JTextArea();
      //textArea.setFont(new Font("Serif", Font.ITALIC, 16));
      //textArea.getDocument().addDocumentListener(frame);
      textArea.setBackground(Color.black);
      textArea.setForeground(Color.yellow);
     
      textArea.setLineWrap(true);
      textArea.setWrapStyleWord(true);
      JScrollPane scrollPane = new JScrollPane(textArea); 
      textArea.setEditable(true);
      //frame.add(textArea);
      frame.add(scrollPane);
      textArea.setVisible(true);
    
      System.out.println("Before the loop");
      int numofrowa = textArea.getLineCount();
      for(int j = 0; j <100; j++){
    	 
    	  textArea.append(numofrowa +" Every day I wake up I am appreciative of the life I have..." + newline);
    	  System.out.println(textArea.getText());
    	  numofrowa = textArea.getLineCount();
      }
      for(int k = 0; k <100; k++){
     	 
    	  System.out.println("Line "+ k);
    	  System.out.println(textArea.getText());
    	  numofrowa = textArea.getLineCount();
      }
      textArea.insert("New line inserted.",80);
      textArea.append("The end " + numofrowa + " lines." + newline);
      System.out.println("After the loop");
      textArea.append("Width:" + "Height:" + frame.getWidth() + " " + frame.getHeight() + newline);
      //textArea.setVisible(true);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
     
      frame.setVisible(true);
      //System.out.println("3. Width: " + (int)jPanel2.getWidth() + "    4. Height: " + (int)jPanel2.getHeight());  
   }
   
   //-------------------------------------------------------
   // New window
   //
   //
   //----------------------------------------------------------
   
   private void showJFrame1Demo(){
	   window1Title = new JLabel("Window 1 - Testing the environment", JLabel.CENTER);
	   JLabel sb = new JLabel("This is the status bar...", JLabel.LEFT);
	      headerLabel.setText("Container in action: JFrame");   
      
	      jFrame1 = new JFrame();
	      jFrame1.setTitle("Application Testing Environment v1.0");
	      jFrame1.setSize(600, 400);
	      
	      
	      jFrame1.setLayout(new BorderLayout());    
	    
	      Panel p2 = new Panel();
	      TextArea ta = new TextArea("Hello", 25, 40);
	      p2.setLayout(new BorderLayout());
	    
	      p2.add(ta, BorderLayout.CENTER); 
	      p2.add(sb, BorderLayout.SOUTH); 
	      p2.setVisible(true);
	      	      
	      jFrame1.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent windowEvent){
	             jFrame1.dispose();
	          }        
	       });  
	      	    
	      jFrame1.setVisible(true);
	   }
   //--------------------------------------------------------
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   private void showCanvasDemo(MyCanvas mc){
	      headerLabel.setText("Control in action: Canvas"); 
          jPanel2.add(mc);
	      //controlPanel.add(mc);////////////////////////////////////////
	      mainFrame.setVisible(true);  
	   } 

	   class MyCanvas extends Canvas {
       private int width = 0;
       private int height = 0;
       private int switched = 0;
       private boolean displayswitched = false;
       private boolean clearbackground = false;
       Graphics bg;
       
	      public MyCanvas (int x, int y) {
	         //setBackground (Color.gray);
	         setSize(x, y);
	         height =  getHeight();
	         width = getWidth();
	      }
	      public void set_displayswitched(boolean action){
	    	  displayswitched = action;
	    	  statusLabel.setText("VAR: displayswitched = "+ action);
	      }
	      public boolean get_displayswitched(){
	    	  return displayswitched;
	      }
	      public void display(){
	    	  statusLabel.setText("Display ");
	    	  paint(bg);
	    	  
	    	  
	    	  //return display
	      }

	      //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	      // PAINT
	      //
	      
	      public void paint (Graphics g) {
	    	  
	         Graphics2D g2;
	         
	         g2 = (Graphics2D) g;
	         //        
	         if (clearbackground){
	        	 rect(g2, 0, 0, width, height, Color.blue); 
	        	 
	         }
	         if (displayswitched){
	             //clearScreen(g2, 0, 0, width, height, Color.black); 
	             //rect(g2, 0, 0, width, height, Color.blue); 
	             drawDiamond(g2, 0, 0, width, height, Color.red); 
	             //statusLabel.setText("Width: " + width + "Height: " + height);
	         }
	         else{
	         //g2.drawString ("It is a custom canvas area", 70, 70);
	             GeneralPath gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
	             clearScreen(g2, 0, 0, width, height, Color.black);  
	             clearbackground = true;
	             //statusLabel.setText("Width: " + width + "Height: " + height);
	         }
	        
	      } // paint
	   }
	      
	   public int rect (Graphics2D g2, int x, int y, int width, int height, Color color) {
		   int iReturnCoded = 0;
	         //setBackground (Color.BLUE);
	         //setSize(x, y);
		   g2.drawRect(x, y, width, height); 
		   g2.fillRect(x, y, width, height);
		   return iReturnCoded;
	      }
	   
	   public int show1 (Graphics2D g2, int x, int y, int width, int height, Color color) {
		   int iReturnCoded = 0;
	         //setBackground (Color.BLUE);
	         //setSize(x, y);
		   g2.drawRect(x, y, width, height); 
		   g2.fillRect(x, y, width, height);
		   for(int i =0; i < 10; i++){
			   g2.drawString ("---------------------------------------------------", 10, i*40);
		   }
		   
		   return iReturnCoded;
	      }
	   
	   public int clearScreen (Graphics2D g2, int x, int y, int width, int height, Color color) {
		   int iReturnCoded = 0;
	         //setBackground (Color.BLUE);
	         //setSize(x, y);
		   //g2.drawRect(x, y, width, height); 
		   g2.setPaint(color);
		   //g2.fillRect(x, y, width, height);
		   g2.clearRect(x, y, width, height);
		   return iReturnCoded;
	      }
	   
	   public void drawDiamond(Graphics2D g2, int x, int y, int width, int height, Color color){
		     int fontSize = 30;
		     
	         g2.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	         g2.setPaint(Color.GREEN);
	         g2.setColor(Color.red);
	         g2.setPaint(Color.yellow);
	         g2.drawString ("Canvas area", 200, 300);
	         g2.setColor(Color.black);
	         g2.drawString ("---------------------------------------------------", 10, 40);
	         fontSize = 16;
	         g2.setFont(new Font("Arial", Font.PLAIN, fontSize));
	        // g2.drawString ("---------------------------------------------------", 10, 50);
	         //g2.drawString ("---------------------------------------------------", 10, 60);
	         //g2.drawString ("---------------------------------------------------", 10, 70);
	         //g2.drawString ("---------------------------------------------------", 10, 80);
	         //g2.drawString ("---------------------------------------------------", 10, 90);
	         
	         width = 600;
	         height = 260;
	         g2.setColor(Color.white);
	         g2.drawString (".Point(10,30)", 10, 30);
	         g2.drawString (".Point(width-200,30)", width-200, 30);
	         g2.drawString (".Point(width-200,height-40)", width-200, height-40);
	         g2.drawString (".Point(10,height-40)", 10, height-40);
	         //g2.drawString (".Point(150,200)", 150, 200);
	         //g2.drawString (".Rectangle 1 at (50,50)",50, 50);
	         //g2.drawString (".Point(100,100)",100, 100);
	         Rectangle r = new Rectangle(6, 6, width-24, 248);
	         Rectangle r1 = new Rectangle(6, 256, width-24, 240);
	         g2.drawRect(r.x, r.y, r.width, r.height);
	         g2.drawRect(r1.x, r1.y, r1.width,r1.height); 
	         
	         
	         int k = 40;
	         int a; int b;
	         for(int j = 0; j < width-20; j++){
	        	 a = 200+  (int)(Math.cos(j)*100);
	        	 b = 200+ (int)(Math.sin(j)*100);
	        	 g2.drawLine(a, b, a, b);
	        	 //k += 2;
	         }
	         //Rectangle r2 = r.intersection(r1);
	         //g2.setPaint(Color.red);
	         //g2.fillRect(r2.x, r2.y, r2.width, r2.height);
	         //for( int i =0 ; i < 10; i++){
	        //	 System.out.println(r2);
	        //	 g2.drawRect(r1.x+(i*r1.width)+4, r1.y+(i*r1.height)+4,r1.width,r1.height); 
	        // }
	            
		   
		   
	   }
}