# Calculadora Java y HTML

## Cómo inicializar y publicar un repositorio en GitHub
1. **Crear el repositorio remoto:** Desde GitHub se crea un repositorio público nuevo inicializado con un archivo `README.md`.
2. **Clonar en local:** Se descarga el proyecto al ordenador usando `git clone <url>`.
3. **Gestionar ramas:** Se crean ramas independientes con `git branch <nombre>` y se cambia entre ellas con `git checkout <nombre>`.
4. **Registrar cambios:** Se preparan los archivos modificados con `git add <archivo>` y se guardan en el historial local con `git commit -m "mensaje"`.
5. **Publicar cambios:** Se envían los commits y las ramas al repositorio remoto en GitHub mediante `git push origin <rama>`.

## Comandos utilizados en orden cronológico
1. `git clone <URL_DEL_REPOSITORIO>`
2. `cd calculadora-git`
3. `git branch backend`
4. `git branch frontend`
5. `git checkout backend`
6. `git add Calculadora.java`
7. `git commit -m "Agrega logica de operaciones matematicas en Java"`
8. `git push -u origin backend`
9. `git checkout frontend`
10. `git add index.html`
11. `git commit -m "Agrega interfaz HTML para la calculadora"`
12. `git push -u origin frontend`
13. `git checkout main`
14. `git merge backend`
15. `git merge frontend`
16. `git add README.md`
17. `git commit -m "Actualizacion de comentarios y documentacion en README.md"`
18. `git push origin main`