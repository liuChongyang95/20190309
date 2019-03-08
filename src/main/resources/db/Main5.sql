-- 编写一个 SQL 查询，获取 Employee 表中第 n 高的薪水（Salary）。
--
-- +----+--------+
-- | Id | Salary |
-- +----+--------+
-- | 1  | 100    |
-- | 2  | 200    |
-- | 3  | 300    |
-- +----+--------+
-- 例如上述 Employee 表，n = 2 时，应返回第二高的薪水 200。如果不存在第 n 高的薪水，那么查询应返回 null。
--
-- +------------------------+
-- | getNthHighestSalary(2) |
-- +------------------------+
-- | 200                    |
-- +------------------------+

CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN

    /* Write your PL/SQL query statement below */
    /*⑴ 降序选出salary 成为表1*/
    /*⑵ 从表1选出salary和rowNum成为表2*/
    /*⑶ 通过参数N从表2选出结果值赋值到result*/
    select salary into result
    from (select salary,rownum as rn from(select DISTINCT salary
                                          from employee order by salary desc))
                                          where rn=N;

    RETURN result;
END;