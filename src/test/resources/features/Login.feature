@Login
Feature: As a potential user i want to interact with the Login functionalities

  @Smoke @Success
  Scenario Outline: The user logs in successfully into the app with <username>
    Given login view is displayed
    When do the login process with '<username>' and '<password>'
    Then home view is displayed

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |

  @Fail
  Scenario Outline: The user tries to log into the app with invalid data: username: <username> and password: <password>
    Given login view is displayed
    When do the login process with '<username>' and '<password>'
    Then message '<message>' is displayed in login view

    Examples:
      | username      | password     | message                                                                   |
      |               |              | Epic sadface: Username is required                                        |
      |               | secret_sauce | Epic sadface: Username is required                                        |
      | standard_user | invalid      | Epic sadface: Username and password do not match any user in this service |
      | invalid       | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user |              | Epic sadface: Password is required                                        |
