package quanly;

import java.awt.RenderingHints.Key;
import java.util.Scanner;
import java.util.Vector;

public class Quanlynhanvien {
	Vector ds=new Vector();
	Scanner key = new Scanner(System.in);
	public Quanlynhanvien() {
		while(true) {
		System.out.println("Quan ly nhan vien");
			System.out.println("1. Nhap nhan vien");
			System.out.println("2. Xem nhan vien");
			int n;
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: nhapTT();
					break;
				case 2: inTT();
					break;
			}
	}
		}
	public void nhapTT() {
		System.out.println("Nhập số lượng nhan viên cần thêm:  ");
		int num= key.nextInt();
		for(int i=0;i<num; i++) {
			
			System.out.println("Nhập ID ");
			int ID= key.nextInt();
			System.out.println("Nhập Tên ");
			String Ten= key.next();
			System.out.println("Nhập Tuổi ");
			int tuoi= key.nextInt();
			nv a= new nv(ID, Ten, tuoi);
			ds.add(a);
		}
	}
		public void inTT() {
			for(int i=0;i<ds.size();i++) {
				nv a = (nv) ds.elementAt(i);
				a.print();
		}
	}
	public static void main(String[] arg) {
		new Quanlynhanvien();
	}
}
class nv{
	int ID;
	String Ten;
	int tuoi;
	public nv(int ID, String Ten, int tuoi) {
		this.ID=ID;
		this.Ten=Ten;
		this.tuoi= tuoi;
	}
	public void print() {
		
		System.out.println("ID: "+ ID+"\t Tên: "+Ten+"\tTuoi:"+tuoi);
	}
}