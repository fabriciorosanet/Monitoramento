CREATE SEQUENCE SEQ_QUALIDADE_AR
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE TABLE tbl_qualidade_ar (
    id NUMBER(10) DEFAULT SEQ_QUALIDADE_AR.NEXTVAL NOT NULL,
    data_leitura DATE,
    pm25 NUMBER,
    pm10 NUMBER,
    no2 NUMBER,
    o3 NUMBER,
    local_monitoramento_id NUMBER,
    PRIMARY KEY (id)
);
