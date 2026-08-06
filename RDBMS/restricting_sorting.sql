-- ============================================================
-- 02_restricting_sorting.sql
-- Restricting and Sorting Data (uses the HR demo schema: employees)
-- ============================================================

-- Q1
SELECT last_name, salary
FROM employees
WHERE salary > 12000;

-- Q2
SELECT last_name, department_id
FROM employees
WHERE employee_id = 176;

-- Q3
SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;

-- Q4
SELECT last_name, job_id, hire_date
FROM employees
WHERE last_name IN ('Matos','Taylor')
ORDER BY hire_date ASC;

-- Q5
SELECT last_name, department_id
FROM employees
WHERE department_id IN (20,50)
ORDER BY last_name ASC;

-- Q6
SELECT last_name AS "Employee", salary AS "Monthly Salary"
FROM employees
WHERE salary BETWEEN 5000 AND 12000
AND department_id IN (20,50);

-- Q7
SELECT last_name, hire_date
FROM employees
WHERE EXTRACT(YEAR FROM hire_date) = 1994;

-- Q8
SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL;

-- Q9
SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY 2 DESC, 3 DESC;

-- Q10 (substitution variable — SQL*Plus/SQL Developer will prompt for a value)
SELECT last_name, salary
FROM employees
WHERE salary > &Salary_value;

-- Q11 (substitution variables)
SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE manager_id = &manager_id
ORDER BY &sorted_by;

-- Q12
SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';

-- Q13
SELECT last_name
FROM employees
WHERE last_name LIKE '%a%'
AND last_name LIKE '%e%';

-- Q14
SELECT last_name, job_id, salary
FROM employees
WHERE job_id IN ('SA_REP','ST_CLERK')
AND salary NOT IN (2500,3500,7000);
