#Language en
#Author: Daniel Sandoval

Feature:Exito Shopping page automation

  As a user on the exito page, I want to choose a category and subcategory,
  to choose 5 random products and from each product random units between 1-10

  #Scenario 1
  @first
  Scenario: Purchases on Exito page
    Given Category and subcategory
    When Choose different amounts of five products
    Then Finally products added to cart





