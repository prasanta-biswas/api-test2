Feature: Github Login API

  @login @positive
  Scenario Outline: Verify login with valid credentials
    #replace username and password with actual values
    Given I have username <username> and password <password>
    When I login to GitHub using api <api>
    Then I should get <status> as HTTP status code


    Examples:
      |username|password|api|status|
      |prasanta-biswas|xxxxxxxx|https://api.github.com|200|

  @login @negative
  Scenario Outline: Verify validation on login with invalid credentials

    Given I have username <username> and password <password>
    When I login to GitHub using api <api>
    Then I should get <status> as HTTP status code
    And I should get <message> as validation message

    Examples:
      |username|password|api|status|message|
      |foo|bar|https://api.github.com|401|Bad credentials|
