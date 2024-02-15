select name from SalesPerson where sales_id not in(
    select sales_id from Orders o
                             left join Company c on o.com_id = c.com_id
    where c.name = 'RED'
)

-- SELECT DISTINCT s.name
-- FROM SalesPerson s
--          LEFT JOIN Orders o ON s.sales_id = o.sales_id AND o.com_id = (
--     SELECT com_id FROM Company WHERE name = 'RED'
-- )
-- WHERE o.sales_id IS NULL;