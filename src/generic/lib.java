package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class lib implements IAutoConstant{
	public static FileInputStream fis;
	public static String getPropertyValue(String Key){
		String PropertyValue = "";
		try {
			fis = new FileInputStream(Config_Path);
			Properties prop=new Properties();
			prop.load(fis);
			PropertyValue=prop.getProperty(Key);
		} catch (Exception e) {

		}
		return PropertyValue;
	}

	public static String getCellValue(String SheetName, int rownum, int colnum){
		String cellValue="";
		try {
			fis = new FileInputStream(Excel_path);
			Workbook wb=WorkbookFactory.create(fis);
			cellValue=wb.getSheet(SheetName).getRow(rownum).getCell(colnum).toString();
		} catch (Exception e) {

		}
		return cellValue;	
	}

	public static int getRowCount(String SheetName){
		int rc=0;
		try {
			fis = new FileInputStream(Excel_path);
			Workbook wb=WorkbookFactory.create(fis);
			rc=wb.getSheet(SheetName).getLastRowNum();
		} catch(Exception e)
		{

		}
		return rc;

	}
}
