Feature: Login Function
  User Story: As a user, I should be able to log in
  @STEP
  Scenario Outline:  "Login Function" Positive Scenario
    Given Users are on the Main page
    Then Users should click Signin button
    Then Users are on the Login page
    When Users enter "<username>" and "<password>"
    And Users click Sign in button
    And Users get an error on the page
    Then Users go back and they are signed in already

    Examples: Valid Credentials
      | username | password |
      | username | password |
  @SIP
  Scenario Outline: Login Function Negative Scenario
    Given Users are on the Main page
    Then Users should click Signin button
    Then Users are on the Login page
    When Users enter wrong credentials "<InvalidUsername>" and "<InvalidPassword>"
    And Users click Sign in button
    When users see warning the message "Login and/or password are wrong."

    Examples: Invalid credentials
      | InvalidUsername | InvalidPassword |
      | Java34          | Api345          |
      | IntellliJ       | termiL87        |
      | Usertest34      | disCord54       |

  Scenario: "Login Function" username and password are empty
    When Users leave login and password boxes empty and click Sign in button
    When Users see warning the message "Login and/or password are wrong."

  Scenario: "Login Function" Forgot Password
    When Users click the "Forgot your password ?" button
    Then Users see the "Forgotten Password" page

