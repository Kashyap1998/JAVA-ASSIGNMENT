package list5;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
	  ArrayList<String> list=new ArrayList<String>();
	  list.add("JavaFX");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      list.add("OpenNLP");
      list.add("JOGL");
      list.add("Hadoop");
      list.add("HBase");
      list.add("Flume");
      list.add("Mahout");
      list.add("Impala");
      System.out.println("Contents of the Array List:\n" +list);
      list.subList(4, 9).clear();
      System.out.println("Contents of the Array List after removing the sublist:\n"+list);
	}

}
