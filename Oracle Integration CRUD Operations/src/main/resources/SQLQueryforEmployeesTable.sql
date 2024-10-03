BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE Employee101';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -942 THEN
            RAISE;
        END IF;
END;
/

CREATE TABLE Employee101 (
                             Fname VARCHAR2(50),
                             Lname VARCHAR2(50),
                             Bdate VARCHAR2(20)
);

INSERT INTO employee101 (Fname, Lname, Bdate)
VALUES ('Perseus', 'Danae',TO_DATE('2000-02-13'));

INSERT INTO employee101 (Fname, Lname, Bdate)
VALUES ('Athena', 'Parthenos', TO_DATE('1995-05-24'));

INSERT INTO employee101 (Fname, Lname, Bdate)
VALUES ('Heracles', 'Alcides', TO_DATE('1987-07-16'));

INSERT INTO employee101 (Fname, Lname, Bdate)
VALUES ('Andromeda', 'Cassiopeia', TO_DATE('2001-09-30'));

Select * From employee101;
