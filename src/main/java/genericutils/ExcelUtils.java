package genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	public String readdatafromExcel(String sheetname,int rowno,int CelNo) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		String value = sh.getRow(rowno).getCell(CelNo).getStringCellValue();
		return value;
		
		
	}
	public void writedataintoExcel(String sheetname,int rowno,int CelNo, String data) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).createRow(rowno).createCell(CelNo).setCellValue(data);
		FileOutputStream fos= new FileOutputStream("./src/test/resources/testdata.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
