package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ttANDdoubleClick extends PropertyFile {

    public By ttNDoubleClick = By.xpath("//li[@class = 'menu-item']//a[text()= 'Tooltip and Double click']");
    public By verifyHover = By.xpath("//span[@class='tooltiptext']");


    public void doubleClickBtn() {
        MainMethods.clickOnButton(ttNDoubleClick);

        WebElement doubleClick = getDriver().findElement(By.xpath("//button[@id = 'doubleClickBtn']"));

        Actions actions = new Actions(getDriver());
        actions.doubleClick(doubleClick).perform();

        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void rightClickBtn() {
        MainMethods.clickOnButton(ttNDoubleClick);

        WebElement rightClick = getDriver().findElement(By.xpath("//button[@id = 'rightClickBtn']"));
        WebElement cmenuTag = getDriver().findElement(By.xpath("//div[@class = 'contextMenuItem'][text()='Tag']"));
        WebElement hover = getDriver().findElement(By.xpath("//div[@class = 'tooltip']"));

        Actions actions = new Actions(getDriver());
        actions.contextClick(rightClick).perform();
        actions.click(cmenuTag).perform();

        Alert alert = getDriver().switchTo().alert();
        alert.accept();

        actions.moveToElement(hover).perform();
        MainMethods.waitElementToBeVisible(verifyHover);
    }
}
