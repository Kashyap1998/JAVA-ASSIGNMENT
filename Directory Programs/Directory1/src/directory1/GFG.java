package directory1;
import java.io.File;
public class GFG {
	public static void displayFiles(File[] files)
	{
		for(File filename:files)
		{
			if(filename.isDirectory())
			{
			System.out.println("Directory : " +filename.getName());
			displayFiles(filename.listFiles());
			}
			else
			{
				System.out.println("File:"+filename.getName());
			}
		}
	}
	public static void main(String[] args) {
		File[] files=new File(" ").listFiles();
		displayFiles(files);
	}
			
}


