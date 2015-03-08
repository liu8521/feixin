package cn.liuning.action;

import java.util.List;

import cn.liuning.domain.Strutct;
import cn.liuning.domain.StudentInfo;
import cn.liuning.service.CalculatePoint;



public class GetJidianAction {
	private String xh;
	private Strutct struct;
	private StudentInfo studentInfo;
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public Strutct getStruct() {
		return struct;
	}
	public void setStruct(Strutct struct) {
		this.struct = struct;
	}
	public StudentInfo getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}
	public String execute() throws Exception {
		CalculatePoint calculate = new CalculatePoint();
		    try
		    {
		      List list = calculate.getMessage(this.xh);
		      StudentInfo student = (StudentInfo) list.get(0);
		      Strutct struct = (Strutct) list.get(1);
		      setStruct(struct);
		      setStudentInfo(student);
		      return "success";
		    } catch (Exception e) {
		    	setStruct(null);
			    setStudentInfo(null);
		    }throw new Exception("–≈œ¢¥ÌŒÛ£°");
		  }

}