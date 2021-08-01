package org.swaglabs.steps.checkout;

import io.cucumber.java.en.Then;
import org.swaglabs.views.checkout.CompleteView;
import org.testng.Assert;

public class CompleteSteps {

    private CompleteView completeView;

    @Then("title {string} and subtitle {string} are shown in complete view")
    public void verifyTitleAndSubtitle(String expectedTitle, String expectedSubtitle) {
        Assert.assertEquals(getCompleteView().geTitle(), expectedTitle);
        Assert.assertEquals(getCompleteView().geSubtitle(), expectedSubtitle);;
    }

    private CompleteView getCompleteView() {
        if (completeView == null) {
            completeView = new CompleteView();
        }
        return completeView;
    }


}
