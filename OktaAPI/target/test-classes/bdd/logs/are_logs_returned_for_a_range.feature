Feature: As an account counselor I want to know the activitiy associated with a given account
  We want the account logging information fetched in a timely fashion so that I as a counselor can help
  plan members when they log in with issues.


  Scenario: Return a range of logged events for a given date range. 
 		Given the since date is 2019-11-01T01:01
 		And the until date is 2019-11-15T01:01
 		And I query the OktaWebClient
		Then I should receive the maximum number of events back
		And the date of the last event should be equal or less than today's date.


