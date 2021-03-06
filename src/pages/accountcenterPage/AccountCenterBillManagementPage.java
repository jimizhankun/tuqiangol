package pages.accountcenterPage;

import org.openqa.selenium.WebDriver;

import automatedriver.AutomateDriver;
/**
 * 账单管理页面 BillManagementPage
 * @author ZhanKun
 *
 */
public class AccountCenterBillManagementPage extends AutomateDriver {
	/**
	 * 账单管理  默认时间条件
	 */
	public static final String BILL_DEFALT_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/span[2]";
	/**
	 * 账单管理  今天时间条件
	 */
	public static final String BILL_TODAY_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[1]";
	/**
	 * 账单管理  本周时间条件
	 */
	public static final String BILL_THIS_WEEK_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[2]";
	/**
	 * 账单管理  本月时间条件
	 */
	public static final String BILL_THIS_MONTH_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[3]";
	/**
	 * 账单管理  上月时间条件
	 */
	public static final String BILL_LAST_MONTH_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[4]";
	/**
	 * 账单管理  自定义时间条件
	 */
	public static final String BILL_CUSTOM_TIME_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[1]/div/div/div/div/ul/li[5]";
	/**
	 * 账单管理  告警设备IMEI条件
	 */
	public static final String BILL_ALARM_DEVICE_IMEI_ELEMENT = "x,//*[@id=\"imei\"]";
	/**
	 * 账单管理  接收告警电话
	 */
	public static final String BILL_RECEIVING_ALARM_PHONE_ELEMENT = "x,//*[@id=\"phone\"]";
	/**
	 * 账单管理  默认接收告警方式
	 */
	public static final String BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/span[2]";
	/**
	 * 账单管理  所有接收告警方式
	 */
	public static final String BILL_ALL_RECEPTION_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[1]";
	/**
	 * 账单管理  电话告警方式
	 */
	public static final String BILL_PHONE_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[2]";
	/**
	 * 账单管理  短信告警方式
	 */
	public static final String BILL_MESSAGE_ALARM_METHODS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[5]/div/div/div/div/ul/li[3]";
	/**
	 * 账单管理  默认处理结果
	 */
	public static final String BILL_DEFALT_PROCESSING_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/span[2]";
	/**
	 * 账单管理  所有处理结果
	 */
	public static final String BILL_ALL_PROCESSING_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[1]";
	/**
	 * 账单管理  成功处理结果
	 */
	public static final String BILL_SUCCESS_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[2]";
	/**
	 * 账单管理  失败处理结果
	 */
	public static final String BILL_FAIL_RESULTS_ELEMENT = "x,//*[@id=\"qryForm\"]/div/div[6]/div/div/div/div/ul/li[3]";
	/**
	 * 账单管理  搜索按钮元素
	 */
	public static final String BILL_SEARCH_ELEMENT = "x,//*[@id=\"qryBtn\"]";
	/**
	 * 账单管理  清空按钮元素
	 */
	public static final String BILL_CLEAR_ELEMENT = "x,//*[@id=\"clearBtn\"]";
	/**
	 * 账单管理  列表元素
	 */
	public static final String BILL_LIST_ELEMENT = "x,//*[@id=\"switchList\"]";
	/**
	 * 账单管理 曲线图元素
	 */
	public static final String BILL_DIAGRAM_ELEMENT = "x,//*[@id=\"switchCurve\"]";
	/**
	 * 账单管理 导出按钮元素
	 */
	public static final String BILL_EXPORT_ELEMENT = "x,//*[@id=\"curveExport\"]/button";
	
	
	public AccountCenterBillManagementPage(WebDriver dr) {
		super(dr);
		
	}
	
	/**
	 * 默认账单搜索
	 */
	public void defaltBillSearch() {
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按本周条件搜索账单
	 * @throws InterruptedException 
	 */
	public void thisWeekBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_THIS_WEEK_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按本月条件搜索账单
	 * @throws InterruptedException 
	 */
	public void thisMonthBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_THIS_MONTH_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按上月条件搜索账单
	 * @throws InterruptedException 
	 */
	public void lastMonthBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_LAST_MONTH_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按自定义时间条件搜索账单
	 * @throws InterruptedException 
	 */
	public void customTimeBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_TIME_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_CUSTOM_TIME_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按告警设备imei搜索账单
	 */
	public void alarmDeviceIMEIBillSearch(String imei) {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.operateInputElement(BILL_ALARM_DEVICE_IMEI_ELEMENT, imei);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
	}
	
	/**
	 * 按接收告警电话搜索账单
	 */
	public void receivingAlarmPhoneBillSearch(String phone) {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.operateInputElement(BILL_RECEIVING_ALARM_PHONE_ELEMENT, phone);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
		
	}
	
	/**
	 * 按所有接收告警方式搜索账单
	 * @throws InterruptedException 
	 */
	public void allReceptionAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_ALL_RECEPTION_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按电话告警方式搜索账单
	 * @throws InterruptedException 
	 */
	public void phoneAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_PHONE_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按短信告警方式搜索账单
	 * @throws InterruptedException 
	 */
	public void messageAlarmMethodsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_RECEPTION_ALARM_METHODS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_MESSAGE_ALARM_METHODS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	/**
	 * 按所有处理结果搜索账单
	 * @throws InterruptedException 
	 */
	public void allProcessingResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_ALL_PROCESSING_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	
	/**
	 * 按成功处理结果搜索账单
	 * @throws InterruptedException 
	 */
	public void successResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_SUCCESS_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
	
	/**
	 * 按失败处理结果搜索账单
	 * @throws InterruptedException 
	 */
	public void failResultsBillSearch() throws InterruptedException {
		
		super.clickElement(BILL_CLEAR_ELEMENT);
		
		super.clickElement(BILL_DEFALT_PROCESSING_RESULTS_ELEMENT);
		Thread.sleep(1000);
		super.clickElement(BILL_FAIL_RESULTS_ELEMENT);
		
		super.clickElement(BILL_SEARCH_ELEMENT);
	}
}
