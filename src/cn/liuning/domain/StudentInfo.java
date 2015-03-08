package cn.liuning.domain;

public class StudentInfo {
	String xh;
	String xm;
	String xb;
	String nj;
	String zy;
	String bj;
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getNj() {
		return nj;
	}
	public void setNj(String nj) {
		this.nj = nj;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getBj() {
		return bj;
	}
	public void setBj(String bj) {
		this.bj = bj;
	}
	@Override
	public String toString() {
		return "StudentInfo [xh=" + xh + ", xm=" + xm + ", xb=" + xb + ", nj="
				+ nj + ", zy=" + zy + ", bj=" + bj + "]";
	}
	
}
