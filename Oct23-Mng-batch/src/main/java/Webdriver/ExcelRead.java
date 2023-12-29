package Webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelRead {

    public static void main(String args[]) throws IOException {

        File src = new File("C:\\Users\\sravn\\OneDrive\\Desktop\\testcase-sample.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sh = wb.getSheet("Sample");

        System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(3).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(4).getStringCellValue());






    }
}
