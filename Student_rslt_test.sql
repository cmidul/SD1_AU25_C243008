BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "student" (
	"SL"	INTEGER NOT NULL UNIQUE,
	"ID"	TEXT NOT NULL,
	"Name"	TEXT NOT NULL,
	"CGPA"	REAL,
	PRIMARY KEY("SL" AUTOINCREMENT)
);
INSERT INTO "student" ("SL","ID","Name","CGPA") VALUES (1,'C243008','Sami',3.98),
 (2,'C243007','Rahat',4.0),
 (3,'C243027','Jamil',4.0),
 (4,'C243029','Shopnil',4.0),
 (5,'C243030','Alim',4.0),
 (6,'C243054','Mahi',4.0),
 (7,'C243055','Naim',3.8);
COMMIT;
