-- SDE Interview SQL Master Script: Window Functions, Joins & CTEs

-- 1. Finding the 2nd Highest Salary using DENSE_RANK()
WITH RankedSalaries AS (
    SELECT 
        employee_id,
        name,
        department_id,
        salary,
        DENSE_RANK() OVER (ORDER BY salary DESC) as rank_pos
    FROM employees
)
SELECT employee_id, name, salary 
FROM RankedSalaries 
WHERE rank_pos = 2;

-- 2. Running Total Salary and Department Top Earners using Window Functions
SELECT 
    e.employee_id,
    e.name,
    d.department_name,
    e.salary,
    SUM(e.salary) OVER (PARTITION BY e.department_id ORDER BY e.hire_date) as running_dept_salary,
    DENSE_RANK() OVER (PARTITION BY e.department_id ORDER BY e.salary DESC) as dept_salary_rank
FROM employees e
INNER JOIN departments d ON e.department_id = d.id;
