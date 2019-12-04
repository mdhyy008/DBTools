package com.dabai.utils;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 日期时间工具类
 * @author 故事与猫
 *
 */
public class DateUtils {
	
	
	/**
	 * 获得当前时间  字符串形式
	 * @param i
	 * @return
	 */
	public static String getTime(int i) {
		
		SimpleDateFormat sdf;
		String time = null;
		
		switch (i) {
		case 1:
			sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			time = sdf.format(new Date());
			break;
		case 2:
			sdf = new SimpleDateFormat("yyyy年 MM月dd日 hh:mm");
			time = sdf.format(new Date());
			break;
		case 3:
			sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
			time = sdf.format(new Date());
			break;
		case 4:
			sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			time = sdf.format(new Date());
			break;
		default:
			break;
		}
		
		return time;
	}
	
	
	
	
	
	
}