package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("C:\\Users\\Allah\\eclipse-workspace\\ShopApothekeFramework\\src\\test\\resources\\configFiles\\config.properties");
		Properties p=new Properties();
		p.load(fr);
		
		System.out.print(p.getProperty("browser"));
	}

}
