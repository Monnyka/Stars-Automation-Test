package Testcase;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class writeexcel {

    @Test
    public void main(){
        writeExcelFile(1,1,"Sheet1","xes");
    }

    public void writeExcelFile(int cRow, int cColumn,String sheetName, String value) {
        XSSFWorkbook wb;
        XSSFCell cell;
        XSSFSheet sh;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\PathmazingPC\\Desktop\\Stadsd\\data.xlsx");
            wb = (XSSFWorkbook) WorkbookFactory.create(fis);
            sh = wb.getSheet(sheetName);
            XSSFRow row = sh.createRow(cRow);
            cell = row.createCell(cColumn);
            cell.setCellValue(value);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\PathmazingPC\\Desktop\\Stadsd\\data.xlsx");
            wb.write(fos);
            fos.flush();
            fos.close();
            System.out.println("Record has been updated successfully");

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

}

