package legiang.com.test;

import java.util.Scanner;

import legiang.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {

		System.out.println("Nhập họ của NV1: ");
		String ho1=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên của NV1: ");
		String ten1=new Scanner(System.in).nextLine();
		System.out.println("Nhập số sản phẩm của NV1: ");
		int soSP1=new Scanner(System.in).nextInt();		
		
		System.out.println("Nhập họ của NV2: ");
		String ho2=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên của NV2: ");
		String ten2=new Scanner(System.in).nextLine();
		System.out.println("Nhập số sản phẩm của NV2: ");
		int soSP2=new Scanner(System.in).nextInt();
		
		NhanVien nv1=new NhanVien(ho1, ten1, soSP1);
		NhanVien nv2 =new NhanVien(ho2, ten2, soSP2);
		System.out.println("Số lương của NV1 là: "+nv1.tinhLuong());
		System.out.println("Số lương của NV2 là: "+nv2.tinhLuong());
		
		//Cách 1
		if(nv1.LonHon(nv2)==true)
		{
			System.out.println("NV1 có số sản phẩm nhiều hơn và nhiều hơn "+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		}
		else 
		{
			System.out.println("NV2 có số sản phẩm nhiều hơn và nhiều hơn "+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		}
		
		//Cách 2
		if(nv1.getSoSP()>nv2.getSoSP())
		{
			System.out.println("NV1 có số sản phẩm nhiều hơn và nhiều hơn "+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		}
		else 
		{
			System.out.println("NV2 có số sản phẩm nhiều hơn và nhiều hơn "+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		}
	}

}
