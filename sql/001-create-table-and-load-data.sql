DROP TABLE IF EXISTS names;

CREATE TABLE names (
  name_id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(name_id)
);

INSERT INTO names (name_id, name) VALUES (1, "John Smith");
INSERT INTO names (name_id, name) VALUES (2, "Maria Garcia");
INSERT INTO names (name_id, name) VALUES (3, "福沢　諭吉");


CREATE TABLE countries (
  country_id int unsigned AUTO_INCREMENT,
  country VARCHAR(20) NOT NULL,
  PRIMARY KEY(country_id)
);

INSERT INTO countries (country_id, country) VALUES (1, "USA");
INSERT INTO countries (country_id, country) VALUES (2, "England");
INSERT INTO countries (country_id, country) VALUES (3, "Japan");
