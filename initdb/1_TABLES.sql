

-- Création de la table Profil
CREATE TABLE Profil (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    email VARCHAR(255),
    title VARCHAR(255),
    logo_url VARCHAR(255),
    objective VARCHAR(255)
);

-- Création de la table Liens Réseaux Sociaux
CREATE TABLE Socialnetwork (
    id SERIAL PRIMARY KEY,
    logo VARCHAR(255),
    link VARCHAR(255)
);

-- Création de la table Recommandation
CREATE TABLE Recommandation (
    id SERIAL PRIMARY KEY,
    author VARCHAR(255),
    position VARCHAR(255),
    text TEXT
);

-- Création de la table Experience
CREATE TABLE Experience (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    company VARCHAR(255),
    location VARCHAR(255),
    start_date DATE,
    end_date DATE,
    description TEXT,
    logo_url VARCHAR(255)
);

-- Création de la table Formation
CREATE TABLE Formation (
    id SERIAL PRIMARY KEY,
    school VARCHAR(255),
    start_date DATE,
    end_date DATE,
    description TEXT,
    logo_url VARCHAR(255)
);

-- Création de la table Competences
CREATE TABLE Skill (
    id SERIAL PRIMARY KEY,
    label VARCHAR(255),
    title VARCHAR(255),
    logo VARCHAR(255)
);

-- Création de la table Hobbies
CREATE TABLE Hobby (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    logo VARCHAR(255),
    description TEXT,
    dates DATE
);

-- Création de la table MessageDeContact
CREATE TABLE Message (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT
);