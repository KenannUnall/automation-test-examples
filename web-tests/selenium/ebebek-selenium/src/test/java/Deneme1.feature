Feature: Add To Cart Test
  Scenario: Go to e-bebek website and add a baby bottle to the cart

    Given go to e-bebek website
    And close the span
    And type Biberon
    And press to enter
    And add to cart the first Biberon
    When click to Sepeti Gor
    Then verify the success message.