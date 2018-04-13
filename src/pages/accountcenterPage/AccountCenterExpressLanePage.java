package pages.accountcenterPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automatedriver.AutomateDriver;

/**
 * ����̨����ͨ��ģ��
 * 
 * @author ZhanKun
 *
 */
public class AccountCenterExpressLanePage extends AutomateDriver {

	public AccountCenterExpressLanePage(WebDriver dr) {
		super(dr);
	}

	/**
	 * �����¼��û��豸
	 * 
	 * @param selector
	 */
	public void selectLowerFlag(String selector) {
		/// html/body/div/div[1]/label/div/ins
		super.clickElement(selector);
	}

	/**
	 * ���ˢ�°�ť
	 * 
	 * @param selector
	 */
	public void refreshFrame(String selector) {
		// *[@id="stockStatDiv"]/div/div/div[1]/span/i[1]
		super.clickElement(selector);
	}

	/**
	 * ɾ��ģ��
	 * 
	 * @param selector
	 */
	public void deleteModula(String selector) {
		// *[@id="stockStatDiv"]/div/div/div[1]/span/i[2]
		super.clickElement(selector);
	}

	/**
	 * �������ģ��
	 * 
	 * @param selector
	 */
	public void clickAddModula(String selector) {
		// "x,/html/body/div[9]/div[3]/div/a"
		super.clickElement(selector);
	}

	/**
	 * ����ģ��
	 * 
	 * @param selector
	 * @throws InterruptedException
	 */
	public void AddModula(String selector) throws InterruptedException {
		// "x,/html/body/div[9]/div[3]/div/a"
		List<WebElement> elements = super.getElements("x,/html/body/div[2]/div/div/div");
		for (WebElement element : elements) {
			if (element.isSelected()) {
				continue;
			} else {
				element.click();
				Thread.sleep(1000);
			}
		}
		super.clickElement("p,ȷ��");
		// super.clickElement("p,ȡ��");
	}

	/**
	 * ����ģ��
	 */

	public void downloadModula() {
		
		super.switch_to_frame("batchEditFrame");

		super.clickElement("p,���������ļ�");
		
		super.switch_to_frame("");
	}

	/**
	 * ����û�����
	 */
	public void treeSubUserSearch(String value) {
		// value:test1101
		super.switch_to_frame("monitUserFrame");
		
		super.operateInputElement("x,//*[@id=\"treeSubUser_search_input\"]", value);

		super.clickElement("x,//*[@id=\"treeSubUser_search_btn\"]");

		super.clickElement("x,/html/body/div/div[1]/div/div/div[1]/div");
	}

	/**
	 * �������û���ť
	 */
	public void monitoringUsers() {

		super.clickElement("x,/html/body/div/div[2]/div/div[6]/button");
	}

	/**
	 * �༭�û�
	 * 
	 * @throws InterruptedException
	 */
	public void editorUser() throws InterruptedException {

		super.clickElement("x,//*[@id=\"editUser\"]/button");
		// ����༭�û�����
		super.switch_to_frame("x,/html/body/div[15]/div[2]/iframe");
		Thread.sleep(2000);
		// ѡ���ϼ��û�
		super.clickElement("x,//*[@id=\"treeDemo2_1_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_3_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_3_span\"]");
		Thread.sleep(1000);
		// �ͻ�����
		super.operateInputElement("nickName", "test911");
		Thread.sleep(1000);
		// �绰
		super.operateInputElement("phone", "6666666");
		Thread.sleep(1000);
		// ����
		super.operateInputElement("email", "jimi123@qq.com");
		// ��ϵ��
		super.operateInputElement("contact", "e�� 2*_");
		// companyName
		super.operateInputElement("companyName", "Ac�� 2*_");
		// �޸�Ȩ�ޣ�web�޸��豸
		super.clickElement("x,//*[@id=\"updateDevFlag\"]");
		// �޸�Ȩ�ޣ�app�޸��豸
		super.clickElement("x,//*[@id=\"appUpdateDevFlag\"]");

		super.switch_to_frame("");

		super.clickElement("p,����");
		Thread.sleep(2000);
	}

