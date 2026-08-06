-- ============================================================
-- 04_ddl.sql
-- DDL: DEPT / EMP tables, constraints, DROP/CREATE cycles
-- (depends on the HR demo schema: departments)
-- ============================================================

--Q1
CREATE TABLE DEPT
(
DEPT_ID NUMBER(7) PRIMARY KEY,
DEPT_NAME VARCHAR2(20)
);

DESC DEPT;

--Q2
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)
SELECT DEPARTMENT_ID,DEPARTMENT_NAME
FROM DEPARTMENTS;

INSERT INTO DEPT VALUES(10,'Accounts');

INSERT INTO DEPT VALUES(NULL,'TT');

UPDATE DEPT
SET DEPT_ID=20
WHERE DEPT_NAME='TT';

-- NOTE: this line is expected to raise an error (inserting a
-- non-numeric value 'A1' into a NUMBER primary key column) —
-- it is intentionally part of the exercise to observe the error.
INSERT INTO DEPT VALUES('A1','Accounts');

INSERT INTO DEPT VALUES(30,'Accounts');

SELECT * FROM DEPT;

--Q3
DROP TABLE EMP CASCADE CONSTRAINTS;

CREATE TABLE DEPT
(
    DEPT_ID NUMBER(7) PRIMARY KEY,
    DEPT_NAME VARCHAR2(20)
);

INSERT INTO DEPT VALUES (10,'Accounts');
INSERT INTO DEPT VALUES (20,'TT');
INSERT INTO DEPT VALUES (30,'Accounts');

CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_DEPT_FK
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);

DESC EMP;

INSERT INTO EMP VALUES (101,'Ram','Krishna',20);
INSERT INTO EMP VALUES (102,'Gopi',NULL,40);   -- expected to fail: DEPT_ID 40 has no matching row in DEPT (FK violation)
INSERT INTO EMP VALUES (103,NULL,'Ram',20);    -- expected to fail: LAST_NAME is NOT NULL
SELECT * FROM EMP;

SELECT table_name
FROM user_tables
WHERE table_name = 'DEPT';

SELECT table_name
FROM user_tables
WHERE table_name = 'EMP';

SELECT * FROM user_errors;


DROP TABLE EMP CASCADE CONSTRAINTS;

DROP TABLE DEPT CASCADE CONSTRAINTS;

CREATE TABLE DEPT
(
    DEPT_ID NUMBER(7) PRIMARY KEY,
    DEPT_NAME VARCHAR2(20)
);

INSERT INTO DEPT VALUES (10,'Accounts');
INSERT INTO DEPT VALUES (20,'TT');
INSERT INTO DEPT VALUES (30,'Accounts');

CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_DEPT_FK
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);

DESC EMP;

INSERT INTO EMP VALUES (101,'Sam','Sundar',10);

INSERT INTO EMP VALUES (101,'Ram','Krishna',20);  -- expected to fail: duplicate PRIMARY KEY (ID = 101)

INSERT INTO EMP VALUES (102,'Gopi',NULL,40);      -- expected to fail: FK violation (DEPT_ID 40 doesn't exist)

INSERT INTO EMP VALUES (103,NULL,'Ram',20);       -- expected to fail: LAST_NAME is NOT NULL

SELECT * FROM EMP;

SELECT table_name
FROM user_tables
ORDER BY table_name;

SELECT object_name, object_type
FROM user_objects
WHERE object_name IN ('DEPT','EMP');

-- NOTE: this CREATE TABLE EMP will fail if EMP already exists from above
-- (drop it first if you want to re-run this block in isolation)
CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_FK1
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);
DESC EMP;

INSERT INTO EMP VALUES (101,'Sam','Sundar',10);

SELECT * FROM EMP;
