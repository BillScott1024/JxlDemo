import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

class CreateExcel {
	public void readexcel(){
        try {
            // ���ļ�
        	
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"));
            // ������Ϊ����һҳ���Ĺ���������0��ʾ���ǵ�һҳ
            WritableSheet sheet1 = book.createSheet("Sheet", 0);
            // ��Label����Ĺ�������ָ����Ԫ��λ���ǵ�һ�е�һ��(0,0)
            // �Լ���Ԫ������Ϊtest
            sheet1.mergeCells(0,0,7,1);
//           sheet1.setRowView(0,500);
//           sheet1.setColumnView(0,80);
            WritableFont font1 = new WritableFont(WritableFont.createFont("����"),16,WritableFont.BOLD);
            WritableFont font2 = new WritableFont(WritableFont.createFont("����"),10,WritableFont.NO_BOLD);
//            WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.BOLD);
            WritableCellFormat format1=new WritableCellFormat(font1);
            WritableCellFormat format2=new WritableCellFormat(font2);
            WritableCellFormat format3=new WritableCellFormat(font2);
            format1.setAlignment(jxl.format.Alignment.CENTRE);
            Label label1=new Label(0,0,"��ְ����",format1);

            Label label2=new Label(0,2,"����",format2);
            Label label3=new Label(2,2,"�Ա�",format2);
            
            Label label4=new Label(4,2,"����",format2);
            Label label5=new Label(0,3,"��������",format2);
            Label label6=new Label(2,3,"����",format2);
            sheet1.setColumnView(5,20);
            Label label7=new Label(4,3,"����",format2);

            Label label8=new Label(0,4,"��ͥסַ",format2);
            sheet1.mergeCells(1,4,5,4);
            Label label9=new Label(0,5,"������ò",format2);
            sheet1.setColumnView(3,15);
            Label label10=new Label(2,5,"�绰",format2);
            Label label11=new Label(4,5,"רҵ",format2);
            // ������õĵ�Ԫ����ӵ���������
            sheet1.addCell(label1);
            sheet1.addCell(label2);
            sheet1.addCell(label3);
            sheet1.addCell(label4);
            
            sheet1.addCell(label5);
            sheet1.addCell(label6);
            sheet1.addCell(label7);
            sheet1.addCell(label8);
            sheet1.addCell(label9);
            sheet1.addCell(label10);
            sheet1.addCell(label11);
            
            sheet1.mergeCells(0,8,7,8);
            format3.setAlignment(jxl.format.Alignment.CENTRE);
            Label label12=new Label(0,8,"���˼��",format3);
            sheet1.mergeCells(0,9,7,17);
            sheet1.addCell(label12);
            
            sheet1.mergeCells(0,18,7,18);
            Label label13=new Label(0,18,"ר��",format3);
            sheet1.mergeCells(0,19,7,28);
            sheet1.addCell(label13);
            
            sheet1.mergeCells(6,2,7,7);
            Label label14=new Label(6,2,"��Ƭ",format3);
            sheet1.addCell(label14);
            /*
             * ����һ���������ֵĵ�Ԫ�� ����ʹ��Number��������·�����������﷨���� ��Ԫ��λ���ǵڶ��У���һ�У�ֵΪ789.123
             */
        //    jxl.write.Number number = new jxl.write.Number(1, 0, 2500.5);
       //     sheet1.addCell(number);

            // д�����ݲ��ر��ļ�
            book.write();
            book.close();
            System.out.println("Excel�����ɣ�");
        } catch (Exception e) {
            System.out.println(e);
        }
}
}