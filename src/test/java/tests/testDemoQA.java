package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.interactions;
import pageObjects.ttANDdoubleClick;
import pageObjects.widgets;

public class testDemoQA extends PropertyFile {

    @Test
    public void demoqa() {
        test = report.startTest("Check DemoQA site");

        interactions ia = new interactions();
        ia.sort();
        test.log(LogStatus.INFO, "items sorted descending");
        ia.selectable();
        test.log(LogStatus.INFO, "selected items");
        ia.resizeBox();
        test.log(LogStatus.INFO, "Box resized");
        ia.dragNdropBox();
        test.log(LogStatus.INFO, "Box dragged to the target");
        ia.draggableBox();
        test.log(LogStatus.INFO, "Box dragged around");

        ttANDdoubleClick ttdc = new ttANDdoubleClick();
        ttdc.doubleClickBtn();
        test.log(LogStatus.INFO, "Button double clicked and alert provided");
        ttdc.rightClickBtn();
        test.log(LogStatus.INFO, "Button right clicked and selected tag");

        widgets wgt = new widgets();
        wgt.switchWindows();
        test.log(LogStatus.INFO, "Windows handled");
        wgt.atPracticeTable();
        test.log(LogStatus.INFO, "Datas from table printed");
        wgt.frame();
        test.log(LogStatus.INFO, "Frames handled");
        wgt.atPracticeForm("Milan", "Stojanovic", "05/02/2020.");
        test.log(LogStatus.INFO, "Practice form provided");
        wgt.contactForm();
        test.log(LogStatus.INFO, "Contacts provided");
        wgt.kbEvents();
        test.log(LogStatus.INFO, "Event provided");
        wgt.keyboardEvent();
        test.log(LogStatus.INFO, "Event provided");
        wgt.tooltip();
        test.log(LogStatus.INFO, "Tooltip provided");
        wgt.tabs();
        test.log(LogStatus.INFO, "Tabs handled and verified");
        wgt.spinner();
        test.log(LogStatus.INFO, "spinner provided");
        wgt.slider();
        test.log(LogStatus.INFO, "slider checked");
        wgt.selectMenu();
        test.log(LogStatus.INFO, "selected items");
        wgt.progressBar();
        test.log(LogStatus.INFO, "progress bar status checked");
        wgt.menu();
        test.log(LogStatus.INFO, "Menu item selected");
        wgt.dialog();
        test.log(LogStatus.INFO, "Dialog box handled");
        wgt.datePicker();
        test.log(LogStatus.INFO, "Date picked");
        wgt.controlGroup();
        test.log(LogStatus.INFO, "Car booked");
        wgt.cbANDrb();
        test.log(LogStatus.PASS, "rated with boxes and test passed");
    }
}
