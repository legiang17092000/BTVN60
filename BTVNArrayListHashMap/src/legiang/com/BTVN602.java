package legiang.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BTVN602 {

	public static void main(String[] args) {
		do {
			menu();
		}
		while(true);
		
	}

	private static void menu() {
		System.out.println("Mời bạn chọn chức năng: ");
		System.out.println("1. Thêm Sinh viên");
		System.out.println("2. Xuất danh sách Sinh viên");
		System.out.println("3. Sửa Sinh viên ");
		System.out.println("4. Xóa Sinh viên có tên bất kỳ ");
		System.out.println("5. Tìm kiếm tên Sinh viên ");
		System.out.println("6. Xuất tất cả các MÃ SINH VIÊN ");
		System.out.println("7. Xuất tất cả các TÊN SINH VIÊN");
		System.out.println("8.Thoát phần mềm ");
		int kq=new Scanner(System.in).nextInt();
		switch (kq) {
		case 1:		
			themSV();
			break;
		case 2:
			xuatToanBo();
			break;
		case 3:
			suaSV();
			break;
		case 4:
			xoaSV();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			xuatMa();
			break;
		case 7:
			xuatTen();
			break;
		case 8:
			System.out.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}

	static HashMap<Integer,String> dsSV=new HashMap<Integer, String>();
	private static void xuatTen() {
		for(Map.Entry<Integer,String> item:dsSV.entrySet())
		{
			System.out.println(item.getValue());
		}
	}

	private static void xuatMa() {
		for(Map.Entry<Integer,String> item:dsSV.entrySet())
		{
			System.out.println(item.getKey());
		}
	}
	
	private static void timKiem() {
		System.out.println("Nhập tên SV mà bạn muốn tìm: ");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer,String> item:dsSV.entrySet())
		{
			if(item.getValue().contains(ten))
				System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}

	private static void xoaSV() {
		
		System.out.println("Bạn muốn xóa SV có tên là: ");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> item:dsSV.entrySet())
		{
			if(item.getValue().contains(ten))
			{
				System.out.println(item.getKey());
			}
		}
	}

	private static void suaSV() {
		xuatToanBo();
		System.out.println("Bạn muốn sửa SV có mã là: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Tên mới của SV đó là: ");
		String ten=new Scanner(System.in).nextLine();
		dsSV.put(ma,ten);
	}

	private static void xuatToanBo() {
		System.out.println("Mã \t Tên SV");
		for(Map.Entry<Integer, String> item :dsSV.entrySet()) {
			System.out.println(item.getKey()+" \t "+item.getValue());
		}
	}

	private static void themSV() {
		System.out.println("Nhập vào mã SV: ");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập vào tên SV");
		String ten=new Scanner(System.in).nextLine();
		dsSV.put(ma,ten);
	}

}
