Feature: Hooks In Cucumber

Scenario: Add new Customer
Given user is on add customer page
When user fills customer details
Then customer is added

Scenario: Edit Customer
Given user is on edit customer page
When user edits contact deatails
Then contact deatils updated

Scenario: Delete customer
Given user delete customer
Then customer deleted
