package ExcelOps;


import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DeleteMatchedRows {
    public static void main(String[] args) throws IOException {
        // Load Excel file and get values from specific column
        String path = System.getProperty("user.home") + File.separator +"Desktop" +File.separator+"AkamaiUK.xlsx";
		System.out.println("\nReading the data from excel file : "+path+"\n");

        FileInputStream excelFile = new FileInputStream(new File(path));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        List<String> columnValues = new ArrayList<>();
        //Set<String> columnValues = new HashSet<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Cell cell = row.getCell(0);
            if (cell != null && cell.getCellType() == CellType.STRING) {
                columnValues.add(cell.getStringCellValue());
                //System.out.println(cell.getStringCellValue());
            }
        }
        //System.out.println(columnValues);
        workbook.close();

        // Load CSV file and delete rows that match column values
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\khari\\Desktop\\Policy186059Version32 (1).csv"));
        System.out.println("\nReading the data from csv file");
        String row;
        StringBuilder csvOutput = new StringBuilder();

        int lineCount = 0;
        while ((row = csvReader.readLine()) != null) {
            if (lineCount < 10) { // Skip the first 10 lines (header)
                csvOutput.append(row).append("\n");
                lineCount++;
                continue;
            }
            //System.out.print(csvOutput);
            String[] data = row.split(",");

            System.out.println(data[3]);

            if (data.length > 3) {
                boolean match = false;
                String[] pathValues = data[3].split(" ");
                for (String pathValue : pathValues) {
                    if (columnValues.contains(pathValue)) {
                        match = true;
                        break;
                    }
                }
                if (match) {
                    // do not append the row to the csvOutput StringBuilder
                } else {
                    csvOutput.append(row).append("\n");
                }
            }
            


            // if (data.length > 3 && columnValues.contains(data[3])) {
            //     // do not append the row to the csvOutput StringBuilder
            // } else {
            //     csvOutput.append(row).append("\n");
            // }

            // if (data.length > 3 && !columnValues.contains(data[3])) {
            //     csvOutput.append(row).append("\n");
            // }

            // if (!columnValues.contains(data[0])) {
            //     csvOutput.append(row).append("\n");
            // }
        }

        csvReader.close();
        FileWriter csvWriter = new FileWriter("C:\\Users\\khari\\Desktop\\OutputUK.csv");
        csvWriter.write(csvOutput.toString());
        csvWriter.close();
    }
}
