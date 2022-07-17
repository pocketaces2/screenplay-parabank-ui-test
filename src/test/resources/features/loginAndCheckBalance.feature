Feature: As a user I want to verify that I can view images of a product

  Scenario: As a user I want to verify product images display correctly
    Given that Bob is on the homepage
    When he accesses his account by logging in with user:bob97 and password:abc123
    Then he should be able to see the account overview page



