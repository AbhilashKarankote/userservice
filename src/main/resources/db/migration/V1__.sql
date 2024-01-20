CREATE TABLE address
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_by datetime NULL,
    updated_by datetime NULL,
    city       VARCHAR(255) NULL,
    street     VARCHAR(255) NULL,
    number     INT NULL,
    zipcode    VARCHAR(255) NULL,
    latitude   VARCHAR(255) NULL,
    longitude  VARCHAR(255) NULL,
    CONSTRAINT pk_address PRIMARY KEY (id)
);

CREATE TABLE user
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_by datetime NULL,
    updated_by datetime NULL,
    email      VARCHAR(255) NULL,
    username   VARCHAR(255) NULL,
    password   VARCHAR(255) NULL,
    address_id BIGINT NULL,
    phone      VARCHAR(255) NULL,
    first_name VARCHAR(255) NULL,
    last_name  VARCHAR(255) NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE user
    ADD CONSTRAINT FK_USER_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES address (id);