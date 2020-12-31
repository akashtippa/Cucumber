Feature: Tagn in cucumber


@SanityTest
Scenario: Verify login
Given This is valid Login test

@SanityTest @EndtoEndTest
Scenario: Verify Logout
Given this is logout test

@RegressionTest
Scenario: Verify search
Given this is search test

@RegressionTest @EndtoEndTest
Scenario: Verify advanced search
Given This is advanced test

@EndtoEndTest
Scenario: verify prepaid recharge
Given This is prepaid recharge

@EndtoEndTest
Scenario: verify Postpaid recharge
Given This is Postpaid recharge
 