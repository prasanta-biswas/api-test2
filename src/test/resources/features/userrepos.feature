Feature: GitHub user repository API

  @userrepos @positive
  Scenario Outline: Verify github user repository details

    Given I have github api <api>
    When I send HTTP request with username <username> and uri <uri>
    Then I should get <status> as HTTP status code
    And I should receive <repos> as repo count

    Examples:
    |api|username|uri|status|repos|
    |https://api.github.com/users|prasanta-biswas|/repos|200|28|

  @userrepos @negative
  Scenario Outline: Verify validation on fetching github user repository details with invalid user

    Given I have github api <api>
    When I send HTTP request with username <username> and uri <uri>
    Then I should get <status> as HTTP status code
    And I should get <message> as validation message

    Examples:
      |api|username|uri|status|message|
      |https://api.github.com/users|*133|/repos|404|Not Found|