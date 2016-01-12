package hw3;

import java.io.*;

class hw3 {
	// 寫文件
	public void writerTxt() {
		BufferedWriter fw = null;
		try {
			File file = new File("c://binarytree.txt");
			fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // 指點編碼格式，以免讀取時中文字符異常
			fw.append("23,57,8,45,12,33,56,6,77,37");
			fw.flush(); // 全部寫入緩存中的內容
			System.out.println("binarytree.txt was created");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 讀文件
	public void readTxt() {
		String filePath = hw3.class.getResource("").getPath().replace("file:", "") + "/test.txt"; // 文件和該類在同個目錄下
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8")); // 指定讀取文件的編碼格式，以免出現中文亂碼
			String str = null;
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		hw3 obj = new hw3();
		obj.writerTxt();
	}
}
