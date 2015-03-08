package cn.liuning.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.liuning.domain.Book;
import cn.liuning.domain.CetScore;
import cn.liuning.domain.Strutct;
import cn.liuning.domain.StudentInfo;

public class PublicUtils
{
	public static List getList_Htmltojavabean(String str)
	  {
		double totaljidian=0;
		double totalxuefen=0;
		double avaragejidian=0;
		Strutct struct = new Strutct();
		StudentInfo studentInfo = new StudentInfo();
		List list = new ArrayList();
		
		Set set = new HashSet();
		set.add("aaaa");
	    Document doc = Jsoup.parse(str);
	    Element table = doc.getElementsByTag("table").get(0);
	    Elements trs = table.getElementsByTag("tr");
	    Elements temp = trs.get(2).getElementsByTag("td");
	    studentInfo.setXh(temp.get(0).text().substring(1));
	    studentInfo.setXm(temp.get(1).text().substring(1));
	    studentInfo.setXb(temp.get(2).text().substring(1));
	    studentInfo.setNj(temp.get(3).text().substring(1));
	    studentInfo.setZy(temp.get(5).text().substring(1));
	    studentInfo.setBj(temp.get(6).text().substring(1));
	    for (int i = 10; i < trs.size(); i++)
	    {
	    	//System.out.println("*****第"+i+"行******");
	    	  //得到第i行的所有内容
	          Element current_tr = trs.get(i);
	          
	    	  Element td = current_tr.getElementsByTag("td").get(0);
	    	  String xh = td.text().substring(1);
	    	 // System.out.println("*****序号"+xh+"******");
	    	 //System.out.println(current_tr.text());
	    	  if(!xh.equals("") && xh!=null)
	    	  {
	    		  Element td_ = current_tr.getElementsByTag("td").get(5);
		    	  String kcmc = td_.text().substring(1);
		    	  
	    		  Element td1 = current_tr.getElementsByTag("td").get(7);
	    		  double currentxuefen = Double.parseDouble(td1.text().substring(1));
	    		  Element td2 = current_tr.getElementsByTag("td").get(9);
	    		  double currentjidian = 0;
	    		  String str1 = td2.text().substring(1);
	    		  if(str1.equals("及格") || str1.equals("差")){
	    			  currentjidian = 62.0;
	    		  }else if(str1.equals("中等") || str1.equals("中")){
	    			  currentjidian = 73.0;
	    		  }else if(str1.equals("良好") || str1.equals("良")){
	    			  currentjidian = 84.0;
	    		  }else if(str1.equals("优秀") || str1.equals("优")){
	    			  currentjidian = 95.0;
	    		  }else if(str1.equals("缺考")){
  				  currentjidian=0;
  			  }else if(str1.equals("合格")){
  				  currentjidian=70;
  			  }else{
	    			  //考试分数不足60
	    			  if(str1.equals("不合格") ||str1.equals("不及格")|| Double.parseDouble(td2.text().substring(1)) < 60.0 || td2.text().substring(1).equals("缓考")){
	    				  //判断补考成绩
	    				  Element td3 = current_tr.getElementsByTag("td").get(10);
	    				  String str2 = td3.text().substring(1);
	    				  if(str2==null||
	    						  str2.equals("")||
	    						  str2.equals("缺考") ||
	    						  str2.equals("不合格")||
	    						  str2.equals("不及格")||
	    						  Double.parseDouble(str2)<60.0
	    						  ){
	    					  currentjidian=0;
	    				  }else{
	    					  currentjidian=60.0;
	    				  }
	    			  }else{
	    				  currentjidian=Double.parseDouble(td2.text().substring(1));
	    			  }
	    			  
	    		  }
	    		  if(!set.contains(kcmc)){
	    			  totalxuefen = totalxuefen + currentxuefen;
	    			  set.add(kcmc);
	    		  }
	    		  totaljidian = totaljidian + currentjidian*currentxuefen;
	    	  }else{
	    		  break;
	    	  }
	     }
	    avaragejidian = totaljidian/totalxuefen;
	    struct.setAveragejidian(avaragejidian);
	    struct.setTotaljidian(totaljidian);
	    struct.setTotalxuefen(totalxuefen);
	   list.add(studentInfo);
	   list.add(struct);
	   return list;
	  }
	
  public static CetScore getList_CetHtmltojavabean(String str)
  {
    Document doc = Jsoup.parse(str);
    Element table = doc.getElementsByTag("table").get(1);
    Elements trs = table.getElementsByTag("tr");
    CetScore score = new CetScore();
    for (int i = 0; i < trs.size(); i++)
    {
      Element current_tr = trs.get(i);
      Element td = current_tr.getElementsByTag("td").get(0);
      String text = td.text();
      if (i == 0) {
        score.setName(text);
      } else if (i == 1) {
        score.setSchool(text);
      } else if (i == 2) {
        score.setCategory(text);
      } else if (i == 3) {
        score.setExamnumber(text);
      } else if (i == 4) {
        score.setTestTime(text);
      } else if (i == 5) {
        score.setTotalScore(text.substring(0, 3));
        score.setListen(text.substring(8, 11));
        score.setReading(text.substring(16, 20));
        score.setTranslate(text.substring(27, 30));
      }
    }
    return score;
  }

  public List<Book> changeTobean(String str)
  {
    Document doc = Jsoup.parse(str);
    Element table = doc.getElementsByTag("table").get(0);
    Elements trs = table.getElementsByTag("tr");
    ArrayList list = new ArrayList();

    for (int i = 1; i < trs.size(); i++)
    {
      Element tr1 = trs.get(i);
      Elements tds = tr1.getElementsByTag("td");
      Book book = new Book();
      for (int j = 0; j < tds.size() - 2; j++)
      {
        Element td = tds.get(j);
        String text = td.text();
        System.out.println(text);
        if (j == 0) {
          book.setBarcode(text);
        }
        else if (j == 1) {
          book.setBookname(text);
        }
        else if (j == 2) {
          book.setAuthor(text);
        }
        else if (j == 3) {
          book.setBorrowdate(text);
        }
        else if (j == 4) {
          book.setReturndate(text);
        }
        else if (j == 5) {
          book.setCollectplace(text);
        }
      }
      list.add(book);
    }

    return list;
  }
}