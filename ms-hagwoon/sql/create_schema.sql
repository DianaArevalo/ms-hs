-- Tabla de profesores
CREATE TABLE IF NOT EXISTS teachers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL,
    email VARCHAR(128) UNIQUE NOT NULL
);
-- Tabla de cursos
CREATE TABLE IF NOT EXISTS courses (
    id SERIAL PRIMARY KEY,
    "name" VARCHAR(32) NOT NULL,
    founder BIGINT,
    CONSTRAINT fk_founder
    FOREIGN KEY (founder)
    REFERENCES teachers(id)
    ON DELETE SET NULL,    
    s_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Índice para el nombre del curso
CREATE INDEX idx_name_courses
ON courses("name");

-- Tabla de sitios web relacionados con cursos
CREATE TABLE IF NOT EXISTS web_site (
    id SERIAL PRIMARY KEY,
    id_course BIGINT,
    "name" VARCHAR(32) NOT NULL,
    category VARCHAR(32) NOT NULL,
    description TEXT,
    CONSTRAINT fk_course
    FOREIGN KEY (id_course)
    REFERENCES courses(id)
    ON DELETE CASCADE
);
