
Feature: Test calculator smoke scenario

  Scenario Outline: Addition Feature
    Given I have a number <number_A> and number <number_B>
    When I want to perform addition operation on these numbers
    Then the expected result will be <number_Result>
    Examples:
      | number_A | number_B | number_Result |
      | 1        |1         |2              |
      |2         |2         |4             |

  Scenario Outline: Subtraction Feature
    Given I have a number <number_A> and number <number_B>
    When I want to perform subtraction operation on these numbers
    Then the expected result will be <number_Result>
    Examples:
      | number_A | number_B | number_Result |
      |1         |1         |0              |
      |2         |2         |0              |

  Scenario Outline: Multiple Feature
    Given I have a number <nummber_A> and number <number_B>
    When I want to perform multiple operation on these numbers
    Then the expected result will be <number_Result>
    Examples:
      | nummber_A | number_B | number_Result |
      |1          |1         |1             |
      |3          |2         |6             |
