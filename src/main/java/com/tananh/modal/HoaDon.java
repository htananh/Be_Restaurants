package com.tananh.modal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hoadon")
public class HoaDon {

    @Id
    @Column(name = "ID_Hoadon")
    private Long idHoaDon;

    @Column(name = "ID_KH")
    private Long idKh;

    @Column(name = "ID_Ban")
    private Long idBan;

    @Column(name = "Ngayhd")
    private LocalDate ngayHd;

    @Column(name = "Tienmonan")
    private Integer tienMonAn;

    @Column(name = "Code_Voucher")
    private String codeVoucher;

    @Column(name = "Tiengiam")
    private Integer tienGiam;

    @Column(name = "Tongtien")
    private Integer tongTien;

    @Column(name = "Trangthai")
    private String trangThai;



	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoaDon(Long idHoaDon, Long idKh, Long idBan, LocalDate ngayHd, Integer tienMonAn, String codeVoucher,
			Integer tienGiam, Integer tongTien, String trangThai) {
		super();
		this.idHoaDon = idHoaDon;
		this.idKh = idKh;
		this.idBan = idBan;
		this.ngayHd = ngayHd;
		this.tienMonAn = tienMonAn;
		this.codeVoucher = codeVoucher;
		this.tienGiam = tienGiam;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		
	}

	public Long getIdHoaDon() {
		return idHoaDon;
	}

	public void setIdHoaDon(Long idHoaDon) {
		this.idHoaDon = idHoaDon;
	}

	public Long getIdKh() {
		return idKh;
	}

	public void setIdKh(Long idKh) {
		this.idKh = idKh;
	}

	public Long getIdBan() {
		return idBan;
	}

	public void setIdBan(Long idBan) {
		this.idBan = idBan;
	}

	public LocalDate getNgayHd() {
		return ngayHd;
	}

	public void setNgayHd(LocalDate ngayHd) {
		this.ngayHd = ngayHd;
	}

	public Integer getTienMonAn() {
		return tienMonAn;
	}

	public void setTienMonAn(Integer tienMonAn) {
		this.tienMonAn = tienMonAn;
	}

	public String getCodeVoucher() {
		return codeVoucher;
	}

	public void setCodeVoucher(String codeVoucher) {
		this.codeVoucher = codeVoucher;
	}

	public Integer getTienGiam() {
		return tienGiam;
	}

	public void setTienGiam(Integer tienGiam) {
		this.tienGiam = tienGiam;
	}

	public Integer getTongTien() {
		return tongTien;
	}

	public void setTongTien(Integer tongTien) {
		this.tongTien = tongTien;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

//	public List<CTHD> getCthds() {
//		return cthds;
//	}
//
//	public void setCthds(List<CTHD> cthds) {
//		this.cthds = cthds;
//	}
    
    // Constructors, getters and setters...
    
}

