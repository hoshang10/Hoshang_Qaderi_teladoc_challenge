Feature:
   Adding a user and deleting a user

  @addUser
  Scenario: Add a user and verify the user has been added
   Given User is on the webTable page
    When User clicks on AddUser button
    And User fills out the information
    And User clicks on Save button
    And new user should be added


  @deleteUser
  Scenario: Delete User: novak and verify user has been deleted
    Given User is on the webTable page
    And User clicks on delete Novak user button
    And User clicks on OK button on Confirmation Dialog window
    Then User Novak should be deleted
