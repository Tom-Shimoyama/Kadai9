DROP TABLE IF EXISTS names;

CREATE TABLE names (
  name_id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(name_id)
);

INSERT INTO names (name_id, name) VALUES (1, "John Smith");
INSERT INTO names (name_id, name) VALUES (2, "Maria Garcia");
