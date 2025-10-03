/* Write your T-SQL query statement below */
SELECT 
    empee.unique_id ,
    emp.name
FROM  Employees AS emp 
LEFT JOIN  EmployeeUNI AS empee
ON emp.id=empee.id
