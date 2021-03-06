package SetupClass.StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.SetUpClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sli_search extends SetUpClass {
	Select sortBy;
	WebElement dropdown;

	@Given("^Open the website URL\\.$")
	public void open_the_website_URL() throws Throwable {
		driver.get(AppURL);

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

		try {
			WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
			email.sendKeys("nishadhiman0027@gmail.com");

			WebElement password_field = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")));
			password_field.sendKeys("Qwerty@1");
			Thread.sleep(2000);

			WebElement login_btn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Login']")));
			login_btn.click();
			Thread.sleep(2000);
			if (!driver.findElements(By.xpath("//div[@id ='confirm_id']\")).")).isEmpty()) {
				WebElement approve = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='confirm-approve']")));
				approve.click();
			}
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {

		}

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
				// js.executeScript("alert('Product Suggestion Box did not appeared after
				// Keyword Removal');");
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

		dropdown = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@data-type = 'custom-dropdown']")));
		js.executeScript("arguments[0].scrollIntoView();", dropdown);
		Thread.sleep(2000);
		dropdown.click();

		sortBy = new Select(dropdown);
		sortBy.selectByVisibleText("Newest");
		Thread.sleep(3000);

		dropdown = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@data-type = 'custom-dropdown']")));
		js.executeScript("arguments[0].scrollIntoView();", dropdown);
		dropdown.click();

		sortBy = new Select(dropdown);
		sortBy.selectByVisibleText("Most Downloaded");
		Thread.sleep(3000);

		dropdown = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@data-type = 'custom-dropdown']")));
		js.executeScript("arguments[0].scrollIntoView();", dropdown);
		Thread.sleep(2000);
		dropdown.click();

		sortBy = new Select(dropdown);
		sortBy.selectByVisibleText("Popularity");
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

		String str = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#sli_content_wrapper > div:nth-child(3) > div > div > div.toolbar-amount.sli_num_results > span.toolbar-number.sli_current_page_value")))
				.getText();
		System.out.println("Total Number of Products ----" + str);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3800);

	}

}
