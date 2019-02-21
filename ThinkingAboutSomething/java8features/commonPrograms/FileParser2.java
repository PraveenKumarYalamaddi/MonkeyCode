package commonPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileParser2 {
	
	String fileName = "E:\\text_file.txt";
	String outFile = "E:\\text_file2.txt";
	
	public void m1() {
		List<String> dataList1 = new ArrayList<String>();
		StringBuilder sb1 = new StringBuilder();
		try {
			Files.lines(Paths.get(fileName)).forEach(s->
			{
			if(s.startsWith("**")) {
				dataList1.add(s.replace("*", "")+"-->");
			}else{
				if(!s.isEmpty())dataList1.add(sb1.append(s).toString());
			}
			});
			dataList1.stream().forEach(
					s->{
						if(s.contains("-->")) {
							String key = s;
							System.out.println(key);
						}else{
							String value = s;
							System.out.println("value***"+value+""+value.length());
							}
						}
					);
			Files.write(Paths.get(outFile), dataList1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void m2() {
		
	}

	public static void main(String[] args) {
		new FileParser2().m1();
	}

}
