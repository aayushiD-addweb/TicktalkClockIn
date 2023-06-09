package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Login_Steps {

    Long login;
    WebDriver driver;

    public Login_Steps(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }


    @Given("User is on Site")
    public void user_is_on_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User is able to see the Login page")
    public void user_is_able_to_see_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User fill in all mandatory fields")
    public void user_fill_in_all_mandatory_fields() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicks on Login Button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User is redirected to Dashboard screen")
    public void user_is_redirected_to_dashboard_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on HR dropdown")
    public void user_clicks_on_hr_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicks on Attendance dropdown")
    public void clicks_on_attendance_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User will be redirected to the Attendance Module")
    public void user_will_be_redirected_to_the_attendance_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
