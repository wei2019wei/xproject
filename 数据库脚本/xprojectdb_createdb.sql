CREATE DATABASE xprojectdb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON xprojectdb.* TO xprojectuser@"%" IDENTIFIED BY "xproject123";

GRANT ALL PRIVILEGES ON xprojectdb.* TO xprojectuser@"127.0.0.1" IDENTIFIED BY "xproject123";

GRANT ALL PRIVILEGES ON xprojectdb.* TO xprojectuser@"localhost" IDENTIFIED BY "xproject123";

