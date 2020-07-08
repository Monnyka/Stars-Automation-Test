package Testcase;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelRW {


    public static void main(String[] args) {
//        FileOutputStream fileOut;
//         XSSFWorkbook wb;
//         XSSFCell cell;
//         XSSFSheet sh;
//          try{
//              FileInputStream fis = new FileInputStream("C:\\Users\\PathmazingPC\\Desktop\\Staff Data\\data.xlsx");
//              wb = (XSSFWorkbook) WorkbookFactory.create(fis);
//              sh = wb.getSheet("Sheet1");
//              int noOfRow = sh.getLastRowNum();
//              System.out.println("The row number is: "+noOfRow);
//              cell = sh.getRow(2).getCell(1);
//              System.out.println("The row number is: "+cell.toString());
//
//          }catch (Exception exp){
//              System.out.println(exp.getMessage());
//          }
        writeExcelFile(1, 1, "asdasd");
    }

    public static void writeExcelFile(int cRow, int cColumn, String value) {
        XSSFWorkbook wb;
        XSSFCell cell;
        XSSFSheet sh;
        try {
            FileInputStream fis = new FileInputStream("./data.xlsx");
            wb = (XSSFWorkbook) WorkbookFactory.create(fis);
            sh = wb.getSheet("data");
            XSSFRow row = sh.createRow(cRow);
            cell = row.createCell(cColumn);
            cell.setCellValue(value);
            FileOutputStream fos = new FileOutputStream("./data.xlsx");
            wb.write(fos);
            fos.flush();
            fos.close();
            System.out.println("successful added field");

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
