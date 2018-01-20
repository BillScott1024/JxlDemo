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
            // 打开文件
        	
            WritableWorkbook book = Workbook.createWorkbook(new File("test.xls"));
            // 生成名为“第一页”的工作表，参数0表示这是第一页
            WritableSheet sheet1 = book.createSheet("Sheet", 0);
            // 在Label对象的构造子中指名单元格位置是第一列第一行(0,0)
            // 以及单元格内容为test
            sheet1.mergeCells(0,0,7,1);
//           sheet1.setRowView(0,500);
//           sheet1.setColumnView(0,80);
            WritableFont font1 = new WritableFont(WritableFont.createFont("仿宋"),16,WritableFont.BOLD);
            WritableFont font2 = new WritableFont(WritableFont.createFont("宋体"),10,WritableFont.NO_BOLD);
//            WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.BOLD);
            WritableCellFormat format1=new WritableCellFormat(font1);
            WritableCellFormat format2=new WritableCellFormat(font2);
            WritableCellFormat format3=new WritableCellFormat(font2);
            format1.setAlignment(jxl.format.Alignment.CENTRE);
            Label label1=new Label(0,0,"求职简历",format1);

            Label label2=new Label(0,2,"姓名",format2);
            Label label3=new Label(2,2,"性别",format2);
            
            Label label4=new Label(4,2,"籍贯",format2);
            Label label5=new Label(0,3,"出生日期",format2);
            Label label6=new Label(2,3,"民族",format2);
            sheet1.setColumnView(5,20);
            Label label7=new Label(4,3,"邮箱",format2);

            Label label8=new Label(0,4,"家庭住址",format2);
            sheet1.mergeCells(1,4,5,4);
            Label label9=new Label(0,5,"政治面貌",format2);
            sheet1.setColumnView(3,15);
            Label label10=new Label(2,5,"电话",format2);
            Label label11=new Label(4,5,"专业",format2);
            // 将定义好的单元格添加到工作表中
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
            Label label12=new Label(0,8,"个人简介",format3);
            sheet1.mergeCells(0,9,7,17);
            sheet1.addCell(label12);
            
            sheet1.mergeCells(0,18,7,18);
            Label label13=new Label(0,18,"专长",format3);
            sheet1.mergeCells(0,19,7,28);
            sheet1.addCell(label13);
            
            sheet1.mergeCells(6,2,7,7);
            Label label14=new Label(6,2,"照片",format3);
            sheet1.addCell(label14);
            /*
             * 生成一个保存数字的单元格 必须使用Number的完整包路径，否则有语法歧义 单元格位置是第二列，第一行，值为789.123
             */
        //    jxl.write.Number number = new jxl.write.Number(1, 0, 2500.5);
       //     sheet1.addCell(number);

            // 写入数据并关闭文件
            book.write();
            book.close();
            System.out.println("Excel已生成！");
        } catch (Exception e) {
            System.out.println(e);
        }
}
}