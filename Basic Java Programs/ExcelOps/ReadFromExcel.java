package ExcelOps;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcel {	
	public static void read(String path) {
		try {
            FileInputStream file = new FileInputStream(new File(path));
            
            // Creating Workbook instance for excel file
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
            // Getting the required sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            // Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        default:
                            break;
                     }
                }
                System.out.println("");
            }
            workbook.close();
            file.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
        String path = System.getProperty("user.home") + File.separator +"Desktop" +File.separator+"New Microsoft Excel Worksheet.xlsx";
		System.out.println("\nReading the data from excel file : "+path+"\n");
        ReadFromExcel.read(path);       
    }
}