# SELECT (
             #     SELECT DISTINCT salary
#     FROM Employee
#     WHERE salary < (
#         SELECT MAX(salary)
#         FROM Employee
#     )
#     ORDER BY salary DESC
#     LIMIT 1
# ) AS SecondHighestSalary;

SELECT IFNULL(( SELECT DISTINCT Salary
                FROM Employee
                ORDER BY Salary DESC
                  LIMIT 1,1),NULL) AS SecondHighestSalary;