CREATE SCHEMA IF NOT EXISTS card;

CREATE TABLE IF NOT EXISTS card.card (
   id int8 NOT NULL,
   customer_id int8 NULL,
   order_date timestamptz(6) NULL,
   total_amount numeric(38, 2) NULL,
   CONSTRAINT card_pkey PRIMARY KEY (id)
);