package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class interactions extends PropertyFile {

    public By interreactions = By.xpath("//a[@title='Interactions']");
    public By sortable = By.xpath("//div[@class = 'demo-frame']//a[text()= 'Sortable']");
    public By selectmenu = By.xpath("//div[@class = 'demo-frame']//a[text()= 'Selectable']");
    public By resizable = By.xpath("//div[@class = 'demo-frame']//a[text()= 'Resizable']");
    public By droppable = By.xpath("//div[@class = 'demo-frame']//a[text()= 'Droppable']");
    public By draggable = By.xpath("//div[@class = 'demo-frame']//a[text()= 'Draggable']");
    public By verifyDropped = By.xpath("//p[text()='Dropped!']");
    public By verifyDraggable = By.xpath("//p[text()='Drag me around']");


    public void sort() {
        MainMethods.clickOnButton(interreactions);
        MainMethods.waitElementToBeVisible(sortable);
        MainMethods.clickOnButton(sortable);

        WebElement item1 = getDriver().findElement(By.xpath("//li[text()= 'Item 1']"));
        WebElement item2 = getDriver().findElement(By.xpath("//li[text()= 'Item 2']"));
        WebElement item3 = getDriver().findElement(By.xpath("//li[text()= 'Item 3']"));
        WebElement item4 = getDriver().findElement(By.xpath("//li[text()= 'Item 4']"));
        WebElement item5 = getDriver().findElement(By.xpath("//li[text()= 'Item 5']"));
        WebElement item6 = getDriver().findElement(By.xpath("//li[text()= 'Item 6']"));
        WebElement item7 = getDriver().findElement(By.xpath("//li[text()= 'Item 7']"));

        Actions actions = new Actions(getDriver());

        actions.dragAndDropBy(item1, 0, 230).build().perform();
        actions.dragAndDropBy(item2, 0, 190).build().perform();
        actions.dragAndDropBy(item3, 0, 150).build().perform();
        actions.dragAndDropBy(item4, 0, 115).build().perform();
        actions.dragAndDropBy(item5, 0, 75).build().perform();
        actions.dragAndDropBy(item6, 0, 45).build().perform();
    }

    public void selectable() {
        MainMethods.clickOnButton(interreactions);
        MainMethods.waitElementToBeVisible(selectmenu);
        MainMethods.clickOnButton(selectmenu);

        WebElement select1 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 1']"));
        WebElement select2 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 2']"));
        WebElement select3 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 3']"));
        WebElement select4 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 4']"));
        WebElement select5 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 5']"));
        WebElement select6 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 6']"));
        WebElement select7 = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][text()='Item 7']"));
        Actions actions = new Actions(getDriver());

        actions.keyDown(Keys.CONTROL).build().perform();
        select1.click();
        select2.click();
        select3.click();
        select4.click();
        select5.click();
        select6.click();
        select7.click();
        actions.keyUp(Keys.CONTROL).build().perform();

        String item4VerifyColorChange = getDriver().findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected'][text()='Item 4']")).getCssValue("background-color");
        Assert.assertEquals("rgba(243, 152, 20, 1)", item4VerifyColorChange);
    }

    public void resizeBox() {
        MainMethods.clickOnButton(interreactions);
        MainMethods.waitElementToBeVisible(resizable);
        MainMethods.clickOnButton(resizable);

        WebElement resizeBoxItem = getDriver().findElement(By.xpath("//div[@class = 'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(resizeBoxItem, 90, 150).build().perform();
    }

    public void dragNdropBox() {
        MainMethods.clickOnButton(interreactions);
        MainMethods.waitElementToBeVisible(droppable);
        MainMethods.clickOnButton(droppable);

        WebElement dragToTargetItem = getDriver().findElement(By.xpath("//div[@id = 'draggable']"));

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(dragToTargetItem, 150, 50).build().perform();
        MainMethods.waitElementToBeVisible(verifyDropped);
    }

    public void draggableBox() {
        MainMethods.clickOnButton(interreactions);
        MainMethods.waitElementToBeVisible(draggable);
        MainMethods.clickOnButton(draggable);

        WebElement draggableBoxItem = getDriver().findElement(By.xpath("//div[@id = 'draggable']"));
        String startLocation = draggableBoxItem.getLocation().toString();

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(draggableBoxItem, 150, 60).build().perform();
        String draggedLocation = draggableBoxItem.getLocation().toString();

        if (startLocation.equals(draggedLocation) == false) {
            MainMethods.waitElementToBeVisible(verifyDraggable);
        }
    }
}
