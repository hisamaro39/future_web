package app;

public class Util {
	static boolean is_post_code(String post_code) {
		try {
			String former_post_code = post_code.substring(0,3);
			String latter_post_code = post_code.substring(4,8);
			String haihun = post_code.substring(3,4);
		}
		catch(StringIndexOutOfBoundsException e) {
			return false;
		}
		try {
			String former_post_code = post_code.substring(0,3);
			String latter_post_code = post_code.substring(4,8);
			String haihun = post_code.substring(3,4);
			Integer.parseInt(former_post_code);
			Integer.parseInt(latter_post_code);
			if(haihun.equals("-")) return true;
			else return false;
		} catch (NumberFormatException e){
			return false;
		}
	}

	static boolean is_date(String date) {
		try {
			String year = date.substring(0,4);
			String month = date.substring(5,7);
			String day = date.substring(8,10);
			String haihun1 = date.substring(4,5);
			String haihun2 = date.substring(7,8);
		}
		catch(StringIndexOutOfBoundsException e) {
			return false;
		}
		try {
			String year = date.substring(0,4);
			String month = date.substring(5,7);
			String day = date.substring(8,10);
			String haihun1 = date.substring(4,5);
			String haihun2 = date.substring(7,8);
			Integer.parseInt(year);
			Integer.parseInt(month);
			Integer.parseInt(day);
			if(haihun1.equals("-") && haihun2.equals("-")) return true;
			else return false;
		} catch (NumberFormatException e){
			return false;
		}
	}

	static boolean correct_entry_retire(String entry, String retire) {

		String year1 = entry.substring(0,4);
		String month1 = entry.substring(5,7);
		String day1 = entry.substring(8,10);
		String year2 = retire.substring(0,4);
		String month2 = retire.substring(5,7);
		String day2 = retire.substring(8,10);
		String date1 = year1 + month1 + day1;
		String date2 = year2 + month2 + day2;
		System.out.println(date1);
		System.out.println(date2);

		if(Integer.parseInt(date2) >= Integer.parseInt(date1)) return true;
		else return false;

	}


}
