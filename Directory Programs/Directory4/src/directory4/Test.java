package directory4;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		String d="D:\\Demo\\a\\b\\c\\d";
		File f=new File(d);
		boolean result=f.mkdirs();
		System.out.println("Status = " + result);
	}

	}


