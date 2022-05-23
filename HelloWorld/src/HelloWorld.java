//Import Area for Libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		
	String strReturnValue = "";
			int i = 100000000;
			
			System.out.println("Hello world!");
			
			System.out.println("Starting Function Void");
			countSuccessfulVoid(i);
			System.out.println("Starting Function String");
			strReturnValue = countSuccessfulString(i);
			System.out.println(strReturnValue);
			
			System.out.println("Completed!, Moving to File Check");
			
			File fileSelectedFile = new File("/home/andrewbranch/Documents/dev_data/edmemo.txt");
			
			//Print out the basic info and set basic variables
			getBasicFileInfo(fileSelectedFile);
		}
		
		static void countSuccessfulVoid(int i)
		{
			int intCount = 0;
			String strStringReturnValue = "";
		
			for(i=0; i<100; i++)
			{
				intCount = i;
			}
			
			strStringReturnValue = "Completed Void Function";
			
			System.out.println(strStringReturnValue);
		}
	
		static String countSuccessfulString(int i)
		{
			int intCount = 0;
			String strStringReturnValue = "";
		
			for(i=0; i<100000000; i++)
			{
				intCount = i;
			}
			
			strStringReturnValue = "Completed String Function";
			
			return strStringReturnValue;
		}
		
		static boolean fileCheck(File inputFileObject)
		{
			boolean boolValue = false;
			if(inputFileObject.exists() == true)
			{
				boolValue = true;
				return boolValue;
			}
			else
			{
				return boolValue;
			}
		}
		
		static void printFileDetails (File inputFileObject)
		{
			if(fileCheck(inputFileObject) == true)
			{
				
			  System.out.println("File name: " + inputFileObject.getName());
		      System.out.println("Absolute path: " + inputFileObject.getAbsolutePath());
		      System.out.println("Writeable: " + inputFileObject.canWrite());
		      System.out.println("Readable " + inputFileObject.canRead());
		      System.out.println("File size in bytes " + inputFileObject.length());
		      System.out.println("File rows: " + getFileLineCount(inputFileObject));
			}
			else
			{
				System.out.println("File not found.");
			}
		}
		
		static void getBasicFileInfo(File inputFileObject)
		{
			printFileDetails(inputFileObject);
		}
		
		static int getFileLineCount(File inputFileObject)
		{
			int intLineCount = 0;
			if(fileCheck(inputFileObject) == true) 
			{
				Scanner scannerObject;
				try {
					String strLine = "";
					
					scannerObject = new Scanner(inputFileObject).useDelimiter("\\n"); //Key off the line feed indicator.
					System.out.println("Starting File Processing");
						while(scannerObject.hasNextLine() == true)
						{
							strLine = scannerObject.nextLine();
							intLineCount++;
						}
						
						System.out.println("Processing completed, closing file.");
						closeFile(scannerObject);
						System.out.println("File Closed.");
						return intLineCount;
						
					} catch (FileNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}catch (Exception ex)
					{	
						System.out.println(ex);
						ex.printStackTrace();
					}
				
			}
			return intLineCount;
				
		}
		
		static void closeFile(Scanner inputFile)
		{
			inputFile.close();
		}
}


