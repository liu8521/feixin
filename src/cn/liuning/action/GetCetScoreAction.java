package cn.liuning.action;

import cn.liuning.domain.CetScore;
import cn.liuning.service.CetScoreService;
import com.opensymphony.xwork2.ActionSupport;

public class GetCetScoreAction extends ActionSupport
{
  private String number;
  private String name;
  private CetScore score;

  public String getNumber()
  {
    return this.number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public CetScore getScore() {
    return this.score;
  }
  public void setScore(CetScore score) {
    this.score = score;
  }

  public String execute() throws Exception {
    CetScoreService service = new CetScoreService();
    try
    {
      CetScore score = service.find_GetofCet(this.number, this.name);

      setScore(score);

      return "success";
    } catch (Exception e) {
      setScore(null);
    }throw new Exception("–≈œ¢¥ÌŒÛ£°");
  }
}