package aqi;

import java.io.File ;
import java.util.Scanner;

public class ReadFile {
    void plot(double aqi_co[],double aqi_alc[],double aqi_lpg[],double aqi_ave[])
    {
        
    }
    public static void main(String[] args){
        try{
            File file =new File("C:\\Users\\Maruf\\Desktop\\Data_Final.txt") ;
            Scanner scanner = new Scanner(file) ;
            int lines = 0 ;
            while(scanner.hasNextLine())
            {
                scanner.nextLine() ;
                lines++ ;

            }
            System.out.println(lines);
            int cnt = 0 ; 
            double aqi_co[] = new double[lines+5]; 
            double aqi_lpg[] = new double[lines+5];
            double aqi_alc[] = new double[lines+5];
            double aqi_ave[] = new double[lines+5];
            while(scanner.hasNext())
            {
                
                aqi_co[cnt]=Float.parseFloat(scanner.next()) ;
                aqi_alc[cnt]=Float.parseFloat(scanner.next()) ;
                aqi_lpg[cnt]=Float.parseFloat(scanner.next()) ;
                aqi_ave[cnt]=Float.parseFloat(scanner.next()) ;
                
            }

        }
        catch(Exception e)
        {
            
        }
    }
    
    
}
