CREATE DATABASE prj250623;
USE prj250623;
CREATE TABLE board
(
    id         INT AUTO_INCREMENT NOT NULL,
    title      VARCHAR(255)       NULL,
    content    VARCHAR(255)       NULL,
    writer     VARCHAR(255)       NULL,
    created_at datetime           NULL,
    CONSTRAINT pk_board PRIMARY KEY (id)
);