package advance.dev;

public class Student {
	private String ten, diachi, sdt;
	private int tuoi;
	private double dtb;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getTuoi(){
		if(tuoi <= 0) {
			throw new ArithmeticException("Khong duoc la so am");
		}
		else {
			return tuoi;
		}
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getDtb() {
		if(dtb < 0) {
			throw new ArithmeticException("Khong duoc la so am");
		}else {
			return dtb;
		}
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		return "Student ten: " + ten + "\t diachi: " + diachi + "\t sdt: " + sdt + "\t tuoi: " + tuoi + "\t dtb: " + dtb;
	}
	
}
