/*
 * ѭ��error���Բ�׽����
 */
package com.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class javatest {
	
	public static void main(String[] args) {
		/*
		 * ����1����ѭ���ڲ�׽
		 */
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<Date> list = new ArrayList<>(10);
		for(int cnt1=0;cnt1<10;cnt1++){
		    try {
		        Date date = dateformat.parse("09-12");
		        list.add(date);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		}
		
		/*
		 * ����2����ѭ���Ⲷ׽
		 */
		
		/*SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<Date> list2 = new ArrayList<>(10);
		try {
		    for(int cnt1=0;cnt1<10;cnt1++){
		        Date date = dateformat2.parse("09-12");
		        list2.add(date);
		    }
		} catch (ParseException e) {
		    e.printStackTrace();
		}*/


	}

}
