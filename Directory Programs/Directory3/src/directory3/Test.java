package directory3;

import java.io.File;

public class Test {

	public static void deleteDirectory(File file)
	{
		for(File subfile : file.listFiles())
		{
			if(subfile.isDirectory())
			{
				deleteDirectory(subfile);
			}
			subfile.delete();
		}
	}
	public static void main(String[] args) {
		
		{
			String filepath="D:\\Demo\\Extra";
			File f=new File(filepath);
			deleteDirectory(f);
			f.delete();
		}
		
	}

}
