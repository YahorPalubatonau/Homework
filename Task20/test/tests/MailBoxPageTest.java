package tests;

import org.junit.Assert;
import org.junit.Test;

import pageObjects.MailBoxPage;

public class MailBoxPageTest extends AbstractTest {

	@Test
	public void lingOutTest() {
		loginPage.enterInMail("egor6661999","Isaac96Soles13");
		loginPage.logoutLinkPresents();
	}

	MailBoxPage mailBoxPage = new MailBoxPage(webDriver);

	@Test
	public void noEmptySpamBoxTest() {
		loginPage.enterInMail("egor6661999","Isaac96Soles13");
		loginPage.logoutLinkPresents();
		mailBoxPage.tipMessageinSpam();
		mailBoxPage.tipMessage();
		mailBoxPage.moveMessageToSpam();
		Assert.assertFalse(mailBoxPage.getTextFromSpamSection().contains("Нет писем"));
	}

	@Test
	public void emptySpamBox() {
		mailBoxPage.goToSpam();
		mailBoxPage.tipMessage();
		mailBoxPage.moveMessageToInput();
		Assert.assertTrue(mailBoxPage.getTextFromSpamSection().contains("Нет писем"));
	}

	@Test
	public void selectTest() {
		loginPage.enterInMail("egor6661999","Isaac96Soles13");
		loginPage.logoutLinkPresents();
		mailBoxPage.goToInboxDerection();
		mailBoxPage.tipTreeMessageinSpam();
		Assert.assertEquals(3, mailBoxPage.getCountOfSelectedChecboxes());
	}

	@Test
	public void unselectTest() {
		loginPage.enterInMail("egor6661999","Isaac96Soles13");
		loginPage.logoutLinkPresents();
		mailBoxPage.tipTreeMessageinSpam();
		mailBoxPage.unselectAll();
		Assert.assertEquals(0, mailBoxPage.getCountOfSelectedChecboxes());
	}

	@Test
	public void sendMessageTest() {
		loginPage.enterInMail("egor6661999","Isaac96Soles13");
		loginPage.logoutLinkPresents();
		mailBoxPage.goToWriteSection();
		mailBoxPage.enterToWhom();
		mailBoxPage.enterMessage();
		mailBoxPage.clickSendButton();
		Assert.assertTrue(mailBoxPage.messageIsPresent());
	}
}
