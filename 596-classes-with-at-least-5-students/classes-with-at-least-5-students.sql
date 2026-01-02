/* Write your T-SQL query statement below */
Select class
from Courses
group by class
Having count(class)>=5