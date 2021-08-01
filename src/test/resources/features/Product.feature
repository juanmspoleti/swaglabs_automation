@Product @Smoke @Success
Feature: As a potential user i want to buy products

  Background: Login to the app
    Given login view is displayed
    When do the login process with 'standard_user' and 'secret_sauce'
    Then home view is displayed

  Scenario Outline: User add a product to the cart and verify is buying the selected product
    When selects the product '<productName>'
    And clicks on add to cart button
    And clicks on chart icon
    And clicks on checkout button
    And completes the information with '<firstName>', '<secondName>' and '<postalCode>'
    Then product name is '<productName>' in overview screen

    Examples:
      | productName         | firstName | secondName | postalCode |
      | Sauce Labs Backpack | Test      | Automation | 1000       |

  @Buy
  Scenario Outline: User add a product to the cart and proceeds with the checkout
    When selects the product '<productName>'
    And clicks on add to cart button
    And clicks on chart icon
    And clicks on checkout button
    And completes the information with '<firstName>', '<secondName>' and '<postalCode>'
    And clicks on finish button
    Then title '<title>' and subtitle '<subtitle>' are shown in complete view

    Examples:
      | productName         | firstName | secondName | postalCode | title                    | subtitle                                                                                |
      | Sauce Labs Backpack | Test      | Automation | 1000       | THANK YOU FOR YOUR ORDER | Your order has been dispatched, and will arrive just as fast as the pony can get there! |

  @Buy @Logout
  Scenario Outline: User add a product to the cart, proceeds with the checkout and do a logout
    When selects the product '<productName>'
    And clicks on add to cart button
    And clicks on chart icon
    And clicks on checkout button
    And completes the information with '<firstName>', '<secondName>' and '<postalCode>'
    And clicks on finish button
    And selects logout option from more menu
    Then login view is displayed

    Examples:
      | productName         | firstName | secondName | postalCode |
      | Sauce Labs Backpack | Test      | Automation | 1000       |
