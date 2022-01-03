
package bar_2006676_p1;

import java.io.*;
import java.util.*;


public class BAR_2006676_P1 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
       File inputInfo = new File("intialInformation.txt");
       File inputCommands = new File("commands.txt");
        
       File outputFile = new File("output.txt");
        
       if (!(inputInfo.exists() && !inputInfo.isDirectory()|| inputCommands.exists())&&!inputCommands.isDirectory()) { // We have to check if the file really exisit or no!!
            System.out.println("Input File, " + inputInfo + " and  Input File, "+ inputCommands +" does not exist.");
            System.exit(0);
        } 
        
         Scanner input1 = new Scanner(inputInfo); // A Scanner so we can read from Files.
         
         //-------------------------------------------------------------------------
         Scanner input2 = new Scanner(inputCommands); // A Scanner so we can read from Files
           
         
         PrintWriter fWrite = new PrintWriter(outputFile);
         
         
         
         int numberOfCenters = input1.nextInt();
         
         int NOCapacityCenter1 = input1.nextInt();
         
         int NOCapacityCenter2 = input1.nextInt();
         
         int NOCapacityCenter3 = input1.nextInt();
         
         String BuildingCenter = input1.next();
         
         String HospitalCenter = input1.next();
         
         String MedServiceCenter = input1.next();
         
         
         ArrayList<Center> centers = new ArrayList<Center>(numberOfCenters);
         
         
        for (int i = 0; i < NOCapacityCenter1; i++) {
            
            
            
        }
         
         
         
         
         
         
         
         
         
          
          fWrite.println("	Welcome to the KAU Vaccination Centers Management System\n"
                + "       ---------------------------------------------------------");
          
          
          System.out.println(centers);
         
       
        fWrite.flush();// we use flush to make sure everything written on the output file.
        input1.close();// we close the input do everthing we read can print on the output file same as printWriter.
        fWrite.close();
       
       
       
       
       
       
        
        
        
        
    }
    
}
