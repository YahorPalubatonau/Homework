package tests;

import dataBase.DataBase;
import org.junit.Assert;
import org.junit.Test;
import pageObject.MailBoxPage;

import java.sql.SQLException;
public class MailBoxPageTest extends AbstractTest {

    DataBase dataBase = new DataBase();

    @Test
    public void lingOutTest() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
    }

    MailBoxPage mailBoxPage = new MailBoxPage(webDriver);

    @Test
    public void noEmptySpamBoxTest() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
        mailBoxPage.tipMessageinSpam();
        mailBoxPage.tipMessage();
        mailBoxPage.moveMessageToSpam();
        Assert.assertFalse(mailBoxPage.getTextFromSpamSection().contains(dataBase.getWordsForTest()));
    }

    @Test
    public void emptySpamBox() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
        mailBoxPage.goToSpam();
        mailBoxPage.tipMessage();
        mailBoxPage.moveMessageToInput();
        Assert.assertTrue(mailBoxPage.getTextFromSpamSection().contains(dataBase.getWordsForTest()));
    }

    @Test
    public void selectTest() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
        mailBoxPage.goToInboxDerection();
        mailBoxPage.tipTreeMessageinSpam();
        Assert.assertEquals(3, mailBoxPage.getCountOfSelectedChecboxes());
    }

    @Test
    public void unselectTest() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
        mailBoxPage.tipTreeMessageinSpam();
        mailBoxPage.unselectAll();
        Assert.assertEquals(0, mailBoxPage.getCountOfSelectedChecboxes());
    }

    @Test
    public void sendMessageTest() throws SQLException {
        loginPage.enterInMail(dataBase.getName(), dataBase.getPassword());
        loginPage.logoutLinkPresents();
        mailBoxPage.goToWriteSection();
        mailBoxPage.enterToWhom();
        mailBoxPage.enterMessage();
        mailBoxPage.clickSendButton();
        Assert.assertTrue(mailBoxPage.messageIsPresent());
    }
}
