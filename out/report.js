$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/add-new-address.feature");
formatter.feature({
  "line": 1,
  "name": "Add new shipping address after login",
  "description": "",
  "id": "add-new-shipping-address-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can add new shipping address",
  "description": "",
  "id": "add-new-shipping-address-after-login;user-can-add-new-shipping-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is logged in my store",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User goes to CreateNewAddressesPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User input Alias, Address, City, Zip, Country, Phone and click save button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User sees \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewAddress.LoginToMyStore()"
});
formatter.result({
  "duration": 4020402300,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddress.goesToNewAddressPage()"
});
formatter.result({
  "duration": 667589800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddress.InputNewAddress()"
});
formatter.result({
  "duration": 1008070400,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddress.confirmation()"
});
formatter.result({
  "duration": 36492400,
  "status": "passed"
});
});