-- ============================================================
-- 01_select_basics.sql
-- Basic SELECT statements (uses the HR demo schema: employees)
-- ============================================================

-- Question 2
SELECT employee_id,
       last_name,
       job_id,
       hire_date AS STARTDATE
FROM employees;

-- Question 3
SELECT DISTINCT job_id
FROM employees;

-- Question 4
SELECT employee_id AS "Emp #",
       last_name AS "Employee",
       job_id AS "Job",
       hire_date AS "Hire Date"
FROM employees;

-- Question 5
SELECT last_name || ', ' || job_id AS "Employee and Title"
FROM employees;
