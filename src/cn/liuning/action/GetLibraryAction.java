package cn.liuning.action;

import cn.liuning.service.LibraryService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class GetLibraryAction extends ActionSupport
{
  private String number;
  private String password;
  private List booklist;

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

  public List getBooklist() {
    return this.booklist;
  }
  public void setBooklist(List booklist) {
    this.booklist = booklist;
  }

  public String execute() throws Exception {
    LibraryService service = new LibraryService();
    try
    {
      List booklist = service.find_library(this.number, this.password);
      setBooklist(booklist);
      return "success";
    } catch (Exception e) {
      setBooklist(null);
    }throw new Exception("–≈œ¢¥ÌŒÛ£°");
  }
}