package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Clock_In_Steps {

    WebDriver driver;

    public Clock_In_Steps(Hooks hooks)
    {
        this.driver = hooks.getDriver();
    }


    @Given("The user is on Dashboard")
    public void the_user_is_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Given("The clock-in button is displayed")
    public void the_clock_in_button_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on the clock-in button")
    public void user_clicks_on_the_clock_in_button() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("The Clock-in pop-up is displayed")
    public void the_clock_in_pop_up_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("The by default selected as WFO")
    public void the_by_default_selected_as_wfo() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("User click on Clock-in button")
    public void user_click_on_clock_in_button() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("The user successfully clock-in")
    public void the_user_successfully_clock_in() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Then("the user's clock-in time should be displayed on the dashboard")
    public void the_user_s_clock_in_time_should_be_displayed_on_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Then("the system should confirm the clock-in with a success message")
    public void the_system_should_confirm_the_clock_in_with_a_success_message() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Given("User clicks on Work Module")
    public void user_clicks_on_work_module() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Attendance module")
    public void user_clicks_on_attendance_module() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("User navigate to the Attendance page")
    public void user_navigate_to_the_attendance_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }



}
