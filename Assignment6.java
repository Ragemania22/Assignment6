import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment6 {

	public static void main(String[] args) throws Exception{
		
		int wordsCount = 0;
		
		Scanner in = null;
		File file = new File("Happy.txt");
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
			
			while(scanner.hasNextLine()) {
				
				String tmpStr = scanner.nextLine();
				if(!tmpStr.equalsIgnoreCase("")) {
					String replaceAll = tmpStr.replaceAll("\\s+", "");
					wordsCount += tmpStr.split("\\s+").length;
					
				}
				
			}
		
		System.out.println("# of words: " + wordsCount);
		}
		
		Map m1 = new HashMap();
		
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");//those are your words
                for (int i = 0; i < words.length; i++) {
                    if (m1.get(words[i]) == null) {
                        m1.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                        newValue++;
                        m1.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
		Map<String, String> sorted = new TreeMap<String, String>(m1);
        for (Object key : sorted.keySet()) {
            System.out.println("Word: " + key + "\tCounts: " + m1.get(key));
        }

	}

}
