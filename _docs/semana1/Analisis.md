# Análisis Orientado a Objetos - LogiCarga

## 1. Identificación del Dominio
**Nombre del negocio:** LogiCarga  
**Tipo:** Empresa de transporte de carga terrestre (logística)  
**Descripción:** LogiCarga presta servicios de transporte de carga nacional, maneja carga general y refrigerada, posee flota de camiones y bodega temporal. Realiza aproximadamente 200 envíos mensuales.

## 2. Objetos Identificados

### Objeto Principal: CargoShipment
**¿Qué es?:** Representa un envío de carga con origen, destino, peso y características de transporte.
**Atributos identificados:**
- shipmentCode: String - identificador único del envío
- origin: String - ciudad de origen
- destination: String - ciudad destino
- weightKg: double - peso de la carga en kilogramos
- distanceKm: int - distancia estimada en kilómetros
- refrigerated: boolean - indica si requiere refrigeración
- delivered: boolean - estado de entrega

**Métodos identificados:**
- printInfo(): void - imprime la información completa del envío
- calculateEstimatedCost(): double - calcula el costo estimado basado en peso y distancia
- getShipmentCode(): String - obtiene el código del envío (getter)
- setDelivered(boolean): void - marca el envío como entregado (setter)
- changeDestination(String): void - permite reprogramar destino

### Objeto Secundario: Cliente
**¿Qué es?:** Representa la persona o empresa que contrata el servicio.
**Atributos identificados:**
- clientId: String - identificador del cliente
- name: String - nombre o razón social
- nitOrId: String - identificación fiscal
- phone: String - contacto telefónico
- address: String - dirección

**Métodos identificados:**
- showInfo(): void - muestra datos del cliente
- makePayment(double, String): boolean - simula un pago y retorna si fue exitoso
- contact(String): String - envía un mensaje de notificación y retorna confirmación

## 3. Relación entre Objetos
**Tipo de relación:** Asociación (Cliente ↔ CargoShipment)  
**Descripción:** Un Cliente puede crear o solicitar uno o varios CargoShipments. El envío registra información necesaria para facturación y seguimiento del cliente; por tanto, el cliente y los envíos están conceptualmente asociados.

## 4. Justificación del Diseño
**¿Por qué elegí estos objetos?** Porque representan las entidades centrales de la operación: quien solicita el servicio (Cliente) y el servicio en sí (CargoShipment).  
**¿Por qué estos atributos son importantes?** Permiten identificar, facturar, calcular costo y gestionar logística (peso, distancia, refrigeración).  
**¿Por qué estos métodos son necesarios?** Para observar/gestionar estado (printInfo, setDelivered), operar sobre datos (changeDestination) y calcular valores de negocio (calculateEstimatedCost).

## 5. Comparación: POO vs Programación Estructurada
**Sin POO (Estructurado):** Se manejarían variables sueltas para cada envío (codigo1, origen1, destino1, peso1...) y funciones separadas. Esto complica la gestión cuando hay muchos envíos.  
**Con POO:** Se crea la clase `CargoShipment`, cada envío es un objeto con datos y métodos. Se facilita escalabilidad, mantenimiento y legibilidad.

**Ventajas específicas en mi dominio:**
1. Modelado realista de la operación logística.
2. Facilita extensión (p. ej. agregar métodos de rastreo, historial).
3. Mejora la reutilización y pruebas unitarias.

## 6. Diagrama de clases (texto simple)
CargoShipment 1..* <----> 0..1 Cliente

CargoShipment:
- shipmentCode: String
- origin: String
- destination: String
- weightKg: double
- distanceKm: int
- refrigerated: boolean
+ printInfo()
+ calculateEstimatedCost()
+ getShipmentCode()
+ setDelivered()

Cliente:
- clientId: String
- name: String
- nitOrId: String
- phone: String
+ showInfo()
+ makePayment()
+ contact()