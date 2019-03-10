package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.AbstractDriver;
import pageObjects.MailBoxPage;

public class MailBoxPageSteps extends AbstractDriver {

    MailBoxPage mailBoxPage = new MailBoxPage(webDriver);


    @When("^user clicks on mail checkbox in spam section$")
    public void clickCheckboxInSpam() {
        mailBoxPage.tipMessageinSpam();
    }

    @When("^user clicks on mail checkbox$")
    public void clickCheckbox() {
        mailBoxPage.tipMessage();
    }


    @When("^user clicks on spam button$")
    public void clickSpamButton() {
        mailBoxPage.moveMessageToSpam();
    }

    @Then("^user can see message that mail was added in spam section$")
    public void spamSection() {
        Assert.assertFalse(mailBoxPage.getTextFromSpamSection().contains("Нет писем"));
    }

    @When("^user clicks on span section button$")
    public void clickSpanSectionButton() {
        mailBoxPage.goToSpam();
    }

    @When("^user clicks on nospam button$")
    public void clickNospamButton() {
        mailBoxPage.moveMessageToInput();
    }

    @Then("^user can see message that mail was extracted from spam section$")
    public void spamSectionIsEmpty() {
        Assert.assertTrue(mailBoxPage.getTextFromSpamSection().contains("Нет писем"));
    }

    @When("^user clicks on inbox mail button$")
    public void returnToInbox() {
        mailBoxPage.goToInboxDerection();
    }

    @When("^user clicks on three checkboxes$")
    public void clickOnTreeMessage() {
        mailBoxPage.tipTreeMessageinSpam();
    }

    @Then("^user can see all three checkboxes are marked$")
    public void seeTreeCheckboxes() {
        Assert.assertEquals(3, mailBoxPage.getCountOfSelectedChecboxes());
    }

    @When("^user clicks on unselect all button$")
    public void clickOnUnselectButton() {
        mailBoxPage.unselectAll();
    }

    @Then("^user can see all checkboxes are unmarked$")
    public void seeEmptyAllCheckboxes() {
        Assert.assertEquals(0, mailBoxPage.getCountOfSelectedChecboxes());
    }

    @When("^user clicks on button Write mail$")
    public void clickButtonWriteMAil() {

        mailBoxPage.goToWriteSection();
    }

    @When("^user fills form To Whom:$")
    public void fillsToWhom() {

        mailBoxPage.enterToWhom();
    }

    @When("^user writes the text of mail$")
    public void writeText() {

        mailBoxPage.enterMessage();
    }

    @When("^user clicks on button Send$")
    public void sendMail() {

        mailBoxPage.clickSendButton();
    }

    @Then("^user can see the message that mail was sended$")
    public void seeMailWasSended() {
        Assert.assertTrue(mailBoxPage.messageIsPresent());
    }
}
