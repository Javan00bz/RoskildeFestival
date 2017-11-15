import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RoskildeFestival {

	public static ArrayList<String> file1() {

		ArrayList<String> lines1 = new ArrayList<String>();

		try {
			BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
			String line = "\r\n";
			while ((line = reader1.readLine()) != null) {
				lines1.add(line);
			}
			System.out.println(lines1);
			reader1.close();
		} catch (IOException e) {
			System.out.println("error");
		} finally {
			System.out.println("file1 read");
		}
		return lines1;
	}
}
