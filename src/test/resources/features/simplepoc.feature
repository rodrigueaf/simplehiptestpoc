Feature: simplepoc


  Scenario: Go to home page (uid:000156a3-cb07-48f8-b9d7-2a6e3cc7461a)
    When go to "home" page
    Then we have 2 menu links

  Scenario: Go to first page (uid:e6b0854b-70fe-4dc2-8c01-0209691f3059)
    Given we are on "home" page
    When we click on "link1" link
    Then we go to "page1" page
    And it shows "Welcome John"

  Scenario: Go to second page (uid:670294bc-1ca9-4221-94e3-46a90c75c902)
    Given we are on "home" page
    When we click on "link2" link
    Then we go to "page2" page
