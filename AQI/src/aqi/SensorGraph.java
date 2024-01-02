package aqi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import com.fazecast.jSerialComm.SerialPort;
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class SensorGraph {
	
	static SerialPort chosenPort;
	static int x = 0;
        static int co = 0 , alc = 0 , lpg = 0 , ave = 0 ;
        public static double SD(double arr[])
	{
		double sum=0,sd=0;
		int l=arr.length;
		for(double num:arr)
		{
			sum+=num;
		}
		double mean=sum/l;
		for(double num:arr)
		{
			sd=sd+Math.pow(num-mean,2);
			
			
		}
	sd=Math.sqrt((sd/l));
	
	return sd;
		
	}
        
        public static double readFile(String A)
        {
            double res = 0 ;
            try{
            File file =new File("C:\\Users\\Maruf\\Desktop\\"+A) ;
            Scanner scanner = new Scanner(file) ;
            int lines = 0 ;
            while(scanner.hasNextLine())
            {
                scanner.nextLine() ;
                lines++ ;

            }
           
            int cnt = 0 ; 
            scanner = new Scanner(file) ;
            double aqi_co[] = new double[lines+5]; 
            
            while(scanner.hasNext())
            {
                
                aqi_co[cnt]=Float.parseFloat(scanner.next()) ;
                cnt++;
               
            }
           res  = SD(aqi_co);
                        

            }
        catch(Exception e)
        {
            System.out.println("Cant Read");
        }
            return res;
        }
        
          
        
public static void customizeChart(JFreeChart chart) {   // here we make some customization
    XYPlot plot = chart.getXYPlot();
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // sets paint color for each series
    renderer.setSeriesPaint(0, Color.RED);
    renderer.setSeriesPaint(1, Color.GREEN);
    renderer.setSeriesPaint(2, Color.YELLOW);
    renderer.setSeriesPaint(3, Color.cyan);
    // sets thickness for series (using strokes)
    renderer.setSeriesStroke(0, new BasicStroke(4.0f));
    renderer.setSeriesStroke(1, new BasicStroke(3.0f));
    renderer.setSeriesStroke(2, new BasicStroke(2.0f));
    renderer.setSeriesStroke(3, new BasicStroke(3.0f));

    // sets paint color for plot outlines
    plot.setOutlinePaint(Color.BLUE);
    plot.setOutlineStroke(new BasicStroke(2.0f));
    
    // sets renderer for lines
    plot.setRenderer(renderer);
    
    // sets plot background
    plot.setBackgroundPaint(Color.DARK_GRAY);
    
    // sets paint color for the grid lines
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.BLACK);
    
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.BLACK);
    
}


