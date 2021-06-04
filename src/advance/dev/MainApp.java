package advance.dev;

import java.util.*;

public class MainApp {
	public static void input(List<Student> studentList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sv: ");
		String ten = sc.next();
		System.out.println("Nhap tuoi sv: ");
		int tuoi = sc.nextInt();
		System.out.println("Nhap dia chi: ");
		String diachi = sc.next();
		System.out.println("Nhap sdt: ");
		String sdt = sc.next();
		System.out.println("Nhap dtb: ");
		double dtb = sc.nextDouble();
		Student std = new Student();
		std.setDiachi(diachi);
		std.setDtb(dtb);
		std.setSdt(sdt);
		std.setTen(ten);
		std.setTuoi(tuoi);
		studentList.add(std);
	}
	public static void print(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		input(studentList);
		input(studentList);
		input(studentList);
		print(studentList);	
		studentList.sort(Comparator.comparing(Student::getDtb).reversed());
		System.out.println("Sau khi sap xep");
		print(studentList);
	}
}
