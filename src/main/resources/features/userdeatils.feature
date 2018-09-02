Feature: GitHub user details API

  @userdetails @positive
  Scenario Outline: Verify github user details with valid username

    Given I have github api <api>
    When I send HTTP request to api with username <username>
    Then I should get <status> as HTTP status code
    And I should get my name <name>, company <company>, location <location>, bio <bio> and public repos <repos>

    Examples:
    |api|username|status|name|company|location|bio|repos|
    |https://api.github.com/users|prasanta-biswas|200|Prasanta Biswas|Seamless Distribution Systems|Kolkata|Test Automation Engineer \| DevOps Enthusiast|28|

  @userdetails @negative
  Scenario Outline: Verify validation on fetching user deatils of invalid user

    Given I have github api <api>
    When I send HTTP request to api with username <username>
    Then I should get <status> as HTTP status code
    And I should get <message> as validation message

    Examples:
      |api|username|status|message|
      |https://api.github.com/users|$abs|404|Not Found|