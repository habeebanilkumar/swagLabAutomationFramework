Feature: Product Checkout feature

  @smoke
  Scenario: Verify User is able to Checkout the Product
    Given user navigates to "url"
    And user enters "adminUsername" username
    And user enters "adminPassword" password
    And user clicks Login button
    Then user navigate to the products page
    Then user click on add to cart
    Then user click on container button
    Then user click on checkout button
    And user enters "firstName" firstname
    And user enters "lastName" lastname
    And user enters "postalCode" postalcode
    Then user click on continue button
    Then user click on finish button
    