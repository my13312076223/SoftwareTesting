package com.tjust.info;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith (Parameterized.class)
public class TestInfo {
 
 
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
 
  

  @BeforeClass
  public static void setUp() throws Exception {
	  String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  public String id,name,git;

  public TestInfo (String id,String name,String git)
  {
	  this.id = id;
	  this.name =name;
	  this.git =git;
	  
  }
  @Parameters
  public static Collection<Object[]> value()
  {
	return Arrays.asList(new Object[][]{{"3016218051","�˽�","https://github.com/popboykingdjko"},
			{"3016218052","��С�","https://github.com/xiaoxuaoj"},
			{"3016218053", "����ˮ", "https://github.com/nbdfls"},
            {"3016218054", "����Ⱥ", "https://github.com/hyqzz1"},
            {"3016218055", "������", ""},
            {"3016218056", "���", "https://github.com/FBIbaby"},
            {"3016218057", "���", "https://github.com/riginAI/test"},
            {"3016218058", "�", "https://github.com/likai3016218058"},
            {"3016218059", "���ǿ�", "https://github.com/forAragaki/Software-Testing.git"},
            {"3016218060", "������", "https://github.com/liuchongwei1998"},
            {"3016218061", "����ɭ", "https://github.com/liuyuesen"},
            {"3016218062", "¥��", "https://github.com/loulin206"},
            {"3016218063", "������", "https://github.com/acan777"},
            {"3016218064", "ʯ���", "https://github.com/Winbeeone/Hello-GitHub"},
            {"3016218065", "����", "https://github.com/tangsongTJU"},
            {"3016218066", "���Ӻ�", "https://github.com/LITTLEEEEE/st.git"},
            {"3016218067", "����", "https://github.com/WangChen0902"},
            {"3016218068", "����", "https://github.com/skye0207"},
            {"3016218069", "����", "https://github.com/wanglei201810/HHH.git"},
            {"3016218070", "�Ľ���", ""},
            {"3016218072", "����Ÿ", "https://github.com/Panda216"},
            {"3016218073", "�����", "https://github.com/AQITF/software-testing-course"},
            {"3016218075", "����Զ", "https://github.com/Tyrusmacv"},
            {"3016218076", "�Ŵ�", "https://github.com/Tyrusmacv"},
            {"3016218077", "�ſ���", "https://github.com/DanielKZhang"},
            {"3016218078", "�����", "https://gitee.com/zqfgly"},
            {"3016230028", "����ϼ", "https://github.com/XiaZiXia"},
            {"3016204130", "����", ""},
            {"3016218079", "������", ""},
            {"3016218080", "������", "https://github.com/cyytju"},
            {"3016218081", "�½�", ""},
            {"3016218083", "���B", "https://github.com/HaoFuTju"},
            {"3016218084", "����ܲ", "https://github.com/Ziyiiii"},
            {"3016218085", "������", "https://github.com/guopeiming"},
            {"3016218086", "�����", ""},
            {"3016218087", "������", "https://github.com/brightknight177"},
            {"3016218088", "��־��", "https://github.com/zhijielee"},
            {"3016218089", "������", "https://github.com/guguguzi"},
            {"3016218090", "������", "https://github.com/EchoLiuYinan"},
            {"3016218091", "¬�", "https://github.com/iiTachi/"},
            {"3016218092", "����", ""},
            {"3016218093", "ŷ�����", "https://github.com/SouperO"},
            {"3016218094", "������", "https://github.com/qyhxxx"},
            {"3016218096", "������", "https://github.com/SunCubeIsMyID"},
            {"3016218097", "������", "https://github.com/passerw"},
            {"3016218098", "����", "https://github.com/old-yellow"},
            {"3016218099", "��һ��", "https://github.com/yibowang98"},
            {"3016218100", "κ��", "https://github.com/Landy0524"},
            {"3016218101", "������", "https://github.com/nkaccounting"},
            {"3016218102", "�ų���", "https://github.com/PlatinumYi"},
            {"3016218103", "�ſ�", "https://github.com/zk990202"},
            {"3016218104", "��ε��", "https://github.com/Zwh0508"},
            {"3016218105", "��ӱ��", "https://github.com/newyingyi"},
            {"3016218106", "�Լ��", "https://github.com/uareagay"},
            {"3016218107", "����", "https://github.com/LeilaniZ"},
            {"3016204310", "�����", "https://github.com/hshsilver/softwaretest"},
            {"3016207516", "�����", ""},
            {"3016218108", "����", "https://github.com/Barbra0613"},
            {"3016218109", "��ŵ", "https://github.com/Nicole1772"},
            {"3016218110", "��ɭ��", "https://github.com/csl784513390"},
            {"3016218111", "���Ӻ�", "https://github.com/czhxbz"},
            {"3016218112", "�޸�", "https://github.com/whyNotwh"},
            {"3016218113", "������", "https://github.com/tjugwt"},
            {"3016218114", "��̹", "https://github.com/tjugwt"},
            {"3016218115", "����", "https://github.com/BoHuyyy"},
            {"3016218116", "������", "https://github.com/mangoSteve"},
            {"3016218117", "�����", "https://github.com/mangoSteve"},
            {"3016218118", "����ʢ", "https://github.com/AndrewJYS"},
            {"3016218119", "������", "https://github.com/liphcpp"},
            {"3016218120", "���Ÿ�", "https://github.com/tju-lzg"},
            {"3016218121", "��Ȼ", "https://github.com/Nfboys"},
            {"3016218122", "������", "https://github.com/tcklll/software-testing.git"},
            {"3016218123", "�����", "https://github.com/MHYpony"},
            {"3016218124", "�Ϸ���", "https://github.com/FANBoMeng3016218124/swTest.git"},
            {"3016218125", "������", "https://github.com/tjwhm"},
            {"3016218126", "������", "https://github.com/hnwyx/software-testing"},
            {"3016218127", "������", "https://github.com/wwwwangyiting"},
            {"3016218128", "Фҵ��", "https://github.com/HNSHongTian/SoftwareTesting"},
            {"3016218129", "���躭", "https://github.com/linghanxu-tju/software_testing.git"},
            {"3016218130", "����", "https://github.com/YWlancer"},
            {"3016218131", "�ż���", "https://github.com/oikawamomo/software_test"},
            {"3016218133", "�Խ�", "https://github.com/ZJ921"},
            {"3016218134", "������", "https://github.com/zzzyyyrrr"},
            {"3016218135", "����", "https://github.com/tjudoubi"},
            {"3014218120", "����", "https://github.com/SoSoSorry"},
            {"3016218136", "���κ϶�����ľ��", "https://github.com/users/azzr997/projects/1"},
            {"3016218137", "���ַ�", "https://github.com/SryTo/SoftwareTesting.git"},
            {"3016218138", "����", "https://github.com/STHARUKI"},
            {"3016218139", "���", "https://github.com/skadoodleR"},
            {"3016218140", "��𩻪", "https://github.com/Potmon/STT2016.git"},
            {"3016218141", "�����", "https://github.com/everlastingstars"},
            {"3016218142", "��ɯ���ᡤ����������", "https://github.com/Lothric19"},
            {"3016218143", "�����", "https://github.com/bxsj/"},
            {"3016218144", "�����", "https://github.com/0-Avalon-0"},
            {"3016218145", "������", "https://github.com/mssjliwenxu"},
            {"3016218146", "������", "https://github.com/MaoMaoChina"},
            {"3016218147", "������", "https://github.com/LiuChunY"},
            {"3016218148", "����", "https://github.com/liuzhidemaomao"},
            {"3016218149", "¦����", "https://github.com/Lou11300306?tab=projects"},
            {"3016218150", "����", "https://github.com/Horsepower8888"},
            {"3016218151", "�˷���", "https://github.com/Skypfx/softwareTesting"},
            {"3016218152", "ʯ����", "https://github.com/colindying"},
            {"3016218153", "ʷ����", "https://github.com/htmmd27"},
            {"3016218154", "ʷ��", "https://github.com/tjuspAIC/Software-Testing"},
            {"3016218155", "����", "https://github.com/Vincent-Sun"},
            {"3016218156", "̷����", "https://github.com/980801"},
            {"3016218157", "����", "https://github.com/ChenHsing"},
            {"3016218158", "����", "https://github.com/yangmeng19980420"},
            {"3016218159", "�Ż���", "https://github.com/Ives66"},
            {"3016218160", "�Ż�", "https://github.com/zhuang12/SoftwareTest.git"},
            {"3016218161", "������", "https://github.com/michellezyw"},
            {"3016218162", "��ݼ��", "https://github.com/Cyphexl"},
            {"3016218163", "����ع", "https://github.com/lazygirlyu/homework"},
            {"3016218164", "ף����", "https://github.com/GZhuJJ/SoftwareTestingCourse"},
            {"3016207275", "���", "https://github.com/Lzhaohui"},
            {"3016214077", "������", "https://github.com/ZhaoMingYang-tju"},
            {"3016218165", "���ι�������������", "https://github.com/azhar241892"},
            {"3016218166", "�����", "https://github.com/husuhusuhusu"},
            {"3016218167", "������", "https://github.com/DemonTimor"},
            {"3016218168", "����", "https://github.com/JoHnHC"},
            {"3016218169", "���", "https://github.com/ritian-hh"},
            {"3016218170", "�ƶ�÷", "https://github.com/hdm926"},
            {"3016218171", "������", "https://github.com/AWenXiong"},
            {"3016218172", "������", "https://github.com/SSFDLware/software-testing"},
            {"3016218173", "������", "https://github.com/yangyi66"},
            {"3016218174", "���ĺ�", "https://gitee.com/tju_hei/software_test.git"},
            {"3016218175", "����", "https://github.com/liuyang806"},
            {"3016218176", "Ī����", "mcyatom@gmail.com"},
            {"3016218177", "������", "https://github.com/ElegantQiu"},
            {"3016218178", "������", "https://github.com/sqq7777"},
            {"3016218179", "������", "https://github.com/suimingben"},
            {"3016218180", "������", "https://github.com/sqis777?tab=repositories"},
            {"3016218181", "���", "https://culturepanda.github.io/SoftwareTesting/"},
            {"3016218182", "��־��", "https://github.com/YourBrotherTT/softwareTesting.git"},
            {"3016218183", "����", "https://github.com/guuuuji/Software-test.git"},
            {"3016218184", "л����", "https://github.com/fallentree"},
            {"3016218186", "Ҷ����", "https://github.com/MarcusNerva"},
            {"3016218187", "�������������������", "https://github.com/ilgarrr"},
            {"3016218188", "������", "https://github.com/githaub/homework.git"},
            {"3016218189", "������", "https://github.com/llmgpty/tjuscsst.git"},
            {"3016218190", "������", "https://github.com/ZhonglinZ"},
            {"3016218191", "ף��Ԫ", "https://github.com/ZHUKAIYUAN0/test"},
            {"3016218192", "�����", "https://github.com/jianxin-YL"},
	});
	  
  }
  @Test
  public void testInfo() throws Exception {
    driver.get(baseUrl + "/");
    WebElement we = driver.findElement(By.name("id"));
    we.click();
    we.sendKeys(id);
    WebElement w=driver.findElement(By.name("password"));
    w.click();
    w.sendKeys(id.substring(id.length()-6));
    WebElement sub = driver.findElement(By.id("btn_login"));
    sub.click();
    assertEquals(id, driver.findElement(By.id("student-id")).getText());
    assertEquals(name, driver.findElement(By.id("student-name")).getText());
    assertEquals(git, driver.findElement(By.id("student-git")).getText());
    WebElement logout = driver.findElement(By.id("btn_logout"));
    logout.click();
    WebElement back = driver.findElement(By.id("btn_return"));
    back.click();
  }

  @After
  public void tearDown() throws Exception {
//      driver.close()
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
