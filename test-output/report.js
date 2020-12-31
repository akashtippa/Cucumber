$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/JavaFrame/Cucumber/Features/CucumberHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks In Cucumber",
  "description": "",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1148013,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add new Customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on add customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user fills customer details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_add_customer_page()"
});
formatter.result({
  "duration": 164144585,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_fills_customer_details()"
});
formatter.result({
  "duration": 278640,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.customer_is_added()"
});
formatter.result({
  "duration": 686527,
  "status": "passed"
});
formatter.after({
  "duration": 288904,
  "status": "passed"
});
formatter.before({
  "duration": 2759033,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit Customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on edit customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user edits contact deatails",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "contact deatils updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_edit_customer_page()"
});
formatter.result({
  "duration": 275599,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_edits_contact_deatails()"
});
formatter.result({
  "duration": 3615861,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.contact_deatils_updated()"
});
formatter.result({
  "duration": 255452,
  "status": "passed"
});
formatter.after({
  "duration": 575908,
  "status": "passed"
});
formatter.before({
  "duration": 2621804,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Delete customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user delete customer",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "customer deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_delete_customer()"
});
formatter.result({
  "duration": 292706,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.customer_deleted()"
});
formatter.result({
  "duration": 28130,
  "status": "passed"
});
formatter.after({
  "duration": 212116,
  "status": "passed"
});
});