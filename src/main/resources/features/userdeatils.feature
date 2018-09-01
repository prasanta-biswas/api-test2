Feature: GitHub user details API

  @userdetails @positive
  Scenario Outline: Verify github user details with valid username

    Given I have username <username>
    When I send HTTP request to <api>
    Then I should get <status> as HTTP status code
    And I should get my name <name>, company <company>, location <location>, bio <bio> and public repos <repos>

    Examples:
    |username|api|status|name|company|location|bio|repos|
    |prasanta-biswas|https://api.github.com/users/prasanta-biswas|200|Prasanta Biswas|Seamless Distribution Systems|Kolkata|Test Automation Engineer \| DevOps Enthusiast|28|

  @userdetails @negative
  Scenario Outline: Verify validation on fetching user deatils of invalid user

    Given I have username <username>
    When I send HTTP request to <api>
    Then I should get <status> as HTTP status code
    And I should get <message> as validation message

    Examples:
      |username|api|status|message|
      |$abs|https://api.github.com/users/$abs|401|Not Found|