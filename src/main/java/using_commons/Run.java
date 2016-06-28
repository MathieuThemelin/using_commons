package using_commons;

import org.apache.commons.lang3.StringUtils;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StringUtils.isEmpty(null));

		System.out.println(StringUtils.isEmpty(""));

		System.out.println(StringUtils.isEmpty("Test"));
	}

}
