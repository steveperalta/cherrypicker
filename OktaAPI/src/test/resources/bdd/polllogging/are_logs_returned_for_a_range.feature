
Feature: As an account counselor I want to know the activitiy associated with a given account
  We want the account logging information fetched in a timely fashion so that I as a counselor can help
  plan members when they log in with issues.

Scenario Outline: Pulling logs data for ranges should return correct numbers and dates.

  Given a search from <since> to <until>
  When I query okta
  Then I should have correct date times and <rows> rows

Examples:
 		| since  								| until 								| rows	|
    | "2019-11-10T01:01:00"	| "2019-11-15T01:01:00"	| 25		|
		| "2019-11-15T01:01:00"	| "2019-12-15T01:01:00"	| 25		|