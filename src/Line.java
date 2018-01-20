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
    // ��õ�һ�����������
    Sheet sheet = book.getSheet(0);
    // �õ���һ�е�һ�еĵ�Ԫ��
    int columnum = sheet.getColumns();// �õ�����
    int rownum = sheet.getRows();// �õ�����
    System.out.println(columnum);
    System.out.println(rownum);
    for (int i = 0; i < rownum; i++)// ѭ�����ж�д
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
