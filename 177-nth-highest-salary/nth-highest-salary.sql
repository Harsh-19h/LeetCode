create function getNthHighestSalary(@N INT)
returns INT
as 
begin
    return(
    select max(salary) 
    from (select salary,
            dense_rank() over(order by salary desc) as dr
        from Employee
        )t
    where dr= @n
    );
end;