package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
			WebDriver driver = new ChromeDriver(); //ChromeDriverの作成
			driver.get("http://www.google.com/xhtml"); //get()でブラウザ起動
			Thread.sleep(5000); //処理を停止(動作確認の為) 
			//ブラウザの要素を指定 メソッド名がわかりやすいですよね。 
			WebElement searchBox = driver.findElement(By.name("q")); 
			searchBox.sendKeys("ChromeDriver");
			searchBox.submit();
			Thread.sleep(5000);
			driver.quit();//ブラウザを閉じる。
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
