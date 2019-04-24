CREATE OR REPLACE VIEW HighestPricedProductPerOrder AS
with temptable as(
select order_id as OrderNumber,
max(od.price) as Price
from "hgm_order_detail" as od
join "hgm_order" as o on od.order_id=o.id
group by order_id
order by order_id
)
select OrderNumber,
(select p."name" from "hgm_order_detail" as od
	join "hgm_product" as p on od.product_id=p.id
	where od.order_id=OrderNumber and od.price=t.Price) as ProductName,
Price
from temptable as t;

