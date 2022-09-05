Feature: Test add Album
  Scenario: Adding album
    Given I add Album to SklepMuzyczny
    When I add 1 Album to SklepMuzyczny
    Then result is 1

    Scenario Outline:
      Given I add Albums to SklepMuzyczny
      When I add <album1> and <album2>
      Then result is 2
      Examples:
        | album1                                           | album2                                          |  |
        | Album album1 = new Album(100,Gatunek.ROCK,1990); | Album album2 = new Album(200,Gatunek.RAP,2000); |

