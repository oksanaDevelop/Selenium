package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    By buyButton = By.xpath(".//*[@id='content']/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/p/a[2]");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnBuyBotton(){
        log.info("METHOD - " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.findElement(buyButton).click();
        log.info("BuyBotton is clicked");
    }
}
