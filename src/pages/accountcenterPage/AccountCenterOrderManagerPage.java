package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
import pages.base.BasePage;

/**
 * 订单管理
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
	 * 按订单号搜索订单 //*[@id="orderNo"]
	 */
	public void orderNoSearch(String orderNo) {

		super.operateInputElement("x,//*[@id=\"orderNo\"]", orderNo);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");

	}

	/**
	 * 按商品名称搜索订单 //*[@id="productName"]
	 */
	public void productNameSearch(String productName) {
		
		super.clickElement("p.清空");

		super.operateInputElement("x,//*[@id=\"productName\"]", productName);

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");

	}
	/**
	 * 按订单类型搜索订单 //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * 短信套餐
	 */
	public void orderTypeMsgSearch(String productName) {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * 按订单类型搜索订单 //*[@id="qryForm"]/div[2]/div[2]/div/div/div/span[2]
	 * 电话套餐
	 */
	public void orderTypePhoneSearch(String productName) {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[2]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * 按订单状态搜索订单 //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * 未支付
	 */
	public void orderStatusNoPaySearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * 按订单状态搜索订单 //*[@id="qryForm"]/div[2]/div[3]/div/div/div/span[2]
	 * 已支付
	 */
	public void orderStatusPaySearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[3]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * 按支付方式搜索订单 //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * 支付宝
	 */
	public void paymentMethodZhiFuBaoSearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	/**
	 * 按支付方式搜索订单 //*[@id="qryForm"]/div[2]/div[4]/div/div/div/span[2]
	 * 微信
	 */
	public void paymentMethodWeiXinSearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[2]/div[4]/div/div/div/div/ul/li[3]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
	}
	
	/**
	 * 按创建时间来搜索订单  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 */
	public void creationTimeSearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[1]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
	}
	/**
	 * 按支付时间来搜索订单  //*[@id="qryForm"]/div[1]/div[2]/div/div/div/span[2]
	 * //*[@id="qryForm"]/div[1]/div[2]/div/div/div/div/ul/li[2]
	 */
	public void paymentTimeSearch() {
		
		super.clickElement("p.清空");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/span[2]");

		super.clickElement("x,//*[@id=\"qryForm\"]/div[1]/div[2]/div/div/div/div/ul/li[2]");

		super.clickElement("x,//*[@id=\"queryorderinfo\"]");
		
	}
	
	public void platformOrderSearch() throws InterruptedException {
		
		super.clickElement("p.清空");
		
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
	//平台订单导出
	public void orderExport() {
		
		super.clickElement("p,导出");
	}
}
