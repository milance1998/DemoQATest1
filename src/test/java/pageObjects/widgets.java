package pageObjects;

import methods.MainMethods;
import methods.PropertyFile;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class widgets extends PropertyFile {

    public By widgetClck = By.xpath("//a[@title='Widgets']");
    public By frameClck = By.xpath("//div[@class='demo-frame']//a[text()='IFrame practice page']");
    public By verifyFrame1 = By.xpath("//span[text()='Testing Artifacts']");
    public By verifyFrame2 = By.xpath("//a[text()='Selectable']");
    public By dateClick = By.xpath("//div[@class='demo-frame']//a[text()='Datepicker']");
    public By selectDate = By.xpath("//input[@id='datepicker']");
    public By nextMonthClck = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    public By pickDay = By.xpath("//a[@class='ui-state-default'][text()='20']");
    public By dialogClck = By.xpath("//div[@class='demo-frame']//a[text()='Dialog']");
    public By closeDialogBox = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
    public By menuClck = By.xpath("//div[@class='demo-frame']//a[text()='Menu']");
    public By progBarClck = By.xpath("//div[@class='demo-frame']//a[text()='Progressbar']");
    public By progressBar = By.xpath("//div[@id='progressbar']");
    public By selectMenuClck = By.xpath("//div[@class='demo-frame']//a[text()='Selectmenu']");
    public By music = By.xpath("//div[@id='ui-id-9']");
    public By rock = By.xpath("//div[@id='ui-id-10']");
    public By alternative = By.xpath("//div[@id='ui-id-11']");
    public By sliderClck = By.xpath("//div[@class='demo-frame']//a[text()='Slider']");
    public By spinnerClck = By.xpath("//div[@class='demo-frame']//a[text()='Spinner']");
    public By disableEnableBtn = By.xpath("//button[text()='Toggle disable/enable']");
    public By getValue = By.xpath("//button[text()='Get value']");
    public By setValue = By.xpath("//button[text()='Set value to 5']");
    public By toggleWgt = By.xpath("//button[text()='Toggle widget']");
    public By tabsClck = By.xpath("//div[@class='demo-frame']//a[text()='Tabs']");
    public By verifyTab1 = By.xpath("//p[contains(text(),'Proin')]");
    public By verifyTab2 = By.xpath("//p[contains(text(),'Morbi')]");
    public By verifyTab3 = By.xpath("//p[contains(text(),'Vestibulum')]");
    public By toolTipClck = By.xpath("//div[@class='demo-frame']//a[text()='Tooltip']");
    public By keyboardEventClck = By.xpath("//div[@class='demo-frame']//a[text()='Keyboard Events Sample Form']");
    public By newBrowserWindow = By.xpath("//button[@id='button1']");
    public By verifyNewWindow = By.xpath("//div[@id='slide-16-layer-4']");
    public By newTab = By.xpath("//button[text()='New Browser Tab']");
    public By newAlert = By.xpath("//button[@id='alert']");
    public By newTAlert = By.xpath("//button[@id='timingAlert']");
    public By verifyDisabledBtn = By.xpath("//button[@id='disabledElement'][text()='enabled']");
    public By verifyInvisibleBtn = By.xpath("//button[@id='invisibility']");
    public By switchWindowsClck = By.xpath("//div[@class='demo-frame']//a[text()='Automation Practice Switch Windows']");
    public By contactFormClck = By.xpath("//div[@class='demo-frame']//a[text()='HTML contact form']");
    public By firstName = By.xpath("//input[@class='firstname']");
    public By verifyGoogleLink = By.xpath("//a[text()='Google Link']");
    public By verifyGoogleLink1 = By.xpath("//a[text()='Google Link is here']");
    public By writeSomething = By.xpath("//textarea[@id='subject']");
    public By keyBoardEvents = By.xpath("//div[@class='demo-frame']//a[text()='Keyboard Events']");
    public By practiceTable = By.xpath("//div[@class='demo-frame']//a[text()='Automation practice table']");
    public By practiceForm = By.xpath("//div[@class='demo-frame']//a[text()='Automation practice form']");
    public By firstnameTxt = By.xpath("//input[@name='firstname']");
    public By lastNameTxt = By.xpath("//input[@id='lastname']");
    public By rbMaleClick = By.xpath("//input[@id='sex-0']");
    public By rbExpClick = By.xpath("//input[@id='exp-0']");
    public By datePickerTxt = By.xpath("//input[@id='datepicker']");
    public By chooseProfession = By.xpath("//input[@id='profession-1']");
    public By chooseTool = By.xpath("//input[@id='tool-2']");


    public void frame() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(frameClck);
        MainMethods.clickOnButton(frameClck);

        WebElement iframe1 = getDriver().findElement(By.xpath("//iframe[@id='IF1']"));
        WebElement iframe2 = getDriver().findElement(By.xpath("//iframe[@id='IF2']"));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(iframe1).perform();
        getDriver().switchTo().frame(iframe1);

        List<WebElement> listElement = getDriver().findElements(By.xpath("//span[text()='Software Testing Tutorial']"));
        listElement.get(0).click();

        MainMethods.waitElementToBeVisible(verifyFrame1);
        getDriver().switchTo().defaultContent();

        actions.moveToElement(iframe2).perform();
        getDriver().switchTo().frame(iframe2);

        MainMethods.clickOnButton(verifyFrame2);
        MainMethods.waitElementToBeVisible(verifyFrame2);
        getDriver().switchTo().defaultContent();
    }

    public void atPracticeForm(String firstName, String lastName, String datepicker) {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(practiceForm);
        MainMethods.clickOnButton(practiceForm);

        MainMethods.type(firstnameTxt, firstName);
        MainMethods.type(lastNameTxt, lastName);
        MainMethods.type(datePickerTxt, datepicker);

        MainMethods.clickOnButton(rbMaleClick);
        MainMethods.clickOnButton(chooseProfession);
        MainMethods.clickOnButton(rbExpClick);
        MainMethods.clickOnButton(chooseTool);

        WebElement selectContinent = getDriver().findElement(By.xpath("//select[@id='continentsmultiple']"));

        Select select = new Select(selectContinent);
        select.selectByVisibleText("Europe");
        select.selectByVisibleText("Australia");

        WebElement selectCommands = getDriver().findElement(By.xpath("//select[@id='selenium_commands']"));


        Select select1 = new Select(selectCommands);
        select1.selectByVisibleText("Wait Commands");
        select1.selectByVisibleText("Switch Commands");

        //WebElement UploadImg = getDriver().findElement(By.xpath("//*[@id='photo']"));
        //UploadImg.sendKeys("C:\\Users\\milan\\IdeaProjects\\DemoQATest\\src\\test\\resources\\sml.png");
        // ******** u redu iznad napisana putanja do slike na mom racunaru, ali je disable-ovana kako
        // test ne bi pukao ukoliko se pokrece sa drugog racunara

        WebElement continents = getDriver().findElement(By.xpath("//select[@id='continents']"));
        List<WebElement> optContinents = getDriver().findElements(By.xpath("//option[@value='AN']"));
        continents.click();
        optContinents.get(0).click();
    }

    public void atPracticeTable() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(practiceTable);
        MainMethods.clickOnButton(practiceTable);

        List<WebElement> row = getDriver().findElements(By.xpath("//table[@class='tsc_table_s13']//tr"));

        String bKhalifa = row.get(2).getText().toString();
        System.out.println(bKhalifa);
    }

    public void kbEvents() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(keyBoardEvents);
        MainMethods.clickOnButton(keyBoardEvents);

        WebElement UploadImg = getDriver().findElement(By.xpath("//*[@id='browseFile']"));
        //UploadImg.sendKeys("C:\\Users\\milan\\IdeaProjects\\DemoQATest\\src\\test\\resources\\sml.png");
        // ******** u redu iznad napisana putanja do slike na mom racunaru, ali je disable-ovana kako
        // test ne bi pukao ukoliko se pokrece sa drugog racunara
        WebElement upload = getDriver().findElement(By.xpath("//button[@id='uploadButton']"));
        upload.click();
        getDriver().switchTo().alert().accept();
    }

    public void contactForm() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(contactFormClck);
        MainMethods.clickOnButton(contactFormClck);

        Actions actions = new Actions(getDriver());

        MainMethods.clickOnButton(firstName);
        actions.sendKeys("Milan").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Stojanovic").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Serbia").perform();
        MainMethods.waitElementToBeVisible(verifyGoogleLink);
        MainMethods.waitElementToBeVisible(verifyGoogleLink1);
        MainMethods.clickOnButton(writeSomething);
        actions.sendKeys("I'm practicing QA testing");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.history.go(-1)");
    }

    public void switchWindows() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(switchWindowsClck);
        MainMethods.clickOnButton(switchWindowsClck);

        Actions actions = new Actions(getDriver());

        MainMethods.clickOnButton(newBrowserWindow);
        String window1 = getDriver().getWindowHandle();
        Set<String> windows = getDriver().getWindowHandles();
        for (String x : windows) {
            if (x.equals(window1) == false) {
                getDriver().switchTo().window(x);
                getDriver().manage().window().maximize();
                MainMethods.waitElementToBeVisible(verifyNewWindow);
                getDriver().close();
            }
        }
        getDriver().switchTo().window(window1);

        MainMethods.clickOnButton(newTab);
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        //MainMethods.waitElementToBeVisible(Text1);
        getDriver().close();
        getDriver().switchTo().window(tabs.get(0));

        MainMethods.clickOnButton(newAlert);
        Alert alert = getDriver().switchTo().alert();

        getDriver().switchTo().alert().getText();
        alert.accept();

        MainMethods.clickOnButton(newTAlert);
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().getText();
        alert.accept();

        String headerColor = getDriver().findElement(By.xpath("//button[@id='colorVar']")).getCssValue("color");
        Assert.assertEquals("rgba(255, 0, 0, 1)", headerColor);

        MainMethods.waitElementToBeVisible(verifyDisabledBtn);
        MainMethods.waitElementToBeVisible(verifyInvisibleBtn);
    }

    public void keyboardEvent() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(keyboardEventClck);
        MainMethods.clickOnButton(keyboardEventClck);

        WebElement inputName = getDriver().findElement(By.xpath("//input[@id='userName']"));
        inputName.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys("Milan").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Kragujevac").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Kragujevac").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        getDriver().switchTo().alert().accept();
    }

    public void tooltip() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(toolTipClck);
        MainMethods.clickOnButton(toolTipClck);

        WebElement tooltipAge = getDriver().findElement(By.xpath("//input[@id='age']"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(tooltipAge).perform();
        tooltipAge.sendKeys("I'm 21 years old");
    }

    public void tabs() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(tabsClck);
        MainMethods.clickOnButton(tabsClck);

        List<WebElement> changeTabs = getDriver().findElements(By.xpath("//li[@role='tab']"));
        changeTabs.get(0).click();
        MainMethods.waitElementToBeVisible(verifyTab1);

        changeTabs.get(1).click();
        MainMethods.waitElementToBeVisible(verifyTab2);

        changeTabs.get(2).click();
        MainMethods.waitElementToBeVisible(verifyTab3);
    }

    public void spinner() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(spinnerClck);
        MainMethods.clickOnButton(spinnerClck);

        MainMethods.clickOnButton(disableEnableBtn);
        MainMethods.clickOnButton(setValue);
        MainMethods.clickOnButton(getValue);
        getDriver().switchTo().alert().accept();
        MainMethods.clickOnButton(toggleWgt);
    }

    public void slider() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(sliderClck);
        MainMethods.clickOnButton(sliderClck);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement sliderChange = getDriver().findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        js.executeScript("arguments[0].setAttribute('style', 'left: 70%')", sliderChange);
    }

    public void selectMenu() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(selectMenuClck);
        MainMethods.clickOnButton(selectMenuClck);

        List<WebElement> openMenu = getDriver().findElements(By.xpath("//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']"));
        openMenu.get(0).click();
        WebElement slow = getDriver().findElement(By.xpath("//div[@id='ui-id-2']"));
        slow.click();

        openMenu.get(1).click();
        WebElement someOther = getDriver().findElement(By.xpath("//div[@id='ui-id-9']"));
        someOther.click();

        openMenu.get(2).click();
        WebElement seccond = getDriver().findElement(By.xpath("//div[@id='ui-id-11']"));
        seccond.click();

        openMenu.get(3).click();
        WebElement prof = getDriver().findElement(By.xpath("//div[@id='ui-id-33']"));
        prof.click();
    }

    public void progressBar() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(progBarClck);
        MainMethods.clickOnButton(progBarClck);

        MainMethods.waitElementToBeVisible(progressBar);
        String progressBarLoaded = getDriver().findElement(By.xpath("//div[@class='ui-progressbar-value ui-corner-left ui-widget-header']")).getCssValue("width");
        System.out.println("Progress bar loaded:" + progressBarLoaded);
    }

    public void menu() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(menuClck);
        MainMethods.clickOnButton(menuClck);

        MainMethods.clickOnButton(music);
        MainMethods.waitElementToBeVisible(rock);
        MainMethods.clickOnButton(rock);
        MainMethods.waitElementToBeVisible(alternative);
        MainMethods.clickOnButton(alternative);
    }

    public void dialog() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(dialogClck);
        MainMethods.clickOnButton(dialogClck);
        WebElement dialogBox = getDriver().findElement(By.xpath("//span[@id='ui-id-1']"));
        Actions actions = new Actions(getDriver());

        actions.dragAndDropBy(dialogBox, 150, 100);
        MainMethods.clickOnButton(closeDialogBox);
    }

    public void datePicker() {
        MainMethods.clickOnButton(widgetClck);
        MainMethods.waitElementToBeVisible(dateClick);
        MainMethods.clickOnButton(dateClick);

        MainMethods.clickOnButton(selectDate);
        MainMethods.clickOnButton(nextMonthClck);
        MainMethods.clickOnButton(pickDay);
    }

    public void controlGroup() {
        MainMethods.clickOnButton(widgetClck);
        Actions actions = new Actions(getDriver());
        WebElement controlGroupBtn = getDriver().findElement(By.xpath("//div[@class='demo-frame']//a[text()='Controlgroup']"));
        actions.moveToElement(controlGroupBtn);
        controlGroupBtn.click();

        List<WebElement> listElement = getDriver().findElements(By.xpath("//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']"));
        List<WebElement> numOfCars = getDriver().findElements(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']"));
        List<WebElement> btnBook = getDriver().findElements(By.xpath("//button[text()='Book Now!']"));
        listElement.get(0).click();
        WebElement rbAutomatic = getDriver().findElement(By.xpath("//label[@for='transmission-automatic']"));
        WebElement option3 = getDriver().findElement(By.xpath("//div[@id='ui-id-3']"));
        option3.click();
        rbAutomatic.click();
        numOfCars.get(0).click();
        btnBook.get(0).click();
    }

    public void cbANDrb() {
        MainMethods.clickOnButton(widgetClck);
        Actions actions = new Actions(getDriver());
        WebElement cbrb = getDriver().findElement(By.xpath("//div[@class='demo-frame']//a[text()='Checkboxradio']"));
        actions.moveToElement(cbrb);
        cbrb.click();

        WebElement rbParis = getDriver().findElement(By.xpath("//label[@for='radio-2']"));
        WebElement forStars = getDriver().findElement(By.xpath("//label[@for='checkbox-3']"));
        WebElement twoQueen = getDriver().findElement(By.xpath("//label[@for='checkbox-nested-2']"));

        rbParis.click();
        forStars.click();
        twoQueen.click();
    }
}
