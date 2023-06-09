Feature: Clock In on Dashboard

#  Scenario: Successful Clock-In
#    Given The user is on Dashboard
#    And The clock-in button is displayed
#    When user clicks on the clock-in button
#    And The Clock-in pop-up is displayed
#    And The by default selected as WFO
#    And User click on Clock-in button
#    Then The user successfully clock-in
#    And the user's clock-in time should be displayed on the dashboard
#    And the system should confirm the clock-in with a success message

  Scenario: Verify the clock-in time
    Given The user is on Dashboard
    And User clicks on Work Module
    When User clicks on Attendance module
    And User navigate to the Attendance page
