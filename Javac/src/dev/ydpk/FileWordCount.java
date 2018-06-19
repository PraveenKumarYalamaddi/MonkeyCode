package dev.ydpk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FileWordCount {

	private static BufferedReader br;
	private static BufferedWriter bw;

	public static void main(String[] args){
		File input = new File(args[0]);
		File output = new File(args[1]);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String readLine;
		try {
			br = new BufferedReader(new FileReader(input));
			while ((readLine = br.readLine()) != null) {
				String[] lineData = readLine.toLowerCase().split("\\W+");
				Arrays.sort(lineData);
				for (String s : lineData) {
					if (map.containsKey(s)) {
						map.put(s, map.get(s) + 1);
					} else {
						map.put(s, 1);
					}
				}
			}

			bw = new BufferedWriter(new FileWriter(output));
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "  " + entry.getValue());
				bw.write(entry.getKey() + "--->" + entry.getValue());
				bw.newLine();

			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
