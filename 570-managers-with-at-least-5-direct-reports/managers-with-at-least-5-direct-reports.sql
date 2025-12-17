/* Write your T-SQL query statement below */
SELECT e1.name
FROM Employee AS e1
INNER JOIN Employee AS e2
ON e1.id = e2.managerId
GROUP BY e1.name,e2.managerId
HAVING count(e2.managerId)>=5
