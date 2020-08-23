package entity;

public class Book {
	private String ten;
	private String xuatXu;
	private String loai;
	private float gia;
	private int soTrang;

	public Book() {

	}

	public Book(String ten, String xuatXu, String loai, float gia, int soTrang) {
		this.ten = ten;
		this.xuatXu = xuatXu;
		this.loai = loai;
		this.gia = gia;
		this.soTrang = soTrang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Book " + ten + ", xuatXu=" + xuatXu + ", loai=" + loai + ", gia=" + gia + ", soTrang=" + soTrang;
	}

}
