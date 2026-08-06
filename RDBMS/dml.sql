-- ============================================================
-- 03_dml.sql
-- DML: create/insert/update/delete on MY_EMPLOYEE
-- (depends on the HR demo schema: employees)
-- ============================================================

--Q1
CREATE TABLE MY_EMPLOYEE AS
SELECT employee_id, first_name, last_name, department_id, salary
FROM employees
WHERE 1=2;

--Q2
DESC MY_EMPLOYEE;

--Q3
INSERT INTO MY_EMPLOYEE
VALUES (201,'Michael','Hartstein',20,13000);
SELECT * FROM MY_EMPLOYEE;

--Q4
INSERT INTO MY_EMPLOYEE
VALUES (202,'Pat','Fay',20,NULL);

SELECT * FROM MY_EMPLOYEE;

--Q5
INSERT INTO MY_EMPLOYEE
(employee_id,first_name,last_name,department_id)
VALUES (203,'Susan','Mavris',40);
SELECT * FROM MY_EMPLOYEE;

--Q6
INSERT INTO MY_EMPLOYEE VALUES (205,'Shelley','Higgins',110,12000);

INSERT INTO MY_EMPLOYEE VALUES (100,'Steven','King',90,24000);

INSERT INTO MY_EMPLOYEE VALUES (101,'Neena','Kochhar',90,17000);

INSERT INTO MY_EMPLOYEE VALUES (102,'Lex','De Haan',90,17000);

INSERT INTO MY_EMPLOYEE VALUES (111,'Ismael','Sciarra',100,7700);

INSERT INTO MY_EMPLOYEE VALUES (112,'Jose Manuel','Urman',100,7800);

INSERT INTO MY_EMPLOYEE VALUES (204,'Hermann','Baer',70,10000);

SELECT * FROM MY_EMPLOYEE;

--Q7
UPDATE MY_EMPLOYEE
SET salary = salary + (salary*0.10)
WHERE department_id = 90;

SELECT * FROM MY_EMPLOYEE;

--Q8
UPDATE MY_EMPLOYEE
SET last_name='Higgins'
WHERE employee_id=202;

SELECT * FROM MY_EMPLOYEE;

--Q9
DELETE FROM MY_EMPLOYEE
WHERE LOWER(first_name) LIKE '%man%'
OR LOWER(last_name) LIKE '%man%';

SELECT * FROM MY_EMPLOYEE;