	/**
	 * ���ñ༭�û�
	 * 
	 * @throws InterruptedException
	 */
	public void resetEditorUser() throws InterruptedException {
		// ����༭��ť
		super.clickElement("x,//*[@id=\"editUser\"]/button");
		// ����༭�û�����
		super.switch_to_frame("x,//*[@id=\"layui-layer5\"]/div[2]/iframe");

		super.clickElement("x,//*[@id=\"treeDemo2_1_switch\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"treeDemo2_1_span\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"updateDevFlag\"]");

		super.clickElement("x,//*[@id=\"appUpdateDevFlag\"]");

		super.switch_to_frame("");

		super.clickElement("p,����");
		Thread.sleep(2000);

	}

	/**
	 * ͨ��IMEI�Ų鿴�켣
	 * 
	 * @throws InterruptedException
	 */

	public void checkTrajectory(String imei, String handle) throws InterruptedException {
		// ����鿴�켣׷���豸���� IMEI�ţ�866160035299002
		super.switch_to_frame("trackingFrame");
		// ����IMEI
		super.operateInputElement("queryimei", imei);

		// String current_handle = super.getCurrentWindowHandle();
		// ����鿴�켣��ť
		super.clickElement("x,/html/body/div/div[2]/button");

		super.switchToWindow(handle);

		// super.getCurrentUrl();
	}

	/**
	 * ׷���豸
	 * 
	 * @throws InterruptedException
	 */
	public void trackingEquipment(String imei, String handle) throws InterruptedException {
		// ����鿴�켣׷���豸���� IMEI�ţ�866160035299002
		super.switch_to_frame("trackingFrame");
		// ����IMEI
		super.operateInputElement("queryimei", imei);

		// String current_handle = super.getCurrentWindowHandle();
		// ���׷�ٰ�ť
		super.clickElement("x,/html/body/div/div[3]/button");

		super.switchToWindow(handle);
	}

	/**
	 * �켣�ط�����
	 * 
	 * @throws InterruptedException
	 */
	public void trajectoryPlaybackSearch() throws InterruptedException {

		// super.operateInputElement("x,//*[@id=\"searchImeiText\"]", imei);

		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[1]");
		// ��λ��ʽ
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// ȫ��
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[1]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[2]");
		// ��λ��ʽ
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// ���Ƕ�λ
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[2]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// ǰ��
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[3]");
		// ��λ��ʽ
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// ��վ��λ
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[3]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[4]");
		// ��λ��ʽ
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/span[2]");
		// WIFI��λ
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/ul/li[4]");
		Thread.sleep(1000);
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[5]");
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);
		// �������
		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/span[2]");

		super.clickElement("x,//*[@id=\"mapview\"]/div[1]/div[2]/div[1]/div/div[2]/div/div/div/ul/li[6]");
		super.clickElement("x,//*[@id=\"selectLocus\"]");
		Thread.sleep(2000);

		// �г���¼
		super.clickElement("x,//*[@id=\"driving\"]");

		Thread.sleep(5000);

