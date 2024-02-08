Feature: Login


  Scenario: login success
    Given my name is {}
    And  mypassord is given and encripted
    When i launch login
    Then I'm redirected to home page.

  Scenario: login failed
    Given my name is landry
    And  mypassord is given and encripted
    When i launch login
    Then I'm redirected to error page.