public static void adder(JFrame a , JPanel b , String area)
{
                //LPG
                double xp = readFile(area+"_LPG.txt");
                Formatter formatter = new Formatter();
                JLabel L1=new JLabel("LPG "+String.valueOf(formatter.format("%.2f", xp))+" ") ;
                b.add(L1);
                a.add(b , BorderLayout.PAGE_END);
                
                
                
                xp = readFile(area+"_CO.txt");
                formatter = new Formatter();
                JLabel L2=new JLabel("CO "+String.valueOf(formatter.format("%.2f", xp))+" ") ;
                b.add(L2);
                a.add(b , BorderLayout.PAGE_END);
                
                
                
                xp = readFile(area+"_Alc.txt");
                formatter = new Formatter();
                JLabel L3=new JLabel("ALCOHOL "+String.valueOf(formatter.format("%.2f", xp))+" ") ;
                b.add(L3);
                a.add(b , BorderLayout.PAGE_END);
                
               
}
	public static void main(String[] args) {
		/*
                String area = "Savar" ;
                double xp = readFile(area+"_LPG.txt");
                Formatter formatter = new Formatter();
                JLabel L1=new JLabel("LPG "+String.valueOf(formatter.format("%.2f", xp))+" ") ;
                */
                String places[] = new String[5] ;
                places[0]="Savar";
                places[1]="Mirpur";
              
		JFrame window = new JFrame();
		window.setTitle("Sensor Graph GUI");
		window.setSize(600, 400);
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox<String> portList = new JComboBox<String>();
                JComboBox<String> placeList = new JComboBox<String>();

		JButton connectButton = new JButton("Connect");
                JButton location = new JButton("location");
                JButton StanDev = new JButton("Standard Deviation");

		JPanel topPanel = new JPanel();
                JPanel topPanel2 = new JPanel();
                JLabel Safety = new JLabel(""); 
                Safety.setOpaque(true);

                topPanel2.add(Safety);
                for(int i=0;i<1;i++)
                {
                    adder(window,topPanel2,places[i]);
                }
		topPanel.add(portList);
                topPanel.add(placeList);

		topPanel.add(connectButton);
               
               // topPanel2.add(L1);

                topPanel.add(location);
                
		window.add(topPanel, BorderLayout.NORTH);
	
		SerialPort[] portNames = SerialPort.getCommPorts();
		for(int i = 0; i < portNames.length; i++)
			portList.addItem(portNames[i].getSystemPortName());
                
                for(int i = 0; i < 2; i++)
			placeList.addItem(places[i]);
		
		// create the line graph
                XYSeriesCollection dataset = new XYSeriesCollection();
                
		XYSeries series1 = new XYSeries("CO AQI");
                XYSeries series2 = new XYSeries("LPG AQI");
                XYSeries series3 = new XYSeries("ALCOHOL AQI");
                XYSeries series4 = new XYSeries("AVERAGE AQI");
		
		

                JFreeChart chart = ChartFactory.createXYLineChart("AQI Readings", "Time", "AQI", dataset);
                customizeChart(chart);
		window.add(new ChartPanel(chart), BorderLayout.CENTER);
		
		// configure the connect button and use another thread to listen for data
                 Random rand = new Random();
		connectButton.addActionListener(new ActionListener(){
			@Override public void actionPerformed(ActionEvent arg0) {
				if(connectButton.getText().equals("Connect")) {
                                    
                                        series1.clear();
                                        series2.clear();
                                        series3.clear();
                                        series4.clear() ; 
					// attempt to connect to the serial port
					chosenPort = SerialPort.getCommPort(portList.getSelectedItem().toString());
                                       
                                       
					chosenPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 1);
					if(chosenPort.openPort()) {
						connectButton.setText("Disconnect");
						portList.setEnabled(false);
                                                 series1.clear();
                                                        series2.clear();
                                                        series3.clear();
                                                        series4.clear();
                                                 
					}
					
                                                        series1.clear();
                                                        series2.clear();
                                                        series3.clear();
                                                        series4.clear();
                                                        x = 0;
                                                        co=lpg=alc=0;
					Thread thread = new Thread(){
						@Override public void run() {
                                                    
                                                       
							Scanner scanner = new Scanner(chosenPort.getInputStream());
                                                        series1.clear();
                                        series2.clear();
                                        series3.clear();
                                        series4.clear() ;
                                                                        dataset.addSeries(series1);
                                                                        dataset.addSeries(series2);
                                                                        dataset.addSeries(series3);
                                                                        dataset.addSeries(series4);
							while(scanner.hasNextLine()) {
								try {
                                                                        System.out.println("TRYING ") ; 
									String line = scanner.next();
                                                                        System.out.println(line) ;
									float number = Float.parseFloat(line);
                                                                        if(number<300)
									series1.add(co++/10.0, number);
                                                                         System.out.println(line) ;
                                                                        line = scanner.next();
								        number = Float.parseFloat(line);
                                                                        if(number<300)
									series2.add(lpg++/10.0, number);
                                                                         System.out.println(line) ;
                                                                        line = scanner.next();
								        number = Float.parseFloat(line);
                                                                        if(number<300)
									series3.add(alc++/10.0, number);
                                                                        System.out.println(line) ;
                                                                        line = scanner.next();
								        number = Float.parseFloat(line);
                                                                         if(number<300)
									series4.add(ave++/10.0, number);
                                                                         System.out.println(line) ;
                                                                         
                                                                          
                                                                          if(number<50)
                                                                          {
                                                                             
                                                                              Safety.setText("Good");
                                                                              Safety.setBackground(Color.green);
                                                                          }
                                                                          else 
                                                                          if(number<300)
                                                                          {
                                                                             
                                                                             Safety.setText("Moderate");
                                                                             Safety.setBackground(Color.yellow);
                                                                          } 
                                                                          else if(number<500)
                                                                          {
                                                                              Safety.setText("Unhealthy");
                                                                              Safety.setBackground(Color.red);
                                                                          }
                                                                          
                                                                          
                                                                   
                                                                        
									window.repaint();
								} catch(Exception e) {
                                                                
                                                                    System.out.println(e);
                                                                }
                                                                 
							}
							scanner.close();
						}
					};
					thread.start();
				} else {
					chosenPort.closePort();
					portList.setEnabled(true);
					connectButton.setText("Connect");
					series1.clear();
                                        series2.clear();
                                        series3.clear();
                                        series4.clear();
					x = 0;
                                        co=lpg=alc=0;
				}
			}
		});
  
                location.addActionListener(new ActionListener(){
			@Override public void actionPerformed(ActionEvent arg0) {
				
                            if(connectButton.getText().equals("Disconnect")) {
					//--------------------SIDE TO CALCULATE THE DETAILS FOR A PLACE-------------\\
                                    Thread thread = new Thread(){
                                        
                                        
                                        
						@Override public void run() {
                                                    
                                        series1.clear();
                                        series2.clear();
                                        series3.clear();
                                        String place  =  placeList.getSelectedItem().toString();
                                        System.out.println(place);
                                        File file =new File("C:\\Users\\Maruf\\Desktop\\"+place+"_CO.txt") ;
                                        
                                        
                                        
                                    try {
                                        Scanner scanner = new Scanner(file) ;
                                      
                                        while(scanner.hasNext())
                                        {

                                            float number=Float.parseFloat(scanner.next()) ;
                                            series1.add(co++/10.0 ,number);

                                        }
                                        
                                    } catch (FileNotFoundException ex) {
                                        
                                        
                                    }
                                    
                                    
                                    ////////////////////FOR LPG ///////////////////////
                                    
                                    file =new File("C:\\Users\\Maruf\\Desktop\\"+place+"_LPG.txt") ;
                                        
                                        
                                        
                                    try {
                                        Scanner scanner = new Scanner(file) ;
                                      
                                        while(scanner.hasNext())
                                        {

                                            float number=Float.parseFloat(scanner.next()) ;
                                            series2.add(lpg++/10.0 ,number);

                                        }
                                        
                                    } catch (FileNotFoundException ex) {
                                        
                                        
                                    }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    ///////////////////////////////////////////////////////
                                    
                                    
                                    
                                    
                                    
                                    ////////////////////FOR ALC ///////////////////////
                                    
                                    file =new File("C:\\Users\\Maruf\\Desktop\\"+place+"_Alc.txt") ;
                                        
                                        
                                        
                                    try {
                                        Scanner scanner = new Scanner(file) ;
                                      
                                        while(scanner.hasNext())
                                        {

                                            float number=Float.parseFloat(scanner.next()) ;
                                            series3.add(alc++/10.0 ,number);

                                        }
                                        
                                    } catch (FileNotFoundException ex) {
                                        
                                        
                                    }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    ///////////////////////////////////////////////////////

						Thread thread = new Thread(){
						@Override public void run() {
                                               
                                                                        dataset.addSeries(series1);
                                                                        dataset.addSeries(series2);
                                                                        dataset.addSeries(series3);
							
                                                             
					x = 0;
                                        co=lpg=alc=0;         
                                                                        
                                                                        
                                                        
                                                        
						}
					};
                                                
					
				}
			};
		 
                
                
                
                
                
                
                
                
                
                
                System.out.println("DDDDDDDDDDDDDDD");
		// show the window
                thread.start();
                } else {
                            
                                        series1.clear();
                                        series2.clear();
                                        series3.clear();
                            }
		
	

}});
                window.setVisible(true);
        }}
        