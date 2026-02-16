# RETO #3: El Reino de los Vehículos  
**Diego Ortiz - Brandon Peña - Julio Mayorquin**

---

## Patrón de Diseño

- **Categoría:** Creacional  
- **Patrón Utilizado:** Abstract Factory  

---

## Justificación

El patrón **Abstract Factory** es ideal para este caso porque:

- Permite crear familias de objetos relacionadas (Tierra, Acuático y Aéreo) sin especificar clases concretas en el cliente.
- Encapsula la creación de los diferentes tipos de vehículos.
- Facilita agregar nuevos tipos de vehículos sin modificar el código cliente.
- Separa la lógica de creación de objetos de la lógica de negocio.

En este proyecto, cada tipo de vehículo representa una familia de productos, y cada familia puede generar modelos específicos como Auto, Moto, Lancha, Avión, entre otros.

---

## Cómo lo aplico

1. **Interfaz AbstractFactory:**  
   `AbstractFactory` define el contrato para la creación de vehículos.

2. **Fábricas concretas:**  
   - `TierraFactory`  
   - `AcuaticoFactory`  
   - `AereoFactory`  

   Cada fábrica concreta crea únicamente los vehículos correspondientes a su familia.

3. **Producto abstracto:**  
   `Vehiculo` es una clase abstracta que define los atributos comunes:
   - modelo  
   - categoría  
   - precio  
   - velocidad máxima  
   - equipamiento  

4. **Productos concretos:**  
   Auto, Bicicleta, Moto, Lancha, Velero, JetSkis, Avion, Avioneta y Helicoptero.

5. **Cliente:**  
   `App` actúa como punto de entrada (`main`), donde el usuario:
   - Selecciona tipo de vehículo  
   - Selecciona categoría  
   - Selecciona modelo  
   - Puede agregar múltiples vehículos  
   - Se calcula el total utilizando Streams  

---

## Principios SOLID aplicados

### S — Single Responsibility Principle (Principio de Responsabilidad Única)

Cada clase tiene una única responsabilidad:

- `Vehiculo` define la estructura común de todos los vehículos.
- Cada clase concreta (Auto, Moto, etc.) configura sus atributos según la categoría.
- Las fábricas (`TierraFactory`, `AcuaticoFactory`, `AereoFactory`) solo se encargan de crear objetos.
- `App` maneja exclusivamente la interacción con el usuario.

Esto permite mantener el código organizado, modular y fácil de mantener.

---

### O — Open/Closed Principle (Abierto/Cerrado)

El sistema está abierto para extensión pero cerrado para modificación.

Es posible:

- Agregar un nuevo tipo de vehículo (por ejemplo: Submarino).
- Agregar nuevos modelos dentro de una familia.
- Crear nuevas fábricas si aparece un nuevo tipo de vehículo.

Sin modificar la lógica principal del cliente (`App`).

Esto permite que el sistema crezca sin alterar el código existente.

---

## Diagrama de clases:
<img width="1520" height="701" alt="image" src="https://github.com/user-attachments/assets/0554a25e-ce33-4f36-b49f-0c8c5456d716" />

<img width="1245" height="607" alt="image" src="https://github.com/user-attachments/assets/2309f714-b296-421e-af8d-0044c119d405" />



