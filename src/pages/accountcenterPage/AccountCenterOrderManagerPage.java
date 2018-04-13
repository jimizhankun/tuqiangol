package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

/**
 * ��������
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterOrderManagerPage extends AutomateDriver {
	BasePage page;

	@SuppressWarnings("unused")
	public AccountCenterOrderManagerPage(WebDriver dr) {
		super(dr);
		page = new BasePage(dr);
	}

	/**
	 * ���������������� //*[@id="orderNo"]
	 */
	public void orderNoSearch(String orderNo) {

		super.operateInputElement("x,//*[@id=\"orderNo\"]", orderNo);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");

	}

	/**
	 * ����Ʒ������������ //*[@id="productName"]
	 */
	public void productNameSearch(String productName) {
		
		super.clickElement("p.���");

		super.operateInputElement("x,//*[@id=\"productName\"]", productName);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");

	}
	/**
	 * ������������������ //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * �����ײ�
	 */
	public void orderTypeMsgSearch(String productName) {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * ������������������ //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * �绰�ײ�
	 */
	public void orderTypePhoneSearch(String productName) {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * ������״̬�������� //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * δ֧��
	 */
	public void orderStatusNoPaySearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * ������״̬�������� //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * ��֧��
	 */
	public void orderStatusPaySearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * ��֧����ʽ�������� //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * ֧����
	 */
	public void paymentMethodZhiFuBaoSearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * ��֧����ʽ�������� //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * ΢��
	 */
	public void paymentMethodWeiXinSearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * ������ʱ������������  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 */
	public void creationTimeSearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[1]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
	}
	/**
	 * ��֧��ʱ������������  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 */
	public void paymentTimeSearch() {
		
		super.clickElement("p.���");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
	}
	
	public void platformOrderSearch() throws InterruptedException {
		
		super.clickElement("p.���");
		
		super.operateInputElement("x,//*[@id=\"orderNo\"]", "TQ201801121824530520");
		
		super.operateInputElement("x,//*[@id=\"productName\"]", "10");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");
		
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");
		
		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		Thread.sleep(5000);
	}
	//ƽ̨��������
	public void orderExport() {
		
		super.clickElement("p,����");
	}
}
