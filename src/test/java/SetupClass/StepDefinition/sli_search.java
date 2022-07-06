package SetupClass.StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.SetUpClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sli_search extends SetUpClass {

	WebDriverWait wait = new WebDriverWait(driver, 50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^Open the website URL\\.$")
	public void open_the_website_URL() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);

		driver.get("https://www.slideteam.net");

		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		try {
			driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}
		WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input")));
		old_paid_email.sendKeys("nishadhiman0027@gmail.com");

		WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div/input")));
		old_paid_pass.sendKeys("Qwerty@1");

		WebElement old_paid_login_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
		old_paid_login_btn.click();

	}

	@Then("^enter a keyword to search\\.$")
	public void enter_a_keyword_to_search() throws Throwable {

		for (int i = 0; i <= 4; i++) {

			WebElement search_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
			Thread.sleep(2000);
			search_btn.sendKeys("Org Chart");
			Thread.sleep(4000);

			WebElement search_1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_ac_section_products")));
			Thread.sleep(2000);
			String text1 = search_1.getText();
			System.out.println(text1);
			Thread.sleep(3000);

			String actual_text1 = "Product Suggestions for Hr Interview ";

			if (text1.equalsIgnoreCase(actual_text1)) {
				log.info("product suggestion tab header is displayed correctly ");
			}

			WebElement prod_sugg = wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_raclist_products")));
			Thread.sleep(2000);
			String pro_sugg_loc = prod_sugg.getText();
			System.out.println("product suggestion list name is ----" + pro_sugg_loc);

			WebElement parent_product = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			System.out.println("classname  of parent is ----------------------->" + parent_product);

			Thread.sleep(4000);

			WebElement search_btn1 = driver.findElement(By.cssSelector("#search"));
			Thread.sleep(2000);
			search_btn1.sendKeys(Keys.CONTROL + "a");
			search_btn1.sendKeys(Keys.DELETE);
			Thread.sleep(8000);

			if (driver.findElement(By.id("sli_raclist_products")).isDisplayed()) {

				System.out.println("Element is Visible");
				throw new IOException("Element Should not be visible");

			} else {
				System.out.println("Element is Not Visible"); //
				js.executeScript("alert('Product Suggestion Box did not appeared after Keyword Removal');");
			}
			driver.navigate().refresh();
			Thread.sleep(3800);

		}

		for (int i = 0; i <= 24; i++) {

			WebElement search_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
			Thread.sleep(2000);
			search_btn.sendKeys("HR");
			Thread.sleep(5000);

			WebElement search_1 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@id='sli_ac_section_products']")));
			Thread.sleep(2000);
			String text1 = search_1.getText();
			System.out.println(text1);
			Thread.sleep(3000);

			String actual_text1 = "Product Suggestions for Hr Interview ";

			if (text1.equalsIgnoreCase(actual_text1)) {
				log.info("product suggestion tab header is displayed correctly ");
			}

			WebElement prod_sugg = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			String pro_sugg_loc = prod_sugg.getText();
			System.out.println("product suggestion list name is ----" + pro_sugg_loc);

			WebElement parent_product = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			System.out.println("classname  of parent is ----------------------->" + parent_product);

			WebElement child1_product = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_product")));
			Thread.sleep(1000);
			child1_product.click();
			Thread.sleep(4000);

		}

		for (int i = 0; i <= 24; i++) {

			WebElement search_btn2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
			Thread.sleep(2000);
			search_btn2.sendKeys("Management");
			Thread.sleep(4000);

			WebElement search_2 = wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_section")));
			Thread.sleep(2000);
			String text3 = search_2.getText();
			System.out.println(text3);
			Thread.sleep(3000);

			String actual_text3 = "Product Suggestions for Management ";

			if (text3.equalsIgnoreCase(actual_text3)) {
				log.info("product suggestion tab header is displayed correctly ");
			}

			WebElement prod_sugg3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_raclist_products")));
			Thread.sleep(2000);
			String pro_sugg_loc3 = prod_sugg3.getText();
			System.out.println("product suggestion list name is ----" + pro_sugg_loc3);

			WebElement parent_product4 = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			System.out.println("classname  of parent is ----------------------->" + parent_product4);

			WebElement child1_product2 = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_product")));
			Thread.sleep(1000);
			child1_product2.click();
			Thread.sleep(4000);

		}

		for (int i = 0; i <= 24; i++) {

			WebElement search_btn3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
			Thread.sleep(2000);
			search_btn3.sendKeys("org chart");
			Thread.sleep(4000);

			WebElement search_3 = wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_section")));
			Thread.sleep(2000);
			String text4 = search_3.getText();
			System.out.println(text4);
			Thread.sleep(3000);

			String actual_text4 = "Product Suggestions for org chart ";

			if (text4.equalsIgnoreCase(actual_text4)) {
				log.info("product suggestion tab header is displayed correctly ");
			}

			WebElement prod_sugg4 = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			String pro_sugg_loc4 = prod_sugg4.getText();
			System.out.println("product suggestion list name is ----" + pro_sugg_loc4);

			WebElement parent_product5 = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
			Thread.sleep(2000);
			System.out.println("classname  of parent is ----------------------->" + parent_product5);

			WebElement child1_product3 = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_product")));
			Thread.sleep(1000);
			child1_product3.click();
			Thread.sleep(4000);

		}

		driver.navigate().refresh();
		Thread.sleep(3800);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				Thread.sleep(1000);
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}

	}

	@Then("^enter a keyword to search and filter\\.$")
	public void enter_a_keyword_to_search_and_filter() throws Throwable {

		Thread.sleep(4000);
		WebElement search_btnn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
		Thread.sleep(2000);
		search_btnn.sendKeys("HR");
		Thread.sleep(4000);

		WebElement search_1n = wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_section")));
		Thread.sleep(2000);
		String text00 = search_1n.getText();
		System.out.println(text00);
		Thread.sleep(3000);

		String actual_text00 = "Product Suggestions for Hr Interview ";

		if (text00.equalsIgnoreCase(actual_text00)) {
			log.info("product suggestion tab header is displayed correctly ");
		}

		WebElement prod_suggn = wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
		Thread.sleep(2000);
		String pro_sugg_locn = prod_suggn.getText();
		System.out.println("product suggestion list name is ----" + pro_sugg_locn);

		WebElement parent_productn = wait
				.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list")));
		Thread.sleep(2000);
		System.out.println("classname  of parent is ----------------------->" + parent_productn);

		Thread.sleep(4000);
		WebElement View_More = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='sli_view_more_link']")));
		Thread.sleep(3000);
		View_More.click();
		Thread.sleep(5000);

		WebElement Sort = driver.findElement(By.cssSelector("#dk0-combobox"));
		js.executeScript("arguments[0].scrollIntoView();", Sort);

		Thread.sleep(3000);
		Sort.click();

		WebElement Newest = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		Thread.sleep(3000);
		Newest.click();
		Thread.sleep(8000);

		WebElement Sort1 = driver.findElement(By.cssSelector("#dk0-combobox"));
		js.executeScript("arguments[0].scrollIntoView();", Sort1);
		Thread.sleep(3000);
		Sort1.click();

		WebElement Popularity = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		Thread.sleep(3000);
		Popularity.click();
		Thread.sleep(3000);

		WebElement Sort2 = driver.findElement(By.cssSelector("#dk0-combobox"));
		js.executeScript("arguments[0].scrollIntoView();", Sort2);
		Thread.sleep(3000);
		Sort2.click();

		WebElement Most_downloaded = driver
				.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		Thread.sleep(3000);
		Most_downloaded.click();
		Thread.sleep(3000);

		WebElement Stage = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#facet-stages > li:nth-child(2) > input[type=checkbox]")));

		Thread.sleep(3000);
		Stage.click();
		Thread.sleep(3000);

		WebElement Category = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#facet-cat1 > li:nth-child(2) > a")));
		js.executeScript("arguments[0].scrollIntoView();", Category);
		Thread.sleep(3000);
		Category.click();
		Thread.sleep(3000);

		String str = driver.findElement(By.cssSelector(
				"#sli_content_wrapper > div:nth-child(3) > div > div > div.toolbar-amount.sli_num_results > span.toolbar-number.sli_current_page_value"))
				.getText();
		System.out.println("Total Number of Products ----" + str);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3800);

	}

}
