# Producto-1
Proyecto back-end desarrollado con Spring Boot para la gestión de alquiler de vehículos. Este repositorio contiene la configuración inicial, controlador base, integración con Git y despliegue mediante Docker como parte del Producto 1 del curso.

## Alquila Tus Vehículos
Este proyecto es una aplicación Spring Boot empaquetada como JAR y preparada para ejecutarse usando Docker con Java 21 y Maven.

### Construcción de la imagen
Desde la raíz del proyecto (donde está el Dockerfile), ejecuta:

```
docker build -t alquila-vehiculos . 
```

Esto compila el proyecto con Maven, genera el JAR y crea una imagen ligera con Java 21 (JRE)


### Ejecución del contenedor

Una vez creada la imagen, ejecuta:
```
docker run -p 8080:8080 --name alquila-vehiculos-container alquila-vehiculos
```

La aplicación quedará disponible en:

```
http://localhost:8080
```

### Reconstrucción de la imagen 

Se se hacen cambios en el código ejecutar:

```
docker stop alquila-vehiculos-container
docker rm alquila-vehiculos-container
docker build -t alquila-vehiculos .
docker run -p 8080:8080 --name alquila-vehiculos-container alquila-vehiculos
```

---
## Comandos útiles

Ver contenedores en ejecución
```
docker ps
```
Ver logs del contenedor
```
docker logs alquila-vehiculos-container
```
Detener el contenedor
```
docker stop alquila-vehiculos-container
```
Eliminar el contenedor
```
docker rm alquila-vehiculos-container
```