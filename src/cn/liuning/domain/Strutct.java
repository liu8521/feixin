package cn.liuning.domain;

public class Strutct {
	double totaljidian;
	double totalxuefen;
	double averagejidian;
	public double getTotaljidian() {
		return totaljidian;
	}
	public void setTotaljidian(double totaljidian) {
		this.totaljidian = totaljidian;
	}
	public double getTotalxuefen() {
		return totalxuefen;
	}
	public void setTotalxuefen(double totalxuefen) {
		this.totalxuefen = totalxuefen;
	}
	public double getAveragejidian() {
		return averagejidian;
	}
	public void setAveragejidian(double averagejidian) {
		this.averagejidian = averagejidian;
	}
	public Strutct(double totaljidian, double totalxuefen, double averagejidian) {
		super();
		this.totaljidian = totaljidian;
		this.totalxuefen = totalxuefen;
		this.averagejidian = averagejidian;
	}
	public Strutct() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "Strutct [totaljidian=" + totaljidian + ", totalxuefen="
				+ totalxuefen + ", averagejidian=" + averagejidian + "]";
	}
	
}
