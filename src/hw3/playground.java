package hw3;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;

public class playground {

	public static void main(String[] args) {
		
      //輸出 -1 (沒找到傳回 -1)
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String option=sc.next(); 

		//		String s = "test", t = "1";

		 if(option.startsWith("i")){
			System.out.println("存在");  
			int value = Integer.parseInt(option.substring(1));
			System.out.println(value);  
			}
		 else{
			 System.out.println("不存在");  
			}
		 
		 
//		 System.out.println("不存在");  
//		 System.out.println(option.substring(1));
		 }
	
	 //String substring(int beginIndex)
	 //擷取自指定位置 beginIndex 至字串結尾的子字串。
	
//	  "Hello".substring(1);
//		ArrayList<Integer> array = new ArrayList<Integer>();
//
//		String filePath = hw3.class.getResource("").getPath().replace("file:", "") + "/binarytree.txt"; // 文件和該類在同個目錄下
//		BufferedReader reader = null;
//		try {
//			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
//			String mustSplitString = reader.readLine();
//			String[] AfterSplit = mustSplitString.split(",");
//			for (int i = 0; i < AfterSplit.length; i++) {
//				System.out.print(AfterSplit[i] + ",");
//				array.add(Integer.parseInt(AfterSplit[i]));
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				reader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("陣列走訪:");
//		for (int i = 0; i < array.size(); i++) {
//			System.out.print("[" + array.get(i) + "]");
//		}
//		System.out.println("");
//		
		
		
		
	
	}


