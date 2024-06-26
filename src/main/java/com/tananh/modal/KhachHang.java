package com.tananh.modal;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Khachhang")
public class KhachHang {
	 	@Id 
	    @Column(name = "id_kh")
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idKh;

	    @Column(name = "Tenkh")
	    private String tenKh;

	   
	    @Column(name = "Ngaythamgia")
	    private LocalDateTime ngayThamGia;

	    @Column(name = "Doanhso")
	    private int doanhSo;

	    @Column(name = "Diemtichluy")
	    private int diemTichLuy;

	    // Assuming 'ID_ND' is a foreign key to another table 'ND' for example
	    @Column(name = "ID_ND")
	    private Long idNd;

		public KhachHang() {
			super();
			// TODO Auto-generated constructor stub
		}

		public KhachHang(int idKh, String tenKh, LocalDateTime ngayThamGia, int doanhSo, int diemTichLuy, Long idNd) {
			super();
			this.idKh = idKh;
			this.tenKh = tenKh;
			this.ngayThamGia = ngayThamGia;
			this.doanhSo = doanhSo;
			this.diemTichLuy = diemTichLuy;
			this.idNd = idNd;
		}

		public int getIdKh() {
			return idKh;
		}

		public void setIdKh(int idKh) {
			this.idKh = idKh;
		}

		public String getTenKh() {
			return tenKh;
		}

		public void setTenKh(String tenKh) {
			this.tenKh = tenKh;
		}

		public LocalDateTime getNgayThamGia() {
			return ngayThamGia;
		}

		public void setNgayThamGia(LocalDateTime ngayThamGia) {
			this.ngayThamGia = ngayThamGia;
		}

		public int getDoanhSo() {
			return doanhSo;
		}

		public void setDoanhSo(int doanhSo) {
			this.doanhSo = doanhSo;
		}

		public int getDiemTichLuy() {
			return diemTichLuy;
		}

		public void setDiemTichLuy(int diemTichLuy) {
			this.diemTichLuy = diemTichLuy;
		}

		public Long getIdNd() {
			return idNd;
		}

		public void setIdNd(Long long1) {
			this.idNd = long1;
		}
	    
	    
}
