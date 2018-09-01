Feature: GitHub user repository API

  @userrepos @positive
  Scenario Outline: Verify github user repository details

    Given I have username <username>
    When I login to GitHub using api <api>
    Then I should get <status> as HTTP status code
    And I should receive <repos> as repo count

    Examples:
    |username|api|status|repos|
    |prasanta-biswas|https://api.github.com/users/prasanta-biswas/repos|200|28|

  Scenario Outline: Verify validation on fetching github user repository details with invalid user

    Given I have username <username>
    When I login to GitHub using api <api>
    Then I should get <status> as HTTP status code
    And I should get <message> as validation message

    Examples:
      |username|api|status|message|
      |*133|https://api.github.com/users/*133/repos|401|Not Found|