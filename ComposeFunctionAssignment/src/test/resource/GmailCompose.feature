Feature: Gmail Compose Functionality

  Scenario: Compose and Send Email
    Given I am logged in to Gmail
    When I compose a new email with subject "Test Email" and body "This is a test email"
    And I add recipient "example@gmail.com"
    And I click on the send button
    Then the email should be sent successfully