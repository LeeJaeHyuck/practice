-- ���� �Լ�
-- ABS (���밪)
SELECT ABS(10), ABS(-10), ABS(-10.123) FROM dual; -- dual�� ���� ���̺�

-- CEIL (���ų� ū ���� ����� ���� ��ȯ)
SELECT CEIL(10.123), CEIL(10.541), CEIL(11.001) FROM dual;

-- FLOOR (���ų� ���� ���� ����� ���� ��ȯ)
SELECT FLOOR(10.123), FLOOR(10.541), FLOOR(11.001) FROM dual;

-- ROUND (�⺻���� �Ҽ� ù��° �ڸ����� �ݿø�)
SELECT ROUND(10.123), ROUND(10.541), ROUND(11.001) FROM dual;
SELECT ROUND(10.123, 1), ROUND(10.541, 1), ROUND(11.001, 1) FROM dual;

-- TRUNC (����)
SELECT TRUNC(10.123, 2), TRUNC(10.541, 1), TRUNC(11.001, -1) FROM dual;

-- POWER (����)
SELECT POWER(3, 2), POWER(3, 3), POWER(3, 3.001) FROM dual;

-- SQRT (������)
SELECT SQRT(2) FROM dual;

-- ������
SELECT MOD(11, 4) FROM dual; -- n2-n1*floor(n2/n1)
SELECT REMAINDER(11, 4) FROM dual; -- n2-n1*round(n2/n1)

-- INITCAP (ù��° ���ڸ� �빮�ڷ� ��ȯ)
SELECT INITCAP('hello') FROM dual;
-- LOWER (��繮�ڸ� �ҹ��ڷ� ��ȯ)
SELECT LOWER('HELLO') FROM dual;

-- CONCAT (���ڿ� ����) * || �����ڷε� ����
SELECT CONCAT('Hello', ' everyone!'), 'Hello' || ' ChulSoo!' FROM dual;

-- SUBSTR (�κ� ���ڿ�)
SELECT SUBSTR('JAVA PROGRAMMING', 6, 4) FROM dual;
-- �������� �ǳ����� �����ϴ� ��ġ��
SELECT SUBSTR('JAVA PROGRAMMING', -3, 4) FROM dual;

-- LTRIM (���ʿ��� ���ڿ� ����)
SELECT LTRIM('ABCDEFGABC', 'ABC') FROM dual;
SELECT LTRIM('      ABCDEFGABC', ' ') FROM dual; -- ���� ����
-- RTRIM (�����ʿ��� ���ڿ� ����)
SELECT RTRIM('ABCDEFGABC', 'ABC') FROM dual;

-- LPAD (���ʿ� ���ڿ� �߰�)
SELECT LPAD('1234-1234', 13, '010-') FROM dual;
-- RPAD (�����ʿ� ���ڿ� �߰�)
SELECT RPAD('1234-1234', 13, '010-') FROM dual;

-- REPLACE (���ڿ����� CHAR�� ã�Ƽ� ���ο� CHAR�� ��ȯ)
SELECT REPLACE(' ABC DEF ', ' ', '') FROM dual; 

-- TRANSLATE
SELECT TRANSLATE('JAVA', 'JA', 'KO') FROM dual;

-- ���ڿ��� ����
SELECT LENGTH('���ѹα�'), LENGTHB('abcd') FROM dual; -- ms949: �ѱ� 1���ڰ� 3����Ʈ utf-8: 2����Ʈ



-- ��¥ ���� �Լ�
-- ���� ���� ���ϴ� �Լ�
SELECT ADD_MONTHS(SYSDATE, 1) FROM DUAL;
SELECT MONTHS_BETWEEN('2020-04-07', '2020-08-07') FROM DUAL;

-- �ش� ���� ������ ��¥
SELECT LAST_DAY('2020-04-07') FROM DUAL;

-- ��¥�� �ݿø�
SELECT SYSDATE, ROUND(TO_DATE('20-04-20'), 'month'), TRUNC(SYSDATE, 'month') FROM DUAL;

-- �ٰ����� ������ ��¥
SELECT NEXT_DAY(SYSDATE, '�ݿ���') FROM DUAL;

-- ���� ��ȯ �Լ�
SELECT TO_CHAR(123456, '999,999') FROM DUAL;
SELECT TO_CHAR(123456.5, '999,999.9') FROM DUAL;
SELECT TO_CHAR(-1234, 'S9999') FROM DUAL;

-- ���� ��ȯ �Լ�
SELECT TO_NUMBER('12345') FROM DUAL;

-- ��¥������ ��ȯ
SELECT TO_CHAR(to_date('20200407'),'YYYY-MM-DD') FROM DUAL;

SELECT INSTR('prefix, precise, preface', 'pre', 7, 1) FROM dual;

-- �������� ###.###.#### ��ȣ�� ó�� ���ڸ� ��� 02 �ֱ�
SELECT '(02)' || SUBSTR(PHONE_NUMBER, 5, 8) FROM employees;

-- �������� �ټ����� 10���̻� ��� ���
SELECT employee_id as �����ȣ, emp_name as �����, hire_date as �Ի�����, 
    ROUND(((SYSDATE - HIRE_DATE) / 365)) as �ټӳ��
    FROM employees where 10 <= ((SYSDATE - HIRE_DATE) / 365);

-- �������� ��ȭ��ȣ - ���� . ���� �ٲٱ�
SELECT REPLACE(cust_main_phone_number, '-', '.') FROM customers;

-- NVL (EXPR1 �� NULL �̸� EXPR2�� ��ȯ)
SELECT NVL(manager_id, employee_id) FROM employees WHERE manager_id IS NULL;

-- NVL2 ����
SELECT emp_name, '$ ' || NVL2(commission_pct, salary+(salary * commission_pct), salary) AS �޿�
    FROM employees ORDER BY NVL2(commission_pct, salary+(salary * commission_pct), salary);

-- COALESCE
SELECT employee_id, salary, commission_pct, COALESCE(salary * commission_pct, salary) AS ���ʽ�
    FROM employees;

-- NULLIF
SELECT employee_id, TO_CHAR(start_date, 'YYYY') AS ���۳⵵,
    TO_CHAR(end_date, 'YYYY') AS ����⵵,
    NULLIF(TO_CHAR(end_date, 'YYYY'), TO_CHAR(start_date, 'YYYY'))
    FROM job_history;

SELECT prod_id, DECODE(channel_id, 3, 'Direct', 9, 'Direct', 5, 'Indirect', 4, 'Indirect', 'Others') as decodes
    FROM sales;

SELECT cust_name,
    DECODE(TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10), 3, '30��', 4, '40��', 5, '50��','��Ÿ') as age
    FROM customers;

SELECT cust_name,
    CASE
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 0 THEN '0��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 1 THEN '10��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 2 THEN '20��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 3 THEN '30��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 4 THEN '40��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 5 THEN '50��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 6 THEN '60��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 7 THEN '70��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 8 THEN '80��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 9 THEN '90��'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 10 THEN '100��'
        ELSE '��Ÿ'
    END AS age
    FROM customers;

-- ��ȸ�Ǽ�
SELECT COUNT(*) FROM customers;

-- ��ü �÷��� �հ� ��ȯ
SELECT SUM(amount_sold) FROM sales;

-- ��հ� ��ȯ
SELECT trunc(AVG(salary)) FROM employees;

-- �ִ밪, �ּҰ�
SELECT MIN(salary), MAX(salary) FROM employees;

-- �л갪, ǥ������
SELECT VARIANCE(salary), STDDEV(salary) FROM employees;
























