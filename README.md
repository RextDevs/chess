# progra2labs

### Flujo de trabajo

Paso 1, regresar a `main`:

```bash
git switch main
```

Paso 2, actualizar `main`:

```bash
git pull
```

Paso 3, crear rama de trabajo desde `main`:

```bash
git switch -c lab1
```

Paso 4, realizar cambios para el respectivo lab

Paso 5, verificar cambios en la rama

```bash
git status
git diff
```

Paso 6, verificar los test y coding standars:

```bash
./gradlew clean check
```

Paso 7, agregar cambios

```bash
git add file1
git add file2
...

```

excluir cambios que no sean necesarios para el lab, evitar incluir binarios `.class`, `bin`, actualizar `.gitignore` para evitarlos 


Paso 8, confirmar cambios:

```bash
git commit -m "implementado el lab1 con..."
```

Paso 9, subir commits al repo personal:

```bash
git push -u origin lab1
```

Paso 10, crear el Merge Request a `main`, describir los cambios, agregar capturas del resultado del comando `./gradlew clean check`, y los diagramas UML. Asignar Reviewer para el MR.
