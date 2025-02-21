INSERT INTO teachers (name, email)
VALUES 
    ('Diana Arévalo', 'diana@example.com'),
    ('Oscar Tovar', 'oscar@example.com');

INSERT INTO courses("name", founder, s_date)
VALUES 
    ('Matematicas', 1, '2025-02-09'),
    ('Learn Programming with me', 1, '2025-02-09'),
    ('Informatica', 2, '2025-02-09');

  -- data for web sites  
INSERT INTO web_site(id_course, "name", category, description)
VALUES 
    (1, 'Matematicas', 'Science', 'Matematicas desde 0 a experto.'),
    (2, 'Learn Programming with me', 'CLOUD_COMPUTING', 'Aprende programacion conmigo, mientras voy aprendiendo.'),
    (3, 'Informatica', 'CLOUD_COMPUTING', 'Curso de informatica basica hasta aprender a armar tu propio PC.');
