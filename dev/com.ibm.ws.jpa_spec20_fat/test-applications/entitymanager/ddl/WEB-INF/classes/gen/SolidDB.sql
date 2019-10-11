CREATE TABLE CEmployee (id INTEGER NOT NULL, firstName VARCHAR(255), lastName VARCHAR(255), vacationDays INTEGER, version BIGINT, PRIMARY KEY (id)) STORE DISK;
CREATE TABLE EMDETACH_ENTAM2MLIST (JPA20EMDETACHENTITY_ID INTEGER, ENTAM2MLIST_ID INTEGER) STORE DISK;
CREATE TABLE EMDETACH_ENTAM2MLIST_CA (JPA20EMDETACHENTITY_ID INTEGER, ENTAM2MLIST_CA_ID INTEGER) STORE DISK;
CREATE TABLE EMDETACH_ENTAM2MLIST_CD (JPA20EMDETACHENTITY_ID INTEGER, ENTAM2MLIST_CD_ID INTEGER) STORE DISK;
CREATE TABLE EMDETACH_ENTAO2MLIST (JPA20EMDETACHENTITY_ID INTEGER, ENTAO2MLIST_ID INTEGER) STORE DISK;
CREATE TABLE EMDETACH_ENTAO2MLIST_CA (JPA20EMDETACHENTITY_ID INTEGER, ENTAO2MLIST_CA_ID INTEGER) STORE DISK;
CREATE TABLE EMDETACH_ENTAO2MLIST_CD (JPA20EMDETACHENTITY_ID INTEGER, ENTAO2MLIST_CD_ID INTEGER) STORE DISK;
CREATE TABLE JPA20EMDetachEntity (id INTEGER NOT NULL, strData VARCHAR(255), version BIGINT, ENTAM2O_ID INTEGER, ENTAM2O_CA_ID INTEGER, ENTAM2O_CD_ID INTEGER, ENTAO2O_ID INTEGER, ENTAO2O_CA_ID INTEGER, ENTAO2O_CD_ID INTEGER, PRIMARY KEY (id)) STORE DISK;
CREATE TABLE JPA20EMEntityA (id INTEGER NOT NULL, strData VARCHAR(255), version BIGINT, PRIMARY KEY (id)) STORE DISK;
CREATE TABLE JPA20EMEntityA_JPA20EMEntityB (ENTITYALIST_ID INTEGER, ENTITYBLIST_ID INTEGER) STORE DISK;
CREATE TABLE JPA20EMEntityB (id INTEGER NOT NULL, strData VARCHAR(255), version BIGINT, PRIMARY KEY (id)) STORE DISK;
CREATE TABLE JPA20EMEntityC (id INTEGER NOT NULL, strData VARCHAR(255), version BIGINT, ENTITYA_ID INTEGER, ENTITYALAZY_ID INTEGER, PRIMARY KEY (id)) STORE DISK;
