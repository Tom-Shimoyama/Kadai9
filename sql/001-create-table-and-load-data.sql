DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO names (id, name) VALUES (1, "John Smith");
INSERT INTO names (id, name) VALUES (2, "Maria Garcia");
