CREATE OR REPLACE PROCEDURE get_net_salary (
    p_empno     IN  emp.empno%TYPE,
    p_ename     OUT emp.ename%TYPE,
    p_netsalary OUT NUMBER
) AS
    v_sal        emp.sal%TYPE;
    v_comm       emp.comm%TYPE;
    v_gross      NUMBER;
    v_it         NUMBER;
BEGIN
    SELECT ename, sal, comm
    INTO   p_ename, v_sal, v_comm
    FROM   emp
    WHERE  empno = p_empno;

    v_gross := v_sal + NVL(v_comm, 0);

    IF v_comm IS NULL THEN
        v_it := 0.10 * v_gross;
    ELSIF v_comm < 500 THEN
        v_it := 0.15 * v_gross;
    ELSE
        v_it := 0.20 * v_gross;
    END IF;

    p_netsalary := v_gross - v_it;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        p_ename := NULL;
        p_netsalary := NULL;
END get_net_salary;
/
