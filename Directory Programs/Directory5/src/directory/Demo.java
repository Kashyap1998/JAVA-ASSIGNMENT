package directory;

import java.io.File;
import java.io.FilenameFilter;

public class Demo implements FileNameFilter, FilenameFilter {
	String initials;
	public Demo(String initials)
	{
		this.initials = initials;
	}
	public boolean accept(File dir, String name)
	{
		return name.startsWith(initials);
	}


	public static void main(String[] args) {
{
			
			File directory = new File("D:\\Demo");
			Demo filter
				= new Demo("Data.txt");
			String[] flist = directory.list(filter);

			if (flist == null) {
				System.out.println(
					"Empty directory or directory does not exists.");
			}
			else {
				for (int i = 0; i < flist.length; i++) {
					System.out.println(flist[i]+" found");
				}
			}
		}
}

	
}
