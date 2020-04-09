-- 숫자 함수
-- ABS (절대값)
SELECT ABS(10), ABS(-10), ABS(-10.123) FROM dual; -- dual은 가상 테이블

-- CEIL (같거나 큰 가장 가까운 정수 반환)
SELECT CEIL(10.123), CEIL(10.541), CEIL(11.001) FROM dual;

-- FLOOR (같거나 작은 가장 가까운 정수 반환)
SELECT FLOOR(10.123), FLOOR(10.541), FLOOR(11.001) FROM dual;

-- ROUND (기본으로 소수 첫번째 자리에서 반올림)
SELECT ROUND(10.123), ROUND(10.541), ROUND(11.001) FROM dual;
SELECT ROUND(10.123, 1), ROUND(10.541, 1), ROUND(11.001, 1) FROM dual;

-- TRUNC (버림)
SELECT TRUNC(10.123, 2), TRUNC(10.541, 1), TRUNC(11.001, -1) FROM dual;

-- POWER (제곱)
SELECT POWER(3, 2), POWER(3, 3), POWER(3, 3.001) FROM dual;

-- SQRT (제곱근)
SELECT SQRT(2) FROM dual;

-- 나머지
SELECT MOD(11, 4) FROM dual; -- n2-n1*floor(n2/n1)
SELECT REMAINDER(11, 4) FROM dual; -- n2-n1*round(n2/n1)

-- INITCAP (첫번째 문자를 대문자로 변환)
SELECT INITCAP('hello') FROM dual;
-- LOWER (모든문자를 소문자로 변환)
SELECT LOWER('HELLO') FROM dual;

-- CONCAT (문자열 연결) * || 연산자로도 가능
SELECT CONCAT('Hello', ' everyone!'), 'Hello' || ' ChulSoo!' FROM dual;

-- SUBSTR (부분 문자열)
SELECT SUBSTR('JAVA PROGRAMMING', 6, 4) FROM dual;
-- 음수값은 맨끝에서 시작하는 위치값
SELECT SUBSTR('JAVA PROGRAMMING', -3, 4) FROM dual;

-- LTRIM (왼쪽에서 문자열 제거)
SELECT LTRIM('ABCDEFGABC', 'ABC') FROM dual;
SELECT LTRIM('      ABCDEFGABC', ' ') FROM dual; -- 공백 제거
-- RTRIM (오른쪽에서 문자열 제거)
SELECT RTRIM('ABCDEFGABC', 'ABC') FROM dual;

-- LPAD (왼쪽에 문자열 추가)
SELECT LPAD('1234-1234', 13, '010-') FROM dual;
-- RPAD (오른쪽에 문자열 추가)
SELECT RPAD('1234-1234', 13, '010-') FROM dual;

-- REPLACE (문자열에서 CHAR을 찾아서 새로운 CHAR로 변환)
SELECT REPLACE(' ABC DEF ', ' ', '') FROM dual; 

-- TRANSLATE
SELECT TRANSLATE('JAVA', 'JA', 'KO') FROM dual;

-- 문자열의 길이
SELECT LENGTH('대한민국'), LENGTHB('abcd') FROM dual; -- ms949: 한글 1글자가 3바이트 utf-8: 2바이트



-- 날짜 관련 함수
-- 월의 수를 더하는 함수
SELECT ADD_MONTHS(SYSDATE, 1) FROM DUAL;
SELECT MONTHS_BETWEEN('2020-04-07', '2020-08-07') FROM DUAL;

-- 해당 월의 마지막 날짜
SELECT LAST_DAY('2020-04-07') FROM DUAL;

-- 날짜의 반올림
SELECT SYSDATE, ROUND(TO_DATE('20-04-20'), 'month'), TRUNC(SYSDATE, 'month') FROM DUAL;

-- 다가오는 요일의 날짜
SELECT NEXT_DAY(SYSDATE, '금요일') FROM DUAL;

-- 문자 변환 함수
SELECT TO_CHAR(123456, '999,999') FROM DUAL;
SELECT TO_CHAR(123456.5, '999,999.9') FROM DUAL;
SELECT TO_CHAR(-1234, 'S9999') FROM DUAL;

-- 숫자 변환 함수
SELECT TO_NUMBER('12345') FROM DUAL;

-- 날짜형으로 변환
SELECT TO_CHAR(to_date('20200407'),'YYYY-MM-DD') FROM DUAL;

SELECT INSTR('prefix, precise, preface', 'pre', 7, 1) FROM dual;

-- 연습문제 ###.###.#### 번호를 처음 세자리 대신 02 넣기
SELECT '(02)' || SUBSTR(PHONE_NUMBER, 5, 8) FROM employees;

-- 연습문제 근속일자 10년이상 사원 출력
SELECT employee_id as 사원번호, emp_name as 사원명, hire_date as 입사일자, 
    ROUND(((SYSDATE - HIRE_DATE) / 365)) as 근속년수
    FROM employees where 10 <= ((SYSDATE - HIRE_DATE) / 365);

-- 연습문제 전화번호 - 에서 . 으로 바꾸기
SELECT REPLACE(cust_main_phone_number, '-', '.') FROM customers;

-- NVL (EXPR1 이 NULL 이면 EXPR2를 반환)
SELECT NVL(manager_id, employee_id) FROM employees WHERE manager_id IS NULL;

-- NVL2 예제
SELECT emp_name, '$ ' || NVL2(commission_pct, salary+(salary * commission_pct), salary) AS 급여
    FROM employees ORDER BY NVL2(commission_pct, salary+(salary * commission_pct), salary);

-- COALESCE
SELECT employee_id, salary, commission_pct, COALESCE(salary * commission_pct, salary) AS 보너스
    FROM employees;

-- NULLIF
SELECT employee_id, TO_CHAR(start_date, 'YYYY') AS 시작년도,
    TO_CHAR(end_date, 'YYYY') AS 종료년도,
    NULLIF(TO_CHAR(end_date, 'YYYY'), TO_CHAR(start_date, 'YYYY'))
    FROM job_history;

SELECT prod_id, DECODE(channel_id, 3, 'Direct', 9, 'Direct', 5, 'Indirect', 4, 'Indirect', 'Others') as decodes
    FROM sales;

SELECT cust_name,
    DECODE(TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10), 3, '30대', 4, '40대', 5, '50대','기타') as age
    FROM customers;

SELECT cust_name,
    CASE
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 0 THEN '0대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 1 THEN '10대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 2 THEN '20대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 3 THEN '30대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 4 THEN '40대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 5 THEN '50대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 6 THEN '60대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 7 THEN '70대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 8 THEN '80대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 9 THEN '90대'
        WHEN TRUNC((to_char(sysdate, 'YYYY') - cust_year_of_birth)/10) = 10 THEN '100대'
        ELSE '기타'
    END AS age
    FROM customers;

-- 조회건수
SELECT COUNT(*) FROM customers;

-- 전체 컬럼의 합계 반환
SELECT SUM(amount_sold) FROM sales;

-- 평균값 반환
SELECT trunc(AVG(salary)) FROM employees;

-- 최대값, 최소값
SELECT MIN(salary), MAX(salary) FROM employees;

-- 분산값, 표준편차
SELECT VARIANCE(salary), STDDEV(salary) FROM employees;
























