DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
    id serial PRIMARY KEY,
    todo varchar(255) NOT NULL,
    detail text,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);