DROP TABLE Employ;
CREATE TABLE Employ (
                        Fname VARCHAR2(50),
                        Lname VARCHAR2(50),
                        Ssn NUMBER,
                        Bdate VARCHAR2(10),
                        Address VARCHAR2(10),
                        Sex VARCHAR2(1),
                        Salary NUMBER
);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Harsh', 'Chhajer', 1, '2006-05-04', 'Mumbai', 'M', 110000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Howard', 'Stark', 2, '1990-07-31', 'Delhi', 'M', 20000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Maansi', 'Soni', 5, '2006-02-13', 'Ahemdabad', 'F', 54000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Jash', 'Vakharia', 6, '2006-05-19', 'Pune', 'M', 40000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Radha', 'Joshi', 7, '2006-08-05', 'Delhi', 'F', 50000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Het', 'Gala', 8, '2006-05-31', 'Kutch', 'M', 100000);

INSERT INTO Employ (Fname, Lname, Ssn, Bdate, Address, Sex, Salary) VALUES
    ('Dhyey', 'Parekh', 9, '2006-8-7', 'Surat', 'M', 80000);

SELECT Fname, lname FROM employ
WHERE ((Address NOT IN ('Delhi', 'Lucknow')) AND Salary<50000);

Select*From Employ;