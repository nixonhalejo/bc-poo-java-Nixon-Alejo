# Análisis Orientado a Objetos - LogiCarga

## 1. Identificación del Dominio

**Nombre del negocio:** LogiCarga  
**Tipo:** Empresa de transporte de carga terrestre (logística)  
**Descripción:**  
LogiCarga presta servicios de transporte de carga nacional, maneja carga general y refrigerada, posee flota de camiones y bodega temporal. Realiza aproximadamente 200 envíos mensuales y mantiene relación directa con clientes empresariales.

El sistema busca modelar los procesos principales: gestión de envíos, clientes, vehículos y operaciones de pago y notificación.

---

## 2. Objetos Identificados

### 🟩 Objeto Principal: CargoShipment

**¿Qué es?:** Representa un envío de carga con origen, destino, peso y características de transporte.

**Atributos:**
- `shipmentCode`: String — identificador único del envío
- `origin`: String — ciudad de origen
- `destination`: String — ciudad destino
- `weightKg`: double — peso de la carga en kilogramos
- `distanceKm`: int — distancia estimada en kilómetros
- `refrigerated`: boolean — indica si requiere refrigeración
- `delivered`: boolean — estado de entrega

**Métodos:**
- `printInfo()`: void — imprime la información completa del envío
- `calculateEstimatedCost()`: double — calcula el costo estimado del envío
- `getShipmentCode()`: String — obtiene el código del envío
- `setDelivered(boolean)`: void — marca el envío como entregado
- `changeDestination(String)`: void — permite reprogramar el destino
- `getSummary()`: String — devuelve un resumen breve del envío

---

### 🟨 Objeto Secundario: Cliente

**¿Qué es?:** Representa al cliente que contrata el servicio de envío.

**Atributos:**
- `clientId`: String — código único del cliente
- `name`: String — nombre de la empresa cliente
- `nit`: String — número de identificación tributaria
- `phone`: String — número de contacto
- `address`: String — dirección física

**Métodos:**
- `showInfo()`: void — muestra la información del cliente
- `makePayment(double, String)`: boolean — simula el pago del envío
- `contact(String)`: void — envía un mensaje al cliente

---

### 🟦 Objeto Complementario: Vehiculo

**¿Qué es?:** Representa un camión o vehículo de transporte asignado a un envío.

**Atributos:**
- `plate`: String — placa del vehículo
- `model`: String — modelo del vehículo
- `capacityKg`: double — capacidad máxima de carga
- `available`: boolean — estado de disponibilidad

**Métodos:**
- `assignToShipment(CargoShipment)`: void — asigna el vehículo a un envío
- `toggleAvailability()`: void — cambia el estado de disponibilidad
- `getInfo()`: String — devuelve la información del vehículo

---

### 🟧 Objeto de Gestión: LogiCarga

**¿Qué es?:** Clase que gestiona todos los envíos realizados por la empresa.

**Atributos:**
- `nombre`: String — nombre de la empresa
- `envios`: ArrayList<Envio> — lista de envíos registrados

**Métodos:**
- `agregarEnvio(Envio)`: void — agrega un nuevo envío
- `mostrarEnvios()`: void — imprime todos los envíos registrados

---

### 🟨 Objeto de Apoyo: Envio

**¿Qué es?:** Representa un envío simplificado para pruebas o gestión interna.

**Atributos:**
- `destino`: String — ciudad destino
- `peso`: double — peso de la carga

**Métodos:**
- `obtenerResumen()`: String — devuelve un resumen del envío

---

### 🟦 Clase de Control: Main

**¿Qué es?:** Punto de entrada del sistema, encargado de demostrar la interacción entre los objetos.

**Responsabilidades:**
- Crear clientes y envíos
- Mostrar información y cálculos
- Ejecutar operaciones sobre envíos (entrega, cambio de destino)
- Simular pagos y notificaciones
- Integrar todas las clases en una demostración funcional

---

## 3. Relaciones entre Clases

- `Cliente` realiza pagos y recibe notificaciones sobre un `CargoShipment`.
- `CargoShipment` puede ser gestionado por `LogiCarga` y asignado a un `Vehiculo`.
- `Vehiculo` puede estar disponible o no para ser asignado a un `CargoShipment`.
- `LogiCarga` actúa como contenedor y gestor de múltiples envíos (`Envio`).
- `Main` coordina la ejecución y demuestra la interacción entre todas las clases.

---

## 4. Justificación Orientada a Objetos

El diseño propuesto sigue los principios de la programación orientada a objetos:

- **Encapsulamiento:** cada clase maneja sus propios datos y comportamientos.
- **Modularidad:** las clases están separadas por responsabilidad (envíos, clientes, vehículos).
- **Reusabilidad:** los métodos permiten reutilizar lógica como impresión, cálculo de costos y contacto.
- **Extensibilidad:** se pueden agregar nuevas clases como `Factura`, `Ruta`, o `Conductor` sin romper el diseño actual.

---

## 5. Estado Actual del Proyecto

- Clases implementadas: `CargoShipment`, `Cliente`, `Vehiculo`, `LogiCarga`, `Envio`, `Main`
- Proyecto funcional y ejecutable desde `Main.java`
- Documentación técnica en progreso (`README.md`, `Analisis.md`)
- Repositorio GitHub actualizado con código y análisis

---