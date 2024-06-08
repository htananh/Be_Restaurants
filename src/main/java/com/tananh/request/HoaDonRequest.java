package com.tananh.request;

import java.time.LocalDate;


public class HoaDonRequest {
	
    private Long idKh;

    
    private Long idBan;

   
    private LocalDate ngayHd;

    
    private Integer tienMonAn;

   
    private String codeVoucher;

    
    private Integer tienGiam;

    
    private Integer tongTien;

    
    private String trangThai;


	public HoaDonRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HoaDonRequest(Long idKh, Long idBan, LocalDate ngayHd, Integer tienMonAn, String codeVoucher,
			Integer tienGiam, Integer tongTien, String trangThai) {
		super();
		this.idKh = idKh;
		this.idBan = idBan;
		this.ngayHd = ngayHd;
		this.tienMonAn = tienMonAn;
		this.codeVoucher = codeVoucher;
		this.tienGiam = tienGiam;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
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
    
    
}
