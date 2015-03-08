package cn.liuning.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintStream;
import java.util.List;

public class GetSdutSoreAction extends ActionSupport
{
  private String number;
  private String password;
  private List scorelist;

  public String getNumber()
  {
    return this.number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public String getPassword() {
    return this.password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public List getScorelist() {
    return this.scorelist;
  }
  public void setScorelist(List scorelist) {
    this.scorelist = scorelist;
  }

  public String execute() throws Exception
  {
    System.out.println(this.number);
    System.out.println(this.password);

    return "success";
  }
}