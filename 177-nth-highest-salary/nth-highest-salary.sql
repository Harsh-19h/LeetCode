CREATE FUNCTION getNthHighestSalary (@N INT)
RETURNS INT
AS
BEGIN
    IF (@N <= 0)
        RETURN NULL;

    RETURN (
        SELECT salary
        FROM (
            SELECT DISTINCT salary
            FROM Employee
        ) AS e
        ORDER BY e.salary DESC
        OFFSET (@N - 1) ROWS FETCH NEXT 1 ROWS ONLY
    );
END;