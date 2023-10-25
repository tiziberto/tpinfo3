## Índice

1. [Introducción](#introducción)
2. [Estructura de Archivos](#estructura-de-archivos)
3. [Lógica y Funcionamiento](#lógica-y-funcionamiento)
4. [Instrucciones para Compilar y Ejecutar](#instrucciones-para-compilar-y-ejecutar)
5. [Contribuciones](#contribuciones)
6. [Agradecimiento](#agradecimiento)

# Proyecto de Inventario en Java

Este es un proyecto de inventario desarrollado en Java que utiliza una estructura de datos de Árbol AVL para gestionar los productos. A continuación, se explica la lógica y el funcionamiento del proyecto, así como las instrucciones para compilar y ejecutar el programa.

## Estructura de Archivos

- `main.java`: El archivo principal de ejecución del programa.
- Carpeta `clases`:
  - `producto.java`: La clase que representa un producto en el inventario.
- Carpeta `util`:
  - `ArbolAVL.java`: La implementación de la estructura de datos Árbol AVL para gestionar los productos.
  - `Menu.java`: La clase que maneja la interfaz de usuario y las opciones del menú.
  - `NodoAVL.java`: La clase que representa un nodo en el Árbol AVL.
  - `Pruebas.java`: Contiene pruebas unitarias para verificar el funcionamiento del Árbol AVL.

## Lógica y Funcionamiento

Este proyecto de inventario utiliza un Árbol AVL para mantener un registro de productos. Los productos se almacenan en el árbol ordenados por algún criterio (por ejemplo, el nombre o el código del producto). Esto permite una búsqueda eficiente y una gestión ordenada de los productos en el inventario.

La clase `Menu.java` proporciona una interfaz de usuario simple para agregar, eliminar, buscar y mostrar productos en el inventario. El Árbol AVL se encarga de mantener la estructura equilibrada del inventario para mantener la eficiencia en las operaciones.

## Instrucciones para Compilar y Ejecutar

Para compilar y ejecutar el programa, sigue estos pasos:

1. Asegúrate de tener Java instalado en tu sistema.
2. Abre una terminal y navega al directorio raíz del proyecto.
3. Compila el programa ejecutando el siguiente comando:

```bash
javac main.java
```

El programa se iniciará y te presentará un menú de opciones para gestionar el inventario de productos.

## Contribuciones:
Si deseas contribuir a este proyecto, siéntete libre de hacer un fork del repositorio, implementar nuevas características o mejoras y enviar un pull request.

¡Disfruta utilizando este sistema de inventario en Java!
