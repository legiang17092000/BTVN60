package legiang.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BTVN601 {

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
		System.out.println("6. Sắp xếp Sinh viên ");
		System.out.println("7. Xuất số lượng Sinh viên ");
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
			sapXep();
			break;
		case 7:
			xuatSoLuong();
			break;
		case 8:
			System.out.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}

	static ArrayList<String> dsSV= new ArrayList<String>();
	
	private static void xuatSoLuong() {
		System.out.println("-----------------------------------");
		System.out.println("Số lượng sinh viên là: "+dsSV.size());
	}

	private static void sapXep() {
		System.out.println("-----------------------------------");
		Collections.sort(dsSV);
		xuatToanBo();
	}

	private static void timKiem() {
		System.out.println("-----------------------------------");
		System.out.println("Nhập TÊN SINH VIÊN bạn muốn tìm: ");
		String kq= new Scanner(System.in).nextLine();
		for (int i = 0; i < dsSV.size(); i++) {
			String tenSV=dsSV.get(i);
			if(tenSV.endsWith(kq))
			{
				System.out.println(tenSV);
			}
		}
		
	}

	private static void xoaSV() {
		System.out.println("-----------------------------------");
		System.out.println("Nhập tên sinh viên bạn muốn xóa: ");
		String kq= new Scanner(System.in).nextLine();
		for (int i = 0; i <dsSV.size(); i++) {
			String tenSV=dsSV.get(i);
			if(tenSV.endsWith(kq))
			{
				dsSV.remove(i);
			}
		}
	}

	private static void suaSV() {
		System.out.println("-----------------------------------");
		for (int i = 0; i < dsSV.size(); i++) {
			System.out.println((i+1)+". "+dsSV.get(i));
		}
		System.out.println("Bạn muốn sửa tên thứ mấy: ");
		int kq= new Scanner(System.in).nextInt();
		System.out.println("Tên mới là: ");
		String tenMoi=new Scanner(System.in).nextLine();
		dsSV.set((kq-1),tenMoi);
	}

	private static void xuatToanBo() {

		System.out.println("-----------------------------------");
		for(String s:dsSV)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
	}

	private static void themSV() {

		System.out.println("Mời bạn nhập HỌ VÀ TÊN SINH VIÊN: ");
		String kq= new Scanner(System.in).nextLine();
		dsSV.add(kq);
	}
	

}