		super.dr.navigate().back();

	}

	/**
	 * �豸�����
	 * 
	 * @throws InterruptedException
	 */
	public void deviceActivationReport() throws InterruptedException {

		if (super.getElement("x,//*[@id=\"radio-year\"]").isSelected()) {
			super.clickElement("x,//*[@id=\\\"radio-month\\\"]");
		} else if (super.getElement("x,//*[@id=\"radio-month\"]").isSelected()) {
			super.clickElement("x,//*[@id=\"radio-year\"]");
		}
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/div/ul/li[6]");
		Thread.sleep(2000);

		super.clickElement("x,/html/body/div/div[1]/div/span/div/span[2]");
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div[1]/div/span/div/div/ul/li[11]");
		Thread.sleep(2000);

	}

	/**
	 * ��������ģ�� ѡ�����е��û����п������� fastSellFrame
	 * 
	 * @throws InterruptedException
	 */
	public void selectUserFastSale() throws InterruptedException {
		// *[@id="fastSellFrame"]
		super.switch_to_frame("fastSellFrame");
		// ���۸��û�����
		super.clickElement("x,//*[@id=\"selectUserSalesName\"]");

		super.clickElement("x,//*[@id=\"ac_putDevice_custTree_1_switch\"]");

		super.clickElement("x,//*[@id=\"ac_putDevice_custTree_1_span\"]");
		// ׷���豸
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", "866160035299002");
		// ������Ӱ�ť
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/button[1]");
		// ���Եȴ�ʱ��
		super.explicitWait("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");

		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");
		// �û�����ʱ��Ϊ����
		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/div/ul/li[5]");
		// ������۰�ť
		super.clickElement("x,/html/body/div/div/div/div/div[3]/button[3]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"resetDevice\"]");
		Thread.sleep(2000);
		super.switch_to_frame("");
	}

	/**
	 * ��������ģ�� �����û����п������� fastSellFrame
	 * 
	 * @throws InterruptedException
	 */
	public void newUserFastSale(String nickName, String account) throws InterruptedException {
		// *[@id="fastSellFrame"]
		super.switch_to_frame("fastSellFrame");
		// ���۸��û����� --��������û�
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[1]/div[2]/button");

		super.switch_to_frame("");
		// ���������û�����

		super.explicitWait("x,/html/body/div[15]/div[2]/iframe");
		super.switch_to_frame("x,/html/body/div[15]/div[2]/iframe");

		super.operateInputElement("x,//*[@id=\"nickName\"]", nickName);

		super.operateInputElement("x,//*[@id=\"account\"]", account);

		super.clickElement("x,//*[@id=\"customer_webupdatedev_div\"]/label/div/ins");
		// *[@id="customer_isBatchSendIns"]/label/div/ins
		super.clickElement("x,//*[@id=\"customer_appupdatedev_div\"]/label/div/ins");

		super.switch_to_frame("");

		super.clickElement("p,����");

		super.explicitWait("fastSellFrame");
		super.switch_to_frame("fastSellFrame");

		// ׷���豸
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", "866160035299002");
		// ������Ӱ�ť
		Thread.sleep(2000);
		super.clickElement("x,/html/body/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/button[1]");
		// ���Եȴ�ʱ��
		super.explicitWait("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");

		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/span[2]");
		// �û�����ʱ��Ϊһ��
		super.clickElement("x,/html/body/div/div/div/div/div[3]/span/div/div/ul/li[6]");
		// ������۰�ť
		super.clickElement("x,/html/body/div/div/div/div/div[3]/button[3]");
		Thread.sleep(2000);
		// ����
		super.clickElement("x,//*[@id=\"resetDevice\"]");
		Thread.sleep(2000);
		super.switch_to_frame("");

	}
	  /**
	   * �豸ָ��ģ��
	   * //*[@id="searchIMEI"]  //*[@id="devInsFrame"]
	 * @throws InterruptedException 
	   */  
	public void deviceInstruction(String imei) throws InterruptedException {
		
		super.switch_to_frame("devInsFrame");
		
		super.operateInputElement("x,//*[@id=\"searchIMEI\"]", imei);
		
		super.clickElement("x,/html/body/div[1]/div/div/div/div/div[1]/div[1]/div/div/div[3]/button[1]");
		
		super.operateInputElement("x,//*[@id=\"text_0\"]", "9527");
		
		super.clickElement("x,//*[@id=\"ins_endTime\"]");
		Thread.sleep(2000);
		super.clickElement("x,//*[@id=\"laydate_today\"]");
		
		super.clickElement("x,//*[@id=\"ins_startTime\"]");
		Thread.sleep(2000);
		//2018-04-08 20:15:00
		super.operateInputElement("x,//*[@id=\"ins_startTime\"]", "2018-04-08 20:15:00");
		
		super.clickElement("x,//*[@id=\"sendInsBtn\"]");
		
		super.dr.navigate().refresh();
	}
}