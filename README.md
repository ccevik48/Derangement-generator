# Derangement-generator
This program generates a random derangement for size 'n'; perfect for "secret santa"-esque events/situations where no object is in the same position as it was before.

"In combinatorial mathematics, a derangement is a permutation of the elements of a set, such that no element appears in its original position. In other words, derangement is a permutation that has no fixed points."


Wikipedia article: https://en.wikipedia.org/wiki/Derangement

EXAMPLE
Suppose that a professor gave a test to 4 students – A, B, C, and D – and wants to let them grade each other's tests. Of course, no student should grade his or her own test. How many ways could the professor hand the tests back to the students for grading, such that no student received his or her own test back? Out of 24 possible permutations (4!) for handing back the tests:

ABCD,	ABDC,	ACBD,	ACDB,	ADBC,	ADCB, 
BACD,	BADC,	BCAD,	BCDA,	BDAC,	BDCA, 
CABD,	CADB,	CBAD,	CBDA,	CDAB,	CDBA, 
DABC,	DACB,	DBAC,	DBCA,	DCAB,	DCBA. 

DABC, BADC, CADB,	BCDA, BDAC, CDAB, DCAB, CDBA, and DCBA are the only nine derangements.

To calculate the number of derangements - also called the subfactorial of n (represented as !n) - use the following formula:

!n = [(n!)/e],

where n is the number of elements, e = 2.718281828, and [ ] represents the nearest integer function. Example:

!4 = [(4!)/e]    
!4 = [24/e]      
!4 = [8.829]     
!4 = 9






As it stands, my solution is currently very bad and there are better ways to do it; the logic is slightly redundant to ensure a derangement is produced; even then, sometimes it does not produce an output, I am not sure why but it is most likely because it is stuck in a loop when generating the random number. I do this because I need to make sure the index is not the same the current number being indexed into the array as well not having been taken up by another number already.
