/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chcao on 6/22/2017.
 */
public class FirstTest {

	public static String getFirstQueryTermNumeric(String query) {
		//get first number
		// String doorNumber = query.replaceFirst(".*?(\\d+).*", "$1");
		// String doorNumber = query.replaceAll(".*?(\\d+[-]?\\d*[a-zA-Z]*).*", "$1");

		// String regEx  = ".*?(\\d+[-]?\\d*[a-zA-Z]*$).*";
		String regEx  = "(\\d+[-]?\\d*\\b)";

		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(query);
		StringBuffer sb = new StringBuffer();
		while(matcher.find()){
			sb.append(matcher.group(1));
		}

		sb.append( " ===== after using replaceAll ===>  ");

		regEx  = "^(\\d+[-]?\\d*\\b)";
		query.replaceAll(regEx,"");
		sb.append(query);

		return sb.toString();
	}

	public static void main(String[] args){

		// String a = "언주로30길 26";
		// String a = "서울특별시 강남구 언주로30";
		String a = "인천광역시 옹진군 덕적면 진리 산77-1";
		// String a = "san 27-1, Seoul, South Korea";

		System.out.println("dorNumber is: "+getFirstQueryTermNumeric(a));

	}

}
