/* Write your T-SQL query statement below */
Select p.project_id,
    Round(sum(e.experience_years)*1.0/count(p.employee_id),2)as average_years
 from project as p
join Employee as e
 on p.employee_id = e.employee_id
 group by p.project_id
