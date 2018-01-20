import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Line {
	public void line(){
	Workbook book = null;
	try {
		book = Workbook.getWorkbook(new File("test.xls"));
	} catch (BiffException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    // 获得第一个工作表对象
    Sheet sheet = book.getSheet(0);
    // 得到第一列第一行的单元格
    int columnum = sheet.getColumns();// 得到列数
    int rownum = sheet.getRows();// 得到行数
    System.out.println(columnum);
    System.out.println(rownum);
    for (int i = 0; i < rownum; i++)// 循环进行读写
    {
        for (int j = 0; j < columnum; j++) {
            Cell cell1 = sheet.getCell(j, i);
            String result = cell1.getContents();
            System.out.print(result);
            System.out.print("\t");
        }
        System.out.println();
    }
    book.close();
}
}
