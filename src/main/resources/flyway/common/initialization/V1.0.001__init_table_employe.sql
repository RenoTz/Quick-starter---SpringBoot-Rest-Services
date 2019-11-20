-- Table: employe

CREATE TABLE employe
(
  id bigserial NOT NULL,
  nom character varying(255),
  prenom character varying(255)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE employe
  OWNER TO postgres;

  
INSERT into employe (nom, prenom) values ('Trezieres', 'Renaud');
  
