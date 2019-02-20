package commonPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
	
	String fileName = "E:\\text_file.txt";
	String outFile = "E:\\text_file2.txt";
	
	public void parseFile() {
		List<String> dataList = new ArrayList<String>();		
		try {
			Files.lines(Paths.get(fileName)).forEach(
				s -> {
					if(s.startsWith("*****")) {
						dataList.add(s.replace("*", "")+" ->");
					}else{
						dataList.add(s);
					}	
				}
			);
			Files.write(Paths.get(outFile), dataList);
			System.out.println(dataList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {	
		new FileParser().parseFile();
	}

}
