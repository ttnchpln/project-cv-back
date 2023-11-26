INSERT INTO Profil (firstname, lastname, email, title, logo_url, objective)
VALUES ('John', 'Doe', 'Software Engineer', 'titouan.chapalain@gmail.com', 'john_doe.png', 'Looking for new opportunities');

INSERT INTO Socialnetwork (logo, link)
VALUES ('LinkedIn', 'https://www.linkedin.com/');

INSERT INTO Recommandation (author, position, text)
VALUES ('Jane Smith', 'Manager', 'John Doe is a highly skilled professional with great expertise.');

INSERT INTO Experience (title, company, location, start_date, end_date, description, logo_url)
VALUES ('Software Developer', 'ABC Inc.', 'New York', '2022-01-15', '2022-12-31', 'Developed web applications.', 'abc_inc_logo.png');

INSERT INTO Formation (school, start_date, end_date, description, logo_url)
VALUES ('University of XYZ', '2018-09-01', '2022-05-15', 'Bachelor of Science in Computer Science', 'university_logo.png');

INSERT INTO Skill (label, title, logo)
VALUES ('Java', 'Programming Languages', 'java_logo.png');

INSERT INTO Hobby (title, logo, description, dates)
VALUES ('Photography', 'camera_logo.png', 'Passionate about capturing beautiful moments.', '2022-01-01');

INSERT INTO Message (name, email, message)
VALUES ('Alice', 'alice@example.com', 'Hello, I would like to get in touch with you.');
