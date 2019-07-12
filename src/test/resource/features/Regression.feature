Feature: Go to yahoo japan website
  Description: The user can go to yahoo.co.jp website from their browser

  Scenario: Customer opens their browser and type yahoo japan by opening their chrome browser
    Given user opened google chrome browser
    When he types query at google search
    Then he should be able to visit to yahoo japan website